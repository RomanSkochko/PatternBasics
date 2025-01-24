package org.example.patternbasics.behavioral.strategy.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.patternbasics.behavioral.strategy.calculationstrategy.PremiumFareStrategy;
import org.example.patternbasics.behavioral.strategy.calculationstrategy.StandardFareStrategy;
import org.springframework.stereotype.Service;

// Context class that uses the strategy
@RequiredArgsConstructor
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TaxiFareService {
    StandardFareStrategy standardFareStrategy;
    PremiumFareStrategy premiumFareStrategy;

    // Method to select and apply appropriate fare calculation strategy
    public double calculateFare(String taxiType, double distance, double duration) {
        return switch (taxiType) {
            case "standard" -> standardFareStrategy.calculateFare(distance, duration);
            case "premium" -> premiumFareStrategy.calculateFare(distance, duration);
            default -> throw new IllegalArgumentException("Unexpected value: " + taxiType);
        };
    }
}
