package com.trybe.acc.java.iocdi.sistemapagamentos.interceptor;

/**
 * Verificacao enum.
 */
public enum Verificacao {
  ADMINISTRADOR("Administrador");

  private String descricao;

  Verificacao(String descricao) {
    this.descricao = descricao;
  }

  public String getDescricao() {
    return descricao;
  } 
}