package domain;

import java.util.UUID;

public class Vehicle {
    public enum VehicleType{
        BIKE,
        CAR,
        TRUCK,
        EV
    }

    private UUID id;
    private String numberPlate;
    private VehicleType vehicleType;

    Vehicle(String _numberPlate,VehicleType _vehicleType){
        this.id=UUID.randomUUID();
        this.numberPlate=_numberPlate;
        this.vehicleType=_vehicleType;
    }
}
