package com.trybe.listaprodutos.model;

/**
 * Produto class.
 */
public class Produto {

  private int id;
  private String nome;

  public Produto() {}

  public Produto(int id, String nome) {
    this.id = id;
    this.nome = nome;
  }

  public int getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

}
