package Resources;

import Model.GiphyObject;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/get-gif")
@Produces(MediaType.APPLICATION_JSON)
public class GiphyForSlackResource {

    @GET
    @Timed
    public String sayHello(@QueryParam("query") String query) {
        return "WOOOOOOHHH! It's working!!!";
    }
}
