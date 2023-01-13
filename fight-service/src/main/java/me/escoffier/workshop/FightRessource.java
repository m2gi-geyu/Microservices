package me.escoffier.workshop;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.inject.Inject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.Random;

@Path("/")
public class FightRessource {

    @Inject
    @RestClient
    HeroServiceClient hero;
    @Inject
    @RestClient
    VillainServiceClient villain;

    @GET
    @Path("/fight")
    public Fight fight() {
        return fight(
                hero.getRandomHero(),
                villain.getRandomVillain()
        );
    }

    private final Random random = new Random();

    private Fight fight(Hero hero, Villain villain) {
        int heroAdjust = random.nextInt(20);
        int villainAdjust = random.nextInt(20);

        if ((hero.level + heroAdjust) >= (villain.level + villainAdjust)) {
            return new Fight(hero, villain, hero.name);
        } else {
            return new Fight(hero, villain, villain.name);
        }
    }

}
