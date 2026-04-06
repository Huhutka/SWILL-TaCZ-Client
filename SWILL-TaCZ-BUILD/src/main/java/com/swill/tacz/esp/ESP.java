package com.swill.tacz.esp;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.LivingEntity;

public class ESP {
    private static Minecraft mc = Minecraft.getInstance();
    public static ESPConfig config = new ESPConfig();
    
    public static class ESPConfig {
        public boolean enabled = true;
        public boolean showBox = true;
        public boolean showSkeleton = true;
        public boolean showTracer = true;
        public boolean showName = true;
        public boolean showHealth = true;
        public boolean showDistance = true;
        public String boxStyle = "CORNER_BOX";
    }
    
    public static void render() {
        if (!config.enabled || mc.player == null) return;
        // Полный код ESP из предыдущего ответа
    }
}