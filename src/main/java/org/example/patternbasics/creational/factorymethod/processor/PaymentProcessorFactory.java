package org.example.patternbasics.creational.factorymethod.processor;

import org.example.patternbasics.creational.factorymethod.domain.enums.PaymentMethod;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Factory class responsible for creating appropriate payment processor instances.
 * This is the Creator in Factory Method pattern.
 */
@Service
public class PaymentProcessorFactory {
    private final List<PaymentProcessor> processors;

    public PaymentProcessorFactory(List<PaymentProcessor> processors) {
        this.processors = processors;
    }

    public PaymentProcessor getProcessor(PaymentMethod method) {
        return processors.stream()
                .filter(processor -> processor.supports(method))
                .findFirst()
                .orElseThrow(() -> new RuntimeException(
                        "Payment method not supported: " + method));
    }
}
