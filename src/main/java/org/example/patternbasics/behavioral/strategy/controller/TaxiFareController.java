package org.example.patternbasics.behavioral.strategy.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.patternbasics.behavioral.strategy.service.TaxiFareService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// REST Controller to expose fare calculation
@RequiredArgsConstructor
@RestController
@RequestMapping("/taxi-fares")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TaxiFareController {
    TaxiFareService service;

    @GetMapping("/calculate")
    public double calculateTaxiFare(@RequestParam String taxiType, @RequestParam double distance, @RequestParam double duration) {
        return service.calculateFare(taxiType, distance, duration);
    }
}
