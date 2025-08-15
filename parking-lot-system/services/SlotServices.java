package services;

import java.nio.file.OpenOption;
import java.util.Optional;
import java.util.UUID;

import Repository.SlotRepository;
import domain.ParkingSlot;
import domain.Vehicle;

public class SlotServices {
    private SlotRepository slotRepository;
    
    SlotServices(SlotRepository _SlotRepository){
        this.slotRepository=_SlotRepository;
    }

    public Optional<ParkingSlot> allocateSlot(Vehicle.VehicleType type){
        System.out.println("[Service] Allocating slot for vehicle type "+type);
        Optional<ParkingSlot> slot=slotRepository.allocateSlot(type);
        if (slot.isPresent()) {
            System.out.println("[Service] Slot Allocated Sccessfully for type "+type);
        }else{
            System.out.println("[Service] No slot Available for Vehicle type "+type);
        }
        return slot;
    }

    public void releseTheSlot(UUID id){
        System.out.println("[Service] Releasing the slot with UUID "+id);
        slotRepository.releseSlot(id);
        System.out.println("[Service] Slot relese Successfuly");
    }
    
    public ParkingSlot createSlot(Vehicle.VehicleType type,int floor){
        System.out.println("[Service] Making new Slot");
        ParkingSlot newSlot=new ParkingSlot(type,floor);
        slotRepository.save(newSlot);
        System.out.println("[Service] New Slot Created Successfuly for type "+type+" on floor "+floor);
        return newSlot;
    }
    
    public long getAvailableSlotCount(Vehicle.VehicleType type){
        System.out.println("[Service] finding count of available slots");
        return slotRepository.findAvailableSlot(type).size();
    }
}
