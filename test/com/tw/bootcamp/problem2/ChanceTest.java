package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

  @Test
  void shouldRepresentChanceOfGettingTails() {
    Chance chanceOfTails = Chance.createChance(0.5);
    assertTrue(chanceOfTails.equals(Chance.createChance(0.5)));
  }

  @Test
  void shouldRepresentChanceOfNotGettingTails() {
    Chance chanceOfNotGettingTails = Chance.createChanceComplement(0.5);
    assertTrue(chanceOfNotGettingTails.equals(Chance.createChanceComplement(0.5)));
  }

  @Test
  void shouldRepresentChanceOfGettingTailsOn2Coins() {
    Chance chanceOfGettingTailsOn2Coins = Chance.createChance(0.75);
    assertTrue(chanceOfGettingTailsOn2Coins.equals(Chance.createChance(0.75)));
  }
//
//  @Test
//  void shouldRepresentChanceOfGetting3OnDice() {
//  }
}