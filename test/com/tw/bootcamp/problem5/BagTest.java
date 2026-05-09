package com.tw.bootcamp.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

  @Test
  void shouldAddABallToBag() throws NoSpaceLeftException {
    Bag bag = new Bag(12);
    int noOfBallsInBag = bag.add();
    assertEquals(1, noOfBallsInBag);
  }

  @Test
  void shouldThrowExceptionWhenBagIsFull() {
    Bag bag = new Bag(0);
    assertThrows(NoSpaceLeftException.class, bag::add);
  }
}