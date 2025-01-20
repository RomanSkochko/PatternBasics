package org.example.PatternBasics.factorymethod.controller;

import lombok.RequiredArgsConstructor;
import org.example.PatternBasics.factorymethod.domain.PaymentRequest;
import org.example.PatternBasics.factorymethod.domain.PaymentResult;
import org.example.PatternBasics.factorymethod.domain.enums.PaymentMethod;
import org.example.PatternBasics.factorymethod.domain.enums.PaymentStatus;
import org.example.PatternBasics.factorymethod.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping
    public PaymentResult processPayment(@RequestBody PaymentRequest request) {
        return paymentService.processPayment(request);
    }

    @GetMapping("/{paymentId}/status")
    public PaymentStatus checkStatus(@PathVariable String paymentId,@RequestParam PaymentMethod method) {
        return paymentService.checkPaymentStatus(paymentId, method);
    }
}
