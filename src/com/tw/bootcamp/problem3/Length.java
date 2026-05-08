package com.tw.bootcamp.problem3;

public class Length {

  private final double measurement;
  private final LengthUnit unit;

  private Length(double measurement, LengthUnit unit) {
    this.measurement = measurement;
    this.unit = unit;
  }

  public static Length create(double measurement, LengthUnit unit) throws InvalidMeasurementException {
    if (measurement < 0 ) throw new InvalidMeasurementException("Invalid measurement");
    return new Length(measurement, unit);
  }

  public boolean isEquals(Length o) {
   return  unit.inStandard(measurement) == o.unit.inStandard(o.measurement);
  }
}
