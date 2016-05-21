package com.lordrayquaza.aztecweaponsmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;

/**
 * Created by Eric on 5/21/2016.
 */
public class MessageController {

    //Static support class for chat messages.

    public static void printChatMessage(TextComponentString tcs) {
        AztecWeaponsMod.getPlayer().addChatComponentMessage(tcs);
    }
}
