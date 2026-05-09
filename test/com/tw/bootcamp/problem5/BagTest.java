package com.tw.bootcamp.problem5;

import com.tw.bootcamp.problem5.constraints.AtLeastThreeGreenBalls;
import com.tw.bootcamp.problem5.constraints.IsValidRedToGreenRatio;
import com.tw.bootcamp.problem5.constraints.Rule;
import com.tw.bootcamp.problem5.errors.CannotAddBallException;
import com.tw.bootcamp.problem5.errors.NoSpaceLeftException;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class BagTest {

  @Test
  void shouldAddABallToBag() throws NoSpaceLeftException, CannotAddBallException {
    HashMap<Ball, Rule> rules = new HashMap();
    Bag bag = new Bag(12, new Rulebook(rules));
    int noOfBallsInBag = bag.add(Ball.BLUE);
    assertEquals(1, noOfBallsInBag);
  }

  @Test
  void shouldThrowExceptionWhenBagIsFull() {
    HashMap<Ball, Rule> rules = new HashMap();

    Bag bag = new Bag(0, new Rulebook(rules));
    assertThrows(NoSpaceLeftException.class, () -> bag.add(Ball.BLUE));
  }

  @Test
  void shouldNotAddMoreThan3GreenBalls() throws NoSpaceLeftException, CannotAddBallException {
    HashMap<Ball, Rule> rules = new HashMap();
    rules.put(Ball.GREEN, new AtLeastThreeGreenBalls());
    Bag bag = new Bag(12, new Rulebook(rules));
    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);
    assertThrows(CannotAddBallException.class, () -> bag.add(Ball.GREEN));
  }

  @Test
  void shouldNotAddARedBallAgainstNoGreen(){
    HashMap<Ball, Rule> rules = new HashMap();
    rules.put(Ball.GREEN, new AtLeastThreeGreenBalls());
    rules.put(Ball.RED, new IsValidRedToGreenRatio());
    Bag bag = new Bag(12, new Rulebook(rules));
    assertThrows(CannotAddBallException.class, () -> bag.add(Ball.RED));
  }
}