package eu.geantworld.fabric.client;

import eu.geantworld.into_the_stars.client.IntoTheStarsClient;
import net.fabricmc.api.ClientModInitializer;

public final class IntoTheStarsFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        IntoTheStarsClient.init();
    }
}
