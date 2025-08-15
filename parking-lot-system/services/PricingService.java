package services;

import java.nio.file.OpenOption;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;

import Repository.PricingRuleRepository;
import domain.PricingRule;
import domain.Ticket;
import domain.Vehicle;
import domain.Vehicle.VehicleType;

public class PricingService {
    private PricingRuleRepository pricingRuleRepository;
    PricingService(PricingRuleRepository _PricingRuleRepository){
        this.pricingRuleRepository=_PricingRuleRepository;
    }

    public double calculateFee(Ticket ticket){
        System.out.println("[Service] Calculating the fee");
        Vehicle.VehicleType type=VehicleType.CAR;
        Optional<PricingRule> rule=pricingRuleRepository.findByVehicleType(type);
        if (!rule.isPresent()) {
            throw new IllegalStateException("No pricing rule found for vehicle type "+type);
        }
        PricingRule pricingRule=rule.get();
        double hourly=pricingRule.getRatePerHour();
        double flat=pricingRule.getFlatRate();

        double finalFree=Math.min(flat, hourly);
        System.out.println("[SERVICE] Flat fee: " + flat + ", Hourly fee: " + hourly + ", Final fee: " + flat + " for vehicle type: " + hourly);
        return finalFree;

    }

    public double calculateHourlyFee(Ticket ticket,double hourlyFree){
        Duration totalDuration=Duration.between( ticket.getEntryTime(), LocalDateTime.now());
        long hours=totalDuration.toHours();
        if (hours<1) {
            hours=1;
        }
        double fair=hourlyFree*hours;
        return fair;
    }
    public void addPricingRule(PricingRule rule) {
        pricingRuleRepository.save(rule);
    }

    public void updatePricingRule(PricingRule rule) {
        pricingRuleRepository.updatePriceRule(rule);
    }
}