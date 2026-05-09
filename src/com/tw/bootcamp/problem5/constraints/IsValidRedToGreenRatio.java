package com.tw.bootcamp.problem5.constraints;

import com.tw.bootcamp.problem5.Ball;
import com.tw.bootcamp.problem5.errors.CannotAddBallException;

import java.util.Collections;
import java.util.List;

public class IsValidRedToGreenRatio implements Rule {
  public IsValidRedToGreenRatio() {

  }
  public boolean apply(List<Ball> balls) throws CannotAddBallException {
    if(2 * Collections.frequency(balls, Ball.RED) >= Collections.frequency(balls, Ball.GREEN)){
      throw new CannotAddBallException("ratio of green to red ball is off");
    }
    return true;
  }

}
