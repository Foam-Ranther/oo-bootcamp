package com.tw.bootcamp.problem4;

import com.tw.bootcamp.problem4.errors.InvalidParkingLotSize;
import com.tw.bootcamp.problem4.errors.ParkingLotFullException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotsTest {
  @Test
  void shouldCreateInstanceOfParkingLots() {
    ParkingLots pl1 = new ParkingLots();
    ParkingLots pl2 = new ParkingLots();
    assertEquals(pl1,pl2);
  }

  @Test
  void shouldAddParkingLotsInsideParkingLots() throws InvalidParkingLotSize {
    ParkingLots parkingLots1 = new ParkingLots();
    int id = parkingLots1.add(ParkingLot.createParkingLot(10));
    assertEquals(1, id);
  }

  @Test
  void shouldParkInParkingLotAccordingToId() throws InvalidParkingLotSize, ParkingLotFullException {
    ParkingLots parkingLots = new ParkingLots();
    ParkingLot parkingLot = ParkingLot.createParkingLot(10);
    int parkingLotId = parkingLots.add(parkingLot);
    parkingLots.park(parkingLotId);
    assertEquals(ParkingLot.createParkingLot(9), parkingLot);
  }

  @Test
  void shouldNotParkTheCarInAlreadyFullParkingLot() throws InvalidParkingLotSize {
    ParkingLots parkingLots = new ParkingLots();
    ParkingLot filledParkingLot = ParkingLot.createParkingLot(0);
    int parkingLotId = parkingLots.add(filledParkingLot);
    assertThrows(ParkingLotFullException.class, () -> parkingLots.park(parkingLotId));
  }
}