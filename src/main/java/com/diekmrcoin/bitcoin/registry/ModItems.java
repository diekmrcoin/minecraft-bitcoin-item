package com.diekmrcoin.bitcoin.registry;

import com.diekmrcoin.bitcoin.BitcoinItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item BITCOIN = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(BitcoinItem.MOD_ID, "bitcoin"), BITCOIN);
    }
}
