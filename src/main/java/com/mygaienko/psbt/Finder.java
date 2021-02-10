package com.mygaienko.psbt;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Finder {

    public static boolean findPs(Strategy strategy) {
        HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();

        HttpRequest request = HttpRequest.newBuilder(URI.create(strategy.getUrl()))
//                .header("Content-Type", "application/json")
                .GET()
                .build();

        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return false;
        }
        String body = response.body();
        return strategy.getKeyWords()
                .stream()
                .anyMatch(body::contains);
    }

}
