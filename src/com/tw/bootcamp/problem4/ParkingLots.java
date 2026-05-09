package com.tw.bootcamp.problem4;

import com.tw.bootcamp.problem4.errors.ParkingLotFullException;

import java.util.HashMap;
import java.util.Objects;

public class ParkingLots  {
  private final HashMap<Integer, ParkingLot> parkingLots;
  private int id = 1;
  public ParkingLots() {
    parkingLots = new HashMap<>();
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    ParkingLots that = (ParkingLots) o;
    return Objects.equals(parkingLots, that.parkingLots);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(parkingLots);
  }

  public int add(ParkingLot parkingLot) {
    parkingLots.put(id , parkingLot);
    return id++;
  }

  public void park(int parkingLotId) throws ParkingLotFullException {
    ParkingLot target = parkingLots.get(parkingLotId);
    target.park();
  }
}
