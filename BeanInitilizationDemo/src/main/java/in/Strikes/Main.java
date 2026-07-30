package in.Strikes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


        //for lazy initilization we need call them
//       OrderService orderService = context.getBean(OrderService.class);
//       orderService.placeOrder();
        //above two line only for wiring the dependency ok when i use lazy at the constructor ok
//      PaymentService paymentService = context.getBean(PaymentService.class);
    }
}
