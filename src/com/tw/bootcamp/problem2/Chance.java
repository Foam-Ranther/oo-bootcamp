package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {
  private final Double chance;

  private Chance(double value) {
    this.chance = value;
  }

  public static Chance create(double value) throws Throwable {
    if (value < 0) {
      throw new Throwable("invalid chance value");
    }
    return new Chance(value);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Chance chance1 = (Chance) o;
    return Objects.equals(chance, chance1.chance);
  }

  public double not() {
    return 1 - chance;
  }

  public double and(Chance o) {
    return this.chance * o.chance;
  }


  public double or(Chance o) {
    return (this.chance + o.chance) - this.and(o);
  }
}
