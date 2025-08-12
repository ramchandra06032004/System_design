package Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import domain.Floor;

public class FloorRepository {
    private Map<UUID,Floor> floors=new ConcurrentHashMap<>();
    private Map<Integer,UUID> floorNoToId=new ConcurrentHashMap<>();

    public Floor save(Floor floor){
        floors.put(floor.getId(), floor);
        floorNoToId.put(floor.getFloorNo(), floor.getId());
        return floor;
    }

    public Optional<Floor> findById(UUID id){
        return Optional.ofNullable(floors.get(id));
    }
    public Optional<Floor> findByNumber(int number){
        UUID id=floorNoToId.get(number);
        return id!=null ? Optional.ofNullable(floors.get(id)):Optional.empty();
    }
    public List<Floor> findAllFloor(){
        return new ArrayList<>(floors.values());
    }
    public void DeleteFloor(UUID id){
        Floor floor=floors.remove(id);
        if (floor!=null) {
            floorNoToId.remove(floor.getFloorNumber());
        }
    }
}
