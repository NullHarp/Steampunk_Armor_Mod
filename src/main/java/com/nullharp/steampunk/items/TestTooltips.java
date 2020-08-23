package com.nullharp.steampunk.items;

import com.nullharp.steampunk.Steampunk;
import com.nullharp.steampunk.util.KeyboardUtil;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class TestTooltips extends Item {
    public TestTooltips() {
        super(new Item.Properties()
                .group(Steampunk.MAIN)
        );
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        if(KeyboardUtil.IsHoldingShift()) {
            // Add Custom Tooltip here \/
            tooltip.add(new StringTextComponent("This is a test tooltip!"));


        } else { // Don't change this part \/
            tooltip.add(new StringTextComponent("press [SHIFT] for more info!"));

        }
    }
}
