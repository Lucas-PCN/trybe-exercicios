package com.trybe.restaurante;

import com.trybe.restaurante.dto.RestauranteDto;
import com.trybe.restaurante.entity.RestauranteEntity;
import com.trybe.restaurante.service.RestauranteService;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * RestauranteController class.
 **/
@Path("/restaurante")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RestauranteController {

  @Inject
  RestauranteService restauranteService;

  @GET
  @Path("/")
  public List<RestauranteEntity> listar() {
    return restauranteService.listar();
  }

  @GET
  @Path("/{id}")
  public RestauranteEntity buscarPorId(@PathParam("id") Long id) {
    return restauranteService.buscarPorId(id);
  }

  /**
   * salvar method.
   */
  @POST
  @Path("/")
  public Response salvar(@Valid RestauranteDto restauranteDto) throws Exception {
    restauranteService.salvar(restauranteDto);
    return Response.status(Response.Status.CREATED)
        .entity("Restaurante criado com sucesso!").build();
  }

  @PATCH
  @Path("/{id}")
  public String atualizar(
      @PathParam("id") Long id, @Valid RestauranteDto restauranteDto
  ) throws Exception {
    restauranteService.atualizar(id, restauranteDto);
    return "Restaurante atualizado com sucesso!";
  }

  @DELETE
  @Path("/{id}")
  public String deletar(@PathParam("id") Long id) {
    restauranteService.deletar(id);
    return "Restaurante deletado com sucesso!";
  }

}
