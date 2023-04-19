package com.trybe.acc.java.anobissexto;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

/**
 * Class AnoBissexto.
 */
public class AnoBissexto {

  /**
   * identificarAnoBissexto Method.
   */
  public boolean identificarAnoBissexto(int ano) {
    boolean ehBissexto = Year.isLeap(ano);
    if (ehBissexto) {
      return true;
    }
    
    return false;
  }

  /**
   * identificarProximoAnoBissexto Method.
   */
  public int identificarProximoAnoBissexto(String data) {
    DateTimeFormatter formatoEspecifico = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    LocalDate dataFornecida = LocalDate.parse(data, formatoEspecifico);

    while (!dataFornecida.isLeapYear()) {
      dataFornecida = dataFornecida.plusYears(1);
    }

    int proximoBissexto = dataFornecida.getYear();

    return proximoBissexto;
  }
}