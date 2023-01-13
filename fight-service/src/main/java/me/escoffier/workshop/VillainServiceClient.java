package me.escoffier.workshop;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RegisterRestClient(configKey = "villain-service")
public interface VillainServiceClient {

    @GET
    @Path("/villains/random")
    Villain getRandomVillain(); 
}