package com.entropystudio.terraland.network.packets;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class LeftClickPacket {
    private static boolean pressed;
    public LeftClickPacket(boolean pressed){
        super();
        LeftClickPacket.pressed = pressed;
    }
    public static void encode(LeftClickPacket msg, PacketBuffer buf){
    }

    public static LeftClickPacket decode(PacketBuffer buf){
        return new LeftClickPacket(pressed);
    }

    public static class Handler {
        public static void handle(LeftClickPacket msg, Supplier<NetworkEvent.Context> ctx){
            ctx.get().enqueueWork(() -> {
                PlayerEntity player = ctx.get().getSender();
                if (player != null) {
                    ItemStack item = player.getMainHandItem();
                }

            });
            ctx.get().setPacketHandled(true);
        }
    }
}
