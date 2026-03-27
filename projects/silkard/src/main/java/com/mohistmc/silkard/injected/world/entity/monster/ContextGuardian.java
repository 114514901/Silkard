package com.mohistmc.silkard.injected.world.entity.monster;

import com.mohistmc.silkard.util.ContextStateException;
import net.minecraft.world.entity.monster.Guardian;

public interface ContextGuardian {

    default Guardian.GuardianAttackGoal silkard$guardianAttackGoal() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setGuardianAttackGoal(Guardian.GuardianAttackGoal guardianAttackGoal) {
        throw new ContextStateException("Not implemented");
    }
}
