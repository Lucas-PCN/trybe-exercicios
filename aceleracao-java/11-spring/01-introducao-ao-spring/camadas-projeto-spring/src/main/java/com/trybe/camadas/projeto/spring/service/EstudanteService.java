package com.trybe.camadas.projeto.spring.service;

import com.trybe.camadas.projeto.spring.persistence.entity.Estudante;

/**
 * Interface EstudanteService.
 */
public interface EstudanteService {
  public Estudante criarEstudante(Estudante estudante);

  public Estudante buscaEstudantepeloId(String id);

  public Estudante atualizaEstudantepeloId(String id, Estudante estudante);

  public void excluiEstudantepeloId(String id);
}
