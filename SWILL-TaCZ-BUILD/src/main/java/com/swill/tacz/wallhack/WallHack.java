package com.swill.tacz.wallhack;

public class WallHack {
    public static WallHackConfig config = new WallHackConfig();
    
    public static class WallHackConfig {
        public boolean enabled = true;
        public boolean xrayBlocks = true;
        public boolean xrayOres = true;
        public boolean highlightPlayers = true;
    }
    
    public static boolean shouldRenderEntity(Object entity) {
        if (!config.enabled) return true;
        if (config.highlightPlayers) return true;
        return false;
    }
}