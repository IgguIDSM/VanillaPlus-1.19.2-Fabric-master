package net.KssK.vanillaplus.Item;

import net.KssK.vanillaplus.VanillaPlus;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup Tanzanite = FabricItemGroupBuilder.build(new Identifier(VanillaPlus.MOD_ID,"vnp"),()-> new ItemStack(ModItems.Tanzanite));
}
