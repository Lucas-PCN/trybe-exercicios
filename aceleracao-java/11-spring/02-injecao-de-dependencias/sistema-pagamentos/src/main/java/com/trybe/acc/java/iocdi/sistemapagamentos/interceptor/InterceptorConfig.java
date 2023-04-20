package com.trybe.acc.java.iocdi.sistemapagamentos.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * InterceptorConfig class.
 */
@Component
public class InterceptorConfig implements WebMvcConfigurer {
  private Interceptor interceptor;

  public InterceptorConfig(Interceptor interceptor) {
    this.interceptor = interceptor;
  }

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(interceptor);
  }
}