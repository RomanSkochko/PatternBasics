package org.example.patternbasics.structural.adapter.paymentsystem;

import org.springframework.stereotype.Component;

// Concrete Legacy Payment Implementation (Simulated)
@Component
class OldBankPaymentSystem implements LegacyPaymentSystem {
    @Override
    public boolean processPayment(String accountNumber, double amount) {
        // Simulate legacy payment processing
        return accountNumber != null && amount > 0;
    }
}
