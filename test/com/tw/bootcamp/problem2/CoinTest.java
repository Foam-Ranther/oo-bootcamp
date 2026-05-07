package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
  @Test
  void shouldInitialiseCoin() {
    Coin coin = new Coin();
    assertInstanceOf(Coin.class, coin);
  }

  @Test
  void shouldReturnProbabilityOfTails() {
    Coin coin = new Coin();
    assertEquals(0.5, coin.chanceOfTails());
  }
}