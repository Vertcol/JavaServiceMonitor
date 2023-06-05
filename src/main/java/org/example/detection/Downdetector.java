package org.example.detection;

import java.util.ArrayList;
import java.util.List;

public class Downdetector {
    private List<AbstractService> services = new ArrayList<AbstractService>();
    public void detect() {
        for (AbstractService service: services) {
            if (!service.serviceOkay()) {
                service.callNotifier();
            }
        }
    }

    public void addService(AbstractService service) {
        this.services.add(service);
    }

    public void removeService(AbstractService service) {
        this.services.remove(service);
    }
}
