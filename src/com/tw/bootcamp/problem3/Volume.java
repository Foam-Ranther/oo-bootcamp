package com.tw.bootcamp.problem3;

public class Volume {

  private final double measurement;
  private final VolumeUnit unit;

  private Volume(double measurement, VolumeUnit unit) {
    this.measurement = measurement;
    this.unit = unit;
  }

  public static Volume create(double measurement, VolumeUnit unit) throws InvalidMeasurementException {
    if (measurement < 0 ) throw new InvalidMeasurementException("Invalid measurement");
    return new Volume(measurement, unit);
  }

  public boolean isEquals(Volume o) {
   return  unit.inStandard(measurement) == o.unit.inStandard(o.measurement);
  }
}
