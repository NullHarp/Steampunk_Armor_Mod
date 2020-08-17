package com.nullharp.steampunk;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class SoundList {
    public static final DeferredRegister<SoundEvent> SOUNDS = new DeferredRegister<>(ForgeRegistries.SOUND_EVENTS, Steampunk.MOD_ID);

    public static final Lazy<SoundEvent> MUSIC_DISK_STICKBUG_LAZY = Lazy.of(() -> new SoundEvent(new ResourceLocation(Steampunk.MOD_ID, "item.stickbug_disk")));


    public static final RegistryObject<SoundEvent> STICKBUG_SOUND = SOUNDS.register("item.stickbug_disk.disk", MUSIC_DISK_STICKBUG_LAZY);
}
