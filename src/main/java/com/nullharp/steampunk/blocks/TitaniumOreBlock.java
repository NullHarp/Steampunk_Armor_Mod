package com.nullharp.steampunk.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class TitaniumOreBlock extends Block {
    public TitaniumOreBlock() {
        super(Properties.create(Material.ROCK)
                    .hardnessAndResistance(10.0f, 15.0f)
                    .sound(SoundType.METAL)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(3)
                    .setRequiresTool()
        );
    }
}
