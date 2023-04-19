package com.trybe.conexaodiscada;

import java.util.Random;

/**
 * Classe ConexaoDiscada.
 *
 */
public class ConexaoDiscada {

  /**
   * Método principal.
   *
   */
  public static void main(String[] args) {
    int tentativas = 0;
    boolean conectou = false;
    String log;
    
    do {
      log = "Tentando conexão ...|n";
      conectou = conectou();
      tentativas += 1;
    } while (conectou == false && tentativas < 3);
    
    log = "Conexão estabelecida na tentativa: " + tentativas;
    System.out.println(log);
  }

  // Chame esta função escrevendo `conectou()`
  static boolean conectou() {
    return conexaoDiscada.verdadeiroOuFalso();
  }

  static ConexaoDiscada conexaoDiscada = new ConexaoDiscada();

  // Retorna verdadeiro ou falso
  boolean verdadeiroOuFalso() {
    return new Random().nextInt(2) == 1;
  }

}
