package com.tw.bootcamp.problem3;

import java.util.Objects;

public class Length {

  private final double measurement;
  private final Unit unit;

  public Length(double measurement, Unit unit) {
    this.measurement = measurement;
    this.unit = unit;
  }

  public boolean isEquals(Length o) {
    if (o.unit == Unit.INCH && unit == Unit.FEET){
      return  measurement * 12 == o.measurement;
    }
    if (o.unit == Unit.CM && unit == Unit.INCH){
      return  measurement * 2.5 == o.measurement;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(measurement, unit);
  }
}
