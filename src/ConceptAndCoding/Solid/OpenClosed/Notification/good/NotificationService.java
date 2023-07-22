package ConceptAndCoding.Solid.OpenClosed.Notification.good;

import ConceptAndCoding.Solid.OpenClosed.Notification.Notification;
import ConceptAndCoding.Solid.OpenClosed.Notification.NotificationType;

import java.util.Map;

public class NotificationService {
    private NotificationProviderFactory notificationProviderFactory;
    public void sendNotification(Notification notification) {
        notificationProviderFactory.getNotificationProvider(notification.getType()).send(notification);

        // This code is Open for Extension, but closed for modification, since we do not have to modify already tested
        // code, when more notificationtype enum will be added, we won't need to add any modification here, like
        // we had to do in previous bad design using if else cases
    }
}
