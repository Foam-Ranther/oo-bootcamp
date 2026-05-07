package com.tw.bootcamp.problem1;

public class Rectangle {

  private final int width;
  private final int length;

  public Rectangle(int width, int length) {
    this.width = width;
    this.length = length;
  }

  public int area() {
    return width * length;
  }

  public int perimeter() {
    return 2 * (width + length);
  }
}
