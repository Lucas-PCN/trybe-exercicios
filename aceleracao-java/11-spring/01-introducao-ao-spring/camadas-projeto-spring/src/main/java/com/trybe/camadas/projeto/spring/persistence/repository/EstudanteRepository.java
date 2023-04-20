package com.trybe.camadas.projeto.spring.persistence.repository;

import com.trybe.camadas.projeto.spring.persistence.entity.Estudante;

/**
 * Interface EstudanteRepository.
 */
public interface EstudanteRepository {
  public Estudante criarEstudante(Estudante estudante);

  public Estudante buscaEstudantepeloId(String id);

  public Estudante atualizaEstudantepeloId(String id, Estudante estudante);

  public void excluiEstudantepeloId(String id);
}
