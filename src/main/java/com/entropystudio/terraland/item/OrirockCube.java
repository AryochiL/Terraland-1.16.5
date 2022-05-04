package com.entropystudio.terraland.item;

import com.entropystudio.terraland.registry.ItemHandler;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;

import java.util.List;

public class OrirockCube extends BlockItem {

    public static Item item1 = ItemHandler.ORIROCK;
    public static int num1 = 3;
    public int id = 2;
    public OrirockCube(Block p_i48527_1_, Properties p_i48527_2_) {
        super(p_i48527_1_, p_i48527_2_);
    }
    @Override
    public void appendHoverText(ItemStack stack, World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        tooltip.set(0, ((IFormattableTextComponent) tooltip.get(0)).setStyle(tooltip.get(0).getStyle().applyFormat(TextFormatting.YELLOW)));
    }
}
