import Resources.GiphyForSlackResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class App extends Application<GiphyForSlackConfiguration> {

    public static void main(String[] args) throws Exception {
        new App().run(args);
    }

    @Override
    public void run(GiphyForSlackConfiguration configuration,
                    Environment environment) {

        final GiphyForSlackResource resource = new GiphyForSlackResource();
        environment.jersey().register(resource);
    }
}
