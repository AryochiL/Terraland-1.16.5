package com.entropystudio.terraland.registry;

import com.entropystudio.terraland.tileentity.OriginiumCoreEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import static com.entropystudio.terraland.TerraLand.MODID;

@Mod.EventBusSubscriber(modid =MODID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class TileEntityTypeHandler {
    public static final TileEntityType<?> ORIGINIUM_CORE_ENTITY_TYPE = TileEntityType.Builder.of(OriginiumCoreEntity::new, BlockHandler.ORIGINIUM_CORE).build(null).setRegistryName("originium_core");//register("originium_core", TileEntityType.Builder.of(OriginiumCoreEntity::new, BlockHandler.ORIGINIUM_CORE));

    @SubscribeEvent
    public static void register(RegistryEvent.Register<TileEntityType<?>> evt){
        IForgeRegistry<TileEntityType<?>> r = evt.getRegistry();
        r.register(ORIGINIUM_CORE_ENTITY_TYPE);
    }
}
