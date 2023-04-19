package com.trybe.idadeemdias;

import java.util.Scanner;

public class Main {
  /** Comment. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual o seu nome?");
    String nome = scanner.next();
    
    System.out.println("Qual é a sua idade em anos, meses e dias?");
    
    System.out.println("anos:");
    int anos = Integer.parseInt(scanner.next());
    
    System.out.println("meses:");
    int meses = Integer.parseInt(scanner.next());
    
    System.out.println("dias:");
    int dias = Integer.parseInt(scanner.next());
    
    Pessoa pessoa = new Pessoa();
    
    int idadeEmDias = pessoa.calcularIdadeEmDias(anos, meses, dias);
    
    System.out.println("Olá " + nome + ", sua idade em dias é " + idadeEmDias);
  }
}