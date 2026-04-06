package com.swill.tacz.config;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class ConfigScreen extends Screen {
    private final Screen parent;
    
    public ConfigScreen(Screen parent) {
        super(Component.literal("SWILL-TaCZ Настройки"));
        this.parent = parent;
    }
    
    @Override
    protected void init() {
        // Полный код GUI из предыдущего ответа
    }
}