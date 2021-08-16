package com.YTrollman.TickAccelerator.registry;

import com.YTrollman.TickAccelerator.TickAccelerator;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TickAccelerator.MOD_ID);

    public static final RegistryObject<Item> TICK_ACCELERATOR_BLOCK_TIER_1_ITEM = ITEMS.register("tick_accelerator_block_tier_1", () -> new BlockItem(ModBlocks.TICK_ACCELERATOR_BLOCK_TIER_1.get(), new Item.Properties().tab(ItemGroupTickAccelerator.TICK_ACCELERATOR)));
    public static final RegistryObject<Item> TICK_ACCELERATOR_BLOCK_TIER_2_ITEM = ITEMS.register("tick_accelerator_block_tier_2", () -> new BlockItem(ModBlocks.TICK_ACCELERATOR_BLOCK_TIER_2.get(), new Item.Properties().tab(ItemGroupTickAccelerator.TICK_ACCELERATOR)));
    public static final RegistryObject<Item> TICK_ACCELERATOR_BLOCK_TIER_3_ITEM = ITEMS.register("tick_accelerator_block_tier_3", () -> new BlockItem(ModBlocks.TICK_ACCELERATOR_BLOCK_TIER_3.get(), new Item.Properties().tab(ItemGroupTickAccelerator.TICK_ACCELERATOR)));
    public static final RegistryObject<Item> TICK_ACCELERATOR_BLOCK_TIER_4_ITEM = ITEMS.register("tick_accelerator_block_tier_4", () -> new BlockItem(ModBlocks.TICK_ACCELERATOR_BLOCK_TIER_4.get(), new Item.Properties().tab(ItemGroupTickAccelerator.TICK_ACCELERATOR)));
}