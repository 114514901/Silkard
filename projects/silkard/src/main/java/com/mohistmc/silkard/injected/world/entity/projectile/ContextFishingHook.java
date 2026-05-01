package com.mohistmc.silkard.injected.world.entity.projectile;

import com.mohistmc.silkard.util.ContextStateException;

public interface ContextFishingHook {

    default int silkard$minLureTime() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$minLureTime(int minLureTime) {
        throw new ContextStateException("Not implemented");
    }

    default int silkard$maxLureTime() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$maxLureTime(int maxLureTime) {
        throw new ContextStateException("Not implemented");
    }

    default float silkard$minLureAngle() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$minLureAngle(float minLureAngle) {
        throw new ContextStateException("Not implemented");
    }

    default float silkard$maxLureAngle() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$maxLureAngle(float maxLureAngle) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$rainInfluenced() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$rainInfluenced(boolean rainInfluenced) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$skyInfluenced() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$skyInfluenced(boolean skyInfluenced) {
        throw new ContextStateException("Not implemented");
    }

    default int silkard$minWaitTime() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$minWaitTime(int minWaitTime) {
        throw new ContextStateException("Not implemented");
    }

    default int silkard$maxWaitTime() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$maxWaitTime(int minWaitTime) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$applyLure() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$applyLure(boolean applyLure) {
        throw new ContextStateException("Not implemented");
    }
}
