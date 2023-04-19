package com.trybe.acc.java.jogodasfazendas;

public class Circle implements Farm {
  static double PI = 3.14;
  private double radius;
  
  public Circle(double radius) {
    this.radius = radius;
  }

  public double area() {
    double area = PI * radius * radius;
    return area;
  }

}
