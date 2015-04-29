import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class httpSyncClient {

    public static void main(String [] args){
        callEndpoint("hello", "payload");
    }

    public static void callEndpoint(String endpoint, String payload) {

        try {

            ClientConfig config = new DefaultClientConfig();
            Client client = Client.create(config);
            WebResource webResource = client.resource(getBaseURI(endpoint));

            // POST method
            System.out.println("start");
            ClientResponse response = webResource.accept("application/json")
                    .type("application/json")
                    .post(ClientResponse.class, payload);

            if (response.getStatus() != 200) {
                // Is this blocking?
                System.out.println("The endpoint [" + getBaseURI(endpoint) + "] returned a non 200 status code [" + response.getStatus() + "] ");
            }
            System.out.println(response);
        } catch (Exception e) {
            // Do something meaningful
            System.out.println ("The endpoint for " + endpoint + " - " + getBaseURI(endpoint) + " is not reachable. This is the exception - " + e);
        }
        System.out.println("done");
    }

    private static URI getBaseURI(String endpoint) {
        String url = "http://localhost/sumitk.in/test.php";
        return UriBuilder.fromUri(url).build();
    }


}
