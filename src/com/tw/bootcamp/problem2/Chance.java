package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {
  private final Double chance;

  private Chance(double value) {
    this.chance = value;
  }

  public static Chance createChance(double value) {
    return new Chance(value);
  }

  public static Chance createChanceComplement(double value) {
    return new Chance(1 - value);
  }


  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Chance chance1 = (Chance) o;
    return Objects.equals(chance, chance1.chance);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(chance);
  }
}
