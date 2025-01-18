package org.example.PatternBasics.factory_method.processor;

import org.example.PatternBasics.factory_method.domain.PaymentRequest;
import org.example.PatternBasics.factory_method.domain.PaymentResult;
import org.example.PatternBasics.factory_method.domain.enums.PaymentMethod;
import org.example.PatternBasics.factory_method.domain.enums.PaymentStatus;

/**
 * Core interface defining contract for all payment processors in the system.
 * This is the Product interface in Factory Method pattern.
 */
public interface PaymentProcessor {
    PaymentResult process(PaymentRequest request);
    boolean supports(PaymentMethod method);
    PaymentStatus checkStatus(String paymentId);
}
