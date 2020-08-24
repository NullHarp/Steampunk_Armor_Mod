package com.nullharp.steampunk.armor;

import com.nullharp.steampunk.Steampunk;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class TitaniumArmor extends ArmorItem {
    public TitaniumArmor(IArmorMaterial materialIn, EquipmentSlotType slot, Properties properties) {
        super(materialIn, slot, properties);
    }

    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        return Steampunk.SIDED_SYSTEM.getPlatedArmorModel(armorSlot);
//        BipedModel<LivingEntity> model = new BipedModel<>(1);
//        PlatedArmorModel tempModel = new PlatedArmorModel();
//        model.bipedBody = tempModel.Body;
//        model.bipedLeftArm.addChild(tempModel.LeftArm);
//        model.bipedRightArm.addChild(tempModel.RightArm);
//
//        model.isSneak = livingEntity.isSneaking();
//        model.isSitting = livingEntity.isPassenger();
//        model.isChild = livingEntity.isChild();
//
//        return (A) model;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type)
    {
        return Steampunk.MOD_ID+":textures/models/armor/titanium_armor.png";
    }
}