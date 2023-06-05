package org.example.detection;

import org.example.notify.Notifier;

public abstract class AbstractService {
    private String name;
    private String hostAdress;
    private Notifier notifier;

    public AbstractService(String name, String hostAdress, Notifier notifier) {
        this.name = name;
        this.hostAdress = hostAdress;
        this.notifier = notifier;
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
