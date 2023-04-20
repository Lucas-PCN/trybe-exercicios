package com.trybe.acc.java.iocdi.sistemapagamentos.model;

/**
 * Payment class.
 */
public class Payment {
  private String id;
  private String valor;

  public Payment(String id, String valor) {
    this.id = id;
    this.valor = valor;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }
}
