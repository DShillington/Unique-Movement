package com.uniquemovement.util;

import com.uniquemovement.UniqueMovementMod;
import com.uniquemovement.entity.bmx.*;
import com.uniquemovement.entity.cargoboat.*;
import com.uniquemovement.entity.hoverboard.*;
import com.uniquemovement.entity.hovercraft.*;
import com.uniquemovement.entity.aventador.*;
import com.uniquemovement.entity.segway.*;
import com.uniquemovement.entity.swegway.*;
import com.uniquemovement.entity.tardis.*;
import com.uniquemovement.entity.unicycle.*;
import com.uniquemovement.items.MovementItems;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class UniqueEntitiesRender {
	public static void loadEntities() {
		//Segway
		RenderingRegistry.registerEntityRenderingHandler(EntitySegwayWhite.class, new RenderSegwayWhite(Minecraft.getMinecraft().getRenderManager(), new ModelSegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySegwayBlue.class, new RenderSegwayBlue(Minecraft.getMinecraft().getRenderManager(), new ModelSegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySegwayGreen.class, new RenderSegwayGreen(Minecraft.getMinecraft().getRenderManager(), new ModelSegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySegwayPurple.class, new RenderSegwayPurple(Minecraft.getMinecraft().getRenderManager(), new ModelSegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySegwayPink.class, new RenderSegwayPink(Minecraft.getMinecraft().getRenderManager(), new ModelSegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySegwayRed.class, new RenderSegwayRed(Minecraft.getMinecraft().getRenderManager(), new ModelSegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySegwayOrange.class, new RenderSegwayOrange(Minecraft.getMinecraft().getRenderManager(), new ModelSegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySegwayYellow.class, new RenderSegwayYellow(Minecraft.getMinecraft().getRenderManager(), new ModelSegway(), 0.0F));
		//Swegway
		RenderingRegistry.registerEntityRenderingHandler(EntitySwegwayWhite.class, new RenderSwegwayWhite(Minecraft.getMinecraft().getRenderManager(), new ModelSwegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySwegwayBlue.class, new RenderSwegwayBlue(Minecraft.getMinecraft().getRenderManager(), new ModelSwegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySwegwayGreen.class, new RenderSwegwayGreen(Minecraft.getMinecraft().getRenderManager(), new ModelSwegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySwegwayPurple.class, new RenderSwegwayPurple(Minecraft.getMinecraft().getRenderManager(), new ModelSwegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySwegwayPink.class, new RenderSwegwayPink(Minecraft.getMinecraft().getRenderManager(), new ModelSwegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySwegwayRed.class, new RenderSwegwayRed(Minecraft.getMinecraft().getRenderManager(), new ModelSwegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySwegwayOrange.class, new RenderSwegwayOrange(Minecraft.getMinecraft().getRenderManager(), new ModelSwegway(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySwegwayYellow.class, new RenderSwegwayYellow(Minecraft.getMinecraft().getRenderManager(), new ModelSwegway(), 0.0F));
	    //Hoverboard
		RenderingRegistry.registerEntityRenderingHandler(EntityHoverboardMcFly.class, new RenderHoverboardMcFly(Minecraft.getMinecraft().getRenderManager(), new ModelHoverboard(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHoverboardWhite.class, new RenderHoverboardWhite(Minecraft.getMinecraft().getRenderManager(), new ModelHoverboard(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHoverboardBlue.class, new RenderHoverboardBlue(Minecraft.getMinecraft().getRenderManager(), new ModelHoverboard(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHoverboardGreen.class, new RenderHoverboardGreen(Minecraft.getMinecraft().getRenderManager(), new ModelHoverboard(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHoverboardPurple.class, new RenderHoverboardPurple(Minecraft.getMinecraft().getRenderManager(), new ModelHoverboard(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHoverboardPink.class, new RenderHoverboardPink(Minecraft.getMinecraft().getRenderManager(), new ModelHoverboard(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHoverboardRed.class, new RenderHoverboardRed(Minecraft.getMinecraft().getRenderManager(), new ModelHoverboard(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHoverboardOrange.class, new RenderHoverboardOrange(Minecraft.getMinecraft().getRenderManager(), new ModelHoverboard(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHoverboardYellow.class, new RenderHoverboardYellow(Minecraft.getMinecraft().getRenderManager(), new ModelHoverboard(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHoverboardSuperGirlyGamer.class, new RenderHoverboardSuperGirlyGamer(Minecraft.getMinecraft().getRenderManager(), new ModelHoverboard(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHoverboardPopularMMO.class, new RenderHoverboardPopularMMO(Minecraft.getMinecraft().getRenderManager(), new ModelHoverboard(), 0.0F));
		//Unicycle
		RenderingRegistry.registerEntityRenderingHandler(EntityUnicycleWhite.class, new RenderUnicycleWhite(Minecraft.getMinecraft().getRenderManager(), new ModelUnicycle(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityUnicycleBlue.class, new RenderUnicycleBlue(Minecraft.getMinecraft().getRenderManager(), new ModelUnicycle(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityUnicycleGreen.class, new RenderUnicycleGreen(Minecraft.getMinecraft().getRenderManager(), new ModelUnicycle(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityUnicyclePurple.class, new RenderUnicyclePurple(Minecraft.getMinecraft().getRenderManager(), new ModelUnicycle(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityUnicyclePink.class, new RenderUnicyclePink(Minecraft.getMinecraft().getRenderManager(), new ModelUnicycle(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityUnicycleRed.class, new RenderUnicycleRed(Minecraft.getMinecraft().getRenderManager(), new ModelUnicycle(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityUnicycleOrange.class, new RenderUnicycleOrange(Minecraft.getMinecraft().getRenderManager(), new ModelUnicycle(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityUnicycleYellow.class, new RenderUnicycleYellow(Minecraft.getMinecraft().getRenderManager(), new ModelUnicycle(), 0.0F));
		//Tardis
	    RenderingRegistry.registerEntityRenderingHandler(EntityTardis.class, new RenderTardis(Minecraft.getMinecraft().getRenderManager(), new ModelTardis(), 0.0F));
	    //Unicycle
		RenderingRegistry.registerEntityRenderingHandler(EntityBMXWhite.class, new RenderBMXWhite(Minecraft.getMinecraft().getRenderManager(), new ModelBMX(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBMXBlue.class, new RenderBMXBlue(Minecraft.getMinecraft().getRenderManager(), new ModelBMX(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBMXGreen.class, new RenderBMXGreen(Minecraft.getMinecraft().getRenderManager(), new ModelBMX(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBMXPurple.class, new RenderBMXPurple(Minecraft.getMinecraft().getRenderManager(), new ModelBMX(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBMXPink.class, new RenderBMXPink(Minecraft.getMinecraft().getRenderManager(), new ModelBMX(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBMXRed.class, new RenderBMXRed(Minecraft.getMinecraft().getRenderManager(), new ModelBMX(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBMXOrange.class, new RenderBMXOrange(Minecraft.getMinecraft().getRenderManager(), new ModelBMX(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBMXYellow.class, new RenderBMXYellow(Minecraft.getMinecraft().getRenderManager(), new ModelBMX(), 0.0F));
		//Cargo Boat
		RenderingRegistry.registerEntityRenderingHandler(EntityCargoBoat.class, new RenderCargoBoat(Minecraft.getMinecraft().getRenderManager(), new ModelCargoBoat(), 0.0F));
		//LazyBoy
		RenderingRegistry.registerEntityRenderingHandler(EntityAventadorWhite.class, new RenderAventadorWhite(Minecraft.getMinecraft().getRenderManager(), new ModelAventador(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAventadorBlue.class, new RenderAventadorBlue(Minecraft.getMinecraft().getRenderManager(), new ModelAventador(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAventadorGreen.class, new RenderAventadorGreen(Minecraft.getMinecraft().getRenderManager(), new ModelAventador(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAventadorPurple.class, new RenderAventadorPurple(Minecraft.getMinecraft().getRenderManager(), new ModelAventador(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAventadorPink.class, new RenderAventadorPink(Minecraft.getMinecraft().getRenderManager(), new ModelAventador(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAventadorRed.class, new RenderAventadorRed(Minecraft.getMinecraft().getRenderManager(), new ModelAventador(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAventadorOrange.class, new RenderAventadorOrange(Minecraft.getMinecraft().getRenderManager(), new ModelAventador(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAventadorYellow.class, new RenderAventadorYellow(Minecraft.getMinecraft().getRenderManager(), new ModelAventador(), 0.0F));
		//Hovercraft
		RenderingRegistry.registerEntityRenderingHandler(EntityHovercraftWhite.class, new RenderHovercraftWhite(Minecraft.getMinecraft().getRenderManager(), new ModelHovercraft(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHovercraftBlue.class, new RenderHovercraftBlue(Minecraft.getMinecraft().getRenderManager(), new ModelHovercraft(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHovercraftGreen.class, new RenderHovercraftGreen(Minecraft.getMinecraft().getRenderManager(), new ModelHovercraft(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHovercraftPurple.class, new RenderHovercraftPurple(Minecraft.getMinecraft().getRenderManager(), new ModelHovercraft(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHovercraftPink.class, new RenderHovercraftPink(Minecraft.getMinecraft().getRenderManager(), new ModelHovercraft(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHovercraftRed.class, new RenderHovercraftRed(Minecraft.getMinecraft().getRenderManager(), new ModelHovercraft(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHovercraftOrange.class, new RenderHovercraftOrange(Minecraft.getMinecraft().getRenderManager(), new ModelHovercraft(), 0.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityHovercraftYellow.class, new RenderHovercraftYellow(Minecraft.getMinecraft().getRenderManager(), new ModelHovercraft(), 0.0F));
		
	}
}