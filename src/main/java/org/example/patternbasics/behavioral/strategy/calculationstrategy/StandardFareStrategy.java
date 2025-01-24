package org.example.patternbasics.behavioral.strategy.calculationstrategy;

import org.springframework.stereotype.Service;

// Concrete strategy for standard taxi fare
@Service
public class StandardFareStrategy implements FareCalculationStrategy {
    @Override
    public double calculateFare(double distance, double duration) {
        // Basic fare calculation: base rate + distance rate + time rate
        return 5.0 + (distance * 1.5) + (duration * 0.5);
    }
}
