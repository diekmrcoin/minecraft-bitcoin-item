package com.diekmrcoin.bitcoin;

import com.diekmrcoin.bitcoin.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class BitcoinItem implements ModInitializer {
    public static final String MOD_ID = "diekmrcoin-bitcoin-item";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
