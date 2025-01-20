package org.example.PatternBasics.factorymethod.domain;

import lombok.Data;
import org.example.PatternBasics.factorymethod.domain.enums.PaymentMethod;

@Data
public class PaymentRequest {
    private PaymentMethod paymentMethod;
}
