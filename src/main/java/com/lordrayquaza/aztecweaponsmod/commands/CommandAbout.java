package com.lordrayquaza.aztecweaponsmod.commands;

import com.lordrayquaza.aztecweaponsmod.AztecWeaponsMod;
import com.lordrayquaza.aztecweaponsmod.MessageController;
import com.lordrayquaza.aztecweaponsmod.PlayerManager;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Eric on 8/6/2016.
 */
public class CommandAbout implements ICommand {

    private final List aliases;

    public CommandAbout() {
        aliases = new ArrayList();
        aliases.add("aztecweaponsmod");
    }

    @Override
    public String getCommandName() {
        return "awm";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/awm <about/spirit>";
    }

    @Override
    public List<String> getCommandAliases() {
        return this.aliases;
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        if(args[0].equals("about")) {
            MessageController.printChatMessage("Aztec Weapons Mod v"+ AztecWeaponsMod.VERSION, TextFormatting.GOLD);
            MessageController.printChatMessage("By Lord Rayquaza", TextFormatting.GREEN);
            MessageController.printChatMessage("aka Eric J. Renart", TextFormatting.ITALIC);
        }
        else if(args[0].equals("spirit")) {
            MessageController.printChatMessage("Your current Spirit level is "+ PlayerManager.spirit +".", TextFormatting.AQUA);
        }
        else {
            MessageController.printChatMessage("Usage: "+getCommandUsage(sender));
        }
    }

    @Override
    public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
        return true;
    }

    @Override
    public List<String> getTabCompletionOptions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos pos) {
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] args, int index) {
        return false;
    }

    @Override
    public int compareTo(ICommand o) {
        return 0;
    }
}
