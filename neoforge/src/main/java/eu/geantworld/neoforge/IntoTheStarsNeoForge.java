package eu.geantworld.neoforge;

import eu.geantworld.into_the_stars.Constants;
import eu.geantworld.neoforge.client.IntoTheStarsNeoForgeClient;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

import eu.geantworld.IntoTheStars;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;

@Mod(Constants.MOD_ID)
public final class IntoTheStarsNeoForge {
    public IntoTheStarsNeoForge(IEventBus modEventBus) {
        // Run our common setup.
        IntoTheStars.init();

        if (FMLEnvironment.dist == Dist.CLIENT) {
            modEventBus.addListener(IntoTheStarsNeoForgeClient::onRegisterScreens);
        }
    }
}