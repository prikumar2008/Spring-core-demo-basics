package in.coder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context  = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService orderService = context.getBean(OrderService.class);
        orderService.orderPlaced();

        PaymentService paymentService = context.getBean(PaymentService.class);
        paymentService.pay();

        DeliveryService deliveryService = context.getBean(DeliveryService.class);
        deliveryService.delivery();
        //how spring works on the code see and understand ok


//        PaymentService service = new PaymentService();
//        OrderService order = new OrderService(service);
//        order.orderPlaced();
    }
}
