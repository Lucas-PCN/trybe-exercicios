package com.trybe.acc.java.jogodasfazendas;

public class Rectangle extends Polygon {
  public Rectangle(double base, double height) {
    super(base, height);
  }
  
  public double area() {
    double area = super.base * super.height;
    return area;
  }
}
