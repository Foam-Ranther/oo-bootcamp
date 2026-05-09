package com.tw.bootcamp.problem5.constraints;

import com.tw.bootcamp.problem5.Ball;
import com.tw.bootcamp.problem5.errors.CannotAddBallException;

import java.util.List;

public interface Rule {
  boolean apply(List<Ball> balls) throws CannotAddBallException;
}
