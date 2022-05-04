package com.entropystudio.terraland.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class OriginiumPrimeBlock extends Block {

    public OriginiumPrimeBlock(Properties p_i48440_1_) {
        super(p_i48440_1_);
    }

    @Override
    public boolean propagatesSkylightDown(BlockState p_200123_1_, IBlockReader p_200123_2_, BlockPos p_200123_3_) {
        return true;
    }
}
