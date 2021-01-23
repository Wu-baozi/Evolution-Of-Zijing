package com.baozi.eoz;

import com.baozi.eoz.handler.ItemHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EOZTab extends CreativeTabs {
    public static final EOZTab EOZ_TAB = new EOZTab();

    public EOZTab() {
        super("eoz.tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemHandler.ITEM_ZIJING);
    }
}
