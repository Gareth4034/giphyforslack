package Resources;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.client.JerseyClient;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.json.simple.JSONObject;

public class GiphyAccess {

    private final String host = "http://api.giphy.com/";
    private final String trendingEndpoint = "v1/gifs/trending";
    private final String key = "vqP1NkY8V6hb4DgxJkg2DT0DkrjYcC7T";

    public JSONObject getTrending() {
        String url = host + trendingEndpoint + "?api_key=" + key;
        JerseyClient client = new JerseyClientBuilder().build();
        WebTarget target = client.target(url);
        final Response response = target.request(MediaType.APPLICATION_JSON)
                .get(Response.class);

        JSONObject jsonContract = response
                .readEntity(new GenericType<JSONObject>() {
                });

        return jsonContract;
    }
}
