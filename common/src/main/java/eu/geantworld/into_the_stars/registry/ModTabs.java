package eu.geantworld.into_the_stars.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import eu.geantworld.into_the_stars.Constants;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Constants.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final Registrar<CreativeModeTab> TAB_REGISTRAR = TABS.getRegistrar();

    public static final RegistrySupplier<CreativeModeTab> MAIN_TAB =
            TAB_REGISTRAR.register(
                    ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "tab"),
                    () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                            .icon(() -> new ItemStack(ModItems.TestBlock.get()))
                            .title(Component.literal(Constants.MOD_NAME))
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.TestBlock.get());
                            })
                            .build()
            );

    public static void register() {
        TABS.register();
    }
}
