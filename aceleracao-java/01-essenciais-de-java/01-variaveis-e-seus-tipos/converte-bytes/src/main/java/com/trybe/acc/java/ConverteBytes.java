package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

public class ConverteBytes {
  /** Function to convert bytes into bits. */
  public static void main(String[] args) {
    // Ler a entrada de um número pelo console
    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite um número:");
    byte valor = scan.nextByte();

    int qtdBits = valor * 8;

    System.out.println(valor + " bytes correspondem a " + qtdBits + " bits");

  }
}
