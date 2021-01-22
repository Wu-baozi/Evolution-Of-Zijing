package com.baozi.eoz.handler;

import com.baozi.eoz.potion.PotionFunny;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber
public class PotionHandler {
    public static final Potion Potion_Funny = new PotionFunny();

    @SubscribeEvent
    public static void onPotionRegistry(RegistryEvent.Register<Potion> event){
        IForgeRegistry<Potion> registry = event.getRegistry();
        registry.register(Potion_Funny);
    }

    @SubscribeEvent
    public static void onLivingHurt(LivingHurtEvent event){
        EntityLivingBase target = event.getEntityLiving();
        Potion potion = Potion_Funny;
        if(target.isPotionActive(potion)){
            PotionEffect effect = target.getActivePotionEffect(potion);
            target.setHealth(target.getHealth()+event.getAmount()/3*(effect.getAmplifier()+1));
            event.setAmount(0);
        }
    }
}
