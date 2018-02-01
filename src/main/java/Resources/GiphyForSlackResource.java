package Resources;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.json.simple.JSONObject;

@Path("/trending")
@Produces(MediaType.APPLICATION_JSON)
public class GiphyForSlackResource {

    @GET
    @Timed
    public JSONObject getTrending(@QueryParam("query") String query) {
        return new GiphyAccess().getTrending();
    }
}
