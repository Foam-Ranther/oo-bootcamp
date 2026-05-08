package com.tw.bootcamp.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
  @Test
  void shouldCreateAParkingLot() {
    ParkingLot parkingLot = ParkingLot.createParkingLot(10);
    assertInstanceOf(ParkingLot.class, parkingLot);
  }

  @Test
  void shouldParkACar() {
    ParkingLot parkingLot = ParkingLot.createParkingLot(10);
    parkingLot.park();
    assertEquals(ParkingLot.createParkingLot(9), parkingLot);
  }

  @Test
  void shouldReturnTrueWhenParkingIsFull() {
    ParkingLot parkingLot = ParkingLot.createParkingLot(1);
    parkingLot.park();
    assertTrue(parkingLot.isFull());
  }
}