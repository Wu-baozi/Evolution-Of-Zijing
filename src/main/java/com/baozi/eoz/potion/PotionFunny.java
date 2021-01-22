package com.baozi.eoz.potion;

import com.baozi.eoz.EOZ;
import net.minecraft.potion.Potion;

public class PotionFunny extends Potion {
    public PotionFunny(){
        super(false,0xF9C766);
        this.setRegistryName(EOZ.MODID+":"+"funny");
        this.setPotionName("effect."+EOZ.MODID+".funny");
    }
}
