package org.example.patternbasics.behavioral.strategy.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.patternbasics.behavioral.strategy.calculationstrategy.FareCalculationStrategy;
import org.example.patternbasics.behavioral.strategy.calculationstrategy.PremiumFareStrategy;
import org.example.patternbasics.behavioral.strategy.calculationstrategy.StandardFareStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

// Context class that uses the strategy
@RequiredArgsConstructor
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TaxiFareService {
    List<FareCalculationStrategy> strategyList;

    // Method to select and apply appropriate fare calculation strategy
    public double calculateFare(String taxiType, double distance, double duration) {
        return strategyList.stream()
                .filter(strategy -> strategy instanceof StandardFareStrategy && taxiType.equals("standard") ||
                        strategy instanceof PremiumFareStrategy && taxiType.equals("premium"))
                .findFirst()
                .map(strategy -> strategy.calculateFare(distance, duration))
                .orElseThrow(() -> new IllegalArgumentException("Unknown taxi type: " + taxiType));
    }
}
