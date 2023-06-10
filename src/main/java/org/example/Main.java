package org.example;

import org.example.detection.Downdetector;
import org.example.detection.WebService;
import org.example.notify.Notifier;
import org.example.notify.TestSubscriber;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Downdetector detector = new Downdetector();

        Notifier hhs_notifier = new Notifier();
        hhs_notifier.addSubscriber(new TestSubscriber());
        detector.addService(new WebService("HHS", "https://www.dehaagsehogeschool.nl/", hhs_notifier));

        detector.detect();

        TimeUnit.SECONDS.sleep(10);

        detector.addService(new WebService("BrokenService", "08402", hhs_notifier));

        while (true) {
            detector.detect();
            TimeUnit.SECONDS.sleep(10);
        }

    }
}