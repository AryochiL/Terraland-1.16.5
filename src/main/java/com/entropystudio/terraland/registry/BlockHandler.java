package com.entropystudio.terraland.registry;

import com.entropystudio.terraland.block.OriginiumCore;
import com.entropystudio.terraland.block.OriginiumPrimeBlock;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import static com.entropystudio.terraland.TerraLand.MODID;
@Mod.EventBusSubscriber(modid =MODID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class BlockHandler {
    //public static final Block TRADINGHOME = new TradingHome(Block.Properties.of(Material.STONE).strength(1.5F, 6.0F)).setRegistryName(MODID+":"+"trading_home");
    public static final Block ORIGINITEPRIME_BLOCK = new OriginiumPrimeBlock(AbstractBlock.Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS)).setRegistryName(MODID+":"+"originite_prime_block");
    //public static final Block WORKSHOP = new Workshop(Block.Properties.of(Material.STONE).strength(1.5F,6.0F)).setRegistryName(MODID + ":workshop");
    public static final Block ORUNDUM = new GlassBlock(AbstractBlock.Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS)).setRegistryName(MODID + ":orundum");
    public static final Block ORIGINIUM_CORE = new OriginiumCore(AbstractBlock.Properties.of(Material.STONE).strength(1.0F).sound(SoundType.GLASS)).setRegistryName(MODID + ":originium_core");
    public static final Block ORIGINIUM_CRYSTAL = new GlassBlock(AbstractBlock.Properties.of(Material.GLASS).strength(0.3F).sound(SoundType.GLASS).noOcclusion()).setRegistryName(MODID + ":originium_crystal");

    public static final Block COPPPER_ORE = createOreBlocks("copper_ore", Material.STONE, 3.0F, 3.0F);
    public static final Block LEAD_ORE = createOreBlocks("lead_ore", Material.STONE, 3.0F, 3.0F);
    public static final Block MANGANESE_ORE_BLOCK = createOreBlocks("manganese_ore_block", Material.STONE, 3.0F, 3.0F);
    public static final Block ORIRON_ORE = createOreBlocks("oriron_ore", Material.STONE, 3.0F, 3.0F);
    public static final Block SILVER_ORE = createOreBlocks("silver_ore",Material.STONE, 3.0F, 3.0F);
    public static final Block TIN_ORE = createOreBlocks("tin_ore", Material.STONE, 3.0F, 3.0F);
    public static final Block ORIGINIUMS_ORE = createOreBlocks("originiums_ore", Material.GLASS, 3.0F, 3.0F);//new Block(Block.Properties.create(Material.GLASS).hardnessAndResistance(3.0F, 3.0F)).setRegistryName(MODID+":"+"originiums_ore");
    public static final Block ORIROCKCUBE = createOreBlocks("orirock_cube", Material.STONE, 1.5F, 6.0F);//new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(MODID+":"+"solid_originrock");


    @SubscribeEvent
    public static void register(RegistryEvent.Register<Block> evt){
        IForgeRegistry<Block> r = evt.getRegistry();
        //r.register(TRADINGHOME);
        r.register(ORIGINITEPRIME_BLOCK);
        //r.register(WORKSHOP);
        r.register(ORUNDUM);

        r.register(ORIGINIUM_CORE);
        r.register(ORIGINIUM_CRYSTAL);

        r.register(ORIGINIUMS_ORE);
        r.register(ORIROCKCUBE);
        r.register(COPPPER_ORE);
        r.register(LEAD_ORE);
        r.register(MANGANESE_ORE_BLOCK);
        r.register(ORIRON_ORE);
        r.register(SILVER_ORE);
        r.register(TIN_ORE);
    }

    private static Block createBlocks(String name, Material material, float hardness, float resistance){
        return new Block(AbstractBlock.Properties.of(material).strength(hardness,resistance)).setRegistryName(MODID+":"+name);
    }

    private static Block createOreBlocks(String name, Material material, float hardness, float resistance){
        return new OreBlock(AbstractBlock.Properties.of(material).strength(hardness,resistance)).setRegistryName(MODID+":"+name);
    }
}
