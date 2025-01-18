package org.example.PatternBasics.factory_method.domain;

import lombok.Data;
import org.example.PatternBasics.factory_method.domain.enums.PaymentMethod;

@Data
public class PaymentRequest {
    private PaymentMethod paymentMethod;
}
