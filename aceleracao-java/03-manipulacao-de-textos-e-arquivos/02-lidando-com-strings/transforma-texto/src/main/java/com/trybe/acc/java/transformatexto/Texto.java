package com.trybe.acc.java.transformatexto;

/**
 * class Texto.
 *
 */
public class Texto {

  /**
   * Method transformaTexto.
   */
  public String transformaTexto(String frase) {
    String novaFrase = frase.replace("+", " ");

    if (novaFrase.indexOf("a") % 2 == 0) {
      return novaFrase.toUpperCase();
    }

    return novaFrase.split(" ")[0];
  }  
}
