package org.example.patternbasics.creational.factorymethod.processor;

import org.example.patternbasics.creational.factorymethod.domain.PaymentRequest;
import org.example.patternbasics.creational.factorymethod.domain.PaymentResult;
import org.example.patternbasics.creational.factorymethod.domain.enums.PaymentMethod;
import org.example.patternbasics.creational.factorymethod.domain.enums.PaymentStatus;
import org.springframework.stereotype.Service;

/**
 * Concrete implementation of PayPal payment processing.
 * This is a Concrete Product in Factory Method pattern.
 */
@Service
public class PayPalPaymentProcessor implements PaymentProcessor {
    @Override
    public PaymentResult process(PaymentRequest request) {
        // Implementation for PayPal processing
        return PaymentResult.builder().build();
    }

    @Override
    public boolean supports(PaymentMethod method) {
        return PaymentMethod.PAYPAL.equals(method);
    }

    @Override
    public PaymentStatus checkStatus(String paymentId) {
        // Implementation for status checking
        return PaymentStatus.PENDING;
    }
}
