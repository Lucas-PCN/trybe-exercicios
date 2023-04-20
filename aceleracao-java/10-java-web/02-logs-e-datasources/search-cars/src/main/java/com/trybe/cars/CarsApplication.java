package com.trybe.cars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Classe CarsApplication.
 * 
 */
@SpringBootApplication
@SpringBootConfiguration
public class CarsApplication {

  public static void main(String[] args) {
    SpringApplication.run(CarsApplication.class, args);
  }

}
