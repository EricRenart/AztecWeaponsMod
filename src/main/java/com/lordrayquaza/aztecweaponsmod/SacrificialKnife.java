package com.lordrayquaza.aztecweaponsmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

/**
 * Created by Eric on 5/19/2016.
 */

public class SacrificialKnife extends ItemSword {

    String name = "SacrificialKnife";

    public SacrificialKnife() {
        super(ToolMaterial.DIAMOND);
        this.setUnlocalizedName(AztecWeaponsMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }


}
