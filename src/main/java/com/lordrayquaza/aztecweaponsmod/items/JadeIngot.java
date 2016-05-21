package com.lordrayquaza.aztecweaponsmod.items;

import com.lordrayquaza.aztecweaponsmod.AztecWeaponsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Eric on 5/20/2016.
 */
public class JadeIngot extends Item {
    public final String name = "JadeIngot";

    public JadeIngot() {
        super();
        this.setUnlocalizedName(AztecWeaponsMod.MODID + "_" + name);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }
}
