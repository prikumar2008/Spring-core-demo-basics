package in.Strikes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService os = context.getBean(OrderService.class);
        os.placeOrder();
    }
}
//flow of running code-->placeOrder() it calls pay() and pay() calls "Payment done" and getOrder() calls "get order details" and at lastly placeOrder() calls "order place"