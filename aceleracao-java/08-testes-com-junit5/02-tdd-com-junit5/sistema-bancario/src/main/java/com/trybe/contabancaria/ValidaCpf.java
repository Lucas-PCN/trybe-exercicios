package com.trybe.contabancaria;

/**
 * Classe ValidaCpf.
 **/

public class ValidaCpf {

  /**
   * Método validarCpf.
   **/
  public static boolean validarCpf(String cpf) {
    boolean primeiroDV = false;
    boolean segundoDV = false;
    int soma = 0;
    int peso = 10;
    
    for (int index = 0; index < 9; index += 1) {
      soma = soma + (Character.getNumericValue(cpf.charAt(index)) * peso);
      peso -= 1;
    }
    
    if (11 - (soma % 11) == Character.getNumericValue(cpf.charAt(9))) {
      primeiroDV = true;
    }
    
    if (11 - (soma % 11) == 10 || 11 - (soma % 11) == 11
            & Character.getNumericValue(cpf.charAt(9)) == 0) {
      primeiroDV = true;
    }
    
    int soma2 = 0;
    int peso2 = 11;
    
    for (int index = 0; index < 10; index += 1) {
      soma2 = soma2 + (Character.getNumericValue(cpf.charAt(index)) * peso2);
      peso2 -= 1;
    }
    
    if (11 - (soma2 % 11) == Character.getNumericValue(cpf.charAt(10))) {
      segundoDV = true;
    }
    
    if (11 - (soma2 % 11) == 10 || 11 - (soma2 % 11) == 11
            & Character.getNumericValue(cpf.charAt(10)) == 0) {
      segundoDV = true;
    }
    
    return primeiroDV & segundoDV;
  }
}
