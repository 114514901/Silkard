package com.mohistmc.silkard.injected.world.entity.projectile;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextFishingHook {

    default int silkard$minLureTime() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setMinLureTime(int minLureTime) {
        throw new ContextStateException("Not implemented");
    }

    default int silkard$maxLureTime() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setMaxLureTime(int maxLureTime) {
        throw new ContextStateException("Not implemented");
    }

    default float silkard$minLureAngle() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setMinLureAngle(float minLureAngle) {
        throw new ContextStateException("Not implemented");
    }

    default float silkard$maxLureAngle() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setMaxLureAngle(float maxLureAngle) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$rainInfluenced() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setRainInfluenced(boolean rainInfluenced) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$skyInfluenced() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setSkyInfluenced(boolean skyInfluenced) {
        throw new ContextStateException("Not implemented");
    }

    default int silkard$minWaitTime() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setMinWaitTime(int minWaitTime) {
        throw new ContextStateException("Not implemented");
    }

    default int silkard$maxWaitTime() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setMaxWaitTime(int minWaitTime) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$applyLure() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setApplyLure(boolean applyLure) {
        throw new ContextStateException("Not implemented");
    }
}
