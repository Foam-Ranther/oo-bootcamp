package com.tw.bootcamp.problem1;

public class Rectangle {

  private final int width;
  private final int length;

  private Rectangle(int width, int length) {
    this.width = width;
    this.length = length;
  }

  public static Rectangle createRectangle(int width, int length) {
    return new Rectangle(width, length);
  }

  public static Rectangle createSquare(int side) {
    return new Rectangle(side , side);
  }

  public int area() {
    return width * length;
  }

  public int perimeter() {
    return 2 * (width + length);
  }
}
