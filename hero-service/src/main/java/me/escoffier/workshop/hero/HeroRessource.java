package me.escoffier.workshop.hero;

import org.jboss.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class HeroRessource {

    private static final Logger LOGGER = Logger.getLogger(HeroRessource.class);

    @GET
    @Path("/heroes/random")
    public Hero getRandomHero() {
        Hero hero = Hero.findRandom();
        LOGGER.debug("Found random hero " + hero);
        return hero;
    }


}
