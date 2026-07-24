package in.coder;

import in.coder.NotificationService.EmailService;
import in.coder.NotificationService.NotificationService;
import in.coder.NotificationService.SmsNotificationService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        OrderService orderService = new OrderService();
//        orderService.placeOrder();
        //if we use constructor there then we have to change here as well ok

        NotificationService Notification = new SmsNotificationService();
        OrderService order =  new OrderService(Notification);
        order.placeOrder();
    }
}
