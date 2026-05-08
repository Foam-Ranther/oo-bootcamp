package com.tw.bootcamp.problem3;

public enum VolumeUnit implements Unit {
  GALLON(3.78),
  LITER(1);


  private final double litre;

  VolumeUnit(double litre) {
    this.litre = litre;
  }

  @Override
  public double inStandard(double measurement) {
    return litre * measurement;
  }
}
