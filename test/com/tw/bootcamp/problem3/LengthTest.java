package com.tw.bootcamp.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
  @Test
  void shouldInitialiseLength() {
    assertInstanceOf(Length.class, new Length(1, Unit.INCH));
  }

  @Test
  void shouldReturnTrueIfOneFeetEqualToTwelveInch() {
    Length oneFeet = new Length(1, Unit.FEET);
    Length twelveInch = new Length(12, Unit.INCH);
    assertTrue(oneFeet.isEquals(twelveInch));
  }

  @Test
  void shouldReturnTrueIfTwoFeetShouldEqualToFiveCentimeters() {
    Length twoInch = new Length(2, Unit.INCH);
    Length fiveCentimeter = new Length(5, Unit.CM);
    assertTrue(twoInch.isEquals(fiveCentimeter));
  }

  @Test
  void shouldReturnTrueIfOneCentimeterEqualToTenMilliMeter() {
    Length oneCentimeter = new Length(1, Unit.CM);
    Length tenMilliMeter = new Length(10, Unit.MM);

    assertTrue(oneCentimeter.isEquals(tenMilliMeter));

  }
}