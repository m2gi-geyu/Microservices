package me.escoffier.workshop;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.time.temporal.ChronoUnit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Timeout;

@RegisterRestClient(configKey = "villain-service")
public interface VillainServiceClient {

    @GET
    @Path("/villains/random")
    @Timeout(value = 1, unit = ChronoUnit.SECONDS) // <---- Added
    @Fallback(fallbackMethod = "getFallbackVillain") // <---- Added
    Villain getRandomVillain(); 

    default Villain getFallbackVillain() {
        String name = "Neville Townsend";
        String otherName = "Neville Townsend";
        int level = 22;
        String picture = "https://github.com/cescoffier/supes/raw/main/pics/38295.jpg";
        String powers = null;

        return new Villain(name, otherName, level, picture, powers);
    }
}
