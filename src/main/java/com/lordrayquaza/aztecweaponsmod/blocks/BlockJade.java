package com.lordrayquaza.aztecweaponsmod.blocks;

import com.lordrayquaza.aztecweaponsmod.AztecWeaponsMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Eric on 5/20/2016.
 */
public class BlockJade extends Block {

    public static final String name = "JadeBlock";

    public BlockJade() {
        super(Material.iron);
        this.setUnlocalizedName(AztecWeaponsMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

}
