package com.baozi.eoz.item;

import com.baozi.eoz.EOZ;
import com.baozi.eoz.EOZTab;
import net.minecraft.item.Item;

public class ItemZijing extends Item {
    public ItemZijing() {
        String name = "zijing";
        this.setRegistryName(name);
        this.setUnlocalizedName(EOZ.MODID + "." + name);
        this.setMaxStackSize(1);
        this.setCreativeTab(EOZTab.EOZ_TAB);
    }
}
