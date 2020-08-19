package com.nullharp.steampunk.armor;

import com.nullharp.steampunk.Steampunk;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;

public class CopperLeggings extends ArmorItem {
    public CopperLeggings() {
        super(Copper.COPPER, EquipmentSlotType.LEGS, new Properties().group(Steampunk.TAB));
    }

    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        BipedModel model = new BipedModel(1);
        CopperArmorModel tempModel = new CopperArmorModel(1f);
        model.bipedLeftLeg = tempModel.LeftLeg;
        model.bipedRightLeg = tempModel.RightLeg;
        model.bipedHead.showModel = slot == EquipmentSlotType.HEAD;

        model.isSneak = livingEntity.isSneaking();
        model.isSitting = livingEntity.isPassenger();
        model.isChild = livingEntity.isChild();

        return (A) model;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type)
    {
        return Steampunk.MOD_ID+":textures/models/armor/copper_armor.png";
    }
}
