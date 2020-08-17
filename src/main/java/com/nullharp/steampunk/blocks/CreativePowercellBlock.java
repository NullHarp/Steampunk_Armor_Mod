package com.nullharp.steampunk.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.energy.IEnergyStorage;


public class CreativePowercellBlock extends Block {
    public CreativePowercellBlock() {
        super(Properties.create(Material.IRON)
                    .hardnessAndResistance(4.0f, 5.0f)
                    .sound(SoundType.GLASS)
                    .harvestTool(ToolType.PICKAXE)
                    .harvestLevel(2)
                    
        );
    }
}
