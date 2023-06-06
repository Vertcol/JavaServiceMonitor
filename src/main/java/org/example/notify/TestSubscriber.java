package org.example.notify;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSubscriber implements Subscriber {
    @Override
    public void notifyDowntime(Notification notification) {
        System.out.println( notification.getTitle() + ": " + notification.getContent());
    }
}
