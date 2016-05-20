package com.lordrayquaza.aztecweaponsmod;

import com.lordrayquaza.aztecweaponsmod.blocks.BlockJade;
import com.lordrayquaza.aztecweaponsmod.blocks.BlockJadeOre;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
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

    public static void preinit(FMLPreInitializationEvent event) {
        jadeOre = new BlockJadeOre();
        GameRegistry.registerBlock(jadeOre,jadeOre.name);
        jadeBlock = new BlockJade();
        GameRegistry.registerBlock(jadeBlock, jadeBlock.name);
    }

    public static void init(FMLInitializationEvent event) {
        if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        }
    }

}
