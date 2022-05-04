package com.entropystudio.terraland.item;

import com.entropystudio.terraland.TerraLand;
import com.entropystudio.terraland.utils.OriginiumThorn;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.UseAction;
import net.minecraft.util.ActionResultType;

public class Temp extends Item {
    public Temp(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public int getUseDuration(ItemStack p_77626_1_) {
        return 10;
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        if (!context.getLevel().isClientSide()) {
            TerraLand.LOGGER.info("Use");
            OriginiumThorn.genThorns(context.getPlayer().position(), context.getLevel());
        }
        return ActionResultType.SUCCESS;
    }

    @Override
    public UseAction getUseAnimation(ItemStack p_77661_1_) {
        return UseAction.EAT;
    }
}
