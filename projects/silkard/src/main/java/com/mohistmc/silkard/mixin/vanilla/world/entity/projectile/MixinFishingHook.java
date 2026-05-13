package com.mohistmc.silkard.mixin.vanilla.world.entity.projectile;

import com.mohistmc.silkard.injected.world.entity.projectile.ContextFishingHook;
import net.minecraft.world.entity.projectile.FishingHook;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/5/1 17:24
 */
@Mixin(FishingHook.class)
public class MixinFishingHook implements ContextFishingHook {

    // CraftBukkit start - Extra variables to enable modification of fishing wait time, values are minecraft defaults
    public int minWaitTime = 100;
    public int maxWaitTime = 600;
    public int minLureTime = 20;
    public int maxLureTime = 80;
    public float minLureAngle = 0.0F;
    public float maxLureAngle = 360.0F;
    public boolean applyLure = true;
    public boolean rainInfluenced = true;
    public boolean skyInfluenced = true;
    // CraftBukkit end

    public int silkard$minLureTime() {
        return minLureTime;
    }

    public void silkard$minLureTime(int minLureTime) {
        this.minLureTime = minLureTime;
    }

    public int silkard$maxLureTime() {
        return maxLureTime;
    }

    public void silkard$maxLureTime(int maxLureTime) {
        this.maxLureTime = maxLureTime;
    }

    public float silkard$minLureAngle() {
        return minLureAngle;
    }

    public void silkard$minLureAngle(float minLureAngle) {
        this.minLureAngle = minLureAngle;
    }

    public float silkard$maxLureAngle() {
        return maxLureAngle;
    }

    public void silkard$maxLureAngle(float maxLureAngle) {
        this.maxLureAngle = maxLureAngle;
    }

    public boolean silkard$rainInfluenced() {
        return rainInfluenced;
    }

    public void silkard$rainInfluenced(boolean rainInfluenced) {
        this.rainInfluenced = rainInfluenced;
    }

    public boolean silkard$skyInfluenced() {
        return skyInfluenced;
    }

    public void silkard$skyInfluenced(boolean skyInfluenced) {
        this.skyInfluenced = skyInfluenced;
    }

    public int silkard$minWaitTime() {
        return minWaitTime;
    }

    public void silkard$minWaitTime(int minWaitTime) {
        this.minWaitTime = minWaitTime;
    }

    public int silkard$maxWaitTime() {
        return maxWaitTime;
    }

    public void silkard$maxWaitTime(int minWaitTime) {
        this.minWaitTime = minWaitTime;
    }

    public boolean silkard$applyLure() {
        return applyLure;
    }

    public void silkard$applyLure(boolean applyLure) {
        this.applyLure = applyLure;
    }
}
