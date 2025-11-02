package eu.geantworld.neoforge.client;

import eu.geantworld.into_the_stars.client.IntoTheStarsClient;
import eu.geantworld.into_the_stars.client.gui.TestScreen;
import eu.geantworld.into_the_stars.common.registry.ModMenus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;

public class IntoTheStarsNeoForgeClient {
    public static void onRegisterScreens(RegisterMenuScreensEvent event) {
        event.register(ModMenus.TEST_MENU.get(), TestScreen::new);
    }
}