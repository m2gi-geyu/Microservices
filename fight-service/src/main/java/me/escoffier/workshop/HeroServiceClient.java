package me.escoffier.workshop;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RegisterRestClient(configKey = "hero-service")
public interface HeroServiceClient {

    @GET
    @Path("/heroes/random")
    Hero getRandomHero(); 
}