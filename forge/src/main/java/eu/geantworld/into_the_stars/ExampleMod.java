package eu.geantworld.into_the_stars;

import eu.geantworld.into_the_stars.registry.ModBlocks;
import eu.geantworld.into_the_stars.registry.ModItems;
import eu.geantworld.into_the_stars.registry.ModTabs;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;

@Mod(Constants.MOD_ID)
public class ExampleMod {

  public static IEventBus eventBus;

  public ExampleMod(FMLJavaModLoadingContext context) {

    eventBus = context.getModEventBus();

    CommonClass.init();

    bind(Registries.BLOCK, ModBlocks::register);
    bind(Registries.ITEM, ModItems::register);
    bind(Registries.CREATIVE_MODE_TAB, ModTabs::register);
  }

  /** Adapted from <a href="https://github.com/VazkiiMods/Botania">Botania</a> */
  private static <T> void bind(ResourceKey<Registry<T>> registry, Consumer<BiConsumer<T, ResourceLocation>> source) {
    eventBus.addListener((RegisterEvent event) -> {
      if (registry.equals(event.getRegistryKey())) {
        source.accept((t, rl) -> event.register(registry, rl, () -> t));
      }
    });
  }
}