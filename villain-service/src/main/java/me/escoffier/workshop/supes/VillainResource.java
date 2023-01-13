package me.escoffier.workshop.supes;

import org.jboss.logging.Logger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Random;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public class VillainResource {

    private static final Logger LOGGER = Logger.getLogger(VillainResource.class);

@GET
    @Path("/villains/random")
    public Villain getRandomVillain() {
        Villain villain = Villain.findRandom();
        LOGGER.debug("Found random villain " + villain);
        return villain;
    }
}