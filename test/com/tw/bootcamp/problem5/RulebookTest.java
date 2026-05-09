package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RulebookTest {
  @Test
  void createInstanceOfRulebook() {
    Rulebook rulebook = new Rulebook();
    assertInstanceOf(Rulebook.class, rulebook);
  }

  @Test
  void shouldAllowAtLeastThreeGreenBalls() throws NoSpaceLeftException, CannotAddBallException, MaxedQuantitiyReachedException {
    Rulebook rulebook = new Rulebook();
    List<Ball> balls = new ArrayList();
    balls.add(Ball.GREEN);
    balls.add(Ball.GREEN);
    balls.add(Ball.GREEN);
    assertThrows(CannotAddBallException.class, ()-> rulebook.canAdd(balls, Ball.GREEN));
  }


  @Test
  void shouldNotAllowToAddRedBall() throws NoSpaceLeftException, CannotAddBallException, MaxedQuantitiyReachedException {
    Rulebook rulebook = new Rulebook();
    List<Ball> balls = new ArrayList();
    assertThrows(CannotAddBallException.class, ()-> rulebook.canAdd(balls, Ball.RED));
  }
}