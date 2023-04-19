package com.trybe.acc.java;

public class Fatorial {
  /** Function to calculate fatorial of 18. */
  public static void main(String[] args) {
    int x = 18;
    long fatorial18 = x;

    while (x > 1) {
      fatorial18 = fatorial18 * (x - 1);
      x = x - 1;
    }

    System.out.println("O fatorial de 18 é igual a " + fatorial18);
  }
}
