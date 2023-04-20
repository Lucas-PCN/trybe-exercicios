package com.trybe.acc.java.testcontainers;

import com.trybe.acc.java.testcontainers.persistence.Produto;
import com.trybe.acc.java.testcontainers.persistence.ProdutoRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import
org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

/**
 * ProdutoRepositoryTest class.
 */
@Testcontainers
@DataMongoTest(excludeAutoConfiguration = EmbeddedMongoAutoConfiguration.class)
public class ProdutoRepositoryTest {

  @Container
  private static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:5.0.15");

  @Autowired
  private ProdutoRepository produtoRepository;

  @AfterEach
  void tearDown() {
    this.produtoRepository.deleteAll();
  }

  /**
   * Modifica a URI do adapter MongoDB do spring data para utilizar a URL do container MongoDB.
   * 
   * Por padrão, a URI utilizada é o `localhost:27017`.
   *
   */
  @DynamicPropertySource
  static void mongoDbProperties(DynamicPropertyRegistry registry) {
    registry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
  }
  
  Produto produto = new Produto("1", "Produto 1", 100L);

  @DisplayName("1 - Deve cadastrar um novo produto com sucesso.")
  @Test
  void DeveCadastrarNovoproduto() {
    this.produtoRepository.save(produto);

    Assertions.assertEquals(1, this.produtoRepository.count());
    Assertions.assertEquals(
        produto.getNome(),
        this.produtoRepository.findAll().get(0).getNome()
    );
  }


  @DisplayName("2 - Deve listar todos os produtos com sucesso.")
  @Test
  void DeveListarTodosOsprodutos() {
    for (int i = 0; i < 5; i += 1) {
      this.produtoRepository.save(new Produto(String.valueOf(i), "Produto " + i, 100L));
    }

    Assertions.assertEquals(5, this.produtoRepository.count());
  }



  @DisplayName("3 - Deve buscar um produto pelo id com sucesso.")
  @Test
  void DeveBuscarprodutoPeloId() {
    this.produtoRepository.save(produto);

    Assertions.assertEquals(
        produto.getNome(),
        this.produtoRepository.findById(produto.getId()).get().getNome()
    );
  }


  @DisplayName("4 - Deve atualizar um produto pelo id com sucesso.")
  @Test
  void DeveAtualizarprodutoPeloId() {
    this.produtoRepository.save(produto);
    Produto produtoAtualizado = new Produto(produto.getId(), "Produto 1 atualizado", 200L);
    this.produtoRepository.save(produtoAtualizado);

    Assertions.assertEquals(
        produtoAtualizado.getNome(),
        this.produtoRepository.findById(produto.getId()).get().getNome()
    );
  }



  @DisplayName("5 - Deve excluir um produto pelo id com sucesso.")
  @Test
  void DeveExcluirprodutoPeloId() {
    this.produtoRepository.save(produto);
    this.produtoRepository.deleteById(produto.getId());

    Assertions.assertEquals(0, this.produtoRepository.count());
  }

}
