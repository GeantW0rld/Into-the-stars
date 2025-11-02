package eu.geantworld.into_the_stars.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import eu.geantworld.into_the_stars.Constants;
import eu.geantworld.into_the_stars.common.menus.TestMenu;
import net.minecraft.core.RegistryAccess;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;

public class ModMenus {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Constants.MOD_ID, Registries.MENU);

    public static final RegistrySupplier<MenuType<TestMenu>> TEST_MENU =
            MENUS.register("test_menu",
                    () -> new MenuType<>(
                            TestMenu::new,
                            FeatureFlags.VANILLA_SET
                    ));

    public static void register() {
        MENUS.register();
    }
}
