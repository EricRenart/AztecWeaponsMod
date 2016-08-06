package com.lordrayquaza.aztecweaponsmod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

/**
 * Created by Eric on 8/6/2016.
 */
public class PlayerManager {

    public static int spirit;

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        spirit = 0;
    }

}
