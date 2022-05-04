package com.entropystudio.terraland.network;

import com.entropystudio.terraland.network.packets.DisasterPacket;
import com.entropystudio.terraland.network.packets.LeftClickPacket;
import com.entropystudio.terraland.network.packets.UpdateWindowPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

import static com.entropystudio.terraland.TerraLand.MODID;

public final class PacketHandler {
    private static final String PROTOCOL_VERSION = Integer.toString(1);



    public static SimpleChannel HANDLER = NetworkRegistry.newSimpleChannel(
            new ResourceLocation(MODID,"main")
            ,() -> PROTOCOL_VERSION
            , PROTOCOL_VERSION::equals
            , PROTOCOL_VERSION::equals);

    private static int id = 0;
    public static void register(){
        HANDLER.registerMessage(id++, LeftClickPacket.class, LeftClickPacket::encode, LeftClickPacket::decode, LeftClickPacket.Handler::handle);
        HANDLER.registerMessage(id++, UpdateWindowPacket.class, UpdateWindowPacket::encode, UpdateWindowPacket::decode, UpdateWindowPacket.Handler::handle);
        HANDLER.registerMessage(id++, DisasterPacket.class, DisasterPacket::encode, DisasterPacket::decode, DisasterPacket.Handler::handle);
        //HANDLER.registerMessage(id++, EntityStatuePacket.class, EntityStatuePacket::encode, EntityStatuePacket::decode, EntityStatuePacket.Handler::handle);
    }
}
