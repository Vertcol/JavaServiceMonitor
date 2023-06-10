package org.example.utility;

import java.net.HttpURLConnection;
import java.net.URL;

public class HTTPrequest {
    private String url_string;
    private String method;

    public HTTPrequest(String url, String method) {
        this.url_string = url;
        this.method = method;
    }

    public boolean execute() {
        try {
            URL url = new URL(url_string);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(method);

            int responseCode = connection.getResponseCode();
            return responseCode == HttpURLConnection.HTTP_OK;
        } catch (Exception ignored) {}

        return false;
    }
}
