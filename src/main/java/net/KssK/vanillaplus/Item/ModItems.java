package net.KssK.vanillaplus.Item;

import net.KssK.vanillaplus.VanillaPlus;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Group Settings
    public static final FabricItemSettings fSettings = new FabricItemSettings();
    //Tab Settings
    public static final ItemGroup iGroup = ModItemGroup.Tanzanite;

    //Custom Items
    public static final Item RawTanzanite = registerItem("raw_tanzanite",new Item(fSettings.group(iGroup)));
    public static final Item Tanzanite = registerItem("tanzanite",new Item(fSettings.group(iGroup)));





    //Item Registry
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM,new Identifier(VanillaPlus.MOD_ID,name),item);
    }
    public static void registerModItems(){
        VanillaPlus.LOGGER.debug("Registering Items for Mod ID: "+VanillaPlus.MOD_ID);
    }
}
