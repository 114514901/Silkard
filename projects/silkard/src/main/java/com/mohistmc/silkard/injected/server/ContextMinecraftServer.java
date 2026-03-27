package com.mohistmc.silkard.injected.server;

import com.mohistmc.silkard.util.ContextStateException;
import joptsimple.OptionSet;
import net.minecraft.commands.Commands;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.Identifier;
import net.minecraft.server.ServerLinks;
import net.minecraft.server.WorldLoader;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.rcon.RconConsoleSource;
import net.minecraft.world.level.levelgen.WorldOptions;
import net.minecraft.world.level.storage.ServerLevelData;
import net.minecraft.world.level.storage.WorldData;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.RemoteConsoleCommandSender;
import org.bukkit.craftbukkit.CraftServer;

import java.util.Optional;

public interface ContextMinecraftServer {

    default void handleCustomClickAction(Identifier minecraftkey, Optional<Tag> optional, ServerPlayer player) {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$drainQueuedTasks() {
        throw new ContextStateException("Not implemented");
    }

    default Commands silkard$getVanillaCommands() {
        throw new ContextStateException("Not implemented");
    }

    default java.util.concurrent.ExecutorService silkard$chatExecutor() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$queuedProcess(Runnable runnable) {
        throw new ContextStateException("Not implemented");
    }

    default java.util.Queue<Runnable> silkard$processQueue() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setProcessQueue(java.util.Queue<Runnable> processQueue) {
        throw new ContextStateException("Not implemented");
    }

    default WorldLoader.DataLoadContext silkard$worldLoader() {
        throw new ContextStateException("Not implemented");
    }

    default CraftServer silkard$server() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setServer(CraftServer server) {
        throw new ContextStateException("Not implemented");
    }

    default OptionSet silkard$options() {
        throw new ContextStateException("Not implemented");
    }

    default ConsoleCommandSender silkard$console() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setConsole(ConsoleCommandSender console) {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setRemoteConsole(RemoteConsoleCommandSender remoteConsole) {
        throw new ContextStateException("Not implemented");
    }

    default boolean silkard$forceTicks() {
        throw new ContextStateException("Not implemented");
    }

    default boolean isDebugging() {
        throw new ContextStateException("Not implemented");
    }

    default boolean hasStopped() {
        throw new ContextStateException("Not implemented");
    }

    default void initWorld(ServerLevel serverlevel, ServerLevelData serverleveldata, WorldData saveData, WorldOptions worldOptions) {
        throw new ContextStateException("Not implemented");
    }

    default void prepareLevels(ServerLevel serverlevel) {
        throw new ContextStateException("Not implemented");
    }

    default void addLevel(ServerLevel level) {
        throw new ContextStateException("Not implemented");
    }

    default void removeLevel(ServerLevel level) {
        throw new ContextStateException("Not implemented");
    }

    default void executeModerately() {
        throw new ContextStateException("Not implemented");
    }

    default double[] getTPS() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setRconConsoleSource(RconConsoleSource source) {
        throw new ContextStateException("Not implemented");
    }

    default void setServerLinks(ServerLinks serverLinks) {
        throw new ContextStateException("Not implemented");
    }

    default int silkard$autosavePeriod() {
        throw new ContextStateException("Not implemented");
    }

    default void silkard$setAutosavePeriod(int autosavePeriod) {
        throw new ContextStateException("Not implemented");
    }
}
