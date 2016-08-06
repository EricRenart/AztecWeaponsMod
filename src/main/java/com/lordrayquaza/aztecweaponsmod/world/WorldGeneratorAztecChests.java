package com.lordrayquaza.aztecweaponsmod.world;

import com.lordrayquaza.aztecweaponsmod.BlockManager;
import com.lordrayquaza.aztecweaponsmod.MessageController;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Eric on 8/6/2016.
 */
public class WorldGeneratorAztecChests implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.getDimension()) {
            //Only generate jade ore in the overworld, for now
            case -1:
                break;
            case 0:
                generateAztecChests(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
            case 1:
                break;
        }
    }

    public void generateAztecChests(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        for(int i = 0; i < 1; i++) {
            int blockX = chunkX * 256 + random.nextInt(16);
            int blockZ = chunkZ * 256 + random.nextInt(16);
            BlockPos topBlock = world.getTopSolidOrLiquidBlock(new BlockPos(blockX, 10, blockZ));
            //System.out.println("Top block: "+topBlock.toString());
            Block aztecChest = BlockManager.aChest;
            IBlockState aztecBlockState = aztecChest.getDefaultState();
            world.setBlockState(topBlock, aztecBlockState);
        }

    }
}
