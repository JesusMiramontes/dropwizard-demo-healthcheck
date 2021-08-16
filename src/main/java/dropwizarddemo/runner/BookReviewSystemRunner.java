package dropwizarddemo.runner;

import dropwizarddemo.config.BRSConfiguration;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class BookReviewSystemRunner extends Application<BRSConfiguration> {
    public static void main(String[] args) throws Exception {
        new BookReviewSystemRunner().run(args);
    }

    @Override
    public void run(BRSConfiguration brsConfiguration, Environment environment) throws Exception {
        System.out.println("Running.");
    }
}
