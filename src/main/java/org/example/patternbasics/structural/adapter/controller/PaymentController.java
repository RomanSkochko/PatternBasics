package org.example.patternbasics.structural.adapter.controller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.patternbasics.structural.adapter.paymentadapter.PaymentResult;
import org.example.patternbasics.structural.adapter.service.PaymentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

// REST Controller
@RequiredArgsConstructor
@RestController
@RequestMapping("/payments")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PaymentController {
    PaymentService paymentService;

    @PostMapping("/process")
    public ResponseEntity<PaymentResult> processPayment(@RequestParam String paymentMethod, @RequestParam BigDecimal amount) {
        PaymentResult result = paymentService.processPayment(paymentMethod, amount);
        return ResponseEntity.ok(result);
    }
}
