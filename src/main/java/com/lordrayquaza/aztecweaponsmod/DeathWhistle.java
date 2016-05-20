package com.lordrayquaza.aztecweaponsmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Eric on 5/19/2016.
 */
public class DeathWhistle extends Item {

    public String name = "DeathWhistle";

    DeathWhistle() {
        super();
        this.setUnlocalizedName(AztecWeaponsMod.MODID + ":" + name);
        this.setCreativeTab(CreativeTabs.tabMisc);
    }
}
