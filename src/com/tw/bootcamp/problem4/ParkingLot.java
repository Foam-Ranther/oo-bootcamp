package com.tw.bootcamp.problem4;

import java.util.Objects;

public class ParkingLot {
  private int capacity;
  private ParkingLot(int size) {
    capacity = size;
  }

  public static ParkingLot createParkingLot(int size) {
    return new ParkingLot(size);
  }

  public void park() {
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
