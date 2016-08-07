package com.lordrayquaza.aztecweaponsmod.world;

import com.lordrayquaza.aztecweaponsmod.BlockManager;
import com.lordrayquaza.aztecweaponsmod.MessageController;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Biomes;
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
        int iterations = 2;
        // Make aztec chests more common in Jungle biomes
        if(world.getBiomeGenForCoords(world.getTopSolidOrLiquidBlock(new BlockPos(chunkX * 16, 10, chunkZ * 16))).getBiomeName().equals(Biomes.jungle.getBiomeName()) ||
                world.getBiomeGenForCoords(world.getTopSolidOrLiquidBlock(new BlockPos(chunkX * 16, 10, chunkZ * 16))).getBiomeName().equals(Biomes.jungleEdge.getBiomeName()) ||
                world.getBiomeGenForCoords(world.getTopSolidOrLiquidBlock(new BlockPos(chunkX * 16, 10, chunkZ * 16))).getBiomeName().equals(Biomes.jungleHills.getBiomeName())) {
            iterations = 5;
        }
        for(int i = 0; i < iterations; i++) {
            int blockX = chunkX * 192 + random.nextInt(128);
            int blockZ = chunkZ * 192 + random.nextInt(128);
            BlockPos topBlock = world.getTopSolidOrLiquidBlock(new BlockPos(blockX, 10, blockZ));
            BlockManager.replaceBlock(world, topBlock, BlockManager.aChest);
        }

    }
}
