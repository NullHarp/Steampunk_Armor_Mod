package com.nullharp.steampunk.armor;

import com.nullharp.steampunk.Steampunk;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;

public class TitaniumBoots extends ArmorItem {
    private BipedModel<LivingEntity> model = null;

    public TitaniumBoots() {
        super(Copper.COPPER, EquipmentSlotType.FEET, new Properties().group(Steampunk.TAB));
    }

    @Override
    public <A extends BipedModel<?>> A getArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlotType armorSlot, A _default) {
        if(this.model == null) {
            this.model = new BipedModel<>(1);
            PlatedArmorModel tempModel = new PlatedArmorModel();
            model.bipedLeftLeg = tempModel.LeftBoot;
            model.bipedRightLeg = tempModel.RightBoot;

            model.isSneak = livingEntity.isSneaking();
            model.isSitting = livingEntity.isPassenger();
            model.isChild = livingEntity.isChild();
        }

        return (A) model;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type)
    {
        return Steampunk.MOD_ID+":textures/models/armor/titanium_armor.png";
    }
}
