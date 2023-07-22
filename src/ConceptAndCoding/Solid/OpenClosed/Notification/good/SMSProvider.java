package ConceptAndCoding.Solid.OpenClosed.Notification.good;

import ConceptAndCoding.Solid.OpenClosed.Notification.Notification;
import ConceptAndCoding.Solid.OpenClosed.Notification.SMSDispatcher;

public class SMSProvider implements NotificationProvider{
    private SMSDispatcher smsDispatcher;
    @Override
    public void send(Notification notification) {
        smsDispatcher.sendSMS();
    }
}
