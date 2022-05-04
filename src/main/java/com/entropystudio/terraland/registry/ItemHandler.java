package com.entropystudio.terraland.registry;

import com.entropystudio.terraland.item.MaterialItem;
import com.entropystudio.terraland.item.OriginitePrime;
import com.entropystudio.terraland.item.OrirockCube;
import com.entropystudio.terraland.item.Temp;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

import static com.entropystudio.terraland.TerraLand.MODID;
import static com.entropystudio.terraland.TerraLand.TERRALAND;
import static net.minecraft.util.text.TextFormatting.*;
@Mod.EventBusSubscriber(modid =MODID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class ItemHandler {

    static TextFormatting COMMON = WHITE;
    static TextFormatting UNCOMMON = YELLOW;
    static TextFormatting RARE = AQUA;
    static TextFormatting EPIC = LIGHT_PURPLE;
    static TextFormatting LEGEND = GOLD;

    public static final Item TESTITEM = new Temp(new Item.Properties().tab(TERRALAND)).setRegistryName(MODID + ":test_item");
    /*
    public static final Item CROWNSLAYER = new SpawnEggItem(EntityHandler.CROWNSLAYER, 0 , 12326679, new Item.Properties().tab(ARKNIGHTS)).setRegistryName(EntityHandler.CROWNSLAYER.getRegistryName());
    public static final Item ORIGINIUMSLUG = new SpawnEggItem(EntityHandler.ORIGINIUMSLUG, 0 , 16776960, new Item.Properties().tab(ARKNIGHTS)).setRegistryName(EntityHandler.ORIGINIUMSLUG.getRegistryName());

    public static final Item EXUSIAI = new Exusiai(new Item.Properties().tab(ARKNIGHTS)).setRegistryName(MODID + ":exusiai");
    public static final Item AMIYA = new Amiya(new Item.Properties().tab(ARKNIGHTS)).setRegistryName(MODID + ":amiya");
    */
    public static final Item ORIGINITEPRIME = new OriginitePrime(new Item.Properties().tab(TERRALAND)).setRegistryName(MODID+":originite_prime");
    public static final Item ORIGINIUMSHARD = createItem("originium_shard", LEGEND);
    public static final Item PUREGOLD = createItem("pure_gold", EPIC);
    //public static final Item ORUNDUM= createItem("orundum", 44, COMMON);
    public static final BlockItem ORUNDUM = createBlockItem(BlockHandler.ORUNDUM);
/*
    public static final Item TRUESILVER_SWORD = new TruesilverSword(new Item.Properties().tab(ARKNIGHTS)).setRegistryName(MODID + ":" + "truesilver_sword");
    public static final Item PROJEKTRED_KNIFE= new ProjektRedKnife(new Item.Properties().tab(ARKNIGHTS)).setRegistryName(MODID + ":" + "projektred_knife");
    public static final Item CROWNSLAYER_KNIFE = new CrownslayerKnife(new Item.Properties().tab(ARKNIGHTS)).setRegistryName(MODID + ":" + "crownslayer_knife");
    public static final Item APULUPAI = new Apulupai(new Item.Properties().tab(ARKNIGHTS).maxDamage(512)).setRegistryName(MODID + ":" + "jb");
    public static final Item SHAW_PUMP = new ShawPump(new Item.Properties().tab(ARKNIGHTS).maxDamage(256)).setRegistryName(MODID + ":" + "shaw_pump");
    public static final Item SHAW_AXE = new ShawAxe(new Item.Properties().tab(ARKNIGHTS)).setRegistryName(MODID + ":" + "shaw_axe");
    public static final Item FAUST_CROSSBOW = new FaustCrossBow(new Item.Properties().maxStackSize(1).group(ARKNIGHTS).maxDamage(1024)).setRegistryName(MODID + ":" + "faust_crossbow");
*/
    public static final Item ORIROCK = createItem("orirock",  COMMON);
    public static final OrirockCube ORIROCKCUBE = (OrirockCube) new OrirockCube(BlockHandler.ORIROCKCUBE, new Item.Properties().tab(TERRALAND)).setRegistryName(BlockHandler.ORIROCKCUBE.getRegistryName());
    public static final Item ORIROCKCLUSTER = createItem("orirock_cluster", RARE);
    public static final Item ORIROCKCONCENTRATION = createItem("orirock_concentration", EPIC);

    public static final Item SUGARSUBSTITUTE = createItem("sugar_substitute", COMMON);
    public static final Item SUGAR = createItem("sugar", UNCOMMON);
    public static final Item SUGARPACK = createItem("sugar_pack", RARE);
    public static final Item SUGARLUMP = createItem("sugar_lump", EPIC);

    public static final Item ESTER = createItem("ester", COMMON);
    public static final Item POLYESTER = createItem("polyester", UNCOMMON);
    public static final Item POLYESTERPACK = createItem("polyester_pack", RARE);
    public static final Item POLYESTERLUMP = createItem("polyester_lump", EPIC);

    public static final Item ORIRONSHARD= createItem("oriron_shard", COMMON);
    public static final Item ORIRON = createItem("oriron", UNCOMMON);
    public static final Item ORIRONCLUSTER = createItem("oriron_cluster", RARE);
    public static final Item ORIRONBLOCK = createItem("oriron_block", EPIC);

    public static final Item DIKETON = createItem("diketon", COMMON);
    public static final Item POLYKETON = createItem("polyketon", UNCOMMON);
    public static final Item AKETON = createItem("aketon", RARE);
    public static final Item KETONCOLLOID = createItem("keton_colloid", EPIC);

    public static final Item DAMAGEDDEVICE = createItem("damaged_device", COMMON);
    public static final Item DEVICE = createItem("device", UNCOMMON);
    public static final Item INTEGRATEDDEVICE = createItem("integrated_device", RARE);
    public static final Item OPTMIZEDDEVICE = createItem("optimized_device", EPIC);

    public static final Item LOXICKOHL = createItem("loxic_kohl", RARE);
    public static final Item WHITEHORSEKOHL = createItem("white_horse_kohl", EPIC);

    public static final Item MANGANESEORE = createItem("manganese_ore", RARE);
    public static final Item MANGANESETRIHYDRATE = createItem("manganese_trihydrate", EPIC);

    public static final Item RMA7012 = createItem("rma70_12", RARE);
    public static final Item RMA7024 = createItem("rma70_24", EPIC);

    //凝胶、炽合金

    public static final Item GRINDSTONE = createItem("grindstone", RARE);
    public static final Item GRINDSTONEPENTAHYDRATE = createItem("grindstone_pentahydrate", EPIC);

    public static final Item D32STEEL = createItem("d32_steel", LEGEND);
    public static final Item BIPOLARNANOFLAKE = createItem("bipolar_nanoflake", LEGEND);
    public static final Item POLYMERIZATIONPREPERATION = createItem("polymerization_preparation", LEGEND);

    //public static final BlockItem TRADINGHOME_ITEM = createBlockItem(BlockHandler.TRADINGHOME);
    public static final BlockItem ORIGINIUMS = createBlockItem(BlockHandler.ORIGINITEPRIME_BLOCK);
    //public static final BlockItem WORKSHOP = createBlockItem(BlockHandler.WORKSHOP);
    public static final BlockItem ORIGINIUM_CORE = createBlockItem(BlockHandler.ORIGINIUM_CORE);
    public static final BlockItem ORIGINIUM_CRYSTAL = createBlockItem(BlockHandler.ORIGINIUM_CRYSTAL);
    public static final BlockItem COPPPER_ORE = createBlockItem(BlockHandler.COPPPER_ORE);
    public static final BlockItem LEAD_ORE = createBlockItem(BlockHandler.LEAD_ORE);
    public static final BlockItem MANGANESE_ORE_BLOCK = createBlockItem(BlockHandler.MANGANESE_ORE_BLOCK);
    public static final BlockItem ORIRON_ORE = createBlockItem(BlockHandler.ORIRON_ORE);
    public static final BlockItem SILVER_ORE = createBlockItem(BlockHandler.SILVER_ORE);
    public static final BlockItem TIN_ORE = createBlockItem(BlockHandler.TIN_ORE);

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> evt){
        IForgeRegistry<Item> r = evt.getRegistry();
        r.register(ORIGINIUM_CORE);
        r.register(ORIGINIUM_CRYSTAL);
        r.register(COPPPER_ORE);
        r.register(LEAD_ORE);
        r.register(MANGANESE_ORE_BLOCK);
        r.register(ORIRON_ORE);
        r.register(SILVER_ORE);
        r.register(TIN_ORE);

        r.register(TESTITEM);

        r.register(ORIGINITEPRIME);
        r.register(ORIGINIUMSHARD);
        r.register(PUREGOLD);
        r.register(ORUNDUM);

        r.register(ORIROCK);
        r.register(ORIROCKCUBE);
        r.register(ORIROCKCLUSTER);
        r.register(ORIROCKCONCENTRATION);
        r.register(SUGARSUBSTITUTE);
        r.register(SUGAR);
        r.register(SUGARPACK);
        r.register(SUGARLUMP);
        r.register(ESTER);
        r.register(POLYESTER);
        r.register(POLYESTERPACK);
        r.register(POLYESTERLUMP);
        r.register(ORIRONSHARD);
        r.register(ORIRON);
        r.register(ORIRONCLUSTER);
        r.register(ORIRONBLOCK);
        r.register(DIKETON);
        r.register(POLYKETON);
        r.register(AKETON);
        r.register(KETONCOLLOID);
        r.register(DAMAGEDDEVICE);
        r.register(DEVICE);
        r.register(INTEGRATEDDEVICE);
        r.register(OPTMIZEDDEVICE);
        r.register(LOXICKOHL);
        r.register(WHITEHORSEKOHL);
        r.register(MANGANESEORE);
        r.register(MANGANESETRIHYDRATE);
        r.register(RMA7012);
        r.register(RMA7024);
        r.register(GRINDSTONE);
        r.register(GRINDSTONEPENTAHYDRATE);
        r.register(D32STEEL);
        r.register(BIPOLARNANOFLAKE);
        r.register(POLYMERIZATIONPREPERATION);

        r.register(ORIGINIUMS);
/*
        r.register(APULUPAI);
        r.register(TRUESILVER_SWORD);
        r.register(CROWNSLAYER_KNIFE);
        r.register(PROJEKTRED_KNIFE);
        r.register(SHAW_PUMP);
        r.register(SHAW_AXE);
        r.register(FAUST_CROSSBOW);

        r.register(TRADINGHOME_ITEM);

        r.register(WORKSHOP);

        r.register(EXUSIAI);
        r.register(AMIYA);

        r.register(CROWNSLAYER);
        r.register(ORIGINIUMSLUG);
*/
    }

    private static Item createItem(String name, ItemGroup group, TextFormatting color){
        MaterialItem item = (MaterialItem) new MaterialItem(new Item.Properties().tab(group), color).setRegistryName(MODID + ":" + name);
        return item;
    }

    private static Item createItem(String name, TextFormatting color){
        MaterialItem item = (MaterialItem) new MaterialItem(new Item.Properties().tab(TERRALAND), color).setRegistryName(MODID + ":" + name);
        return item;
    }

    private static BlockItem createBlockItem(Block block){
        return (BlockItem) new BlockItem(block, new Item.Properties().tab(TERRALAND)).setRegistryName(block.getRegistryName());
    }
}
