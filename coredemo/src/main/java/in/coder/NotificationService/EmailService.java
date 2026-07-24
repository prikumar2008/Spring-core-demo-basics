package in.coder.NotificationService;

public class EmailService implements NotificationService{
    @Override
    public void Notification() {
        System.out.println("sent  Email NOTIFICATION.");
    }
}
