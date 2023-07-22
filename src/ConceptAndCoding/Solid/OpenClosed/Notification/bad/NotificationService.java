package ConceptAndCoding.Solid.OpenClosed.Notification.bad;

import ConceptAndCoding.Solid.OpenClosed.Notification.EmailDispatcher;
import ConceptAndCoding.Solid.OpenClosed.Notification.Notification;
import ConceptAndCoding.Solid.OpenClosed.Notification.NotificationType;
import ConceptAndCoding.Solid.OpenClosed.Notification.SMSDispatcher;

public class NotificationService {
    private EmailDispatcher emailDispatcher;
    private SMSDispatcher smsDispatcher;

    public void sendNotification(Notification notification) {
        if(notification.getType() == NotificationType.SMS) {
            smsDispatcher.sendSMS();
        } else if(notification.getType() == NotificationType.EMAIL) {
            emailDispatcher.sendEmail();
        }
        // This is a bad design because this method and therefore class is open for modification
        // When a new NotificationType is introduced, we will have to add more if conditions.
    }
}
