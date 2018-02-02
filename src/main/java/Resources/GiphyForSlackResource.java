package Resources;

import com.codahale.metrics.annotation.Timed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONObject;

@Path("/gifs")
@Produces(MediaType.APPLICATION_JSON)
public class GiphyForSlackResource {

    @GET
    @Path("/trending")
    @Timed
    public JSONObject getTrending() {
        return new GiphyAccess().getTrending();
    }

    @GET
    @Path("/search")
    @Timed
    public String getTrending(@QueryParam("query") String query) throws
            Exception {
        String response = "{\n" +
                "\"attachments\": [\n" +
                "        {\n" +
                "            \"fallback\": \"Required plain-text summary of the attachment.\",\n" +
                "            \"color\": \"#36a64f\",\n" +
                "            \"pretext\": \"Optional text that appears above the attachment block\",\n" +
                "            \"author_name\": \"Bobby Tables\",\n" +
                "            \"author_link\": \"http://flickr.com/bobby/\",\n" +
                "            \"author_icon\": \"http://flickr.com/icons/bobby.jpg\",\n" +
                "            \"title\": \"Slack API Documentation\",\n" +
                "            \"title_link\": \"https://api.slack.com/\",\n" +
                "            \"text\": \"Optional text that appears within the attachment\",\n" +
                "            \"fields\": [\n" +
                "                {\n" +
                "                    \"title\": \"Priority\",\n" +
                "                    \"value\": \"High\",\n" +
                "                    \"short\": false\n" +
                "                }\n" +
                "            ],\n" +
                "            \"image_url\": \"https://s7d1.scene7.com/is/image/PETCO/cat-category-090617-369w-269h-hero-cutout-d?fmt=png-alpha\",\n" +
                "            \"thumb_url\": \"https://s7d1.scene7.com/is/image/PETCO/cat-category-090617-369w-269h-hero-cutout-d?fmt=png-alpha\",\n" +
                "            \"footer\": \"Slack API\",\n" +
                "            \"footer_icon\": \"https://platform.slack-edge.com/img/default_application_icon.png\",\n" +
                "            \"ts\": 123456789\n" +
                "        }\n" +
                "    ]\n" +
                "}";


        return response;
    }
}

/*Example message
{
"attachments": [
        {
            "fallback": "Required plain-text summary of the attachment.",
            "color": "#36a64f",
            "pretext": "Optional text that appears above the attachment block",
            "author_name": "Bobby Tables",
            "author_link": "http://flickr.com/bobby/",
            "author_icon": "http://flickr.com/icons/bobby.jpg",
            "title": "Slack API Documentation",
            "title_link": "https://api.slack.com/",
            "text": "Optional text that appears within the attachment",
            "fields": [
                {
                    "title": "Priority",
                    "value": "High",
                    "short": false
                }
            ],
            "image_url": "https://s7d1.scene7.com/is/image/PETCO/cat-category-090617-369w-269h-hero-cutout-d?fmt=png-alpha",
            "thumb_url": "https://s7d1.scene7.com/is/image/PETCO/cat-category-090617-369w-269h-hero-cutout-d?fmt=png-alpha",
            "footer": "Slack API",
            "footer_icon": "https://platform.slack-edge.com/img/default_application_icon.png",
            "ts": 123456789
        }
    ]*/
