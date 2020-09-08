package main.httpNewClient;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;

public class NewHttpClientDemo {
    public void demo() {
        try{
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest httpRequest = HttpRequest
                    .newBuilder()
                    .uri(new URI("https://www.geeksforgeeks.org/about/"))
                    .GET()
                    .build();
            HttpResponse<String> httpResponse = httpClient.send(
                    httpRequest,
                    HttpResponse.BodyHandler.asString()
            );
            System.out.println("Response status:"+httpResponse.statusCode());
            System.out.println("Response body:"+httpResponse.body());
        }catch (Exception ex){
            System.out.println(ex);
        }

    }
}
