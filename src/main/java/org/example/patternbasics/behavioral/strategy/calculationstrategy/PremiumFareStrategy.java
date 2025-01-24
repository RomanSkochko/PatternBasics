package org.example.patternbasics.behavioral.strategy.calculationstrategy;

import org.springframework.stereotype.Service;

// Concrete strategy for premium taxi fare
@Service
public class PremiumFareStrategy implements FareCalculationStrategy {
    @Override
    public double calculateFare(double distance, double duration) {
        // Premium fare with higher rates
        return 10.0 + (distance * 2.0) + (duration);
    }
}
