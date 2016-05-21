package com.lordrayquaza.aztecweaponsmod;

import com.lordrayquaza.aztecweaponsmod.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Created by Eric on 5/19/2016.
 */
public class ItemManager {
    // Item declarations
    public static SacrificialKnife sacrificialKnife;
    public static Spear spear;
    public static DeathWhistle deathWhistle;
    public static JadeIngot jadeIngot;
    public static ObsidianIngot obsidianIngot;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        // Initialize and register items and recipes here

        // Sacrificial Knife
        sacrificialKnife = new SacrificialKnife();
        GameRegistry.registerItem(sacrificialKnife, sacrificialKnife.name);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.sacrificialKnife), " o ", " o ", " s ", 'o', ItemManager.obsidianIngot, 's', Items.stick);

        // Spear
        spear = new Spear();
        GameRegistry.registerItem(spear, spear.name);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.spear), " f ", " s ", " s ", 'f', Items.flint, 's', Items.stick);

        // Death Whistle
        deathWhistle = new DeathWhistle();
        GameRegistry.registerItem(deathWhistle, deathWhistle.name);
        // not sure what the recipe for this is going to be yet, but it will probably involve jade ingots and bones

        // Jade/Obsidian Ingots
        jadeIngot = new JadeIngot();
        GameRegistry.registerItem(jadeIngot, jadeIngot.name);
        GameRegistry.addSmelting(new ItemStack(BlockManager.jadeOre), new ItemStack(ItemManager.jadeIngot), 0.3f);
        GameRegistry.addShapedRecipe(new ItemStack(BlockManager.jadeBlock), "iii","iii","iii",'i',ItemManager.jadeIngot);

        obsidianIngot = new ObsidianIngot();
        GameRegistry.registerItem(obsidianIngot, obsidianIngot.name);
        GameRegistry.addSmelting(new ItemStack(Blocks.obsidian), new ItemStack(ItemManager.obsidianIngot), 0.3f);


    }

    public static void init(FMLInitializationEvent event) {
        if (FMLCommonHandler.instance().getSide() == Side.CLIENT) {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            renderItem.getItemModelMesher().register(sacrificialKnife, 0,
                    new ModelResourceLocation(AztecWeaponsMod.MODID + ":" + sacrificialKnife.name, "inventory"));
            renderItem.getItemModelMesher().register(spear, 0,
                    new ModelResourceLocation(AztecWeaponsMod.MODID + ":" + spear.name, "inventory"));
            renderItem.getItemModelMesher().register(deathWhistle, 0,
                    new ModelResourceLocation(AztecWeaponsMod.MODID + ":" + deathWhistle.name, "inventory"));
            renderItem.getItemModelMesher().register(jadeIngot, 0,
                    new ModelResourceLocation(AztecWeaponsMod.MODID + ":" + jadeIngot.name, "inventory"));
            renderItem.getItemModelMesher().register(obsidianIngot, 0,
                    new ModelResourceLocation(AztecWeaponsMod.MODID + ":" + obsidianIngot.name, "inventory"));
        }
    }
}
