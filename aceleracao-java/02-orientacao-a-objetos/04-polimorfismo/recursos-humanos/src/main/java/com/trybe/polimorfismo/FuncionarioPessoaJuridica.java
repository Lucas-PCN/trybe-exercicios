package com.trybe.polimorfismo;

/**
 * Classe pessoa jurídica.
 */
public class FuncionarioPessoaJuridica extends Funcionario {
  public double calcularSalarioLiquido() {
    double salarioLiquido = super.getSalarioBruto() * 0.9;
    return salarioLiquido;
  }
}
