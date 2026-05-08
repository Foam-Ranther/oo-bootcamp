package com.tw.bootcamp.problem3;

public class Length {

  private final double measurement;
  private final Unit unit;

  public Length(double measurement, Unit unit) {
    this.measurement = measurement;
    this.unit = unit;
  }

  public boolean isEquals(Length o) {
   return  unit.inStandard(measurement) == o.unit.inStandard(o.measurement);
  }
}
