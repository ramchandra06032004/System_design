package Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

import domain.PricingRule;
import domain.Vehicle;

public class PricingRuleRepository {
    Map<UUID,PricingRule> rules=new ConcurrentHashMap<>();
    Map<Vehicle.VehicleType,UUID> vehicleToRule=new ConcurrentHashMap<>();

    public PricingRule save(PricingRule rule){
        rules.put(rule.getId(), rule);
        vehicleToRule.put(rule.getVehicleType(), rule.getId());
        return rule;
    }

    public Optional<PricingRule> findById(UUID id){
        return Optional.ofNullable(rules.get(id));
    }
    public Optional<PricingRule> findByVehicleType(Vehicle.VehicleType type){
        UUID id=vehicleToRule.get(type);
        return Optional.ofNullable(rules.get(id));
    }
    public List<PricingRule> findAll(){
        return new ArrayList<>(rules.values());
    }
    public void updatePriceRule(PricingRule rule){
        if (rules.containsKey(rule.getId())) {
            rules.put(rule.getId(), rule);
            vehicleToRule.put(rule.getVehicleType(), rule.getId());
        }
    }
    public void deleteRule(UUID id){
        PricingRule rule=rules.remove(id);
        if (rule!=null) {
            vehicleToRule.remove(rule.getVehicleType());
        }
    }
}
