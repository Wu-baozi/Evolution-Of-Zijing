package com.baozi.eoz.item;

import com.baozi.eoz.EOZ;
import com.baozi.eoz.creativeTAB.creativeTAB.TABEOZ;
import net.minecraft.item.*;

public class ItemZijing extends Item {
    public ItemZijing() {
        String name = "zi_jing";
        this.setRegistryName(name);
        this.setUnlocalizedName(EOZ.MODID + "." + name);
        this.setMaxStackSize(1);
        this.setCreativeTab(TABEOZ.Tab_EOZ);
    }
}
