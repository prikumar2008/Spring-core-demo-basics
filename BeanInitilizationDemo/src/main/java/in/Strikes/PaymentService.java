package in.Strikes;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy                           //here lazy means create Order wala and when it will create order wala then it needs payment wala as well
public class PaymentService {
    public PaymentService() {
        System.out.println("PaymentService");
    }
    public void pay(){
        System.out.println("payment completed");
    }
}
