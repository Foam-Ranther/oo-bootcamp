package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BallTest {
  @Test
  void shouldInitialiseABall() {
    assertInstanceOf(Ball.class, new Ball(Color.BLUE));
  }
}