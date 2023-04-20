package com.trybe.restaurante.service;

import com.trybe.restaurante.dto.RestauranteDto;
import com.trybe.restaurante.entity.RestauranteEntity;
import com.trybe.restaurante.repository.RestauranteRepository;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

/**
 * RestauranteService class.
 **/
@ApplicationScoped
public class RestauranteService {

  @Inject
  RestauranteRepository restauranteRepository;

  /**
   * salvar method.
   */
  @Transactional
  public void salvar(RestauranteDto restauranteDto) {
    RestauranteEntity restauranteEntity = new RestauranteEntity();
    restauranteEntity.setNome(restauranteDto.getNome());
    restauranteEntity.setDescricao(restauranteDto.getDescricao());
    restauranteRepository.persist(restauranteEntity);
    return;
  }

  public List<RestauranteEntity> listar() {
    return restauranteRepository.listAll();
  }

  public RestauranteEntity buscarPorId(Long id) {
    return restauranteRepository.findById(id);
  }

  /**
   * atualizar method.
   */
  @Transactional
  public void atualizar(Long id, RestauranteDto restauranteDto) {
    RestauranteEntity restauranteEntity = restauranteRepository.findById(id);
    restauranteEntity.setNome(restauranteDto.getNome());
    restauranteEntity.setDescricao(restauranteDto.getDescricao());
    restauranteRepository.persist(restauranteEntity);
    return;
  }

  /**
   * deletar method.
   */
  @Transactional
  public void deletar(Long id) {
    RestauranteEntity restauranteEntity = restauranteRepository.findById(id);
    restauranteRepository.delete(restauranteEntity);
    return;
  }

}
