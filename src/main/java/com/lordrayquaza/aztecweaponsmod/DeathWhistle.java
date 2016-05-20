package com.lordrayquaza.aztecweaponsmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by Eric on 5/19/2016.
 */
public class DeathWhistle extends Item {

    public String name = "DeathWhistle";
    protected SoundEvent deathWhistleSoundEvent;
    protected ResourceLocation deathWhistleSoundLocation;

    DeathWhistle() {
        super();
        this.deathWhistleSoundLocation = new ResourceLocation("aztecweaponsmod:deathWhistleWail");
        this.deathWhistleSoundEvent = new SoundEvent(deathWhistleSoundLocation);
        this.setUnlocalizedName(AztecWeaponsMod.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand) {
        worldIn.playSound(playerIn, playerIn.posX, playerIn.posY, playerIn.posZ, deathWhistleSoundEvent, SoundCategory.MASTER, 1, 1);
        return super.onItemRightClick(itemStackIn, worldIn, playerIn, hand);
    }
}
