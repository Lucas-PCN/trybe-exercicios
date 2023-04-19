package com.trybe.acc.java.jogodasfazendas;

public class PlayerResult {
  String playerName;
  private Farm[] farms;
  
  PlayerResult(String name, Farm[] farms) {
    this.playerName = name;
    this.farms = farms;
  }
  
  /**
   * método score.
   */
  public double score() {
    double score = 0;
    for (Farm farm : this.farms) {
      score += farm.area();
    }
    return score;
  }
}
