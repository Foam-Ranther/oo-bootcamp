package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {

  @Test
  void initialiseChance() {
    Chance chance = Chance.createChance(0.5);
    assertInstanceOf(Chance.class, chance);
    assertTrue(chance.equals(Chance.createChance(0.5)));
  }

  @Test
  void initialiseComplementOfChance() {
    Chance complementChance = Chance.createChanceComplement(0.5);
    assertInstanceOf(Chance.class, complementChance);
    assertTrue(complementChance.equals(Chance.createChance(0.5)));

  }


}