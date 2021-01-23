package com.baozi.eoz.handler;

import com.baozi.eoz.EOZ;
import com.baozi.eoz.entity.EntityMoInk;
import com.baozi.eoz.entity.EntityZijing;
import com.baozi.eoz.entity.render.RenderMoInk;
import com.baozi.eoz.entity.render.RenderZijing;
import com.baozi.eoz.utils.EntityRenderFactory;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EntityHandler {
    public static void register() {
        EntityRegistry.registerModEntity(new ResourceLocation(EOZ.MODID, "entity.zijing"), EntityZijing.class,
                "eoz.entity_zijing", 1, EOZ.instance, 64, 1, true, 0xB3FFFF, 0x4D94FF);

        EntityRegistry.registerModEntity(new ResourceLocation(EOZ.MODID, "entity.moink"), EntityMoInk.class,
                "eoz.entity_moink", 2, EOZ.instance, 64, 1, true, 0xffffb3, 0x66b2ff);
    }

    @SuppressWarnings("unchecked")
    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        registerEntityRender(EntityZijing.class, RenderZijing.class);
        registerEntityRender(EntityMoInk.class, RenderMoInk.class);
    }

    @SideOnly(Side.CLIENT)
    private static <T extends Entity, E extends Render<T>> void registerEntityRender(Class<T> entityClass, Class<E> render) {
        RenderingRegistry.registerEntityRenderingHandler(entityClass, new EntityRenderFactory<>(render));
    }
}