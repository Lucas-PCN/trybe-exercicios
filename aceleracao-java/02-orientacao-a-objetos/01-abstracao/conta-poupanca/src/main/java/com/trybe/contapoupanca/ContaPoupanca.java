package com.trybe.contapoupanca;

/** Classe ContaPoupanca. */
public class ContaPoupanca {
  private double saldo;
  private String titularConta;
  
  public ContaPoupanca(String nomeTitular, double depositoInicial) {
    this.titularConta = nomeTitular;
    this.saldo = depositoInicial;
  }
  
  public double depositar(double deposito) {
    this.saldo += deposito;
    return this.saldo;
  }
  
  public double sacar(double debito) {
    this.saldo -= debito;
    return this.saldo;
  }
  
  public double mostrarSaldo() {
    return this.saldo;
  }
  
  public String mostrarTitularConta() {
    return this.titularConta;
  }

}
