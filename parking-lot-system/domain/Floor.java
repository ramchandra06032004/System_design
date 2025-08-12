package domain;
import domain.ParkingSlot;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Floor {
    private UUID id;
    private int floorNumber;
    private List<ParkingSlot> slots;

    Floor(int _floorNumber){
        this.id=UUID.randomUUID();
        this.floorNumber=_floorNumber;
        this.slots=new ArrayList<>();
    }
    public UUID getId(){
        return this.id;
    }

    public int getFloorNo(){
        return this.floorNumber;
    }
    public int getFloorNumber(){
        return this.floorNumber;
    }
}
