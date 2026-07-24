package in.coder.NotificationService;

public class SmsNotificationService implements NotificationService {
    @Override
    public void Notification()
    {
        System.out.println("sent to SMS.");
    }
}
