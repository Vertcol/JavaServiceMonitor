package org.example.detection;

import org.example.notify.Notifier;

public class WebService extends AbstractService {

    public WebService(String name, String hostAdress, Notifier notifier) {
        super(name, hostAdress, notifier);
    }

    @Override
    public boolean serviceAvailable() {
        return true;
    }
}
