import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Exception;
import java.net.MalformedURLException;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
//import org.apache.http.impl.client.DefaultHttpClient;

import org.apache.http.Header;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;


public class ApacheHttpClientSync {

    public static void main(String[] args){

        ApacheHttpClientSync http = new ApacheHttpClientSync();

        try {
            System.out.println("Testing - Send Http POST request");
            http.sendPost();

            //System.out.println("\nTesting - Send Http GET request");
            //http.sendGet();

        }  catch (MalformedURLException e) {
            System.out.println("MalformedURLException = ");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException = ");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Exception = " + e.getMessage());
        }
    }

    private void sendPost() throws MalformedURLException, IOException, Exception {

        //DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost postRequest = new HttpPost("http://sfo2-dev-vmdev008.sfo2.zoosk.com:9088/worker/v2/SeoV2");

        StringEntity input = new StringEntity("{\"qty\":100,\"name\":\"iPad 4\"}");
        input.setContentType("application/json");
        postRequest.setEntity(input);

        HttpResponse response = httpClient.execute(postRequest);

        if (response.getStatusLine().getStatusCode() != 201) {
            throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
        }

        BufferedReader br = new BufferedReader(
                new InputStreamReader((response.getEntity().getContent())));

        String output;
        System.out.println("Output from Server .... \n");
        while ((output = br.readLine()) != null) {
            System.out.println(output);
        }

        //httpClient.close();
        //httpClient.getConnectionManager().shutdown();

    }

}