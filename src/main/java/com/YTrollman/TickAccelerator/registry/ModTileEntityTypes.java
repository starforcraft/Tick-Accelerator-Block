package com.YTrollman.TickAccelerator.registry;

import com.YTrollman.TickAccelerator.TickAccelerator;
import com.YTrollman.TickAccelerator.tileentity.TickAcceleratorTileEntityTier1;
import com.YTrollman.TickAccelerator.tileentity.TickAcceleratorTileEntityTier2;
import com.YTrollman.TickAccelerator.tileentity.TickAcceleratorTileEntityTier3;
import com.YTrollman.TickAccelerator.tileentity.TickAcceleratorTileEntityTier4;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, TickAccelerator.MOD_ID);

    public static final RegistryObject<TileEntityType<TickAcceleratorTileEntityTier1>> TICK_ACCELERATOR_BLOCK_TIER_1_TILE_ENTITY = TILE_ENTITY_TYPES.register("tick_accelerator_block_tier_1", () -> TileEntityType.Builder
            .of(TickAcceleratorTileEntityTier1::new, ModBlocks.TICK_ACCELERATOR_BLOCK_TIER_1.get())
            .build(null));
    public static final RegistryObject<TileEntityType<TickAcceleratorTileEntityTier2>> TICK_ACCELERATOR_BLOCK_TIER_2_TILE_ENTITY = TILE_ENTITY_TYPES.register("tick_accelerator_block_tier_2", () -> TileEntityType.Builder
            .of(TickAcceleratorTileEntityTier2::new, ModBlocks.TICK_ACCELERATOR_BLOCK_TIER_2.get())
            .build(null));
    public static final RegistryObject<TileEntityType<TickAcceleratorTileEntityTier3>> TICK_ACCELERATOR_BLOCK_TIER_3_TILE_ENTITY = TILE_ENTITY_TYPES.register("tick_accelerator_block_tier_3", () -> TileEntityType.Builder
            .of(TickAcceleratorTileEntityTier3::new, ModBlocks.TICK_ACCELERATOR_BLOCK_TIER_3.get())
            .build(null));
    public static final RegistryObject<TileEntityType<TickAcceleratorTileEntityTier4>> TICK_ACCELERATOR_BLOCK_TIER_4_TILE_ENTITY = TILE_ENTITY_TYPES.register("tick_accelerator_block_tier_4", () -> TileEntityType.Builder
            .of(TickAcceleratorTileEntityTier4::new, ModBlocks.TICK_ACCELERATOR_BLOCK_TIER_4.get())
            .build(null));
}
