package org.acme;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/")
public class GreetingResource {

    @Inject
    @ConfigProperty(name = "VAR")
    String var;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String main() {
        return var;
    }
}
