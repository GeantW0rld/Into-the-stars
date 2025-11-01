package eu.geantworld.into_the_stars.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import eu.geantworld.into_the_stars.Constants;
import eu.geantworld.into_the_stars.block.MyCoolBlock;
import java.util.function.BiConsumer;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Constants.MOD_ID, Registries.BLOCK);

    public static final Registrar<Block> BLOCK_REGISTRAR = BLOCKS.getRegistrar();

    public static final RegistrySupplier<Block> TestBlock = BLOCK_REGISTRAR.register(ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "test_block"), () -> new MyCoolBlock(BlockBehaviour.Properties.of()));

    public static void register() {

    }
}
