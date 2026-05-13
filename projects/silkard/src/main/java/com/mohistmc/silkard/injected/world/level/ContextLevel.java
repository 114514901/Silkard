package com.mohistmc.silkard.injected.world.level;

import com.mohistmc.silkard.util.ContextStateException;
import java.util.List;
import java.util.Map;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.LevelChunk;
import net.minecraft.world.level.dimension.LevelStem;
import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.CraftWorld;
import org.bukkit.craftbukkit.block.CapturedBlockState;
import org.bukkit.entity.SpawnCategory;

public interface ContextLevel {

    default boolean silkard$preventPoiUpdated() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setPreventPoiUpdated(boolean preventPoiUpdated) {
        throw new ContextStateException("Not implemented");
    }

    default org.bukkit.generator.BiomeProvider silkard$biomeProvider() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setBiomeProvider(org.bukkit.generator.BiomeProvider biomeProvider) {
        throw new ContextStateException("Not implemented");
    }

    default org.bukkit.World.Environment silkard$environment() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setEnvironment(org.bukkit.World.Environment environment) {
        throw new ContextStateException("Not implemented");
    }

    default org.bukkit.generator.ChunkGenerator silkard$generator() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setGenerator(org.bukkit.generator.ChunkGenerator generator) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$pvpMode() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setPvpMode(boolean pvpMode) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$captureBlockStates() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$captureBlockStates(boolean captureState) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$captureTreeGeneration() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$captureTreeGeneration(boolean treeGeneration) {
        throw new ContextStateException("Not implemented");
    }

    default Map<BlockPos, CapturedBlockState> silkard$capturedBlockStates() {
        throw new ContextStateException("Not implemented");
    }

    default Map<BlockPos, BlockEntity> silkard$capturedTileEntities() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setCapturedTileEntities(Map<BlockPos, BlockEntity> tileEntities) {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setCapturedBlockStates(Map<BlockPos, CapturedBlockState> capturedBlockStates) {
        throw new ContextStateException("Not implemented");
    }

    default List<ItemEntity> silkard$captureDrops() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setCaptureDrops(List<ItemEntity> captureDrops) {
        throw new ContextStateException("Not implemented");
    }

    default it.unimi.dsi.fastutil.objects.Object2LongOpenHashMap<SpawnCategory> silkard$ticksPerSpawnCategory() {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$populating() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setPopulating(boolean populating) {
        throw new ContextStateException("Not implemented");
    }

    default ResourceKey<LevelStem> getTypeKey(){
        throw new ContextStateException("Not implemented");
    }

    default CraftWorld getWorld() {
        throw new ContextStateException("Not implemented");
    }

    default CraftServer getCraftServer() {
        throw new ContextStateException("Not implemented");
    }

    default void notifyAndUpdatePhysics(BlockPos blockpos, LevelChunk levelchunk, BlockState oldBlock, BlockState newBlock, BlockState actualBlock, int i, int j) {
        throw new ContextStateException("Not implemented");
    }

    default BlockEntity getBlockEntity(BlockPos pos, boolean validate) {
        throw new ContextStateException("Not implemented");
    }
}
