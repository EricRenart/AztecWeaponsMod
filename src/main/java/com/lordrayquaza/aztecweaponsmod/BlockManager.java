package com.lordrayquaza.aztecweaponsmod;

import com.lordrayquaza.aztecweaponsmod.blocks.AztecChest;
import com.lordrayquaza.aztecweaponsmod.blocks.BlockJade;
import com.lordrayquaza.aztecweaponsmod.blocks.BlockJadeOre;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by Eric on 5/19/2016.
 */
public class BlockManager {

    //Declare blocks here
    public static BlockJadeOre jadeOre;
    public static BlockJade jadeBlock;
    public static AztecChest aChest;

    public static void preinit(FMLPreInitializationEvent event) {
        jadeOre = new BlockJadeOre();
        GameRegistry.registerBlock(jadeOre,jadeOre.name);
        jadeBlock = new BlockJade();
        GameRegistry.registerBlock(jadeBlock, jadeBlock.name);
        aChest = new AztecChest();
        GameRegistry.registerBlock(aChest, aChest.name);
    }

    public static void init(FMLInitializationEvent event) {
        if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(jadeOre), 0,
                    new ModelResourceLocation(AztecWeaponsMod.MODID + ":" + jadeOre.name, "inventory"));
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(jadeBlock), 0,
                    new ModelResourceLocation(AztecWeaponsMod.MODID + ":" + jadeBlock.name, "inventory"));
            renderItem.getItemModelMesher().register(Item.getItemFromBlock(aChest), 0,
                    new ModelResourceLocation(AztecWeaponsMod.MODID + ":" + aChest.name, "inventory"));
        }
    }

    // Replace a block at the specified BlockPos or x,y,z coordinates.
    // Since setBlock was removed in FML 1.8
    public static void replaceBlock(World world, BlockPos pos, Block newBlock) {
        IBlockState newBlockState = newBlock.getDefaultState();
        world.setBlockState(pos, newBlockState);
    }

    public static void replaceBlock(World world, int x, int y, int z, Block newBlock) {
        IBlockState newBlockState = newBlock.getDefaultState();
        BlockPos pos = new BlockPos(x, y, z);
        world.setBlockState(pos, newBlockState);
    }

}
