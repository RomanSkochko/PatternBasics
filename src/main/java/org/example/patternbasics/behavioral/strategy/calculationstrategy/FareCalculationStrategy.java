package org.example.patternbasics.behavioral.strategy.calculationstrategy;

// Strategy interface for fare calculation
interface FareCalculationStrategy {
    double calculateFare(double distance, double duration);
}
