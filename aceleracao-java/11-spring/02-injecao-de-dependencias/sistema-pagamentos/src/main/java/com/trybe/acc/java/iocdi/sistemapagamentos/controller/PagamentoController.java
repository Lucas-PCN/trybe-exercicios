package com.trybe.acc.java.iocdi.sistemapagamentos.controller;

import com.trybe.acc.java.iocdi.sistemapagamentos.model.Payment;
import com.trybe.acc.java.iocdi.sistemapagamentos.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * PagamentoController class.
 */
@RestController
public class PagamentoController {
  @Autowired
  private PagamentoService pagamentoService;

  @PostMapping("/pagamento")
  public Payment criarPagamento(Payment pagamento) {
    return pagamentoService.criarPagamento(pagamento);
  }  
}