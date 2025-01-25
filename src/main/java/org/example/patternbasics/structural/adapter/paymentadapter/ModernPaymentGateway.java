package org.example.patternbasics.structural.adapter.paymentadapter;

import java.math.BigDecimal;

// Modern Payment Gateway Interface (New System)
public interface ModernPaymentGateway {
    PaymentResult processTransaction(String paymentMethod, BigDecimal amount);
}
