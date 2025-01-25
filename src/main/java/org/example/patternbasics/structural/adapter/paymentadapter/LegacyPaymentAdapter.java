package org.example.patternbasics.structural.adapter.paymentadapter;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.patternbasics.structural.adapter.paymentsystem.LegacyPaymentSystem;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

// Adapter: Converts Legacy System to Modern Interface
@RequiredArgsConstructor
@Component
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class LegacyPaymentAdapter implements ModernPaymentGateway {
    LegacyPaymentSystem legacySystem;

    @Override
    public PaymentResult processTransaction(String paymentMethod, BigDecimal amount) {
        // Convert modern interface call to legacy system method
        boolean result = legacySystem.processPayment(extractAccountNumber(paymentMethod), amount.doubleValue());

        return new PaymentResult(result, result ? generateTransactionId() : null);
    }

    private String extractAccountNumber(String paymentMethod) {
        // Extract account number logic
        return paymentMethod.split(":")[1];
    }

    private String generateTransactionId() {
        // Generate unique transaction ID
        return "TX-" + System.currentTimeMillis();
    }
}
