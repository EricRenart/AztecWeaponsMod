package com.lordrayquaza.aztecweaponsmod;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Eric on 5/19/2016.
 */
public class SoundManager {

    public static SoundEvent deathWhistleSoundEvent;
    private static ResourceLocation deathWhistleSoundLocation;

    public static void preinit(FMLPreInitializationEvent event) {
        //Initialize sounds and resources here
        ResourceLocation deathWhistleResourceLocation = new ResourceLocation(AztecWeaponsMod.MODID + ":" + "deathWhistleWail");
        System.out.print(deathWhistleResourceLocation.toString());
        deathWhistleSoundEvent = new SoundEvent(deathWhistleResourceLocation);
    }

    public static void init(FMLInitializationEvent event) {

    }
}
