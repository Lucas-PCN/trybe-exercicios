package com.trybe.gerarpessoausuaria;

/**
 * Classe Pessoa.
 *
 */
public abstract class Pessoa {
  protected String nome;
  protected String sobrenome;
  
  public Pessoa(String nome, String sobrenome) {
    this.nome = nome;
    this.sobrenome = sobrenome;
  }
}
