package com.baozi.eoz.handler;

import com.baozi.eoz.item.ItemFunnyApple;
import com.baozi.eoz.item.ItemZijing;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber
public class ItemHandler {
    public static final List<Item> ITEM_REGISTRY = new ArrayList<>();

    public static final ItemFunnyApple ITEM_FUNNY_APPLE = new ItemFunnyApple();
    public static final ItemZijing ITEM_ZIJING = new ItemZijing();

    @SubscribeEvent
    public static void onRegister(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(ITEM_FUNNY_APPLE);
        registry.register(ITEM_ZIJING);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(ITEM_FUNNY_APPLE, 0, new ModelResourceLocation(ITEM_FUNNY_APPLE.getRegistryName(), "inventory"));
        ModelLoader.setCustomModelResourceLocation(ITEM_ZIJING, 0, new ModelResourceLocation(ITEM_ZIJING.getRegistryName(), "inventory"));
    }
}