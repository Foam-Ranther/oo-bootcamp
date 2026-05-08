package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Length {

  private final double measurement;
  private final LengthUnit unit;

  private Length(double measurement,LengthUnit  unit) {
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

  public Length add(Length o) {
    double len1 = o.unit.covertToUnit(o.measurement, LengthUnit.INCH);
    double len2 = unit.covertToUnit(measurement, LengthUnit.INCH);
    return new Length(len1 + len2, LengthUnit.INCH);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Length length = (Length) o;
    return Double.compare(measurement, length.measurement) == 0 && unit == length.unit;
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurement, unit);
  }
}
