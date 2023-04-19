package com.trybe.acc.java;

import java.time.LocalDateTime;

/**
 * Class SimuladorRendimento.
 */
public class SimuladorRendimento {
  /**
   * main Method.
   */
  public static void main(String[] args) {
    SimuladorRendimento obj = new SimuladorRendimento();
    double montanteInicial = 500;
    double valorMeta = 5000;
    int anoDaMeta = obj.simularRendimentoAnos(montanteInicial, valorMeta);
    System.out.println("Com " + montanteInicial + " seu rendimento será "
            + valorMeta + " no ano " + anoDaMeta);
  }

  /**
   * simularRendimentos Method.
   */
  public int simularRendimentoAnos(double montanteInicial, double valorMeta) {
    LocalDateTime anoPresente = LocalDateTime.now();

    while (montanteInicial < valorMeta) {
      montanteInicial = montanteInicial * 1.1;
      anoPresente = anoPresente.plusYears(1);
    }

    int anoDaMeta = anoPresente.getYear();

    return anoDaMeta;
  }
}
