package com.tw.bootcamp.problem5;

import java.util.Collections;
import java.util.List;

public class Rulebook {
  public Rulebook() {

  }

  public boolean canAdd(List<Ball> balls, Ball ball) throws CannotAddBallException {
    switch (ball) {
      case Ball.GREEN:
        return canAddGreenBall(balls);
      case Ball.RED:
        return canAddRedBall(balls);
      default:
        return true;
    }
  }

  private boolean canAddRedBall(List<Ball> balls) throws CannotAddBallException {
    if(2 * Collections.frequency(balls, Ball.RED) >= Collections.frequency(balls, Ball.GREEN)){
      throw new CannotAddBallException("ratio of green to red ball is off");
    }
    return true;
  }

  private boolean canAddGreenBall(List<Ball> balls) throws CannotAddBallException {
    if( hasAtMostThreeGreenBalls(balls)) {
      throw new CannotAddBallException("At least three green balls are allowed");
    }
    return true;
  }

  private boolean hasAtMostThreeGreenBalls(List<Ball> balls) {
    return Collections.frequency(balls, Ball.GREEN) == 3;
  }

}
