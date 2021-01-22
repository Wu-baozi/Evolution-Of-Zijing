package com.baozi.eoz.potion;

import com.baozi.eoz.EOZ;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;

public class PotionFunny extends Potion {
    private static final ResourceLocation TEXTURE = new ResourceLocation(EOZ.MODID+":textures/gui/potion.png");

    public PotionFunny(){
        super(false,0xF9C766);
        this.setRegistryName(EOZ.MODID+":"+"funny");
        this.setPotionName("effect."+EOZ.MODID+".funny");
    }

    @Override
    public void renderInventoryEffect(int x, int y, PotionEffect e, Minecraft mc){
        mc.getTextureManager().bindTexture(TEXTURE);
        mc.currentScreen.drawTexturedModalRect(x+7,y+7,0,0,36,36);
    }

    @Override
    public void renderHUDEffect(int x,int y ,PotionEffect e,Minecraft mc,float alpha){
        mc.getTextureManager().bindTexture(TEXTURE);
        mc.ingameGUI.drawTexturedModalRect(x+3,y+3,0,0,36,36);
    }
}
