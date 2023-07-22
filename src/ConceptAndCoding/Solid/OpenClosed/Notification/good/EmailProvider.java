package ConceptAndCoding.Solid.OpenClosed.Notification.good;

import ConceptAndCoding.Solid.OpenClosed.Notification.EmailDispatcher;
import ConceptAndCoding.Solid.OpenClosed.Notification.Notification;

public class EmailProvider implements NotificationProvider{
    private EmailDispatcher emailDispatcher;
    @Override
    public void send(Notification notification) {
        emailDispatcher.sendEmail();
    }
}
