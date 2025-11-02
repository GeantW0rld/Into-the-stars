package eu.geantworld;

import eu.geantworld.into_the_stars.common.registry.ModBlocks;
import eu.geantworld.into_the_stars.common.registry.ModItems;
import eu.geantworld.into_the_stars.common.registry.ModMenus;
import eu.geantworld.into_the_stars.common.registry.ModTabs;

public final class IntoTheStars {
    // public static final String MOD_ID = "into_the_stars";

    public static void init() {
        ModBlocks.register();
        ModItems.register();
        ModTabs.register();
        ModMenus.register();
    }
}
