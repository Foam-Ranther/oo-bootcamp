package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

  @Test
  void shouldAddABallToBag() throws NoSpaceLeftException, MaxedQuantitiyReachedException {
    Bag bag = new Bag(12);
    int noOfBallsInBag = bag.add(Ball.BLUE);
    assertEquals(1, noOfBallsInBag);
  }

  @Test
  void shouldThrowExceptionWhenBagIsFull() {
    Bag bag = new Bag(0);
    assertThrows(NoSpaceLeftException.class, () -> bag.add(Ball.BLUE));
  }

  @Test
  void shouldNotAddMoreThan3GreenBalls() throws NoSpaceLeftException, MaxedQuantitiyReachedException {
    Bag bag = new Bag(12);
    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);
    assertThrows(MaxedQuantitiyReachedException.class, () -> bag.add(Ball.GREEN));

  }
}