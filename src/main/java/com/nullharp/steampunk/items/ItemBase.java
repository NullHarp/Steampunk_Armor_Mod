package com.nullharp.steampunk.items;

import com.nullharp.steampunk.Steampunk;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(Steampunk.MAIN));
    }
}
