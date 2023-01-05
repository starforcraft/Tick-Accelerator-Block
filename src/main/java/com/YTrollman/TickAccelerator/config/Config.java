package com.YTrollman.TickAccelerator.config;

import com.YTrollman.TickAccelerator.TickAccelerator;
import com.YTrollman.TickAccelerator.config.TickAcceleratorConfig;
import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.common.Mod;

import java.io.File;

@Mod.EventBusSubscriber(modid = TickAccelerator.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {
    public static final ForgeConfigSpec common_config;

    private static final ForgeConfigSpec.Builder common_builder = new ForgeConfigSpec.Builder();

    static {
        TickAcceleratorConfig.init(common_builder);
        common_config = common_builder.build();
    }

    public static void loadConfig(ForgeConfigSpec config, String path) {
        TickAccelerator.LOGGER.info("Loading config: " + path);
        CommentedFileConfig file = CommentedFileConfig.builder(new File(path)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        TickAccelerator.LOGGER.info("Built config: " + path);
        file.load();
        TickAccelerator.LOGGER.info("Loaded config: " + path);
        config.setConfig(file);
    }
}