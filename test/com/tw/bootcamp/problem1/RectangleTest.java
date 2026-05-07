package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

  private Rectangle rectangle;

  @BeforeEach
  void setUp() {
    rectangle = new Rectangle(2, 3);
  }


  @Test
  void shouldReturnARectangleObject() {
    assertInstanceOf(Rectangle.class, rectangle);
  }

  @Test
  void shouldCalculateArea() {
    assertEquals(6, rectangle.area());
  }

  @Test
  void shouldCalculatePerimeter() {
    assertEquals(10, rectangle.perimeter());
  }
}