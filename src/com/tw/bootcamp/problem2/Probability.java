package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Probability {
  private final Double chance;

  private Probability(double value) {
    this.chance = value;
  }

  public static Probability create(double value) throws ImpossibleProbabilityError {
    if (value < 0 || value > 1) {
      throw new ImpossibleProbabilityError("impossible probability");
    }
    return new Probability(value);
  }

  public Probability not() {
    return new Probability(1 - chance);
  }

  public Probability and(Probability o) {
    return new Probability(this.chance * o.chance);
  }

  public Probability or(Probability o) {
    return new Probability((this.chance + o.chance) - (this.chance * o.chance));
  }

  public Probability orDeMorgon(Probability o) {
    return this.not().and(o.not()).not();
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(chance);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Probability probability1 = (Probability) o;
    return Objects.equals(chance, probability1.chance);
  }
}
