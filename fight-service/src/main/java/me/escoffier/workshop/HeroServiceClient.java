package me.escoffier.workshop;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RegisterRestClient(configKey = "hero-service")
@Produces(MediaType.TEXT_PLAIN)
public interface HeroServiceClient {

    @GET
    @Path("/heroes/random")
    Hero getRandomHero(); 
}