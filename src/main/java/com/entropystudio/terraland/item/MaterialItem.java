package com.entropystudio.terraland.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class MaterialItem extends Item {
    public int id;
    public TextFormatting color;
    public MaterialItem(Properties p_i48487_1_, TextFormatting color) {
        super(p_i48487_1_);
        this.color = color;
    }

    @Override
    public void appendHoverText(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        super.appendHoverText(stack, world, tooltip, flag);
        tooltip.set(0, ((IFormattableTextComponent) tooltip.get(0)).setStyle(tooltip.get(0).getStyle().applyFormat(this.color)));
        //tooltip.set(0, tooltip.get(0).getStyle().applyFormat(this.color));
    }
}
