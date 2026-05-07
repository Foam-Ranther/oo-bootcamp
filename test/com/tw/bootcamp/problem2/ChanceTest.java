package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

  @Test
  void shouldRepresentChanceOfGettingTails() {
    Chance chanceOfTails = Chance.create(0.5);
    assertTrue(chanceOfTails.equals(Chance.create(0.5)));
  }

  @Test
  void shouldRepresentChanceOfNotGettingTails() {
    Chance chanceOfNotGettingTails = Chance.createComplement(0.5);
    assertTrue(chanceOfNotGettingTails.equals(Chance.createComplement(0.5)));
  }

  @Test
  void shouldRepresentChanceOfGettingTailsOn2Coins() {
    Chance chanceOfGettingTailsOn2Coins = Chance.create(0.75);
    assertTrue(chanceOfGettingTailsOn2Coins.equals(Chance.create(0.75)));
  }

}