package com.mohistmc.launcher.silkard;

import java.io.File;
import java.nio.file.Paths;
import net.fabricmc.loader.impl.game.minecraft.MinecraftGameProvider;
import net.fabricmc.loader.impl.launch.FabricLauncher;
import net.fabricmc.loader.impl.util.Arguments;

public class SilkardGameProvider extends MinecraftGameProvider {

    @Override
    public void initialize(FabricLauncher launcher) {
        System.setProperty("log4j2.configurationFile", "log4j2_silkard.xml");
        for (var lib : System.getProperty("silkard.classpath").split(File.pathSeparator)) {
            launcher.addToClassPath(Paths.get(lib));
        }
        super.initialize(launcher);
    }

    @Override
    public Arguments getArguments() {
        Arguments arguments = super.getArguments();
        arguments.addExtraArg("nogui");
        return arguments;
    }

    @Override
    public void unlockClassPath(FabricLauncher launcher) {
        super.unlockClassPath(launcher);
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
