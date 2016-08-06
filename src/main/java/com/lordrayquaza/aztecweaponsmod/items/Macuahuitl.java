package com.lordrayquaza.aztecweaponsmod.items;

import java.util.List;

import com.lordrayquaza.aztecweaponsmod.AztecWeaponsMod;
import com.lordrayquaza.aztecweaponsmod.ItemManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class Macuahuitl extends ItemSword {
	
	public static String name = "Macuahuitl";

	public Macuahuitl(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(AztecWeaponsMod.MODID + "_" + this.name);
		this.setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		// TODO Auto-generated method stub
		tooltip.add("§4Sword of the Aztecs.");
		super.addInformation(stack, playerIn, tooltip, advanced);
	}

}
