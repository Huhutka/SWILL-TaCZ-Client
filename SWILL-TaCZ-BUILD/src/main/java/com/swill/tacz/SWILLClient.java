package com.swill.tacz;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SWILLClient.MODID)
public class SWILLClient {
    public static final String MODID = "swill_tacz_client";
    public static final Logger LOGGER = LogManager.getLogger(MODID);
    
    public SWILLClient() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::clientSetup);
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void clientSetup(final FMLClientSetupEvent event) {
        LOGGER.info("SWILL-TaCZ Чит Клиент загружен!");
    }
}