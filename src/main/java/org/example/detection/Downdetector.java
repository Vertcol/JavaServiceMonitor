package org.example.detection;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Downdetector {
    private List<AbstractService> services = new ArrayList<AbstractService>();
    public void detect() {
        List<AbstractService> services_with_errors = new ArrayList<AbstractService>();
        for (AbstractService service: services) {
            if (!service.serviceOkay()) {
                services_with_errors.add(service);
            }
        }
        System.out.print("[" + new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new Date()) + "]");
        if (services_with_errors.size() == 0) {
            System.out.println(" All services operational");
        } else {
            System.out.println(" Problems detected with the following services:");
            for (AbstractService service: services_with_errors) {
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
