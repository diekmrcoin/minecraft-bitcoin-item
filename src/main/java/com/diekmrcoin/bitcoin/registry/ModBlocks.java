package com.diekmrcoin.bitcoin.registry;

import com.diekmrcoin.bitcoin.BitcoinItem;
import com.diekmrcoin.bitcoin.blocks.BitcoinMinerBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block BITCOIN_MINER_BLOCK = new BitcoinMinerBlock(
            FabricBlockSettings
                    .of(Material.METAL)
                    .breakByTool(FabricToolTags.PICKAXES, 2)
                    .requiresTool()
                    .strength(3.5f, 30.0f)
                    .sounds(BlockSoundGroup.METAL)
                    .luminance(10)
    );

    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(BitcoinItem.MOD_ID, "bitcoin_miner_block"), BITCOIN_MINER_BLOCK);
    }
}
