package ParkingLot.models;
import ParkingLot.models.Enums.ParkingLotStatus;
import ParkingLot.models.Enums.VehicleType;
import ParkingLot.service.strategy.BillCalculationStrategy;
import ParkingLot.service.strategy.SpotAllocationStrategy;

import java.time.LocalDateTime;
import java.util.List;

public class ParkingLot extends BaseModel{
    private String name;
    private String address;
    private List<ParkingFloor> floors;
    private ParkingLotStatus parkingLotStatus;
    private List<VehicleType> vehicleTypesSupported;
    private  int capacity;
    private BillCalculationStrategy billCalculationStrategy;
    private SpotAllocationStrategy slotAllocationStrategy;

    public ParkingLot(String name, String address, List<ParkingFloor> floors, ParkingLotStatus parkingLotStatus, List<VehicleType> vehicleTypesSupported, int capacity, BillCalculationStrategy billCalculationStrategy, SpotAllocationStrategy slotAllocationStrategy) {
        this.name = name;
        this.address = address;
        this.floors = floors;
        this.parkingLotStatus = parkingLotStatus;
        this.vehicleTypesSupported = vehicleTypesSupported;
        this.capacity = capacity;
        this.billCalculationStrategy = billCalculationStrategy;
        this.slotAllocationStrategy = slotAllocationStrategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<ParkingFloor> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public List<VehicleType> getVehicleTypesSupported() {
        return vehicleTypesSupported;
    }

    public void setVehicleTypesSupported(List<VehicleType> vehicleTypesSupported) {
        this.vehicleTypesSupported = vehicleTypesSupported;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public BillCalculationStrategy getBillCalculationStrategy() {
        return billCalculationStrategy;
    }

    public void setBillCalculationStrategy(BillCalculationStrategy billCalculationStrategy) {
        this.billCalculationStrategy = billCalculationStrategy;
    }

    public SpotAllocationStrategy getSlotAllocationStrategy() {
        return slotAllocationStrategy;
    }

    public void setSlotAllocationStrategy(SpotAllocationStrategy slotAllocationStrategy) {
        this.slotAllocationStrategy = slotAllocationStrategy;
    }
}
