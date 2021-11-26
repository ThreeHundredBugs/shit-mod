package net.fabricmc.shitmod.materials;

import net.fabricmc.shitmod.ShitItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ShitToolMaterial implements ToolMaterial {
    private static final int durability = 500;
    private static final float miningSpeedMultiplier = 5.0F;
    private static final float attackDamage = 3.0F;
    private static final int miningLevel = 2;
    private static final int enchantability = 15;
    public static final ShitToolMaterial INSTANCE = new ShitToolMaterial();

    @Override
    public int getDurability() {
        return ShitToolMaterial.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return ShitToolMaterial.miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return ShitToolMaterial.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return ShitToolMaterial.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return ShitToolMaterial.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ShitItems.shitIngot);
    }
}
