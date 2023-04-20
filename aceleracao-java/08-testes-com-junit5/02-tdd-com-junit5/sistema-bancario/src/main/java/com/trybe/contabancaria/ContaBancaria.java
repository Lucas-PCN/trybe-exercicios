package com.trybe.contabancaria;

/**
 * Classe ContaBancaria.
 **/

public class ContaBancaria {

  /**
   * Atributos.
   **/
  int saldo = 0;
  Cliente cliente = new Cliente();

  /**
   * Métodos.
   **/
  public String getNomeCliente() {
    return this.cliente.getNome();
  }
  
  public void setNomeCliente(String nome) {
    this.cliente.setNome(nome);
  }
  
  public String getCpfCliente() {
    return this.cliente.getCpf();
  }
  
  public void setCpfCliente(String cpf) {
    this.cliente.setCpf(cpf);
  }
  
  public int depositar(int deposito) {
    return this.saldo += deposito;
  }
  
  public int sacar(int saque) {
    return this.saldo -= saque;
  }
  
  public int verSaldo() {
    return this.saldo;
  }
}
