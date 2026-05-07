package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
  @Test
  void shouldCreateInstanceOfSquare() {
    assertInstanceOf(Square.class, new Square(5));
  }

  @Test
  void shouldCalculateArea() {
    Square square = new Square(5);
    assertEquals(25, square.area());
  }

  @Test
  void shouldCalculatePerimeter() {
    Square square = new Square(5);
    assertEquals(20, square.perimeter());
  }
}