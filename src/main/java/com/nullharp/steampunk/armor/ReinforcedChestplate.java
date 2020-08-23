package com.nullharp.steampunk.armor;

import com.nullharp.steampunk.Steampunk;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;

public class ReinforcedChestplate extends ArmorItem {
    private BipedModel<LivingEntity> model = null;

    public ReinforcedChestplate() {
        super(Copper.COPPER, EquipmentSlotType.CHEST, new Properties().group(Steampunk.TAB));
    }

    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        if(this.model == null) {
            this.model = new BipedModel (1);
            IronArmorModel tempModel = new IronArmorModel();
            model.bipedBody = tempModel.Body;
            model.bipedLeftArm.addChild(tempModel.LeftArm);
            model.bipedRightArm.addChild(tempModel.RightArm);

            model.isSneak = livingEntity.isSneaking();
            model.isSitting = livingEntity.isPassenger();
            model.isChild = livingEntity.isChild();
        }

        return (A) model;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type)
    {
        return Steampunk.MOD_ID+":textures/models/armor/reinforced_armor.png";
    }
}
