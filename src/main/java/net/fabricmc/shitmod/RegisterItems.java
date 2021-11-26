package net.fabricmc.shitmod;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class RegisterItems {

    public RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_ore"), ShitItems.shitOre);
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_ingot"), ShitItems.shitIngot);
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_sword"), ShitItems.shitSword);
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_helmet"), ShitItems.shitHelmet);
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_chestplate"), ShitItems.shitChestplate);
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_leggings"), ShitItems.shitLeggings);
        Registry.register(Registry.ITEM, new Identifier("shitmod", "shit_boots"), ShitItems.shitBoots);
    }
}