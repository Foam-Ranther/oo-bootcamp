package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

  @Test
  void shouldRepresentChanceOfGettingTails() throws Throwable {
    Chance chanceOfTails = Chance.create(0.5);
    assertTrue(chanceOfTails.equals(Chance.create(0.5)));
  }

  @Test
  void shouldRepresentChanceOfNotGettingTails() throws Throwable {
    Chance chanceOfTails = Chance.create(0.5);
    assertEquals(0.5, chanceOfTails.complement());
  }

  @Test
  void shouldRepresentChanceOfGettingTailsOn2Coins() throws Throwable {
    Chance chanceOfGettingTailsOn2Coins = Chance.create(0.75);
    assertTrue(chanceOfGettingTailsOn2Coins.equals(Chance.create(0.75)));
  }

  @Test
  void shouldThrowErrorIfChanceIsBelowZero() {
    assertThrows(Throwable.class, () -> Chance.create(-2));
  }

}