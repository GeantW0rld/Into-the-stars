package eu.geantworld.into_the_stars.common.registry;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registrar;
import dev.architectury.registry.registries.RegistrySupplier;
import eu.geantworld.into_the_stars.Constants;
import eu.geantworld.into_the_stars.common.blocks.TestBlock;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Constants.MOD_ID, Registries.BLOCK);

    public static final Registrar<Block> BLOCK_REGISTRAR = BLOCKS.getRegistrar();

    public static final RegistrySupplier<Block> TestBlock = BLOCK_REGISTRAR.register(ResourceLocation.fromNamespaceAndPath(
            Constants.MOD_ID, "test_block"),
            () -> new TestBlock(BlockBehaviour.Properties.of().strength(3f).sound(SoundType.AMETHYST)));

    public static void register() {

    }
}
