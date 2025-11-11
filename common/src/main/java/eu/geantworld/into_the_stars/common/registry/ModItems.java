package eu.geantworld.into_the_stars.common.registry;


import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import eu.geantworld.into_the_stars.Constants;
import eu.geantworld.into_the_stars.common.items.TestItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Constants.MOD_ID, Registries.ITEM);

    public static final Registrar<Item> ITEM_REGISTRAR = ITEMS.getRegistrar();

    public static final RegistrySupplier<Item> TestBlock = ITEM_REGISTRAR.register(ModBlocks.TestBlock.getId(), () -> new BlockItem(ModBlocks.TestBlock.get(), new Item.Properties()));

    public static final RegistrySupplier<Item> MoonSandBlock = ITEM_REGISTRAR.register(ModBlocks.MoonSandBlock.getId(), () -> new BlockItem(ModBlocks.MoonSandBlock.get(), new Item.Properties()));

    public static final RegistrySupplier<Item> TestItem = ITEM_REGISTRAR.register(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "test_item"), () -> new TestItem(new Item.Properties().stacksTo(1)));

    public static void register() {

    }
}
