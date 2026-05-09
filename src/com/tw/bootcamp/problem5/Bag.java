package com.tw.bootcamp.problem5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Bag {
  private final int capacity;
  private List<Ball> balls;

  public Bag(int maxCapacity) {
    capacity = maxCapacity;
    balls = new ArrayList<>(12);
  }

  public int add(Ball ball) throws NoSpaceLeftException, MaxedQuantitiyReachedException {
    if (balls.size() == capacity) {
      throw new NoSpaceLeftException("Bag is Full");
    }
    if(hasAtMostThreeGreenBalls()) {
      throw new MaxedQuantitiyReachedException("At least three ball are allowed");
    };
    balls.add(ball);
    return balls.size();
  }

  private boolean hasAtMostThreeGreenBalls() {
    return Collections.frequency(balls, Ball.GREEN) == 3;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Bag bag = (Bag) o;
    return capacity == bag.capacity && Objects.equals(balls, bag.balls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, balls);
  }
}
