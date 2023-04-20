package com.trybe.listaprodutos.repository;

import com.trybe.listaprodutos.model.Produto;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.enterprise.context.ApplicationScoped;

/**
 * EstoqueRepository class.
 */
@ApplicationScoped
public class EstoqueRepository {

  public Map<Integer, Produto> produtos;
  
  /**
   * Constructor.
   */
  public EstoqueRepository() {
    produtos = new HashMap<Integer, Produto>();
    produtos.put(1, new Produto(1, "Leite"));
    produtos.put(2, new Produto(2, "Ovo"));
    produtos.put(3, new Produto(3, "Suco"));
    produtos.put(4, new Produto(4, "Pão"));
  }

  public List<Produto> findAll() {
    return produtos.values().stream().collect(Collectors.toList());
  }

  public Produto findById(Integer id) {
    return produtos.get(id);
  }
}
