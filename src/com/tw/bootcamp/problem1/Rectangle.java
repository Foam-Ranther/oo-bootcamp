package com.tw.bootcamp.problem1;

public class Rectangle implements Shape {

  private final int width;
  private final int length;

  public Rectangle(int width, int length) {
    this.width = width;
    this.length = length;
  }

  @Override
  public int area() {
    return width * length;
  }

  @Override
  public int perimeter() {
    return 2 * (width + length);
  }
}
