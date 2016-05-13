package com.uniquemovement.items;

import papertazer.items.ItemBase;

import com.google.common.base.Function;
import com.uniquemovement.UniqueMovementMod;
import com.uniquemovement.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MovementItems extends ItemBase{
	//Armor
	public static ArmorMaterial HelmetArmor = EnumHelper.addArmorMaterial("helmet", "hoverway:helmet", 30, new int[] {3, 8, 6, 3}, 20);
	//Misc Items
	public static Item Helmet;
	public static Item Plastic_Dust, Platic_Hard;
	public static Item Wheel;
	public static Item Engine;
	//Segway
	public static Item Segway_white, Segway_blue, Segway_green, 
	Segway_orange, Segway_pink, Segway_purple, 
	Segway_red, Segway_yellow;
	//Hoverboard
	public static Item Hoverboard_white, Hoverboard_blue, Hoverboard_green, 
	Hoverboard_orange, Hoverboard_pink, Hoverboard_purple, 
	Hoverboard_red, Hoverboard_yellow, Hoverboard_mcfly, Hoverboard_PopularMMO,
	 Hoverboard_SuperGirlyGamer;
	//Unicycle
	public static Item Unicycle_white, Unicycle_blue, Unicycle_green,
	Unicycle_orange, Unicycle_pink, Unicycle_purple,
	Unicycle_red, Unicycle_yellow;
	//Swegway
	public static Item Swegway_white, Swegway_blue, Swegway_green,
	Swegway_orange, Swegway_pink, Swegway_purple,
	Swegway_red, Swegway_yellow;
	//Tardis
	public static Item Tardis;
	//BMX
	public static Item BMX_white, BMX_blue, BMX_green,
	BMX_orange, BMX_pink, BMX_purple,
	BMX_red, BMX_yellow;
	//CargoBoat
	public static Item CargoBoat;
	//Aventador
	public static Item Aventador_white, Aventador_blue, Aventador_green,
	Aventador_orange, Aventador_pink, Aventador_purple,
	Aventador_red, Aventador_yellow;
	//Hovercraft
	public static Item Hovercraft_white, Hovercraft_blue, Hovercraft_green,
	Hovercraft_orange, Hovercraft_pink, Hovercraft_purple,
	Hovercraft_red, Hovercraft_yellow;
	
	public static void init()
	{
		//Misc Items
		Helmet = (new MaterialArmor("helmet", HelmetArmor, 1, 0).setUnlocalizedName("helmet")).setCreativeTab(UniqueMovementMod.MovementTab);
		Plastic_Dust = (new ItemBase().setUnlocalizedName("plastic_dust")).setCreativeTab(UniqueMovementMod.MovementTab);
		Platic_Hard = (new ItemBase().setUnlocalizedName("plastic_hard")).setCreativeTab(UniqueMovementMod.MovementTab);
		Wheel = (new ItemBase().setUnlocalizedName("wheel")).setCreativeTab(UniqueMovementMod.MovementTab);
		Engine = (new ItemBase().setUnlocalizedName("engine")).setCreativeTab(UniqueMovementMod.MovementTab);
		//Segway
		Segway_white = (new ItemSegway().setUnlocalizedName("segway_white")).setCreativeTab(UniqueMovementMod.MovementTab);
		Segway_blue = (new ItemSegway().setUnlocalizedName("segway_blue")).setCreativeTab(UniqueMovementMod.MovementTab);
		Segway_green = (new ItemSegway().setUnlocalizedName("segway_green")).setCreativeTab(UniqueMovementMod.MovementTab);
		Segway_orange = (new ItemSegway().setUnlocalizedName("segway_orange")).setCreativeTab(UniqueMovementMod.MovementTab);
		Segway_pink = (new ItemSegway().setUnlocalizedName("segway_pink")).setCreativeTab(UniqueMovementMod.MovementTab);
		Segway_purple = (new ItemSegway().setUnlocalizedName("segway_purple")).setCreativeTab(UniqueMovementMod.MovementTab);
		Segway_red = (new ItemSegway().setUnlocalizedName("segway_red")).setCreativeTab(UniqueMovementMod.MovementTab);
		Segway_yellow = (new ItemSegway().setUnlocalizedName("segway_yellow")).setCreativeTab(UniqueMovementMod.MovementTab);
		//Swegway
		Swegway_white = (new ItemSwegway().setUnlocalizedName("swegway_white")).setCreativeTab(UniqueMovementMod.MovementTab);
		Swegway_blue = (new ItemSwegway().setUnlocalizedName("swegway_blue")).setCreativeTab(UniqueMovementMod.MovementTab);
		Swegway_green = (new ItemSwegway().setUnlocalizedName("swegway_green")).setCreativeTab(UniqueMovementMod.MovementTab);
		Swegway_orange = (new ItemSwegway().setUnlocalizedName("swegway_orange")).setCreativeTab(UniqueMovementMod.MovementTab);
		Swegway_pink = (new ItemSwegway().setUnlocalizedName("swegway_pink")).setCreativeTab(UniqueMovementMod.MovementTab);
		Swegway_purple = (new ItemSwegway().setUnlocalizedName("swegway_purple")).setCreativeTab(UniqueMovementMod.MovementTab);
		Swegway_red = (new ItemSwegway().setUnlocalizedName("swegway_red")).setCreativeTab(UniqueMovementMod.MovementTab);
		Swegway_yellow = (new ItemSwegway().setUnlocalizedName("swegway_yellow")).setCreativeTab(UniqueMovementMod.MovementTab);
		//Hoverboard
		Hoverboard_white = (new ItemHoverboard().setUnlocalizedName("hoverboard_white")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hoverboard_blue = (new ItemHoverboard().setUnlocalizedName("hoverboard_blue")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hoverboard_green = (new ItemHoverboard().setUnlocalizedName("hoverboard_green")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hoverboard_orange = (new ItemHoverboard().setUnlocalizedName("hoverboard_orange")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hoverboard_pink = (new ItemHoverboard().setUnlocalizedName("hoverboard_pink")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hoverboard_purple = (new ItemHoverboard().setUnlocalizedName("hoverboard_purple")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hoverboard_red = (new ItemHoverboard().setUnlocalizedName("hoverboard_red")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hoverboard_yellow = (new ItemHoverboard().setUnlocalizedName("hoverboard_yellow")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hoverboard_mcfly = (new ItemHoverboard().setUnlocalizedName("hoverboard_mcfly")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hoverboard_SuperGirlyGamer = (new ItemHoverboard().setUnlocalizedName("hoverboard_supergirlygamer")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hoverboard_PopularMMO = (new ItemHoverboard().setUnlocalizedName("hoverboard_popularmmo")).setCreativeTab(UniqueMovementMod.MovementTab);
		//Unicycle
		Unicycle_white = (new ItemUnicycle().setUnlocalizedName("unicycle_white")).setCreativeTab(UniqueMovementMod.MovementTab);
		Unicycle_blue = (new ItemUnicycle().setUnlocalizedName("unicycle_blue")).setCreativeTab(UniqueMovementMod.MovementTab);
		Unicycle_green = (new ItemUnicycle().setUnlocalizedName("unicycle_green")).setCreativeTab(UniqueMovementMod.MovementTab);
		Unicycle_orange = (new ItemUnicycle().setUnlocalizedName("unicycle_orange")).setCreativeTab(UniqueMovementMod.MovementTab);
		Unicycle_pink = (new ItemUnicycle().setUnlocalizedName("unicycle_pink")).setCreativeTab(UniqueMovementMod.MovementTab);
		Unicycle_purple = (new ItemUnicycle().setUnlocalizedName("unicycle_purple")).setCreativeTab(UniqueMovementMod.MovementTab);
		Unicycle_red = (new ItemUnicycle().setUnlocalizedName("unicycle_red")).setCreativeTab(UniqueMovementMod.MovementTab);
		Unicycle_yellow = (new ItemUnicycle().setUnlocalizedName("unicycle_yellow")).setCreativeTab(UniqueMovementMod.MovementTab);
		//Tardis
		Tardis = (new ItemTardis().setUnlocalizedName("tardis")).setCreativeTab(UniqueMovementMod.MovementTab);
		//BMX
		BMX_white = (new ItemBMX().setUnlocalizedName("bmx_white")).setCreativeTab(UniqueMovementMod.MovementTab);
		BMX_blue = (new ItemBMX().setUnlocalizedName("bmx_blue")).setCreativeTab(UniqueMovementMod.MovementTab);
		BMX_green = (new ItemBMX().setUnlocalizedName("bmx_green")).setCreativeTab(UniqueMovementMod.MovementTab);
		BMX_orange = (new ItemBMX().setUnlocalizedName("bmx_orange")).setCreativeTab(UniqueMovementMod.MovementTab);
		BMX_pink = (new ItemBMX().setUnlocalizedName("bmx_pink")).setCreativeTab(UniqueMovementMod.MovementTab);
		BMX_purple = (new ItemBMX().setUnlocalizedName("bmx_purple")).setCreativeTab(UniqueMovementMod.MovementTab);
		BMX_red = (new ItemBMX().setUnlocalizedName("bmx_red")).setCreativeTab(UniqueMovementMod.MovementTab);
		BMX_yellow = (new ItemBMX().setUnlocalizedName("bmx_yellow")).setCreativeTab(UniqueMovementMod.MovementTab);
		//Cargo Boat
		CargoBoat = (new ItemCargoBoat().setUnlocalizedName("cargo_boat")).setCreativeTab(UniqueMovementMod.MovementTab);
		//Segway
		Aventador_white = (new ItemAventador().setUnlocalizedName("aventador_white")).setCreativeTab(UniqueMovementMod.MovementTab);
		Aventador_blue = (new ItemAventador().setUnlocalizedName("aventador_blue")).setCreativeTab(UniqueMovementMod.MovementTab);
		Aventador_green = (new ItemAventador().setUnlocalizedName("aventador_green")).setCreativeTab(UniqueMovementMod.MovementTab);
		Aventador_orange = (new ItemAventador().setUnlocalizedName("aventador_orange")).setCreativeTab(UniqueMovementMod.MovementTab);
		Aventador_pink = (new ItemAventador().setUnlocalizedName("aventador_pink")).setCreativeTab(UniqueMovementMod.MovementTab);
		Aventador_purple = (new ItemAventador().setUnlocalizedName("aventador_purple")).setCreativeTab(UniqueMovementMod.MovementTab);
		Aventador_red = (new ItemAventador().setUnlocalizedName("aventador_red")).setCreativeTab(UniqueMovementMod.MovementTab);
		Aventador_yellow = (new ItemAventador().setUnlocalizedName("aventador_yellow")).setCreativeTab(UniqueMovementMod.MovementTab);
		//Hovercraft
		Hovercraft_white = (new ItemHovercraft().setUnlocalizedName("hovercraft_white")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hovercraft_blue = (new ItemHovercraft().setUnlocalizedName("hovercraft_blue")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hovercraft_green = (new ItemHovercraft().setUnlocalizedName("hovercraft_green")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hovercraft_orange = (new ItemHovercraft().setUnlocalizedName("hovercraft_orange")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hovercraft_pink = (new ItemHovercraft().setUnlocalizedName("hovercraft_pink")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hovercraft_purple = (new ItemHovercraft().setUnlocalizedName("hovercraft_purple")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hovercraft_red = (new ItemHovercraft().setUnlocalizedName("hovercraft_red")).setCreativeTab(UniqueMovementMod.MovementTab);
		Hovercraft_yellow = (new ItemHovercraft().setUnlocalizedName("hovercraft_yellow")).setCreativeTab(UniqueMovementMod.MovementTab);
						
	}
	
	public static void register()
	{
		//Misc Items
		GameRegistry.registerItem(Helmet = new MaterialArmor("helmet", HelmetArmor, 1, 0), "helmet");
		GameRegistry.registerItem(Plastic_Dust, Plastic_Dust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Platic_Hard, Platic_Hard.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Wheel, Wheel.getUnlocalizedName().substring(5));	
		GameRegistry.registerItem(Engine, Engine.getUnlocalizedName().substring(5));	
		//Segway
		GameRegistry.registerItem(Segway_white, Segway_white.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Segway_blue, Segway_blue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Segway_green, Segway_green.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Segway_orange, Segway_orange.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Segway_pink, Segway_pink.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Segway_purple, Segway_purple.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Segway_red, Segway_red.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Segway_yellow, Segway_yellow.getUnlocalizedName().substring(5));
		//Swegway
		GameRegistry.registerItem(Swegway_white, Swegway_white.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Swegway_blue, Swegway_blue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Swegway_green, Swegway_green.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Swegway_orange, Swegway_orange.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Swegway_pink, Swegway_pink.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Swegway_purple, Swegway_purple.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Swegway_red, Swegway_red.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Swegway_yellow, Swegway_yellow.getUnlocalizedName().substring(5));
		//Hoverboard
		GameRegistry.registerItem(Hoverboard_white, Hoverboard_white.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hoverboard_blue, Hoverboard_blue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hoverboard_green, Hoverboard_green.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hoverboard_orange, Hoverboard_orange.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hoverboard_pink, Hoverboard_pink.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hoverboard_purple, Hoverboard_purple.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hoverboard_red, Hoverboard_red.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hoverboard_yellow, Hoverboard_yellow.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hoverboard_mcfly, Hoverboard_mcfly.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hoverboard_SuperGirlyGamer, Hoverboard_SuperGirlyGamer.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hoverboard_PopularMMO, Hoverboard_PopularMMO.getUnlocalizedName().substring(5));
		
		//Unicycle
		GameRegistry.registerItem(Unicycle_white, Unicycle_white.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Unicycle_blue, Unicycle_blue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Unicycle_green, Unicycle_green.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Unicycle_orange, Unicycle_orange.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Unicycle_pink, Unicycle_pink.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Unicycle_purple, Unicycle_purple.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Unicycle_red, Unicycle_red.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Unicycle_yellow, Unicycle_yellow.getUnlocalizedName().substring(5));
		//Tardis
		GameRegistry.registerItem(Tardis, Tardis.getUnlocalizedName().substring(5));
		//BMX
		GameRegistry.registerItem(BMX_white, BMX_white.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BMX_blue, BMX_blue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BMX_green, BMX_green.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BMX_orange, BMX_orange.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BMX_pink, BMX_pink.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BMX_purple, BMX_purple.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BMX_red, BMX_red.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(BMX_yellow, BMX_yellow.getUnlocalizedName().substring(5));
		//Cargo Boat
		GameRegistry.registerItem(CargoBoat, CargoBoat.getUnlocalizedName().substring(5));
		//LazyBoy
		GameRegistry.registerItem(Aventador_white, Aventador_white.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Aventador_blue, Aventador_blue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Aventador_green, Aventador_green.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Aventador_orange, Aventador_orange.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Aventador_pink, Aventador_pink.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Aventador_purple, Aventador_purple.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Aventador_red, Aventador_red.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Aventador_yellow, Aventador_yellow.getUnlocalizedName().substring(5));
		//Hovercraft
		GameRegistry.registerItem(Hovercraft_white, Hovercraft_white.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hovercraft_blue, Hovercraft_blue.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hovercraft_green, Hovercraft_green.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hovercraft_orange, Hovercraft_orange.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hovercraft_pink, Hovercraft_pink.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hovercraft_purple, Hovercraft_purple.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hovercraft_red, Hovercraft_red.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(Hovercraft_yellow, Hovercraft_yellow.getUnlocalizedName().substring(5));
	
	}

	public static void registerRenders()
	{
		//Misc Items
		registerRender(Helmet);
		registerRender(Plastic_Dust);	
		registerRender(Platic_Hard);	
		registerRender(Wheel);	
		registerRender(Engine);	
		//Segway
		registerRender(Segway_white);
		registerRender(Segway_blue);
		registerRender(Segway_green);
		registerRender(Segway_orange);
		registerRender(Segway_pink);
		registerRender(Segway_purple);
		registerRender(Segway_red);
		registerRender(Segway_yellow);
		//Swegway
		registerRender(Swegway_white);
		registerRender(Swegway_blue);
		registerRender(Swegway_green);
		registerRender(Swegway_orange);
		registerRender(Swegway_pink);
		registerRender(Swegway_purple);
		registerRender(Swegway_red);
		registerRender(Swegway_yellow);
		//Hoverboard
		registerRender(Hoverboard_white);
		registerRender(Hoverboard_blue);
		registerRender(Hoverboard_green);
		registerRender(Hoverboard_orange);
		registerRender(Hoverboard_pink);
		registerRender(Hoverboard_purple);
		registerRender(Hoverboard_red);
		registerRender(Hoverboard_yellow);
		registerRender(Hoverboard_mcfly);
		registerRender(Hoverboard_SuperGirlyGamer);
		registerRender(Hoverboard_PopularMMO);
		//Unicycle
		registerRender(Unicycle_white);
		registerRender(Unicycle_blue);
		registerRender(Unicycle_green);
		registerRender(Unicycle_orange);
		registerRender(Unicycle_pink);
		registerRender(Unicycle_purple);
		registerRender(Unicycle_red);
		registerRender(Unicycle_yellow);
		//Tardis
		registerRender(Tardis);
		//BMX
		registerRender(BMX_white);
		registerRender(BMX_blue);
		registerRender(BMX_green);
		registerRender(BMX_orange);
		registerRender(BMX_pink);
		registerRender(BMX_purple);
		registerRender(BMX_red);
		registerRender(BMX_yellow);
		//Cargo Boat
		registerRender(CargoBoat);
		//LazyBoy
		registerRender(Aventador_white);
		registerRender(Aventador_blue);
		registerRender(Aventador_green);
		registerRender(Aventador_orange);
		registerRender(Aventador_pink);
		registerRender(Aventador_purple);
		registerRender(Aventador_red);
		registerRender(Aventador_yellow);
		//Hovercraft
		registerRender(Hovercraft_white);
		registerRender(Hovercraft_blue);
		registerRender(Hovercraft_green);
		registerRender(Hovercraft_orange);
		registerRender(Hovercraft_pink);
		registerRender(Hovercraft_purple);
		registerRender(Hovercraft_red);
		registerRender(Hovercraft_yellow);
	}
	
	public static void registerRender(Item item)
	{
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		}
}
