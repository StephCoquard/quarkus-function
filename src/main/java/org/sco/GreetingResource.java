package org.sco;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello jaxrs";
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld(final String name) {
        return "hello " + name;
    }
}
