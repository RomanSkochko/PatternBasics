package org.example.patternbasics.behavioral.adapter.paymentsystem;

// Legacy Payment System Interface (Existing System)
public interface LegacyPaymentSystem {
    boolean processPayment(String accountNumber, double amount);
}
