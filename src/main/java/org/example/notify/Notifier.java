package org.example.notify;

import java.util.ArrayList;
import java.util.List;

public class Notifier {
    private List<Subscriber> subscribers = new ArrayList<Subscriber>();
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void notifyDowntime(Notification notification) {
        for (Subscriber subscriber: subscribers) {
            subscriber.notifyDowntime(notification);
        }
    }
}
