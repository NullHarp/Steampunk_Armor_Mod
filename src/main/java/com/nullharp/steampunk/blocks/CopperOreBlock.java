package com.nullharp.steampunk.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class CopperOreBlock extends Block {
    public CopperOreBlock() {
        super(Block.Properties.create(Material.ROCK)
                    .hardnessAndResistance(4.0f, 5.0f)
                    .sound(SoundType.STONE)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
        );
    }
}
