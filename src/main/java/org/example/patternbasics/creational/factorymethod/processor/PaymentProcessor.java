package org.example.patternbasics.creational.factorymethod.processor;

import org.example.patternbasics.creational.factorymethod.domain.PaymentRequest;
import org.example.patternbasics.creational.factorymethod.domain.PaymentResult;
import org.example.patternbasics.creational.factorymethod.domain.enums.PaymentMethod;
import org.example.patternbasics.creational.factorymethod.domain.enums.PaymentStatus;

/**
 * Core interface defining contract for all payment processors in the system.
 * This is the Product interface in Factory Method pattern.
 */
public interface PaymentProcessor {
    PaymentResult process(PaymentRequest request);
    boolean supports(PaymentMethod method);
    PaymentStatus checkStatus(String paymentId);
}
