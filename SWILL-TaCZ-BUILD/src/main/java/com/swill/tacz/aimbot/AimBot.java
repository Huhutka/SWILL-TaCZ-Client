package com.swill.tacz.aimbot;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class AimBot {
    private static Minecraft mc = Minecraft.getInstance();
    public static AimBotConfig config = new AimBotConfig();
    
    public static class AimBotConfig {
        public boolean enabled = true;
        public float fov = 15.0f;
        public float range = 100.0f;
        public int smoothness = 8;
        public String targetPart = "HEAD";
        
        public enum TargetPart {
            HEAD, NECK, CHEST, BODY, LEGS, ARMS
        }
        public TargetPart targetPart = TargetPart.HEAD;
    }
    
    public static void onRenderTick() {
        if (!config.enabled || mc.player == null) return;
        // Полный код AimBot из предыдущего ответа
    }
}