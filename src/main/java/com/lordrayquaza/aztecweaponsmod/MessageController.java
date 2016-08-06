package com.lordrayquaza.aztecweaponsmod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;

/**
 * Created by Eric on 5/21/2016.
 */
public class MessageController {

    //Static support class for chat messages.

    private static void printTextComponentString(TextComponentString tcs) {
        AztecWeaponsMod.getPlayer().addChatComponentMessage(tcs);
    }

    // Print a message to the chat. A color can be specified as well.

    public static void printChatMessage(String message) {
        TextComponentString tcs = new TextComponentString(message);
        printTextComponentString(tcs);
    }

    public static void printChatMessage(String message, TextFormatting colorEnum) {
        TextComponentString tcs = new TextComponentString(colorEnum + message);
        printTextComponentString(tcs);
    }
}
