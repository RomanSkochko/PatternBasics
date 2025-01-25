package org.example.patternbasics.behavioral.adapter.paymentsystem;

import org.example.patternbasics.behavioral.adapter.paymentadapter.PaymentResult;

import java.math.BigDecimal;

// Modern Payment Gateway Interface (New System)
public interface ModernPaymentGateway {
    PaymentResult processTransaction(String paymentMethod, BigDecimal amount);
}
