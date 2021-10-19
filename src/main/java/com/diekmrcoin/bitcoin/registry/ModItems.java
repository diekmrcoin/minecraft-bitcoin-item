package com.diekmrcoin.bitcoin.registry;

import com.diekmrcoin.bitcoin.BitcoinItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    // Items
    public static final Item BITCOIN = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    // Block items
    public static final Item BITCOIN_MINER_BLOCK = new BlockItem(
            ModBlocks.BITCOIN_MINER_BLOCK,
            new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)
    );

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(BitcoinItem.MOD_ID, "bitcoin"), BITCOIN);
        Registry.register(Registry.ITEM, new Identifier(BitcoinItem.MOD_ID, "bitcoin_miner_block"), BITCOIN_MINER_BLOCK);
    }
}
