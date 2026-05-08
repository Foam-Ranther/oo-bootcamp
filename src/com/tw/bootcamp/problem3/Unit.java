package com.tw.bootcamp.problem3;

public enum Unit {
  FEET (300),
  CM(10),
  INCH(25),
  MM(1);

  private final int milliMeters;

  Unit(int milliMeters) {
    this.milliMeters = milliMeters;
  }

  public double inStandard(double measurement) {
    return measurement * milliMeters;
  }
}
