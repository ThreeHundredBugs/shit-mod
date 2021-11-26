package net.fabricmc.shitmod;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ShitItemGroup {
    public static final ItemGroup shitItemGroup = FabricItemGroupBuilder.build(
            new Identifier("shit", "general"),
            () -> new ItemStack(ShitItems.shitIngot));
}
