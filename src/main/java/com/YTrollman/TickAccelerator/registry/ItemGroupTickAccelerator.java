package com.YTrollman.TickAccelerator.registry;

import com.YTrollman.TickAccelerator.TickAccelerator;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;

public class ItemGroupTickAccelerator {

	public static final ItemGroup TICK_ACCELERATOR = (new ItemGroup(TickAccelerator.MOD_ID) {

		@Override
		@Nonnull
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ModItems.TICK_ACCELERATOR_BLOCK_TIER_1_ITEM.get());
		}
	});
	
}
