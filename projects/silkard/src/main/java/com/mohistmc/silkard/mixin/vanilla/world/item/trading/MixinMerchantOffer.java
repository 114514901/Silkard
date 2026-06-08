package com.mohistmc.silkard.mixin.vanilla.world.item.trading;

import com.mohistmc.silkard.injected.world.item.trading.ContextMerchantOffer;
import net.minecraft.world.item.trading.MerchantOffer;
import org.spongepowered.asm.mixin.Mixin;

/**
 * @author Mgazul
 * @date 2026/6/8
 */
@Mixin(MerchantOffer.class)
public class MixinMerchantOffer implements ContextMerchantOffer {
}
