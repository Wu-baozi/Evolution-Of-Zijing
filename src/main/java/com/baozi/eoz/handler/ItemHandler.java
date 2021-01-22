package com.baozi.eoz.handler;

import com.baozi.eoz.item.ItemFunnyApple;
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

    public static final ItemFunnyApple Item_Funny_Apple = new ItemFunnyApple();

    @SubscribeEvent
    public static void onRegister(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(Item_Funny_Apple);
    }

    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onModelRegistry(ModelRegistryEvent event){
        ModelLoader.setCustomModelResourceLocation(Item_Funny_Apple,0,new ModelResourceLocation(Item_Funny_Apple.getRegistryName(),"inventory"));
    }
}
