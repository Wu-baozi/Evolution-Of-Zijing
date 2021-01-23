package com.baozi.eoz.item;

import com.baozi.eoz.EOZ;
import com.baozi.eoz.EOZTab;
import net.minecraft.item.Item;

class ItemFunnyIron extends Item {
    public ItemFunnyIron() {
        String name = "funny_iron";
        this.setRegistryName(name);
        this.setUnlocalizedName(EOZ.MODID + "." + name);
        this.setMaxStackSize(1);
        this.setCreativeTab(EOZTab.EOZ_TAB);
    }
}
