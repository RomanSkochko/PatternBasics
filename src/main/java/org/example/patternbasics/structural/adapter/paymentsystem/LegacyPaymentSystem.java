package org.example.patternbasics.structural.adapter.paymentsystem;

// Legacy Payment System Interface (Existing System)
public interface LegacyPaymentSystem {
    boolean processPayment(String accountNumber, double amount);
}
