package org.example.patternbasics.creational.factorymethod.domain;

import lombok.Data;
import org.example.patternbasics.creational.factorymethod.domain.enums.PaymentMethod;

@Data
public class PaymentRequest {
    private PaymentMethod paymentMethod;
}
