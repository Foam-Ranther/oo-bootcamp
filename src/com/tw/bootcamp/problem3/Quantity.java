package com.tw.bootcamp.problem3;

public class Quantity {

  private final double measurement;
  private final Unit unit;

  public Quantity(double measurement, Unit unit) {
    this.measurement = measurement;
    this.unit = unit;
  }

  public boolean isEquals(Quantity o) {
   return  unit.inStandard(measurement) == o.unit.inStandard(o.measurement);
  }
}
