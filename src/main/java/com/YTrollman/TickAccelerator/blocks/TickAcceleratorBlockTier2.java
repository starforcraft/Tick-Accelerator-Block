package com.YTrollman.TickAccelerator.blocks;

import com.YTrollman.TickAccelerator.tileentity.TickAcceleratorTileEntityTier2;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class TickAcceleratorBlockTier2 extends Block {

    public TickAcceleratorBlockTier2(Properties properties) {
        super(properties);
    }

    @Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block changedBlock, BlockPos changedBlockPos, boolean bool) {
        TileEntity tileEntity = world.getBlockEntity(pos);
        if (tileEntity instanceof TickAcceleratorTileEntityTier2) {
            TickAcceleratorTileEntityTier2 TileEntity = (TickAcceleratorTileEntityTier2) tileEntity;
            TileEntity.setIsPoweredByRedstone(world.hasNeighborSignal(pos));
        }
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new TickAcceleratorTileEntityTier2();
    }
}
