package com.tw.bootcamp.problem3;

public enum LengthUnit implements Unit {
  FEET (300),
  CM(10),
  INCH(25),
  MM(1);

  private final int milliMeters;

  LengthUnit(int milliMeters) {
    this.milliMeters = milliMeters;
  }

  @Override
  public double inStandard(double measurement) {
    return measurement * milliMeters;
  }
}
