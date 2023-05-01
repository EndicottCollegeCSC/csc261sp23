package edu.endicott.csc;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class WebGet {
    public static void main(String[] args) throws IOException, InterruptedException {

        if(args.length == 0){
            System.err.println("No enough arguments; must specify URL to download.");
            System.exit(1);
        }
        // String url = "https://en.wikipedia.org/wiki/Endicott_College";
        String url = args[0];
        
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .build();
            
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
