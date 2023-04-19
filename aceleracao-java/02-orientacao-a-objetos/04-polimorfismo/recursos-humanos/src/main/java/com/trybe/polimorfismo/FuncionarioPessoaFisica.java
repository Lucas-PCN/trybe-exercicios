package com.trybe.polimorfismo;

/**
 * Classe pessoa física.
 */
public class FuncionarioPessoaFisica extends Funcionario {
  public double calcularSalarioLiquido() {
    double salarioLiquido = super.getSalarioBruto() * 0.8;
    return salarioLiquido;
  }
}
