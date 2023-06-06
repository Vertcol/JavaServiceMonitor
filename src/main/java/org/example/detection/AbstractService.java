package org.example.detection;

import org.example.notify.Notification;
import org.example.notify.Notifier;

public abstract class AbstractService {
    protected String name;
    protected String hostAdress;
    protected Notifier notifier;

    public AbstractService(String name, String hostAdress, Notifier notifier) {
        this.name = name;
        this.hostAdress = hostAdress;
        this.notifier = notifier;
    }
    public void callNotifier() {
        this.notifier.notifyDowntime(new Notification(name, "Service unreachable"));
    }
    public boolean serviceOkay() {
        return serviceAvailable() && serviceNormalResonseTime();
    }

    public boolean serviceAvailable() {
        return true;
    }

    public boolean serviceNormalResonseTime() {
        return true;
    }
}
