package net.KssK.vanillaplus.block;

import net.KssK.vanillaplus.Item.ModItemGroup;
import net.KssK.vanillaplus.VanillaPlus;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    //Block Settings
    public static final FabricBlockSettings TanzaniteBlockSetting = FabricBlockSettings.of(Material.METAL).strength(.6f).requiresTool();
    public static final FabricBlockSettings TanzaniteOreSetting = FabricBlockSettings.of(Material.STONE).strength(.6f).requiresTool();
    //Blocks
    public static final Block Tanzanite_Block = registerBlock("tanzanite_block",new Block(TanzaniteBlockSetting), ModItemGroup.Tanzanite);
    //Ores
    public static final Block Tanzanite_Ore = registerBlock("tanzanite_ore",new OreBlock(TanzaniteOreSetting, UniformIntProvider.create(3,7)), ModItemGroup.Tanzanite);
    public static final Block Deepslate_Tanzanite_Ore = registerBlock("deepslate_tanzanite_ore",new OreBlock(TanzaniteOreSetting, UniformIntProvider.create(3,7)), ModItemGroup.Tanzanite);
    public static final Block Endstone_Tanzanite_Ore = registerBlock("endstone_tanzanite_ore",new OreBlock(TanzaniteOreSetting,UniformIntProvider.create(4,8)),ModItemGroup.Tanzanite);
    public static final Block Netherrack_Tanzanite_Ore = registerBlock("netherrack_tanzanite_ore",new OreBlock(TanzaniteOreSetting,UniformIntProvider.create(4,8)),ModItemGroup.Tanzanite);



    //Register Methods
    private static Block registerBlock(String name, Block block, ItemGroup iGroup){
        registerBlockItem(name,block,iGroup);
        return Registry.register(Registry.BLOCK,new Identifier(VanillaPlus.MOD_ID,name),block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup iGroup){
        return Registry.register(Registry.ITEM,new Identifier(VanillaPlus.MOD_ID,name),new BlockItem(block,new FabricItemSettings().group(iGroup)));
    }
    public static void registerModBlocks(){
        VanillaPlus.LOGGER.debug("Registering Blocks For Mod ID: "+VanillaPlus.MOD_ID);
    }
}
