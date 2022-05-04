package com.entropystudio.terraland.network.packets;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class UpdateWindowPacket {

    private final int windowId;
    private final int time;

    public UpdateWindowPacket(int windowId, int time) {
        this.windowId = windowId;
        this.time = time;
    }

    public static void encode(UpdateWindowPacket msg, PacketBuffer buf) {
        buf.writeInt(msg.windowId);
        buf.writeInt(msg.time);
    }

    public static UpdateWindowPacket decode(PacketBuffer buf) {
        return new UpdateWindowPacket(buf.readInt(), buf.readInt());
    }

    public static class Handler {

        public static void handle(final UpdateWindowPacket msg, Supplier<NetworkEvent.Context> ctx) {
            ctx.get().enqueueWork(() -> handleClient(msg));
            ctx.get().setPacketHandled(true);
        }

        //Needed to make the server be able to resolve registering the packet
        //@OnlyIn(Dist.CLIENT)
        private static void handleClient(final UpdateWindowPacket msg) {
            PlayerEntity player = Minecraft.getInstance().player;
            //if (player.openContainer.windowId == msg.windowId) {
                //player.openContainer.updateProgressBar(msg.windowId, msg.time);

            //}
        }
    }
}
