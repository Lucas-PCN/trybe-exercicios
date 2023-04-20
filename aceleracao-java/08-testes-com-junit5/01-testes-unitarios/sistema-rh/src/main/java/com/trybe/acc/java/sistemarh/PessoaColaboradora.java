package com.trybe.acc.java.sistemarh;

/**
 * PessoaColaboradora class.
 */
public class PessoaColaboradora {
  double salarioBruto;

  public double calcularSalarioLiquido() {
    return this.salarioBruto * 0.8;
  }

  public double calcularValorBrutoRecebidoAnual(int ano) {
    return this.salarioBruto * ano * 12;
  }

  public double calcularValorLiquidoRecebidoAnual(int ano) {
    return this.calcularSalarioLiquido() * ano * 12;
  }

  public double calcularValorImpostoAnual(int ano) {
    return this.calcularValorBrutoRecebidoAnual(ano) - this.calcularValorLiquidoRecebidoAnual(ano);
  }

  public double getSalarioBruto() {
    return this.salarioBruto;
  }

  public void setSalarioBruto(double salarioBruto) {
    this.salarioBruto = salarioBruto;
  }

}
