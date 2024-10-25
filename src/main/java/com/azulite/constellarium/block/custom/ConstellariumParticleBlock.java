package com.azulite.constellarium.block.custom;

import net.minecraft.block.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class ConstellariumParticleBlock extends Block {

    public ConstellariumParticleBlock(AbstractBlock.Settings settings) {
        super(settings);
    }


    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        int i = pos.getX();
        int j = pos.getY();
        int k = pos.getZ();
        double d = (double)i + random.nextDouble();
        double e = (double)j + random.nextDouble();
        double f = (double)k + random.nextDouble();
        world.addParticle(ParticleTypes.FIREWORK, d, e, f, 0.0, 0.0, 0.0);
        BlockPos.Mutable mutable = new BlockPos.Mutable();

        for (int l = 0; l < 14; l++) {
            mutable.set(i + MathHelper.nextInt(random, -10, 10), j + MathHelper.nextInt(random, -10, 10), k + MathHelper.nextInt(random, -10, 10));
            BlockState blockState = world.getBlockState(mutable);
            if (!blockState.isFullCube(world, mutable)) {
                world.addParticle(
                        ParticleTypes.FIREWORK,
                        (double)mutable.getX() + random.nextDouble(),
                        (double)mutable.getY() + random.nextDouble(),
                        (double)mutable.getZ() + random.nextDouble(),
                        0.0,
                        0.0,
                        0.0
                );
            }
        }
    }
}