package com.trybe.acc.java.jogodasfazendas;

public class Square implements Farm {
  double side;
  
  public Square(double side) {
    this.side = side;
  }
  
  public double area() {
    double area = side * side;
    return area;
  }
}
