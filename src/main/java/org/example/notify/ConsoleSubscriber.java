package org.example.notify;

public class ConsoleSubscriber implements Subscriber {
    @Override
    public void notifyDowntime(Notification notification) {
        System.out.println(notification.getTitle() + ": " + notification.getContent());
    }
}
