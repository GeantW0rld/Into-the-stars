package eu.geantworld;

import eu.geantworld.into_the_stars.registry.ModBlocks;
import eu.geantworld.into_the_stars.registry.ModItems;
import eu.geantworld.into_the_stars.registry.ModTabs;

public final class IntoTheStars {
    public static final String MOD_ID = "into_the_stars";

    public static void init() {
        ModBlocks.register();
        ModItems.register();
        ModTabs.register();
    }
}
