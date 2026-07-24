package in.coder;

import in.coder.NotificationService.EmailService;
import in.coder.NotificationService.NotificationService;
import in.coder.NotificationService.SmsNotificationService;

public class OrderService {

//NotificationService common = new SmsNotificationService();
/*in above line we are created object ok but we want to change in main class we don't want to change at any other place
  so that here we are going to use constructor after the decleration ok*/

/*here I have applied dependency injection from the main class this is a constructor injection ok it injected from the main class
    it says to class do your work, whatever you need I will give you, you do not need to create from yourself ok
 */

    public NotificationService Notification;
    public OrderService(NotificationService Notification) {
        this.Notification = Notification;
    }
    public void placeOrder() {
        System.out.println("order placed");
        Notification.Notification();
    }
}
