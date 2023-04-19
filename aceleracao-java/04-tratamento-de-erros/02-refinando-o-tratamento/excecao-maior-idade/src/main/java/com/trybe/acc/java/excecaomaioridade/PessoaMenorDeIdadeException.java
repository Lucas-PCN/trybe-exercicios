package com.trybe.acc.java.excecaomaioridade;

/**
 * Class PessoaMenorDeIdadeException.
 *
 */
public class PessoaMenorDeIdadeException extends Exception {

  public PessoaMenorDeIdadeException() {
    super("Pessoa menor de idade, entrada não permitida.");
  }
}
