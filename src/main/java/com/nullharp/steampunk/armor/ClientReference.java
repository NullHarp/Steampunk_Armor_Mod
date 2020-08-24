package com.nullharp.steampunk.armor;

import net.minecraft.inventory.EquipmentSlotType;

public class ClientReference implements ISidedReference {

    private final PlatedArmorModel platedArmorModel = new PlatedArmorModel(1.0f);
    private final PlatedArmorModel platedLeggingsModel = new PlatedArmorModel(0.5f);
    private final PlatedArmorModel copperArmorModel = new PlatedArmorModel(1.0f);
    private final PlatedArmorModel copperLeggingsModel = new PlatedArmorModel(0.5f);

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getPlatedArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? platedLeggingsModel : platedArmorModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public <A> A getCopperArmorModel(EquipmentSlotType armorSlot) {
        return (A) (armorSlot == EquipmentSlotType.LEGS ? copperArmorModel : copperLeggingsModel);
    }
}