package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

  @Test
  void shouldReturnProbabilityOfTails() {
    assertEquals(0.5, Chance.gettingOutcome(1, 2));
  }

  @Test
  void shouldReturnProbabilityOfNotGettingTails() {
    assertEquals(0.5, Chance.gettingOutcome(1, 2));
  }


}