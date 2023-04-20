package com.trybe.acc.java.iocdi.sistemapagamentos.controller;

import com.trybe.acc.java.iocdi.sistemapagamentos.interceptor.RestritoPermissaoEscrita;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * InterceptorController class.
 */
@RestController
@RequestMapping("/middleware")
public class InterceptorController {

  @RestritoPermissaoEscrita
  @GetMapping("/com-interceptor")
  public String comInterceptor() {
    return "Com interceptor";
  }

  @GetMapping("/sem-interceptor")
  public String semInterceptor() {
    return "Sem interceptor";
  }
}