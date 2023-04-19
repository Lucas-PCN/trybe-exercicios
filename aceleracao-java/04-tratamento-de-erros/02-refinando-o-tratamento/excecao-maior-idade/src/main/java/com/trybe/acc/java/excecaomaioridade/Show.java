package com.trybe.acc.java.excecaomaioridade;

/**
 * Classe do desafio.
 */
public class Show {

  /**
   * Método do desafio.
   */
  public boolean permitirEntrada(int idade) throws PessoaMenorDeIdadeException {
    if (idade < 18) {
      throw new PessoaMenorDeIdadeException();
    }

    return true;
  }
}
