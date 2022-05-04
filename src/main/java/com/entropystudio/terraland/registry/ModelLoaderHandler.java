package com.entropystudio.terraland.registry;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.Mod;

import static com.entropystudio.terraland.TerraLand.MODID;

@Mod.EventBusSubscriber(modid =MODID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModelLoaderHandler extends ModelLoaderRegistry {

    public static void myRegister()
    {
        registerLoader(new ResourceLocation(MODID + ":models"), OBJLoader.INSTANCE);
    }
}
