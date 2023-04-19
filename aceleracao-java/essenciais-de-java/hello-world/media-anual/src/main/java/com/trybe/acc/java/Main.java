package com.trybe.acc.java;

import java.util.Scanner;

public class Main {
  /** Comment. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual é o seu nome?");
    String nome = scanner.next();
    
    System.out.println("Entre com as notas das provas: ");
    
    System.out.println("Avaliação 1:");
    double nota1 = Double.parseDouble(scanner.next());
    
    System.out.println("Avaliação 2:");
    double nota2 = Double.parseDouble(scanner.next());
    
    System.out.println("Avaliação 3:");
    double nota3 = Double.parseDouble(scanner.next());
    
    System.out.println("Avaliação 4:");
    double nota4 = Double.parseDouble(scanner.next());
    
    Nota nota = new Nota();
    
    double mediaFinal = nota.calcularMedia(nota1, nota2, nota3, nota4);
    
    System.out.println("Olá, " + nome + ", sua média é " + mediaFinal);
  }
}
