package com.tw.bootcamp.problem5;

import com.tw.bootcamp.problem5.constraints.AtLeastThreeGreenBalls;
import com.tw.bootcamp.problem5.constraints.IsValidRedToGreenRatio;
import com.tw.bootcamp.problem5.constraints.Rule;
import com.tw.bootcamp.problem5.errors.CannotAddBallException;
import com.tw.bootcamp.problem5.errors.NoSpaceLeftException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RulebookTest {
  @Test
  void createInstanceOfRulebook() {
    HashMap<Ball, Rule> rules = new HashMap();
    Rulebook rulebook = new Rulebook(rules);
    assertInstanceOf(Rulebook.class, rulebook);
  }

  @Test
  void shouldAllowAtLeastThreeGreenBalls()  {
    HashMap<Ball, Rule> rules = new HashMap();
    rules.put(Ball.GREEN, new AtLeastThreeGreenBalls());
    Rulebook rulebook = new Rulebook(rules);
    List<Ball> balls = new ArrayList();
    balls.add(Ball.GREEN);
    balls.add(Ball.GREEN);
    balls.add(Ball.GREEN);
    assertThrows(CannotAddBallException.class, ()-> rulebook.canAdd(balls, Ball.GREEN));
  }


  @Test
  void shouldNotAllowToAddRedBall()  {
    HashMap<Ball, Rule> rules = new HashMap();
    rules.put(Ball.GREEN, new AtLeastThreeGreenBalls());
    rules.put(Ball.RED, new IsValidRedToGreenRatio());
    Rulebook rulebook = new Rulebook(rules);
    List<Ball> balls = new ArrayList();
    assertThrows(CannotAddBallException.class, ()-> rulebook.canAdd(balls, Ball.RED));
  }
}