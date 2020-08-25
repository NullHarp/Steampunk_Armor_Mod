package com.nullharp.steampunk.tools;

import com.nullharp.steampunk.util.RegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum SteampunkItemTier implements IItemTier {
    COPPER(2, 250, 6.0f, 0.0f, 25, () -> {
            return Ingredient.fromItems(RegistryHandler.COPPER_SWORD_TOOL.get());
    }),
    COPPER_STEEL(3, 500, 8.0f, 0.5f, 35, () -> {
        return Ingredient.fromItems(RegistryHandler.COPPER_SWORD_TOOL.get());
    }),
    TITANIUM_STEEL(4, 2000, 8.0f, 1.0f, 45, () -> {
        return Ingredient.fromItems(RegistryHandler.COPPER_SWORD_TOOL.get());
    });
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    SteampunkItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {

        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
