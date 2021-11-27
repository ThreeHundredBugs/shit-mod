package net.fabricmc.shitmod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems
{

    public RegisterItems()
    {
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_ore"), ShitItems.shitOre);
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_ingot"), ShitItems.shitIngot);
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_sword"), ShitItems.shitSword);
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_helmet"), ShitItems.shitHelmet);
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_chestplate"), ShitItems.shitChestplate);
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_leggings"), ShitItems.shitLeggings);
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_boots"), ShitItems.shitBoots);
        Registry.register(Registry.BLOCK, new Identifier("shitmod", "shit_block"), ShitItems.shitBlock);
        Registry.register(Registry.BLOCK, new Identifier("shitmod", "shit_block_slab"), ShitItems.shitBlockSlab);
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_block"),
                new BlockItem(ShitItems.shitBlock, new FabricItemSettings().group(ShitItemGroup.shitItemGroup)));
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_block_slab"),
                new BlockItem(ShitItems.shitBlockSlab, new FabricItemSettings().group(ShitItemGroup.shitItemGroup)));

    }
}