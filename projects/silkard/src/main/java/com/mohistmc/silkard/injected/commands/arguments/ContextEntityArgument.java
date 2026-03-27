package com.mohistmc.silkard.injected.commands.arguments;

import com.mohistmc.silkard.util.ContextStateException;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.arguments.selector.EntitySelector;

public interface ContextEntityArgument {

    default EntitySelector parse(StringReader reader, boolean allowSelectors, boolean overridePermissions) throws CommandSyntaxException {
        throw new ContextStateException("Not implemented");
    }
}
