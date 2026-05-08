package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuantityTest {
  @Test
  void shouldInitialiseLength() {
    assertInstanceOf(Quantity.class, new Quantity(1, LengthUnit.INCH));
  }

  @Test
  void shouldReturnTrueIfOneFeetEqualToTwelveInch() {
    Quantity oneFeet = new Quantity(1, LengthUnit.FEET);
    Quantity twelveInch = new Quantity(12, LengthUnit.INCH);
    assertTrue(oneFeet.isEquals(twelveInch));
  }

  @Test
  void shouldReturnTrueIfTwoFeetShouldEqualToFiveCentimeters() {
    Quantity twoInch = new Quantity(2, LengthUnit.INCH);
    Quantity fiveCentimeter = new Quantity(5, LengthUnit.CM);
    assertTrue(twoInch.isEquals(fiveCentimeter));
  }

  @Test
  void shouldReturnTrueIfOneCentimeterEqualToTenMilliMeter() {
    Quantity oneCentimeter = new Quantity(1, LengthUnit.CM);
    Quantity tenMilliMeter = new Quantity(10, LengthUnit.MM);

    assertTrue(oneCentimeter.isEquals(tenMilliMeter));
  }

  @Test
  void shouldReturnTrueIfOneGallonEqualTo3Liters() {
    Quantity oneGallon = new Quantity(1, VolumeUnit.GALLON);
    Quantity threeLitres = new Quantity(3.78, VolumeUnit.LITER);
    assertTrue(oneGallon.isEquals(threeLitres));
  }
}