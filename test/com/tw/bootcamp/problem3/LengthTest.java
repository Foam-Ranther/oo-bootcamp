package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
  @Test
  void shouldInitialiseLength() throws InvalidMeasurementException {
    assertInstanceOf(Length.class, Length.create(1, LengthUnit.INCH));
  }

  @Test
  void shouldThrowErrorForInvalidMeasurement() {
    assertThrows(InvalidMeasurementException.class, () -> Length.create(-1, LengthUnit.INCH));
  }

  @Test
  void shouldReturnTrueIfOneFeetEqualToTwelveInch() throws InvalidMeasurementException {
    Length oneFeet = Length.create(1, LengthUnit.FEET);
    Length twelveInch = Length.create(12, LengthUnit.INCH);
    assertTrue(oneFeet.isEquals(twelveInch));
  }

  @Test
  void shouldReturnTrueIfTwoFeetShouldEqualToFiveCentimeters() throws InvalidMeasurementException {
    Length twoInch = Length.create(2, LengthUnit.INCH);
    Length fiveCentimeter = Length.create(5, LengthUnit.CM);
    assertTrue(twoInch.isEquals(fiveCentimeter));
  }

  @Test
  void shouldReturnTrueIfOneCentimeterEqualToTenMilliMeter() throws InvalidMeasurementException {
    Length oneCentimeter = Length.create(1, LengthUnit.CM);
    Length tenMilliMeter = Length.create(10, LengthUnit.MM);

    assertTrue(oneCentimeter.isEquals(tenMilliMeter));
  }

  @Test
  void shouldAddTwoLengthsOfSameUnit() throws InvalidMeasurementException {
    Length twoInch = Length.create(2, LengthUnit.INCH);
    Length fourInch = Length.create(4, LengthUnit.INCH);
    assertEquals(fourInch, twoInch.add(twoInch));
  }

  @Test
  void shouldAddTwoLengthOfDifferentUnit() throws InvalidMeasurementException {
    Length twoInch = Length.create(2, LengthUnit.INCH);
    Length twoCentimeter = Length.create(2.5, LengthUnit.CM);
    Length threeInch = Length.create(3, LengthUnit.INCH);
    assertEquals(threeInch, twoInch.add(twoCentimeter));
  }
}