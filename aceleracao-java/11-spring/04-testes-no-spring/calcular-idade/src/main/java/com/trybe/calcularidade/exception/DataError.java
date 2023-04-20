package com.trybe.calcularidade.exception;

/**
 * Classe DataError.
 **/

public class DataError {

  private String error;
  
  public DataError(String error) {
    this.error = error;
  }
  
  public String getError() {
    return error;
  }

}
