package org.example.patternbasics.structural.adapter.service;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.patternbasics.structural.adapter.paymentsystem.ModernPaymentGateway;
import org.example.patternbasics.structural.adapter.paymentadapter.PaymentResult;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

// Payment Service using the Adapter
@RequiredArgsConstructor
@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PaymentService {
    ModernPaymentGateway paymentGateway;

    public PaymentResult processPayment(String paymentMethod, BigDecimal amount) {
        return paymentGateway.processTransaction(paymentMethod, amount);
    }
}
