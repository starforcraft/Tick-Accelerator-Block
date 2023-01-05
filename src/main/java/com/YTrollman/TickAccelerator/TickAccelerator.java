package com.YTrollman.TickAccelerator;

import com.YTrollman.TickAccelerator.config.Config;
import com.YTrollman.TickAccelerator.registry.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("tickaccelerator")
public class TickAccelerator {
    public static final String MOD_ID = "tickaccelerator";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    
    public TickAccelerator() {
        RegistryHandler.init();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.common_config);
        Config.loadConfig(Config.common_config, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + "-common.toml").toString());
    }
}
