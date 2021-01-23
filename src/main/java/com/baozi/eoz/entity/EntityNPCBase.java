package com.baozi.eoz.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class EntityNPCBase extends EntityCreature {
    public EntityNPCBase(World worldIn) {
        super(worldIn);
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
    }

    @Override
    protected void dropFewItems(boolean wasRecentlyHit, int lootingModifier) {
        super.dropFewItems(wasRecentlyHit, lootingModifier);
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();

        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0F);
    }

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(1, new EntityAISwimming(this));
        // this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.9D, 32.0F));
        // this.tasks.addTask(3, new EntityAIPanic(this, 0.5D));
        this.tasks.addTask(1, new EntityAIMoveIndoors(this));
        this.tasks.addTask(1, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(1, new EntityAIOpenDoor(this, true));
        // this.tasks.addTask(2, new EntityAIAttackMelee(this, 0.55D, true));
        // this.tasks.addTask(2, new EntityAIMoveTowardsTarget(this, 0.55D, 32.0F));

        this.tasks.addTask(6, new EntityAIWanderAvoidWater(this, 0.4D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 10.0F));
        this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityNPCBase.class, 10.0F));
        this.targetTasks.addTask(9, new EntityAIWatchClosest(this, EntityLiving.class, 10.0F));

        // this.targetTasks.addTask(1, new EntityAIAttackMelee(this, 0.7D, false));
        // this.targetTasks.addTask(1, new EntityAISelfDefense(this));
        // this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false, new
        // Class[0]));
        // this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this,
        // EntityZombie.class, true));
        super.initEntityAI();
    }

    @Override
    protected boolean processInteract(EntityPlayer player, EnumHand hand) {
        if (player.world.isRemote)
            return super.processInteract(player, hand);
        BlockPos pos = player.getPosition();
        return super.processInteract(player, hand);
    }
}