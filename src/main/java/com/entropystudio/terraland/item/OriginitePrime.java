package com.entropystudio.terraland.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;

import static net.minecraft.potion.Effects.*;

public class OriginitePrime extends Item {
    List<Pair<EffectInstance, Float>> effects = new ArrayList<>();
    String playerName = null;

    public OriginitePrime(Properties p_i48476_1_) {
        super(p_i48476_1_);
    }

    @Override
    public void appendHoverText(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        tooltip.set(0, ((IFormattableTextComponent) tooltip.get(0)).setStyle(tooltip.get(0).getStyle().applyFormat(TextFormatting.GOLD)));
    }
}
