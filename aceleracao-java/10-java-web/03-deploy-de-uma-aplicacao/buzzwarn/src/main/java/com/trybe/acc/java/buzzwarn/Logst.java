package com.trybe.acc.java.buzzwarn;

import org.apache.logging.log4j.Logger;

/**
 * Class Logst.
 */
public class Logst {

  private Logger logging;

  public Logst(Logger log) {
    this.logging = log;
  }

  /**
   * CountLogger method.
   */
  public void countLogger() {
    for (int i = 1; i <= 30; i += 1) {
      if (i % 3 == 0 && i % 5 == 0) {
        logging.warn(i);
      } else if (i % 5 == 0) {
        logging.debug(i);
      } else if (i % 3 == 0) {
        logging.trace(i);
      } else {
        logging.info(i);
      }
    }
  }
}
