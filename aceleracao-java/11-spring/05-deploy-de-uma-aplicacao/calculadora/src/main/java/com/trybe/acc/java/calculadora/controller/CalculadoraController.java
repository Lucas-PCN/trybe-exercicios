package com.trybe.acc.java.calculadora.controller;

import com.trybe.acc.java.calculadora.domain.Valor;
import com.trybe.acc.java.calculadora.service.CalculadoraService;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * CalculadoraController class.
 */
@RestController
@RequestMapping("/")
public class CalculadoraController {

  /**
   * calculadora method.
   */
  @GetMapping("/")
  public ResponseEntity<Valor> calculadora(
      @RequestParam("primeiroValor") int primeiroValor,
      @RequestParam("segundoValor") int segundoValor,
      @RequestParam("operacao") String operacao) {
    switch (operacao) {
      case "ADICAO":
        return ResponseEntity.ok(CalculadoraService.somar(primeiroValor, segundoValor));
      case "SUBTRACAO":
        return ResponseEntity.ok(CalculadoraService.subtrair(primeiroValor, segundoValor));
      case "MULTIPLICACAO":
        return ResponseEntity.ok(CalculadoraService.multiplicar(primeiroValor, segundoValor));
      case "DIVISAO":
        return ResponseEntity.ok(CalculadoraService.dividir(primeiroValor, segundoValor));
      default:
        return ResponseEntity.status(Response.SC_BAD_REQUEST).build();
    }
  }

}