package com.trybe.camadas.projeto.spring.service;

import com.trybe.camadas.projeto.spring.persistence.entity.Estudante;

/**
 * Classe EstudanteServiceImpl.
 */
public class EstudanteServiceImpl implements EstudanteService {
  EstudanteServiceImpl estudanteRepository;

  @Override
  public Estudante criarEstudante(Estudante estudante) {
    estudanteRepository.criarEstudante(estudante);
    return null;
  }

  @Override
  public Estudante buscaEstudantepeloId(String id) {
    estudanteRepository.buscaEstudantepeloId(id);
    return null;
  }

  @Override
  public Estudante atualizaEstudantepeloId(String id, Estudante estudante) {
    estudanteRepository.atualizaEstudantepeloId(id, estudante);
    return null;
  } 

  @Override
  public void excluiEstudantepeloId(String id) {
    estudanteRepository.excluiEstudantepeloId(id);
  }
}
