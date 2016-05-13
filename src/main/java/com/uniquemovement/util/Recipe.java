package com.uniquemovement.util;

import com.uniquemovement.items.MovementItems;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipe {
	public static void loadRecipes() {
		
//Smelting
GameRegistry.addSmelting(MovementItems.Plastic_Dust, new ItemStack(MovementItems.Platic_Hard), 1.5F);

//Crafting
//Misc Items
GameRegistry.addRecipe(new ItemStack(MovementItems.Helmet), "XXX", "X X",
		'X', MovementItems.Platic_Hard);
GameRegistry.addRecipe(new ItemStack(MovementItems.Wheel), "XXX","XOX", "XXX", 
		'X', MovementItems.Platic_Hard, 'O', Items.iron_ingot);
GameRegistry.addRecipe(new ItemStack(MovementItems.Plastic_Dust), "X","O", 
		'X', Blocks.sand, 'O', new ItemStack(Items.dye, 1, 15));
GameRegistry.addRecipe(new ItemStack(MovementItems.Engine), " X ","XOX", " X ", 
		'X', Items.iron_ingot, 'O', Items.redstone);

//Segways
GameRegistry.addRecipe(new ItemStack(MovementItems.Segway_white)," X ", "XXX", "OPO", 
		'X', MovementItems.Platic_Hard, 'O', MovementItems.Wheel, 'P', Items.iron_ingot);
GameRegistry.addRecipe(new ItemStack(MovementItems.Segway_blue), "X","O", 
		'X', MovementItems.Segway_white, 'O', new ItemStack(Items.dye, 1, 4));
GameRegistry.addRecipe(new ItemStack(MovementItems.Segway_green), "X","O", 
		'X', MovementItems.Segway_white, 'O', new ItemStack(Items.dye, 1, 2));
GameRegistry.addRecipe(new ItemStack(MovementItems.Segway_orange), "X","O", 
		'X', MovementItems.Segway_white, 'O', new ItemStack(Items.dye, 1, 14));
GameRegistry.addRecipe(new ItemStack(MovementItems.Segway_purple), "X","O", 
		'X', MovementItems.Segway_white, 'O', new ItemStack(Items.dye, 1, 5));
GameRegistry.addRecipe(new ItemStack(MovementItems.Segway_pink), "X","O", 
		'X', MovementItems.Segway_white, 'O', new ItemStack(Items.dye, 1, 9));
GameRegistry.addRecipe(new ItemStack(MovementItems.Segway_red), "X","O", 
		'X', MovementItems.Segway_white, 'O', new ItemStack(Items.dye, 1, 1));
GameRegistry.addRecipe(new ItemStack(MovementItems.Segway_yellow), "X","O", 
		'X', MovementItems.Segway_white, 'O', new ItemStack(Items.dye, 1, 11));

//Swegways
GameRegistry.addRecipe(new ItemStack(MovementItems.Swegway_white),"XXX", "OPO", 
		'X', MovementItems.Platic_Hard, 'O', MovementItems.Wheel, 'P', Items.iron_ingot);
GameRegistry.addRecipe(new ItemStack(MovementItems.Swegway_blue), "X","O", 
		'X', MovementItems.Swegway_white, 'O', new ItemStack(Items.dye, 1, 4));
GameRegistry.addRecipe(new ItemStack(MovementItems.Swegway_green), "X","O", 
		'X', MovementItems.Swegway_white, 'O', new ItemStack(Items.dye, 1, 2));
GameRegistry.addRecipe(new ItemStack(MovementItems.Swegway_orange), "X","O", 
		'X', MovementItems.Swegway_white, 'O', new ItemStack(Items.dye, 1, 14));
GameRegistry.addRecipe(new ItemStack(MovementItems.Swegway_purple), "X","O", 
		'X', MovementItems.Swegway_white, 'O', new ItemStack(Items.dye, 1, 5));
GameRegistry.addRecipe(new ItemStack(MovementItems.Swegway_pink), "X","O", 
		'X', MovementItems.Swegway_white, 'O', new ItemStack(Items.dye, 1, 9));
GameRegistry.addRecipe(new ItemStack(MovementItems.Swegway_red), "X","O", 
		'X', MovementItems.Swegway_white, 'O', new ItemStack(Items.dye, 1, 1));
GameRegistry.addRecipe(new ItemStack(MovementItems.Swegway_yellow), "X","O", 
		'X', MovementItems.Swegway_white, 'O', new ItemStack(Items.dye, 1, 11));

//Hoverboards
GameRegistry.addRecipe(new ItemStack(MovementItems.Hoverboard_white), "XXX",
		'X', MovementItems.Platic_Hard);
GameRegistry.addRecipe(new ItemStack(MovementItems.Hoverboard_blue), "X","O", 
		'X', MovementItems.Hoverboard_white, 'O', new ItemStack(Items.dye, 1, 4));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hoverboard_green), "X","O", 
		'X', MovementItems.Hoverboard_white, 'O', new ItemStack(Items.dye, 1, 2));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hoverboard_orange), "X","O", 
		'X', MovementItems.Hoverboard_white, 'O', new ItemStack(Items.dye, 1, 14));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hoverboard_purple), "X","O", 
		'X', MovementItems.Hoverboard_white, 'O', new ItemStack(Items.dye, 1, 5));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hoverboard_pink), "X","O", 
		'X', MovementItems.Hoverboard_white, 'O', new ItemStack(Items.dye, 1, 9));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hoverboard_red), "X","O", 
		'X', MovementItems.Hoverboard_white, 'O', new ItemStack(Items.dye, 1, 1));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hoverboard_yellow), "X","O", 
		'X', MovementItems.Hoverboard_white, 'O', new ItemStack(Items.dye, 1, 11));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hoverboard_mcfly), "XBA","GOJ","FDZ", 
		'O', MovementItems.Hoverboard_white, 
		'X', new ItemStack(Items.dye, 1, 4),
		'B', new ItemStack(Items.dye, 1, 2),
		'A', new ItemStack(Items.dye, 1, 14),
		'G', new ItemStack(Items.dye, 1, 5),
		'J', new ItemStack(Items.dye, 1, 9),
		'F', new ItemStack(Items.dye, 1, 1),
		'D', new ItemStack(Items.dye, 1, 11),
		'Z', new ItemStack(Items.dye, 1, 15));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hoverboard_PopularMMO), "XXX","XOX", "XXX", 
		'O', MovementItems.Hoverboard_white, 'X', new ItemStack(Items.dye, 1, 4));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hoverboard_SuperGirlyGamer), "XXX","XOX", "XXX", 
		'O', MovementItems.Hoverboard_white, 'X', new ItemStack(Items.dye, 1, 9));

//Unicycles
GameRegistry.addRecipe(new ItemStack(MovementItems.Unicycle_white)," P ", "PPP", "POP",
		'O', MovementItems.Wheel, 'P', Items.iron_ingot);
GameRegistry.addRecipe(new ItemStack(MovementItems.Unicycle_blue), "X","O", 
		'X', MovementItems.Unicycle_white, 'O', new ItemStack(Items.dye, 1, 4));
GameRegistry.addRecipe(new ItemStack(MovementItems.Unicycle_green), "X","O", 
		'X', MovementItems.Unicycle_white, 'O', new ItemStack(Items.dye, 1, 2));
GameRegistry.addRecipe(new ItemStack(MovementItems.Unicycle_orange), "X","O", 
		'X', MovementItems.Unicycle_white, 'O', new ItemStack(Items.dye, 1, 14));
GameRegistry.addRecipe(new ItemStack(MovementItems.Unicycle_purple), "X","O", 
		'X', MovementItems.Unicycle_white, 'O', new ItemStack(Items.dye, 1, 5));
GameRegistry.addRecipe(new ItemStack(MovementItems.Unicycle_pink), "X","O", 
		'X', MovementItems.Unicycle_white, 'O', new ItemStack(Items.dye, 1, 9));
GameRegistry.addRecipe(new ItemStack(MovementItems.Unicycle_red), "X","O", 
		'X', MovementItems.Unicycle_white, 'O', new ItemStack(Items.dye, 1, 1));
GameRegistry.addRecipe(new ItemStack(MovementItems.Unicycle_yellow), "X","O", 
		'X', MovementItems.Unicycle_white, 'O', new ItemStack(Items.dye, 1, 11));
	
//Tardis
GameRegistry.addRecipe(new ItemStack(MovementItems.Tardis),"XOX", "XAX", "XXX",
		'O', Blocks.glass, 'A', Blocks.redstone_block,'X', Blocks.iron_block);
	
//BMX
GameRegistry.addRecipe(new ItemStack(MovementItems.BMX_white),"P  ", "PPP", "O O",
		'O', MovementItems.Wheel, 'P', Items.iron_ingot);
GameRegistry.addRecipe(new ItemStack(MovementItems.BMX_blue), "X","O", 
		'X', MovementItems.BMX_white, 'O', new ItemStack(Items.dye, 1, 4));
GameRegistry.addRecipe(new ItemStack(MovementItems.BMX_green), "X","O", 
		'X', MovementItems.BMX_white, 'O', new ItemStack(Items.dye, 1, 2));
GameRegistry.addRecipe(new ItemStack(MovementItems.BMX_orange), "X","O", 
		'X', MovementItems.BMX_white, 'O', new ItemStack(Items.dye, 1, 14));
GameRegistry.addRecipe(new ItemStack(MovementItems.BMX_purple), "X","O", 
		'X', MovementItems.BMX_white, 'O', new ItemStack(Items.dye, 1, 5));
GameRegistry.addRecipe(new ItemStack(MovementItems.BMX_pink), "X","O", 
		'X', MovementItems.BMX_white, 'O', new ItemStack(Items.dye, 1, 9));
GameRegistry.addRecipe(new ItemStack(MovementItems.BMX_red), "X","O", 
		'X', MovementItems.BMX_white, 'O', new ItemStack(Items.dye, 1, 1));
GameRegistry.addRecipe(new ItemStack(MovementItems.BMX_yellow), "X","O", 
		'X', MovementItems.BMX_white, 'O', new ItemStack(Items.dye, 1, 11));

//Aventador
GameRegistry.addRecipe(new ItemStack(MovementItems.Aventador_white), "PPP", "OXO",
		'O', MovementItems.Wheel, 'P', Items.iron_ingot, 'X', MovementItems.Engine);
GameRegistry.addRecipe(new ItemStack(MovementItems.Aventador_blue), "X","O", 
		'X', MovementItems.Aventador_white, 'O', new ItemStack(Items.dye, 1, 4));
GameRegistry.addRecipe(new ItemStack(MovementItems.Aventador_green), "X","O", 
		'X', MovementItems.Aventador_white, 'O', new ItemStack(Items.dye, 1, 2));
GameRegistry.addRecipe(new ItemStack(MovementItems.Aventador_orange), "X","O", 
		'X', MovementItems.Aventador_white, 'O', new ItemStack(Items.dye, 1, 14));
GameRegistry.addRecipe(new ItemStack(MovementItems.Aventador_purple), "X","O", 
		'X', MovementItems.Aventador_white, 'O', new ItemStack(Items.dye, 1, 5));
GameRegistry.addRecipe(new ItemStack(MovementItems.Aventador_pink), "X","O", 
		'X', MovementItems.Aventador_white, 'O', new ItemStack(Items.dye, 1, 9));
GameRegistry.addRecipe(new ItemStack(MovementItems.Aventador_red), "X","O", 
		'X', MovementItems.Aventador_white, 'O', new ItemStack(Items.dye, 1, 1));
GameRegistry.addRecipe(new ItemStack(MovementItems.Aventador_yellow), "X","O", 
		'X', MovementItems.Aventador_white, 'O', new ItemStack(Items.dye, 1, 11));

//Hovercraft
GameRegistry.addRecipe(new ItemStack(MovementItems.Hovercraft_white), "PPX", "PPP",
		'P', Items.iron_ingot, 'X', MovementItems.Engine);
GameRegistry.addRecipe(new ItemStack(MovementItems.Hovercraft_blue), "X","O", 
		'X', MovementItems.Hovercraft_white, 'O', new ItemStack(Items.dye, 1, 4));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hovercraft_green), "X","O", 
		'X', MovementItems.Hovercraft_white, 'O', new ItemStack(Items.dye, 1, 2));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hovercraft_orange), "X","O", 
		'X', MovementItems.Hovercraft_white, 'O', new ItemStack(Items.dye, 1, 14));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hovercraft_purple), "X","O", 
		'X', MovementItems.Hovercraft_white, 'O', new ItemStack(Items.dye, 1, 5));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hovercraft_pink), "X","O", 
		'X', MovementItems.Hovercraft_white, 'O', new ItemStack(Items.dye, 1, 9));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hovercraft_red), "X","O", 
		'X', MovementItems.Hovercraft_white, 'O', new ItemStack(Items.dye, 1, 1));
GameRegistry.addRecipe(new ItemStack(MovementItems.Hovercraft_yellow), "X","O", 
		'X', MovementItems.Hovercraft_white, 'O', new ItemStack(Items.dye, 1, 11));

//Cargo Boat
GameRegistry.addRecipe(new ItemStack(MovementItems.CargoBoat),"XOX", "XXX",
		'O', Blocks.chest, 'X', Blocks.planks);
}}