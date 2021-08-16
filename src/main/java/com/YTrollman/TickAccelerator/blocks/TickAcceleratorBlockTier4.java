package com.YTrollman.TickAccelerator.blocks;

import com.YTrollman.TickAccelerator.tileentity.TickAcceleratorTileEntityTier4;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class TickAcceleratorBlockTier4 extends Block {

    public TickAcceleratorBlockTier4(Properties properties) {
        super(properties);
    }

    @Override
    public void neighborChanged(BlockState state, World world, BlockPos pos, Block changedBlock, BlockPos changedBlockPos, boolean bool) {
        TileEntity tileEntity = world.getBlockEntity(pos);
        if (tileEntity instanceof TickAcceleratorTileEntityTier4) {
            TickAcceleratorTileEntityTier4 TileEntity = (TickAcceleratorTileEntityTier4) tileEntity;
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
        return new TickAcceleratorTileEntityTier4();
    }
}
