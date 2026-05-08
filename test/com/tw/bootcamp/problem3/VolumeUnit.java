package com.tw.bootcamp.problem3;

public enum VolumeUnit implements Unit {
  GALLON(3.78), LITER(1);

  private final double liters;

  VolumeUnit(double liters) {
    this.liters = liters;
  }

  @Override
  public double inStandard(double measurement) {
    return measurement * liters;
  }
}
