package com.nps.iso.config;

import com.nps.iso.web.CurrencyEndpoint;
import com.nps.iso.web.EntityEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        registerEndpoints();
    }

    private void registerEndpoints() {
        register(CurrencyEndpoint.class);
        register(EntityEndpoint.class);
    }
}