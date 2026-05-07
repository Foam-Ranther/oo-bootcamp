package com.tw.bootcamp.problem1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

  @Test
  void shouldReturnARectangleObject() {
    Rectangle rectangle = new Rectangle(2, 3);
    assertInstanceOf(Rectangle.class, rectangle);
  }

  @Test
  void shouldCalculateArea() {
    Rectangle rectangle = new Rectangle(2, 3);
    assertEquals(6, rectangle.area());
  }
}