package com.lordrayquaza.aztecweaponsmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by Eric on 5/19/2016.
 */
public class Spear extends ItemSword {

    String name = "Spear";

    public Spear() {
        super(ToolMaterial.IRON);
        this.setUnlocalizedName(AztecWeaponsMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

}
