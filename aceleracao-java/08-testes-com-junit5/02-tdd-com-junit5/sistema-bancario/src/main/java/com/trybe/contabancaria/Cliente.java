package com.trybe.contabancaria;

/**
 * Classe Cliente.
 **/

public class Cliente {

  /**
   * Atributos.
   **/
  String nome;
  String cpf;
  ValidaCpf validaCpf = new ValidaCpf();

  /**
   * Métodos.
   **/
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  /**
   * Método setCpf.
   */
  public void setCpf(String cpf) {
    if (validaCpf.validarCpf(cpf)) {
      this.cpf = cpf;
    } else {
      this.cpf = null;
    }
  }
}
