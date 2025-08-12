package domain;

import java.util.UUID;

public class PricingRule {
    private UUID id;
    private Vehicle.VehicleType vehicleType;
    private double ratePerHour;
    private double ratePerDay;
    
    PricingRule(Vehicle.VehicleType _VehicleType,double _ratePerHour,double _ratePerDay){
        this.id=UUID.randomUUID();
        this.vehicleType=_VehicleType;
        this.ratePerDay=_ratePerDay;
        this.ratePerHour=_ratePerHour;
    }
    
}
