package com.baozi.eoz.handler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class EventHandler {
    @SubscribeEvent
    public static void onPlayerJoin(EntityJoinWorldEvent event)
    {
        Entity entity = event.getEntity();
        if(entity instanceof EntityPlayer && !entity.world.isRemote)
        {
            String message = "Welcome to Evolution Of Zijing , "+entity.getName() + " !";
            TextComponentString text = new TextComponentString(message);
            entity.sendMessage(text);
        }
    }
}
