package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

  @Test
  void shouldRepresentChanceOfGettingTails() throws Throwable {
    Chance chanceOfTails = Chance.create(0.5);
    assertEquals(chanceOfTails, Chance.create(0.5));
  }

  @Test
  void shouldRepresentChanceOfNotGettingTails() throws Throwable {
    Chance chanceOfTails = Chance.create(0.5);
    assertEquals(0.5, chanceOfTails.not());
  }

  @Test
  void shouldRepresentChanceOfGettingTailsOn2Coins() throws Throwable {
    Chance chanceOfGettingTailsOn2Coins = Chance.create(0.75);
    assertEquals(chanceOfGettingTailsOn2Coins, Chance.create(0.75));
  }

  @Test
  void shouldThrowErrorIfChanceIsBelowZero() {
    assertThrows(Throwable.class, () -> Chance.create(-2));
  }

  @Test
  void shouldReturnChanceOfGettingTailsOn2Coins() throws Throwable {
    Chance chanceOfGettingTail = Chance.create(0.5);

    assertEquals(0.25, chanceOfGettingTail.and(chanceOfGettingTail));
  }

  @Test
  void shouldReturnChanceOfGettingAtLeastOneTailsOn2Coins() throws Throwable {
    Chance chanceOfGettingTail = Chance.create(0.5);
    Chance chanceOfNotGettingTail = Chance.create(chanceOfGettingTail.not());

    assertEquals(0.75, chanceOfNotGettingTail.or(chanceOfGettingTail));
  }
}