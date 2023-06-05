package org.example.notify;

public class APIsubscriber  implements Subscriber {
    private String hostAdress;

    @Override
    public void notifyDowntime(Notification notification) {
        // TODO api call for downtime
    }
}
