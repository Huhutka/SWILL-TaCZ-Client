package com.swill.tacz.mixins;

import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.world.entity.LivingEntity;
import com.swill.tacz.wallhack.WallHack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntityRenderer.class)
public class MixinEntityRenderer {
    @Inject(method = "shouldRender", at = @At("HEAD"), cancellable = true)
    private void onShouldRender(LivingEntity entity, CallbackInfoReturnable<Boolean> cir) {
        if (WallHack.shouldRenderEntity(entity)) {
            cir.setReturnValue(true);
        }
    }
}