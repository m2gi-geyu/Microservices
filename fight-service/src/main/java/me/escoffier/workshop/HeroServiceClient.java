package me.escoffier.workshop;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.time.temporal.ChronoUnit;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.faulttolerance.Timeout;

@RegisterRestClient(configKey = "hero-service")
public interface HeroServiceClient {

    @GET
    @Path("/heroes/random")
    @Timeout(value = 1, unit = ChronoUnit.SECONDS) // <---- Added
    @Fallback(fallbackMethod = "getFallbackHero") // <---- Added
    Hero getRandomHero(); 

    default Hero getFallbackHero() {
        String name = "C-3PO";
        String otherName = "";
        int level = 16;
        String picture = "https://github.com/cescoffier/supes/raw/main/pics/10445.jpg";
        String powers = null;

        return new Hero(name, otherName, level, picture, powers);
    }

}