package com.trybe.acc.java.iocdi.sistemapagamentos.service;

import com.trybe.acc.java.iocdi.sistemapagamentos.model.Auth;
import com.trybe.acc.java.iocdi.sistemapagamentos.model.Payment;
import com.trybe.acc.java.iocdi.sistemapagamentos.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * PagamentoService service.
 */
@Service
public class PagamentoService {
  @Autowired
  private PagamentoRepository pagamentoRepository;

  @Autowired
  private AuthConfigService authConfigService;

  public Auth validarLogin(Auth auth) {
    return authConfigService.fazerLogin(auth);
  }

  public Payment criarPagamento(Payment pagamento) {
    return pagamentoRepository.criarPagamento(pagamento);
  }
}