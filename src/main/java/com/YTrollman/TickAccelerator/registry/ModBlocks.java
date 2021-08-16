package com.YTrollman.TickAccelerator.registry;

import com.YTrollman.TickAccelerator.TickAccelerator;
import com.YTrollman.TickAccelerator.blocks.TickAcceleratorBlockTier1;
import com.YTrollman.TickAccelerator.blocks.TickAcceleratorBlockTier2;
import com.YTrollman.TickAccelerator.blocks.TickAcceleratorBlockTier3;
import com.YTrollman.TickAccelerator.blocks.TickAcceleratorBlockTier4;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TickAccelerator.MOD_ID);

    public static final RegistryObject<Block> TICK_ACCELERATOR_BLOCK_TIER_1 = BLOCKS.register("tick_accelerator_block_tier_1", () -> new TickAcceleratorBlockTier1(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.5F, 7.0F)));
    public static final RegistryObject<Block> TICK_ACCELERATOR_BLOCK_TIER_2 = BLOCKS.register("tick_accelerator_block_tier_2", () -> new TickAcceleratorBlockTier2(AbstractBlock.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(4.5F, 8.0F)));
    public static final RegistryObject<Block> TICK_ACCELERATOR_BLOCK_TIER_3 = BLOCKS.register("tick_accelerator_block_tier_3", () -> new TickAcceleratorBlockTier3(AbstractBlock.Properties.of(Material.HEAVY_METAL).requiresCorrectToolForDrops().strength(5.5F, 9.0F)));
    public static final RegistryObject<Block> TICK_ACCELERATOR_BLOCK_TIER_4 = BLOCKS.register("tick_accelerator_block_tier_4", () -> new TickAcceleratorBlockTier4(AbstractBlock.Properties.of(Material.HEAVY_METAL).requiresCorrectToolForDrops().strength(6.5F, 10.0F)));
}