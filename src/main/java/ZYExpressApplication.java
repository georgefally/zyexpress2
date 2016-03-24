import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.forms.MultiPartBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ZYExpressApplication extends Application<ZYExpressConfiguration> {
    public static void main(String[] args) throws Exception {
        new ZYExpressApplication().run(args);
    }

    @Override
    public String getName() {
        return "ZYExpressApplication";
    }

    @Override
    public void initialize(Bootstrap<ZYExpressConfiguration> bootstrap) {
        bootstrap.addBundle(new MultiPartBundle());
        bootstrap.addBundle(new AssetsBundle("/assets/", "/","index.html"));
    }

    @Override
    public void run(ZYExpressConfiguration configuration, Environment environment) throws Exception {

    }
}
