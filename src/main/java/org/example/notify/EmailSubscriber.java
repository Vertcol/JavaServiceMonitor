package org.example.notify;
import org.example.notify.Subscriber;
public class EmailSubscriber implements Subscriber {
    private String email;

    @Override
    public void notifyDowntime(Notification notification) {
        // TODO send email
    }
}
