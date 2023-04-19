package com.trybe.acc.java;

/**
 * class NullGuard.
 */
public class NullGuard {

  /**
   * printName method.
   *
   */
  public String printName(int divisor) {
    NullGenerator generator = new NullGenerator();

    try {
      String result = generator.getNome(divisor);
      return result;
    } catch (NullPointerException e) {
      String nomeNulo = "Nome nulo";
      return nomeNulo;
    }
  }
}
