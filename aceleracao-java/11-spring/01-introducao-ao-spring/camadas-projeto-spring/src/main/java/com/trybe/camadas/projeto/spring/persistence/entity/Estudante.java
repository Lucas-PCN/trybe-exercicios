package com.trybe.camadas.projeto.spring.persistence.entity;

/**
 * Classe Estudante.
 **/

public class Estudante {
  private String id;
  private String nomeEstudante;
  private String stackFavorita;
  private String cidade;
  
  /**
   * Construtor Estudante.
   */
  public Estudante(String id, String nomeEstudante, String stackFavorita, String cidade) {
    this.id = id;
    this.nomeEstudante = nomeEstudante;
    this.stackFavorita = stackFavorita;
    this.cidade = cidade;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getNomeEstudante() {
    return nomeEstudante;
  }

  public void setNomeEstudante(String nomeEstudante) {
    this.nomeEstudante = nomeEstudante;
  }

  public String getStackFavorita() {
    return stackFavorita;
  }

  public void setStackFavorita(String stackFavorita) {
    this.stackFavorita = stackFavorita;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }
}
