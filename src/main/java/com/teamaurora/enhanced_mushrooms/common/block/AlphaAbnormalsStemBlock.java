package com.teamaurora.enhanced_mushrooms.common.block;

import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;

public class AlphaAbnormalsStemBlock extends AbnormalsStemBlock {
    public AlphaAbnormalsStemBlock (Supplier<Block> strippedBlock, Properties properties) {
        super(strippedBlock, properties);
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean isSideInvisible(BlockState bs1, BlockState bs2, Direction side) {
        return super.isSideInvisible(bs1, bs2, side) || bs2.getBlock() == this ;
    }
}
