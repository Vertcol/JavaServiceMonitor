package org.example.detection;

import org.example.notify.Notifier;
import org.example.utility.HTTPrequest;

public class APIService extends AbstractService {

    public APIService(String name, String hostAdress, Notifier notifier) {
        super(name, hostAdress, notifier);
    }

    @Override
    public boolean serviceAvailable() {
        HTTPrequest request = new HTTPrequest(super.hostAdress,"POST");
        return request.execute();
    }
}
