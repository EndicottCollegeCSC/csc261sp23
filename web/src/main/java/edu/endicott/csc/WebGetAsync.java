package edu.endicott.csc;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class WebGetAsync {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String url = "https://en.wikipedia.org/wiki/Endicott_College";
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        HttpClient client = HttpClient.newHttpClient();
        client.sendAsync(request, BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

    }
}