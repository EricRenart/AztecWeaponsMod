package com.lordrayquaza.aztecweaponsmod.world;

import com.lordrayquaza.aztecweaponsmod.BlockManager;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * IWorldGenerator.java
 * Generates jade ore veins.
 */
public class WorldGeneratorOre implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.getDimension()) {
            //Only generate jade ore in the overworld, for now
            case -1:
                break;
            case 0:
                generateJade(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
            case 1:
                break;
        }
    }

    public void generateJade(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        int iterations = 5; // number of iterations for the ore generator to run
        for(int i = 0; i < iterations; i++) {
            int startX = chunkX * 16 + random.nextInt(16);
            int startY = random.nextInt(16);
            int startZ = chunkZ * 16 + random.nextInt(16);
            BlockPos pos = new BlockPos(startX, startY, startZ);
            (new WorldGenMinable(BlockManager.jadeOre.getDefaultState(), 5 + random.nextInt(5))).generate(world, random, pos);
        }
    }
}
