package com.mohistmc.silkard.mixin.vanilla.world.entity.monster;

import com.mohistmc.silkard.injected.world.entity.monster.ContextGuardian;
import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.entity.monster.Guardian;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/5/1 17:20
 */
@Mixin(Guardian.class)
public class MixinGuardian implements ContextGuardian {

    public Guardian.GuardianAttackGoal guardianAttackGoal; // CraftBukkit - add field

    public Guardian.GuardianAttackGoal silkard$guardianAttackGoal() {
       return guardianAttackGoal;
    }

    public void silkard$guardianAttackGoal(Guardian.GuardianAttackGoal guardianAttackGoal) {
        this.guardianAttackGoal = guardianAttackGoal;
    }
}
