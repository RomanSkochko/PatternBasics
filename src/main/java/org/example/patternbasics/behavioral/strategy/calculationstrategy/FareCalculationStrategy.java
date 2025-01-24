package org.example.patternbasics.behavioral.strategy.calculationstrategy;

// Strategy interface for fare calculation
public interface FareCalculationStrategy {
    double calculateFare(double distance, double duration);
}
