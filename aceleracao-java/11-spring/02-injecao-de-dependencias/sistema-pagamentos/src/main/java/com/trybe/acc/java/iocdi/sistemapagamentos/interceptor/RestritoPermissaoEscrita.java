package com.trybe.acc.java.iocdi.sistemapagamentos.interceptor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * RestritoPermissaoEscrita interface.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RestritoPermissaoEscrita {

  /**
   * Verificacao. 
   */
  Verificacao verifica() default Verificacao.ADMINISTRADOR;

}
