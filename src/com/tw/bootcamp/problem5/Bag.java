package com.tw.bootcamp.problem5;

import java.util.Objects;

public class Bag {
  private final int capacity;
  private int noOfBalls;

  public Bag(int maxCapacity) {
    capacity = maxCapacity;
    noOfBalls = 0;
  }



  public int add(Ball ball) throws NoSpaceLeftException {
    if (noOfBalls == capacity) {
      throw new NoSpaceLeftException("Bag is Full");
    }
    noOfBalls++;
    return noOfBalls;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Bag bag = (Bag) o;
    return capacity == bag.capacity && noOfBalls == bag.noOfBalls;
  }

  @Override
  public int hashCode() {
    return Objects.hash(capacity, noOfBalls);
  }
}
