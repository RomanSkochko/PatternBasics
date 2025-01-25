package org.example.patternbasics.behavioral.adapter.paymentadapter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentResult {
    boolean success;
    String transactionId;
}
