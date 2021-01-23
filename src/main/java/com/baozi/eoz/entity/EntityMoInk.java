package com.baozi.eoz.entity;

import com.baozi.eoz.EOZTab;
import net.minecraft.init.Items;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import com.baozi.eoz.EOZTab;

public class EntityMoInk extends EntityNPCBase {
    public EntityMoInk(World worldIn) {
        super(worldIn);
    }

    @Override
    protected void dropFewItems(boolean wasRecentlyHit, int lootingModifier) {
        ItemStack egg = new ItemStack(Items.SPAWN_EGG, 1);
        ItemStack stick = new ItemStack(Items.STICK, (int) (Math.random() * 5));
        ItemStack diamond = new ItemStack(Items.DIAMOND, (int) (Math.random() * 3));
        ItemMonsterPlacer.applyEntityIdToItemStack(egg, new ResourceLocation("eoz:entity.moink"));
        ItemMonsterPlacer.applyEntityIdToItemStack(stick, new ResourceLocation("eoz:entity.moink"));
        ItemMonsterPlacer.applyEntityIdToItemStack(diamond, new ResourceLocation("eoz:entity.moink"));
        this.entityDropItem(egg, 0.3F);
        this.entityDropItem(stick, 0.3F);
        this.entityDropItem(diamond, 0.3F);
        super.dropFewItems(wasRecentlyHit, lootingModifier);
    }

}