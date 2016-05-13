package com.uniquemovement.util;

import com.uniquemovement.items.MovementItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class MovementTab extends CreativeTabs {

	public MovementTab(String label) {
		super(label);
		}
	@Override
	public Item getTabIconItem() {
		return MovementItems.Tardis;
	}

}
