package eu.geantworld.into_the_stars.registry;

import eu.geantworld.into_the_stars.Constants;
import eu.geantworld.into_the_stars.platform.Services;
import java.util.function.BiConsumer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {

  public static final CreativeModeTab tab = Services.PLATFORM.tabBuilder()
      .icon(() -> new ItemStack(ModItems.MY_COOL_BLOCK))
      .title(Component.literal(Constants.MOD_NAME))
      .displayItems((itemDisplayParameters, output) -> {
        output.accept(ModItems.MY_COOL_BLOCK);
      }).build();

  public static void register(BiConsumer<CreativeModeTab, ResourceLocation> consumer) {
    consumer.accept(tab, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "tab"));
  }
}
