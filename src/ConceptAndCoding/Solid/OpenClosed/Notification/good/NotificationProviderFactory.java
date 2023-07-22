package ConceptAndCoding.Solid.OpenClosed.Notification.good;

import ConceptAndCoding.Solid.OpenClosed.Notification.NotificationType;

import java.util.Map;

public class NotificationProviderFactory {
    private Map<NotificationType, NotificationProvider> providers;

    public NotificationProvider getNotificationProvider(NotificationType notificationType){
        return providers.get(notificationType);
    }
}
