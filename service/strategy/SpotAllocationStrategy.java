package ParkingLot.service.strategy;

import ParkingLot.models.ParkingSpot;
import ParkingLot.models.Vehicle;

public interface SpotAllocationStrategy {
    ParkingSpot getSpotForVehicle(Vehicle vehicle);
}
