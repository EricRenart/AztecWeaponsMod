package com.lordrayquaza.aztecweaponsmod.items;

import com.lordrayquaza.aztecweaponsmod.AztecWeaponsMod;
import com.lordrayquaza.aztecweaponsmod.SoundManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.world.World;


import java.util.List;

/**
 * Created by Eric on 5/19/2016.
 */
public class DeathWhistle extends Item {

    public String name = "DeathWhistle";


    public DeathWhistle() {
        super();
        this.setUnlocalizedName(AztecWeaponsMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
        worldIn.playSound(playerIn, playerIn.posX, playerIn.posY, playerIn.posZ, SoundManager.deathWhistleSoundEvent, SoundCategory.MASTER, 1, 1);
        return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("§4Screams of a thousand corpses");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }
}
