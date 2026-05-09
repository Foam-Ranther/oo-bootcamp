package com.tw.bootcamp.problem5;

import com.tw.bootcamp.problem5.constraints.Rule;
import com.tw.bootcamp.problem5.errors.CannotAddBallException;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Rulebook {
  private final HashMap<Ball, Rule> rules;

  public Rulebook(HashMap<Ball, Rule> rules) {
    this.rules = rules;
  }

  public boolean canAdd(List<Ball> balls, Ball ball) throws CannotAddBallException {
    if (rules.containsKey(ball)){
    return rules.get(ball).apply(balls);
    }
    return true;
  }

}
