package com.tw.bootcamp.problem5;

import com.tw.bootcamp.problem5.errors.CannotAddBallException;
import com.tw.bootcamp.problem5.errors.NoSpaceLeftException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bag {
  private final int capacity;
  private final Rulebook rulebook;
  private List<Ball> balls;

  public Bag(int maxCapacity, Rulebook rulebook) {
    capacity = maxCapacity;
    this.rulebook = rulebook;
    balls = new ArrayList<>(12);
  }

  public int add(Ball ball) throws NoSpaceLeftException, CannotAddBallException {
    if (balls.size() == capacity) {
      throw new NoSpaceLeftException("Bag is Full");
    }
    if (rulebook.canAdd(balls, ball)) {
      balls.add(ball);
    }
    return balls.size();
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
