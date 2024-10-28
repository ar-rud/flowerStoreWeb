package ua.edu.ucu.apps.flowerStore.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class PaymentController {
    @GetMapping("payment")
    public List<CreditCardPaymentStrategy> paymentShow() {
        return List.of(new CreditCardPaymentStrategy("desription"));
    }
}
