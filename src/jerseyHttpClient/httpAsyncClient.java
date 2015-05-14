import com.sun.jersey.api.client.AsyncWebResource;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.concurrent.Future;

public class httpAsyncClient {

    public static void main(String [] args){
        call("hello", "payload");
    }

    public static void call(String endpoint, String payload) {

        try {

            ClientConfig config = new DefaultClientConfig();
            Client client = Client.create(config);
            AsyncWebResource webResource = client.asyncResource(getBaseURI(endpoint));

            // POST method
            System.out.println("start");
            Future<ClientResponse> resp = webResource.accept("application/json")
                    .type("application/json")
                    .post(ClientResponse.class, payload);

            // The call below makes it blocking
            /*
            ClientResponse response = resp.get();

            if (response.getStatus() != 200) {
                System.out.println("The  [" + getBaseURI(endpoint) + "] returned a non 200 status code [" + response.getStatus() + "] ");
            }
            */
            System.out.println(response);
        } catch (Exception e) {
            // Do something meaningful
            System.out.println ("The  for " + endpoint + " - " + getBaseURI(endpoint) + " is not reachable. This is the exception - " + e);
        }
        System.out.println("done");
    }

    private static URI getBaseURI(String endpoint) {
        String url = "http://localhost/sumitk.in/test.php";
        return UriBuilder.fromUri(url).build();
    }


}
