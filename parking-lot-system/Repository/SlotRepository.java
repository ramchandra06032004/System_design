package Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import domain.ParkingSlot;
import domain.Vehicle;

public class SlotRepository {
    Map<UUID, ParkingSlot> slots = new ConcurrentHashMap<>();

    public ParkingSlot save(ParkingSlot slot) {
        slots.put(slot.getId(), slot);
        return slot;
    }

    public Optional<ParkingSlot> findSlotById(UUID id) {
        return Optional.ofNullable(slots.get(id));
    }

    public List<ParkingSlot> findAvailableSlot(Vehicle.VehicleType type) {
        return slots.values().stream().filter(slots -> slots.getSlotType() == type && !slots.getIsOccupied())
                .collect(Collectors.toList());
    }

    public Optional<ParkingSlot> allocateSlot(Vehicle.VehicleType type) {
        return slots.values()
                .stream()
                .filter(slot -> slot.getSlotType() == type && !slot.getIsOccupied())
                .findFirst().map(slot -> {
                    slot.setIsOccupied(true);
                    return slot;
                });
    }
    public void releseSlot(UUID slotId){
        slots.computeIfPresent(slotId, (id,slot)->{
            slot.setIsOccupied(false);
            return slot;
        });
    }
}
