package com.tw.bootcamp.problem5.constraints;

import com.tw.bootcamp.problem5.Ball;
import com.tw.bootcamp.problem5.errors.CannotAddBallException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoMoreThanFortyPercentTest {
  @Test
  void shouldAllow() throws CannotAddBallException {
    List<Ball> balls = new ArrayList(12);
    balls.add(Ball.GREEN);
    balls.add(Ball.GREEN);
    balls.add(Ball.YELLOW);
    NoMoreThanFortyPercent noMoreThanFortyPercent = new NoMoreThanFortyPercent();
    assertTrue(noMoreThanFortyPercent.apply(balls));
  }
  @Test
  void shouldThrowTheError() throws CannotAddBallException {
    List<Ball> balls = new ArrayList(12);
    balls.add(Ball.GREEN);
    balls.add(Ball.YELLOW);
    NoMoreThanFortyPercent noMoreThanFortyPercent = new NoMoreThanFortyPercent();
    assertThrows(CannotAddBallException.class, () -> noMoreThanFortyPercent.apply(balls));
  }
}