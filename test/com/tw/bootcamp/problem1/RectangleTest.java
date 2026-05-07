package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class RectangleTest {

  @Test
  void shouldReturnARectangleObject() {
    Rectangle rectangle = Rectangle.createRectangle(2, 3);
    assertInstanceOf(Rectangle.class, rectangle);
  }

  @Test
  void shouldCalculateArea() {
    Rectangle rectangle = Rectangle.createRectangle(2, 3);
    assertEquals(6, rectangle.area());
  }

  @Test
  void shouldCalculatePerimeter() {
    Rectangle rectangle = Rectangle.createRectangle(2, 3);
    assertEquals(10, rectangle.perimeter());
  }

  @Test
  void shouldCreateASquare() {
    Rectangle square = Rectangle.createSquare(3);
    assertInstanceOf(Rectangle.class, square);
  }

  @Test
  void shouldCalculateAreaOfSquare() {
    Rectangle square = Rectangle.createSquare(5);
    assertEquals(25, square.area());
  }

  @Test
  void shouldCalculatePerimeterOfSquare() {
    Rectangle square = Rectangle.createSquare(5);
    assertEquals(20, square.perimeter());
  }

  @Test
  void shouldCalculateAreaOfSquareHavingSideAsDouble() {
    Rectangle square = Rectangle.createSquare(2.2);
    assertEquals(4.84, square.area(), 0.1);
  }
}