package com.baozi.eoz.creativeTAB.creativeTAB;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import com.baozi.eoz.handler.ItemHandler;

public class TABEOZ extends CreativeTabs {
   public static final TABEOZ Tab_EOZ = new TABEOZ();

   public TABEOZ(){
       super("EOZ");
   }
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemHandler.Item_Zijing);
    }
}
