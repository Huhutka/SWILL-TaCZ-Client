package com.swill.tacz.mixins;

import net.minecraft.client.renderer.LevelRenderer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(LevelRenderer.class)
public class MixinWorldRenderer {
    // X-Ray реализация
}