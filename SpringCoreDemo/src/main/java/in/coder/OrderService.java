package in.coder;

import org.springframework.stereotype.Component;
@Component
public class OrderService {

//    private PaymentService paymentService;
//    public OrderService (PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }


    public void orderPlaced() {
        System.out.println("Order Placed");
        //paymentService.pay();
    }
}
