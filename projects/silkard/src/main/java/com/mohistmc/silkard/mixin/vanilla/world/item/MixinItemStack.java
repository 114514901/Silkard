package com.mohistmc.silkard.mixin.vanilla.world.item;

import com.mohistmc.silkard.injected.world.item.ContextItemStack;
import net.minecraft.core.Holder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

/**
 * @author Mgazul
 * @date 2026/5/1 17:38
 */
@Mixin(ItemStack.class)
public class MixinItemStack implements ContextItemStack {

    @Shadow
    private @Nullable Holder<Item> item;

    @Deprecated
    @Override
    public void setItem(Holder<Item> item) {
        this.item = item;
    }
}
