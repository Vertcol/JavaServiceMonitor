package org.example.utility;

import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPrequest {
    private String url_string;

    public HTTPrequest(String url) {
        this.url_string = url;
    }

    public boolean execute() {
        try {
            URL url = new URL(url_string);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            return responseCode == HttpURLConnection.HTTP_OK;
        } catch (Exception ignored) {}

        return false;
    }
}
