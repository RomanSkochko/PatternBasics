package org.example.PatternBasics.factory_method.service;

import lombok.RequiredArgsConstructor;
import org.example.PatternBasics.factory_method.domain.PaymentRequest;
import org.example.PatternBasics.factory_method.domain.PaymentResult;
import org.example.PatternBasics.factory_method.domain.enums.PaymentMethod;
import org.example.PatternBasics.factory_method.domain.enums.PaymentStatus;
import org.example.PatternBasics.factory_method.processor.PaymentProcessor;
import org.example.PatternBasics.factory_method.processor.PaymentProcessorFactory;
import org.springframework.stereotype.Service;

/**
 * Service that uses Factory Method pattern to process payments.
 * Demonstrates how Factory Method pattern is used in the application.
 */
@RequiredArgsConstructor
@Service
public class PaymentService {
    private final PaymentProcessorFactory processorFactory;

    public PaymentResult processPayment(PaymentRequest request) {
        PaymentProcessor processor = processorFactory.getProcessor(request.getPaymentMethod());
        return processor.process(request);
    }

    public PaymentStatus checkPaymentStatus(String paymentId, PaymentMethod method) {
        PaymentProcessor processor = processorFactory.getProcessor(method);
        return processor.checkStatus(paymentId);
    }
}
