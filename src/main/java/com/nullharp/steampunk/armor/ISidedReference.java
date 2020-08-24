package com.nullharp.steampunk.armor;

import net.minecraft.inventory.EquipmentSlotType;

public interface ISidedReference {
    default <A> A getPlatedArmorModel(EquipmentSlotType armorSlot) {
        return null;
    }

    default <A> A getCopperArmorModel(EquipmentSlotType armorSlot) {
        return null;
    }
}