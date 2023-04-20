package com.trybe.acc.java.buzzwarn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Class App.
 */
public class App {
  private static final Logger LOGGING = LogManager.getLogger(App.class);

  public static void main(String[] args) {
    LOGGING.error("Este projeto é apenas para o teste!");
  }
}
