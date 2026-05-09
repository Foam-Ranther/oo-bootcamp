package com.tw.bootcamp.problem5.constraints;

import com.tw.bootcamp.problem5.*;
import com.tw.bootcamp.problem5.errors.CannotAddBallException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class atLeastGreenThreeBallsTest {

  @Test
  void shouldAllowAddingOfBallIfLessThanThreeGreenBalls() throws CannotAddBallException {
    AtLeastThreeGreenBalls rule = new AtLeastThreeGreenBalls();
    List<Ball> balls = new ArrayList();
    balls.add(Ball.GREEN);
    balls.add(Ball.GREEN);
    assertTrue(rule.apply(balls));
  }
  @Test
  void shouldNotAllowAddingOfBallIfMoreThanThreeGreenBalls() {
    AtLeastThreeGreenBalls rule = new AtLeastThreeGreenBalls();
    List<Ball> balls = new ArrayList();
    balls.add(Ball.GREEN);
    balls.add(Ball.GREEN);
    balls.add(Ball.GREEN);
    assertThrows(CannotAddBallException.class, ()-> rule.apply(balls));
  }
}