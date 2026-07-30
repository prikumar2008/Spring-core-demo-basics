package in.Strikes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {
//field injection
    @Autowired
    private PaymentService ps;
//    public OrderService(PaymentService ps){
//        this.ps = ps;
//    }
    public void getOrder(){
        System.out.println("Get order details ");
    }
    public void placeOrder(){
        ps.pay();
        getOrder();
        System.out.println("Order Placed in some minute");
    }
}
//1st method
//here i applied field injection in both classes for removing circular dependency ok
//second method if PaymentService class does not depend on the OrderService class it means we are calling our method at the inside of OrderService class

