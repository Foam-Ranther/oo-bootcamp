package com.tw.bootcamp.problem5.constraints;

import com.tw.bootcamp.problem5.Ball;
import com.tw.bootcamp.problem5.errors.CannotAddBallException;

import java.util.Collections;
import java.util.List;

public class NoMoreThanFortyPercent implements Rule{

  @Override
  public boolean apply(List<Ball> balls) throws CannotAddBallException {
    int frequency = Collections.frequency(balls, Ball.YELLOW);
    if (((double) frequency / balls.size()) < 0.4 ) {
    return true;
    }
    throw new CannotAddBallException("only 40 percent yellow allowed");
  }
}
