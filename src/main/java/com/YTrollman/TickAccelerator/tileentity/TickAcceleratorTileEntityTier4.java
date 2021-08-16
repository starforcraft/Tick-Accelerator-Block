package com.YTrollman.TickAccelerator.tileentity;

import com.YTrollman.TickAccelerator.registry.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class TickAcceleratorTileEntityTier4 extends TileEntity implements ITickableTileEntity {

    protected boolean isPoweredByRedstone;

    public TickAcceleratorTileEntityTier4() {
        super(ModTileEntityTypes.TICK_ACCELERATOR_BLOCK_TIER_4_TILE_ENTITY.get());
    }

    @Override
    public void tick() {
        if(isPoweredByRedstone)
        {
            World world = this.getLevel();
            BlockPos pos = this.getBlockPos();
            accelerateTick(world, pos.above());
            accelerateTick(world, pos.below());
        }
    }

    public void accelerateTick(World world, BlockPos pos) {
        BlockState blockState = world.getBlockState(pos);
        Block block = blockState.getBlock();
        if(!world.isClientSide && world instanceof ServerWorld){
            if (block.isRandomlyTicking(blockState) && world.getRandom().nextInt(10) == 0) {
                block.randomTick(blockState, (ServerWorld) world, pos, world.getRandom());
            }
        }
        if (block.hasTileEntity(blockState)) {
            TileEntity tileEntity = world.getBlockEntity(pos);
            if (tileEntity != null && !tileEntity.isRemoved() && tileEntity instanceof ITickableTileEntity) {
                for (int i = 0; i < 16; i++) {
                    ((ITickableTileEntity) tileEntity).tick();
                }
            }
        }
    }

    public void setIsPoweredByRedstone(boolean isPoweredByRedstone) {
        this.isPoweredByRedstone = isPoweredByRedstone;
    }

    @Override
    public CompoundNBT save(CompoundNBT tag) {
        super.save(tag);
        return saveToNBT(tag);
    }

    protected CompoundNBT saveToNBT(CompoundNBT tag) {
        tag.putBoolean("isPoweredByRedstone", isPoweredByRedstone);
        return tag;
    }

    protected void loadFromNBT(CompoundNBT tag) {
        isPoweredByRedstone = tag.getBoolean("isPoweredByRedstone");
    }

    @Override
    public void load(BlockState state, CompoundNBT tag) {
        this.loadFromNBT(tag);
        super.load(state, tag);
    }
}
