package com.trybe.acc.java;

import java.util.Locale;
import java.util.Scanner;

public class Imc {
  /** Function to calculate IMC. */
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o peso:");
    float peso = scan.nextFloat();

    System.out.println("Digite a aultura:");
    float altura = scan.nextFloat();

    float imc = peso / (altura * altura);

    System.out.println(imc);

  }
}
