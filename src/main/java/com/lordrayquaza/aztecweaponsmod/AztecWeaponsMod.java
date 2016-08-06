package com.lordrayquaza.aztecweaponsmod;

import com.lordrayquaza.aztecweaponsmod.world.WorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


/**
 * Lord Rayquaza's Aztec Weapons Mod
 * For MC 1.9
 */

@Mod(modid = AztecWeaponsMod.MODID, version = AztecWeaponsMod.VERSION)
public class AztecWeaponsMod {

    public static final String MODID = "aztecweaponsmod";
    public static final String VERSION = "0.1";

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        BlockManager.preinit(event);
        ItemManager.preInit(event);
        SoundManager.preinit(event);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        BlockManager.init(event);
        WorldGenerator.init();
        ItemManager.init(event);
        SoundManager.init(event);
    }

    public static EntityPlayer getPlayer() {
        return Minecraft.getMinecraft().thePlayer;
    }

}
