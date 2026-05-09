package com.tw.bootcamp.problem5.constraints;

import com.tw.bootcamp.problem5.Ball;
import com.tw.bootcamp.problem5.errors.CannotAddBallException;

import java.util.Collections;
import java.util.List;

public class AtLeastThreeGreenBalls implements Rule {
  @Override
  public boolean apply(List<Ball> balls) throws CannotAddBallException {
    if(Collections.frequency(balls, Ball.GREEN) == 3) {
      throw new CannotAddBallException("At least three green balls are allowed");
    }
    return true;
  }

}
