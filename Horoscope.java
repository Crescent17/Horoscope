package Astrology;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Horoscope {
    public static HttpClient client = HttpClient.newHttpClient();

    public static void horoscope(Zodiac sign) {
        if (!sign.toString().equals("ERROR")) {
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://horoscope-api.herokuapp.com/horoscope/today/"
                    + sign.toString())).build();
            client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenAccept(System.out::println)
                    .join();
        }
    }
}