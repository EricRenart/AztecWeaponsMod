package com.lordrayquaza.aztecweaponsmod.items;

import com.lordrayquaza.aztecweaponsmod.AztecWeaponsMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by Eric on 5/21/2016.
 */
public class EagleWarriorCostume extends ItemArmor {

    public final String name;


    public EagleWarriorCostume(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn, String name) {
        super(materialIn, renderIndexIn, equipmentSlotIn);
        this.name = name;
        this.setUnlocalizedName(AztecWeaponsMod.MODID + "_" + this.name);
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
        if(slot == EntityEquipmentSlot.LEGS) {
            return "aztecweaponsmod:textures/models/EagleWarriorCostume_Layer2.png";
        }
        else {
            return "aztecweaponsmod:textures/models/EagleWarriorCostume_Layer1.png";
        }
    }
}
