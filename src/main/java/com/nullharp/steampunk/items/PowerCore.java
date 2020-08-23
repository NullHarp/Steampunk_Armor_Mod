package com.nullharp.steampunk.items;

import com.nullharp.steampunk.Steampunk;
import net.minecraft.item.Item;

public class PowerCore extends Item {

    public PowerCore() {
        super(new Properties()
                .group(Steampunk.MAIN)
                .maxStackSize(1)
        );
    }


}
