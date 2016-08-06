package com.lordrayquaza.aztecweaponsmod.blocks;

import com.lordrayquaza.aztecweaponsmod.AztecWeaponsMod;
import com.lordrayquaza.aztecweaponsmod.ItemManager;
import com.lordrayquaza.aztecweaponsmod.MessageController;
import com.lordrayquaza.aztecweaponsmod.PlayerManager;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Eric on 8/6/2016.
 */
public class AztecChest extends Block {
    public static final String name = "AztecChest";

    public AztecChest() {
        super(Material.wood);
        this.setUnlocalizedName(AztecWeaponsMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this.getRandomAztecWeapon(PlayerManager.spirit);
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }

    @Override
    public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
        super.onBlockHarvested(worldIn, pos, state, player);
    }

    // Returns a random Aztec weapon, with chances weighted based on the argument.
    private Item getRandomAztecWeapon(int playerSpirit) {
        Random r = new Random();
        int result = r.nextInt(100);

        if(playerSpirit < 50) {
            if(result <= 5) {
                return ItemManager.sacrificialKnife;
            }
            else if(result > 5 && result <= 20) {
                return ItemManager.macuahuitl;
            }
            else {
                return ItemManager.spear;
            }
        }

        else if(playerSpirit > 50 && playerSpirit < 200) {
            if(result <= 15) {
                return ItemManager.sacrificialKnife;
            }
            else if(result > 15 && result <= 40) {
                return ItemManager.macuahuitl;
            }
            else {
                return ItemManager.spear;
            }
        }

        else if(playerSpirit > 200 && playerSpirit < 400) {
            if(result <= 25) {
                return ItemManager.sacrificialKnife;
            }
            else if(result > 25 && result <= 60) {
                return ItemManager.macuahuitl;
            }
            else {
                return ItemManager.spear;
            }
        }

        else { //spirit > 400
            if(result <= 40) {
                return ItemManager.sacrificialKnife;
            }
            else if(result > 40 && result <= 80) {
                return ItemManager.macuahuitl;
            }
            else {
                return ItemManager.spear;
            }
        }

    }

}
