package com.lordrayquaza.aztecweaponsmod;

import com.lordrayquaza.aztecweaponsmod.items.DeathWhistle;
import com.lordrayquaza.aztecweaponsmod.items.SacrificialKnife;
import com.lordrayquaza.aztecweaponsmod.items.Spear;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        // Initialize and register items and recipes here

        // Sacrificial Knife
        sacrificialKnife = new SacrificialKnife();
        GameRegistry.registerItem(sacrificialKnife, sacrificialKnife.name);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.sacrificialKnife), " o ", " o ", " s ", 'o', Blocks.obsidian, 's', Items.stick);

        // Spear
        spear = new Spear();
        GameRegistry.registerItem(spear, spear.name);
        GameRegistry.addShapedRecipe(new ItemStack(ItemManager.spear), " f ", " s ", " s ", 'f', Items.flint, 's', Items.stick);

        // Death Whistle
        deathWhistle = new DeathWhistle();
        GameRegistry.registerItem(deathWhistle, deathWhistle.name);


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
        }
    }
}
