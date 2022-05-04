package com.entropystudio.terraland.network.packets;

import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class DisasterPacket {
    private static boolean isDisaster;
    public DisasterPacket(boolean isDisaster){
        super();
        this.isDisaster = isDisaster;
    }
    public static void encode(DisasterPacket msg, PacketBuffer buf){
    }

    public static DisasterPacket decode(PacketBuffer buf){
        return new DisasterPacket(isDisaster);
    }

    public static class Handler {
        public static void handle(DisasterPacket msg, Supplier<NetworkEvent.Context> ctx){
            ctx.get().enqueueWork(() -> {

            });
            ctx.get().setPacketHandled(true);
        }
    }
}
