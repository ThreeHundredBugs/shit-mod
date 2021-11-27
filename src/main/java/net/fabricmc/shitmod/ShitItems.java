package net.fabricmc.shitmod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.shitmod.blocks.ShitBlock;
import net.fabricmc.shitmod.blocks.ShitBlockSlab;
import net.fabricmc.shitmod.items.ShitIngot;
import net.fabricmc.shitmod.items.ShitOre;
import net.fabricmc.shitmod.materials.ShitArmorMaterial;
import net.fabricmc.shitmod.materials.ShitToolMaterial;
import net.minecraft.block.Material;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;

public class ShitItems
{

    public static final Item shitOre = new ShitOre(new FabricItemSettings().group(ShitItemGroup.shitItemGroup));
    public static final Item shitIngot = new ShitIngot(new FabricItemSettings().group(ShitItemGroup.shitItemGroup));
    public static final ArmorMaterial shitArmorMaterial = new ShitArmorMaterial();
    public static final ToolMaterial shitToolMaterial = new ShitToolMaterial();
    public static final Item shitHelmet = new ArmorItem(shitArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(ShitItemGroup.shitItemGroup));
    public static final Item shitChestplate = new ArmorItem(shitArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(ShitItemGroup.shitItemGroup));
    public static final Item shitLeggings = new ArmorItem(shitArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(ShitItemGroup.shitItemGroup));
    public static final Item shitBoots = new ArmorItem(shitArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(ShitItemGroup.shitItemGroup));
    public static ToolItem shitShovel = new ShovelItem(shitToolMaterial, 1.5F, -3.0F, new Item.Settings().group(ShitItemGroup.shitItemGroup));
    public static ToolItem shitSword = new SwordItem(ShitToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings().group(ShitItemGroup.shitItemGroup));
    public static final ShitBlock shitBlock = new ShitBlock(FabricBlockSettings.of(Material.METAL).strength(4.0f));
    public static final ShitBlockSlab shitBlockSlab = new ShitBlockSlab(FabricBlockSettings.of(Material.METAL).strength(4.0f));
}


