package com.tw.bootcamp.problem4;

import com.tw.bootcamp.problem4.errors.InvalidParkingLotSize;
import com.tw.bootcamp.problem4.errors.ParkingLotFullException;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ParkingLot {
  private final int capacity;
  private int spacesLeft;
  private Set<Subscriber> subscribers = new HashSet<>();

  private ParkingLot(int size) {
    spacesLeft = size;
    capacity = size;
  }

  public static ParkingLot createParkingLot(int size) throws InvalidParkingLotSize {
    if (size < 0) {
      throw new InvalidParkingLotSize("Parking lot size cannot be negative");
    }
    return new ParkingLot(size);
  }

  public void park() throws ParkingLotFullException {
    if(isFull()) {
      throw new ParkingLotFullException("Parking lot is full");
    }
    spacesLeft = spacesLeft -1;
    notifySubscribers();
  }

  private void notifySubscribers() {
    subscribers.forEach((subscriber) -> {
      subscriber.onPark(spacesLeft);
    });
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    ParkingLot that = (ParkingLot) o;
    return spacesLeft == that.spacesLeft;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(spacesLeft);
  }

  public boolean isFull() {
    return spacesLeft <= 0;
  }

  public void subscribe(Subscriber mockAssistant) {
    subscribers.add(mockAssistant);
  }
}
