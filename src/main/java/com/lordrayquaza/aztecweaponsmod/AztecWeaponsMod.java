package com.lordrayquaza.aztecweaponsmod;

import com.example.examplemod.ExampleMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.entity.RenderEntityItem;
import net.minecraft.client.resources.ResourceIndex;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

/**
 * Lord Rayquaza's Aztec Weapons Mod
 * For MC 1.9
 */

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class AztecWeaponsMod {

    public static final String MODID = "aztecweaponsmod";
    public static final String VERSION = "0.1";

    // Item declarations
    public static SacrificialKnife sacrificialKnife;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        // Initialize and register items here

        //Sacrificial Knife
        sacrificialKnife = new SacrificialKnife();
        GameRegistry.registerItem(sacrificialKnife, sacrificialKnife.name);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        if(FMLCommonHandler.instance().getSide() == Side.CLIENT) {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        }
    }
}
