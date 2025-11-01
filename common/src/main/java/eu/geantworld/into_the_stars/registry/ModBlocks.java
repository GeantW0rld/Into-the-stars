package eu.geantworld.into_the_stars.registry;

import eu.geantworld.into_the_stars.Constants;
import eu.geantworld.into_the_stars.block.MyCoolBlock;
import java.util.function.BiConsumer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {

  public static final Block MY_COOL_BLOCK = new MyCoolBlock(BlockBehaviour.Properties.of());

  static {
    Constants.LOG.info("defined blocks!");
  }

  public static void register(BiConsumer<Block, ResourceLocation> consumer) {
    Constants.LOG.info("registering blocks!");
    consumer.accept(MY_COOL_BLOCK, ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "my_cool_block"));
  }
}
