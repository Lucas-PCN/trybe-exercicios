package com.trybe.calcularidade.controller;

import com.trybe.calcularidade.domain.Idade;
import com.trybe.calcularidade.service.CalculadoraService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe CalcularDataController.
 **/
@RestController
public class CalcularDataController {

  @Autowired
  private CalculadoraService calculadoraService;

  /**
   * calcularIdade method.
   */
  @GetMapping("/")
  @CircuitBreaker(name = "calcularIdade", fallbackMethod = "fallback")
  public ResponseEntity<Idade> calcularIdade(
      @RequestParam("data") String dataNascimento,
      @RequestParam(name = "fallback", defaultValue = "false") boolean fallback
  ) {
    Idade idade = calculadoraService.calcularIdade(dataNascimento);
    return ResponseEntity.ok(idade);
  }

  /**
   * fallback method.
   */
  public ResponseEntity<Idade> fallback(String dataNascimento, boolean fallback, Exception e) {
    if (fallback) {
      return ResponseEntity.ok(new Idade(0));
    }

    return this.calcularIdade(dataNascimento, fallback);
  }

}
