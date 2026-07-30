package in.Strikes;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy                       //yaha lazy means create payment wala only don't create order wala ok
public class OrderService {
    PaymentService paymentService;
    //at the constructor lazy means don't create payment wala matlab don't wire them for creating payment as well we have to call a method from it
    public OrderService(@Lazy PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("OrderService");
    }
    public void placeOrder(){
        paymentService.pay();
        System.out.println("OrderService completed ok");
    }
}
