package com.tw.bootcamp.problem1;

public class Rectangle {

  private final double width;
  private final double length;

  private Rectangle(double width, double length) {
    this.width = width;
    this.length = length;
  }

  public static Rectangle createRectangle(double width, double length) {
    return new Rectangle(width, length);
  }

  public static Rectangle createSquare(double side) {
    return new Rectangle(side , side);
  }

  public double area() {
    return width * length;
  }

  public double perimeter() {
    return 2 * (width + length);
  }
}
