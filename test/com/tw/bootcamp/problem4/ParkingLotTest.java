package com.tw.bootcamp.problem4;
import com.tw.bootcamp.problem4.errors.InvalidParkingLotSize;
import com.tw.bootcamp.problem4.errors.ParkingLotFullException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ParkingLotTest {
  @Test
  void shouldCreateAParkingLot() throws InvalidParkingLotSize {
    ParkingLot parkingLot = ParkingLot.createParkingLot(10);
    assertInstanceOf(ParkingLot.class, parkingLot);
  }

  @Test
  void shouldNotBeAbleToCreateParkingLotWithNegativeCapacity() {
    assertThrows(InvalidParkingLotSize.class, () -> ParkingLot.createParkingLot(-1));
  }

  @Test
  void shouldParkACar() throws ParkingLotFullException, InvalidParkingLotSize {
    ParkingLot parkingLot = ParkingLot.createParkingLot(10);
    parkingLot.park();
    assertEquals(ParkingLot.createParkingLot(9), parkingLot);
  }

  @Test
  void shouldReturnTrueWhenParkingIsFull() throws ParkingLotFullException, InvalidParkingLotSize {
    ParkingLot parkingLot = ParkingLot.createParkingLot(1);
    parkingLot.park();
    assertTrue(parkingLot.isFull());
  }

  @Test
  void shouldNotBeAbleToParkTheCarWhenParkingLotIsFull() throws InvalidParkingLotSize {
    ParkingLot parkingLot = ParkingLot.createParkingLot(0);
    assertThrows(ParkingLotFullException.class, parkingLot::park);
  }

  @Test
  void shouldNotifySubscriberWhenUpdatingParkingLot() throws InvalidParkingLotSize, ParkingLotFullException {
    ParkingLot parkingLot = ParkingLot.createParkingLot(10);
    Subscriber mockAssistant = mock(Subscriber.class);
    parkingLot.subscribe(mockAssistant);
    parkingLot.park();
    verify(mockAssistant, times(1)).onPark(9);
  }
}