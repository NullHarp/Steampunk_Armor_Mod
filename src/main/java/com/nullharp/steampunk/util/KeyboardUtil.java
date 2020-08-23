package com.nullharp.steampunk.util;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.InputMappings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.glfw.GLFW;

public class KeyboardUtil {
    private static final long MINECRAFT_WINDOW = Minecraft.getInstance().getMainWindow().getHandle();

    @OnlyIn(Dist.CLIENT)
    public static boolean IsHoldingShift() {
        return InputMappings.isKeyDown(MINECRAFT_WINDOW, GLFW.GLFW_KEY_LEFT_SHIFT);
    }
}
