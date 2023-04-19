package com.trybe.acc.java;

/**
 * Class Divisor.
 */
public class Divisor {

  /**
   * Method dividir.
   */
  public int dividir(int dividendo, int divisor) {
    try {
      int conta = dividendo / divisor;
      return conta;
    } catch (ArithmeticException e) {
      int zero = 0;
      System.out.println(e.getMessage());
      return zero;
    }
  }
}
