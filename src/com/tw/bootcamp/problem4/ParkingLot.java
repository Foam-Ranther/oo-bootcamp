package com.tw.bootcamp.problem4;

import com.tw.bootcamp.problem4.errors.InvalidParkingLotSize;
import com.tw.bootcamp.problem4.errors.ParkingLotFullException;

import java.util.Objects;

public class ParkingLot {
  private int capacity;
  private ParkingLot(int size) {
    capacity = size;
  }

  public static ParkingLot createParkingLot(int size) throws InvalidParkingLotSize {
    if (size < 0) {
      throw new InvalidParkingLotSize("Parking lot size cannot be negative");
    }
    return new ParkingLot(size);
  }

  public void park() throws ParkingLotFullException {
    if(capacity <= 0) {
      throw new ParkingLotFullException("Parking lot is full");
    }
    capacity = capacity -1;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    ParkingLot that = (ParkingLot) o;
    return capacity == that.capacity;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(capacity);
  }

  public boolean isFull() {
    return capacity == 0;
  }
}
