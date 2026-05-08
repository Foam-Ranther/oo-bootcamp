package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {

  @Test
  void shouldReturnTrueIfOneGallonEqualTo3Liters() throws InvalidMeasurementException {
    Volume oneGallon = Volume.create(1, VolumeUnit.GALLON);
    Volume threeLitres = Volume.create(3.78, VolumeUnit.LITER);
    assertTrue(oneGallon.isEquals(threeLitres));
  }

  @Test
  void shouldThrowErrorForInvalidMeasurement() {
    assertThrows(InvalidMeasurementException.class,() -> Volume.create(-1, VolumeUnit.GALLON));
  }
}