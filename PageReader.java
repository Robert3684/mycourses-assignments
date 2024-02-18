import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;;

public class PageReader {
    public static void main(String[] args) {
        // making instance of HttpClient
        HttpClient httpClient = HttpClient.newHttpClient();

        String url = "https://mycourses.rit.edu/d2l/home";

        // makes a request object
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        

        try{ 
            // send request and retrieves the response
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // prints the response body
            System.out.println(response.body());
        } catch (IOException | InterruptedException ioe){
            ioe.printStackTrace();
        }


    }
    
    

}