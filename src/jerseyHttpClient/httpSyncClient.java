import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.Client;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

public class httpSyncClient {

    public static void main(String [] args){

        /**
         * This is how you run it
         * $ javac -cp ../../lib/jersey-bundle-1.19.jar httpSyncClient.java
         * $ java -cp .:../../lib/jersey-bundle-1.19.jar httpSyncClient
         */

        String payload = "{\"id\":837686871,\"funcname\":\"SeoV2\",\"args\":null,\"source\":null,\"product\":null}";
        callEndpoint("hello", payload);
    }

    public static void callEndpoint(String endpoint, String payload) {

        try {

            ClientConfig config = new DefaultClientConfig();
            Client client = Client.create(config);
            client.setConnectTimeout(5000);
            client.setReadTimeout(10000);

            //Client client = ClientBuilder.newClient();
            WebResource webResource = client.resource(getBaseURI(endpoint));

            // POST method
            System.out.println("start");
            ClientResponse response = webResource.accept("application/json")
                    .type("application/json")
                    .post(ClientResponse.class, payload);

            // This is blocking call and will wait for the response
            if (response.getStatus() != 200) {
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
        String url = "http://sfo2-dev-vmdev008.sfo2.zoosk.com:9088/worker/v2/SeoV2";
        return UriBuilder.fromUri(url).build();
    }


}
