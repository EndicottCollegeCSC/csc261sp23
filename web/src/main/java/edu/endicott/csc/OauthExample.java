package edu.endicott.csc;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Base64;

import com.google.gson.Gson;

public class OauthExample {

    public class Token {
        private String token_type, access_token, exp;

        public String getToken_type() {
            return token_type;
        }

        public void setToken_type(String token_type) {
            this.token_type = token_type;
        }

        public String getAccess_token() {
            return access_token;
        }

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
        }

        public String getExp() {
            return exp;
        }

        public void setExp(String exp) {
            this.exp = exp;
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        // {
        //     "clientId": "8b72d56f-5ebb-4c6e-8281-45bb28f16c00",
        //     "clientSecret": "29e959d7-8d30-4b46-8331-0d9f94b80abd"
        //   }
        // Get the base 64 encoding of a string:
        //Base64.getEncoder().encodeToString(myString.getBytes());
        // DON"T ACTUALLY STORE CREDENTIALS IN YOUR CODE.
        String clientId = "XXXXXX"; // Replace this with your client id
        String clientSecret = "YYYYYY"; // Replace this with your client secret
        String authString = Base64.getEncoder().encodeToString(
            (clientId+":"+clientSecret).getBytes());

        String url = "https://digdug.cs.endicott.edu/~hfeild/ds303/oauth/api/token";
        HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(url))
        // Authorization header should be set to Basic XYZ -- Question 1: HOW?
        .header("Authorization", "Basic "+ authString)
        .header("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8")
        .POST(BodyPublishers.ofString("grant_type=client_credentials"))
        .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());

        Token token = new Gson().fromJson(response.body(), Token.class);

        System.out.println(token.getAccess_token());
        // For post arguments in form-format, set header:
        // Content-Type: application/x-www-form-urlencoded; charset=UTF-8

        request = HttpRequest.newBuilder()
        .uri(URI.create("https://digdug.cs.endicott.edu/~hfeild/ds303/oauth/api/csv/mouse"))
        // Authorization header should be set to Basic XYZ -- Question 1: HOW?
        .header("Authorization", "Bearer "+ token.getAccess_token())
        .build();

        response = client.send(request, BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
