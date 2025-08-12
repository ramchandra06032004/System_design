package domain;

import java.util.UUID;

public class ParkingSlot {
    private UUID id;
    private Vehicle.VehicleType type;
    private int floor;
    private boolean isOccupied;

    ParkingSlot(Vehicle.VehicleType _type,int _floor){
        this.id=UUID.randomUUID();
        this.type=_type;
        this.floor=_floor;
        this.isOccupied=false;
    }
    public UUID getId(){
        return this.id;
    }
    public Vehicle.VehicleType getSlotType(){
        return this.type;
    }
    public boolean getIsOccupied(){
        return this.isOccupied;
    }
    public void setIsOccupied(boolean status){
        this.isOccupied=status;
    }
}
