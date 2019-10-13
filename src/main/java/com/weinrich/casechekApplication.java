package com.weinrich;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class casechekApplication extends Application<casechekConfiguration> {

    public static void main(final String[] args) throws Exception {
        new casechekApplication().run(args);
    }

    @Override
    public String getName() {
        return "casechek";
    }

    @Override
    public void initialize(final Bootstrap<casechekConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final casechekConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
