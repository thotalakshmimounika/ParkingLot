package ParkingLot.models;

import ParkingLot.models.Enums.GateStatus;
import ParkingLot.models.Enums.GateType;

import java.time.LocalDateTime;

public class Gate extends BaseModel{
    private int gateNumber;//102--> floor-1 , gatenumber -1
    private GateType gateType;
    private GateStatus gateStatus;
    private String operatorName;

    public Gate(int gateNumber, GateType gateType, GateStatus gateStatus, String operatorName) {
        this.gateNumber = gateNumber;
        this.gateType = gateType;
        this.gateStatus = gateStatus;
        this.operatorName = operatorName;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
