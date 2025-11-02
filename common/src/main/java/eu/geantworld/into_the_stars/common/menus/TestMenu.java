package eu.geantworld.into_the_stars.common.menus;

import eu.geantworld.into_the_stars.common.registry.ModMenus;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;

public class TestMenu extends AbstractContainerMenu {
    public TestMenu(int id, Inventory inv) {
        super(ModMenus.TEST_MENU.get(), id);
    }

    public TestMenu(int id, Inventory inv, FriendlyByteBuf buf) {
        this(id, inv);
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        return ItemStack.EMPTY;
    }
}
