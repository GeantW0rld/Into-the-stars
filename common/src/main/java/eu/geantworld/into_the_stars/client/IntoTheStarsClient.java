package eu.geantworld.into_the_stars.client;

import dev.architectury.registry.menu.MenuRegistry;
import eu.geantworld.into_the_stars.client.gui.TestScreen;
import eu.geantworld.into_the_stars.common.registry.ModMenus;
import net.minecraft.client.gui.screens.MenuScreens;

public class IntoTheStarsClient {
    public static void init() {
        MenuRegistry.registerScreenFactory(ModMenus.TEST_MENU.get(), TestScreen::new);
    }
}
