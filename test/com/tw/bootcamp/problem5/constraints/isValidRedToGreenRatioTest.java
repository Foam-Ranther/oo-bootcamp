package com.tw.bootcamp.problem5.constraints;

import com.tw.bootcamp.problem5.*;
import com.tw.bootcamp.problem5.errors.CannotAddBallException;
import com.tw.bootcamp.problem5.errors.NoSpaceLeftException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class isValidRedToGreenRatioTest {
  @Test
  void shouldAdd() throws CannotAddBallException {
    List<Ball> balls = new ArrayList();
    balls.add(Ball.GREEN);
    IsValidRedToGreenRatio IsValidRedToGreenRatio = new IsValidRedToGreenRatio();
    assertTrue(IsValidRedToGreenRatio.apply(balls));
  }

  @Test
  void shouldNotAllowToAddRedBall() {
    IsValidRedToGreenRatio IsValidRedToGreenRatio = new IsValidRedToGreenRatio();
    List<Ball> balls = new ArrayList();
    assertThrows(CannotAddBallException.class, ()-> IsValidRedToGreenRatio.apply(balls));
  }
}