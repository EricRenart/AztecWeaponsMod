package com.lordrayquaza.aztecweaponsmod.items;

import com.lordrayquaza.aztecweaponsmod.AztecWeaponsMod;
import com.lordrayquaza.aztecweaponsmod.MessageController;
import ibxm.Player;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

import java.util.List;

/**
 * Created by Eric on 5/19/2016.
 */

public class SacrificialKnife extends ItemSword {

    public String name = "SacrificialKnife";

    public SacrificialKnife() {
        super(ToolMaterial.DIAMOND);
        this.setUnlocalizedName(AztecWeaponsMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("§4Slice their bellies open and rip their hearts out.");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        TextComponentString godsPleased = new TextComponentString(TextFormatting.GREEN + "Blood! Blood flies everywhere! Huitzilopochtli is pleased!");
        MessageController.printChatMessage(godsPleased);
        return super.hitEntity(stack, target, attacker);
    }
}
