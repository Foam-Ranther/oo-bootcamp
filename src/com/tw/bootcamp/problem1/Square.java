package com.tw.bootcamp.problem1;

public class Square implements Shape{

  private final int side;

  public Square(int side) {
    this.side = side;
  }

  public int area() {
    return side * side;
  }

  public int perimeter() {
    return 4 * side;
  }
}
