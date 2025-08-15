package domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    private UUID id;
    private UUID vehicleId;
    private UUID slotId;
    private LocalDateTime entryTime;
    private boolean isActive;

    public Ticket(UUID _vehicleId,UUID _slotId){
        this.id=UUID.randomUUID();
        this.vehicleId=_vehicleId;
        this.slotId=_slotId;
        this.entryTime=LocalDateTime.now();
        this.isActive=true;
    }
    public UUID getId(){
        return this.id;
    }
    public boolean getIsActive(){
        return this.isActive;
    }
    public void setActive(boolean status){
        this.isActive=status;
    }
    public LocalDateTime getEntryTime(){
        return this.getEntryTime();
    }
}
