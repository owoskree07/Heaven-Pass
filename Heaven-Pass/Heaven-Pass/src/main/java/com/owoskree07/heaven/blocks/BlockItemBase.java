package com.owoskree07.heaven.blocks;

import com.owoskree07.heaven.ExampleMod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(ExampleMod.TAB));
    }
}
