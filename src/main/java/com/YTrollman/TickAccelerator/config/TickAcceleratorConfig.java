package com.YTrollman.TickAccelerator.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class TickAcceleratorConfig {
    public static ForgeConfigSpec.IntValue TICK_ACCELERATOR_TIER_1_SPEED;
    public static ForgeConfigSpec.IntValue TICK_ACCELERATOR_TIER_2_SPEED;
    public static ForgeConfigSpec.IntValue TICK_ACCELERATOR_TIER_3_SPEED;
    public static ForgeConfigSpec.IntValue TICK_ACCELERATOR_TIER_4_SPEED;

    public static void init(ForgeConfigSpec.Builder common) {
        common.comment("Tick Accelerator Block Options");

        TICK_ACCELERATOR_TIER_1_SPEED = common.comment("\nTick Accelerator Tier 1 Speed").defineInRange("tickAcceleratorTier1Speed", 4, 1, Integer.MAX_VALUE);
        TICK_ACCELERATOR_TIER_2_SPEED = common.comment("\nTick Accelerator Tier 2 Speed").defineInRange("tickAcceleratorTier2Speed", 8, 1, Integer.MAX_VALUE);
        TICK_ACCELERATOR_TIER_3_SPEED = common.comment("\nTick Accelerator Tier 3 Speed").defineInRange("tickAcceleratorTier3Speed", 12, 1, Integer.MAX_VALUE);
        TICK_ACCELERATOR_TIER_4_SPEED = common.comment("\nTick Accelerator Tier 4 Speed").defineInRange("tickAcceleratorTier4Speed", 16, 1, Integer.MAX_VALUE);
    }
}