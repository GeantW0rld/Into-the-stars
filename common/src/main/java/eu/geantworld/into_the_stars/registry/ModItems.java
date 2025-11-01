package eu.geantworld.into_the_stars.registry;


import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import eu.geantworld.into_the_stars.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Constants.MOD_ID, Registries.ITEM);

    public static final Registrar<Item> ITEM_REGISTRAR = ITEMS.getRegistrar();

    public static final RegistrySupplier<Item> TestBlock = ITEM_REGISTRAR.register(ModBlocks.TestBlock.getId(), () -> new BlockItem(ModBlocks.TestBlock.get(), new Item.Properties()));

    public static void register() {

    }
}
