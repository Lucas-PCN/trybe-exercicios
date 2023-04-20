package com.trybe.acc.java.sistemarh;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PessoaColaboradoraTest {


  @Test
  @DisplayName("10. Teste do método CalcularSalarioLiquido")
  public void testeCalcularSalarioLiquido() {
    PessoaColaboradora colaborador = new PessoaColaboradora();
    colaborador.setSalarioBruto(10000.0);
    assertEquals(8000.0, colaborador.calcularSalarioLiquido());
  }


  @Test
  @DisplayName("11. Teste do método CalcularValorBrutoRecebidoAnual")
  public void testeCalcularValorBrutoRecebidoAnual() {
    PessoaColaboradora colaborador = new PessoaColaboradora();
    colaborador.setSalarioBruto(10000.0);
    assertEquals(120000.0, colaborador.calcularValorBrutoRecebidoAnual(1));
  }


  @Test
  @DisplayName("12. Teste do método CalcularValorLiquidoRecebidoAnual")
  public void testeCalcularValorLiquidoRecebidoAnual() {
    PessoaColaboradora colaborador = new PessoaColaboradora();
    colaborador.setSalarioBruto(10000.0);
    assertEquals(96000.0, colaborador.calcularValorLiquidoRecebidoAnual(1));
  }


  @Test
  @DisplayName("13. Teste do método CalcularValorImpostoAnual")
  public void testeCalcularValorImpostoAnual() {
    PessoaColaboradora colaborador = new PessoaColaboradora();
    colaborador.setSalarioBruto(10000.0);
    assertEquals(24000.0, colaborador.calcularValorImpostoAnual(1));
  }

}
