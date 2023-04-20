package com.trybe.listaprodutos.service;

import com.trybe.listaprodutos.model.Produto;
import com.trybe.listaprodutos.repository.EstoqueRepository;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

/**
 * EstoqueService class.
 */
@ApplicationScoped
public class EstoqueService {

  @Inject
  private EstoqueRepository repository;

  public List<Produto> listar() {
    return repository.findAll();
  }

  public Produto buscarPorId(Integer id) {
    return repository.findById(id);
  }

}
