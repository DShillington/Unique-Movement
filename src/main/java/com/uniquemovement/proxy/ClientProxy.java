package com.uniquemovement.proxy;

import com.uniquemovement.UniqueMovementMod;
import com.uniquemovement.items.MovementItems;
import com.uniquemovement.items.model.ModelHelmet;
import com.uniquemovement.player.PlayerOverrideBMX;
import com.uniquemovement.player.PlayerOverrideCargoBoat;
import com.uniquemovement.player.PlayerOverrideHoverboard;
import com.uniquemovement.player.PlayerOverrideSegway;
import com.uniquemovement.player.PlayerOverrideSwegway;
import com.uniquemovement.player.PlayerOverrideTardis;
import com.uniquemovement.player.PlayerOverrideUnicycle;
import com.uniquemovement.util.UniqueEntitiesRender;

import api.player.model.ModelPlayerAPI;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ClientProxy extends CommonProxy{
			
			public void register() {
		    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
				  renderItem.getItemModelMesher().register(MovementItems.Helmet, 0, new ModelResourceLocation(UniqueMovementMod.ASSET_PREFIX, "textures/models/armor/Helmet.png"));

			}
			
			public EntityPlayer getClientPlayer()
			{
				return Minecraft.getMinecraft().thePlayer;
			}
			public boolean isSinglePlayer()
			{
				return Minecraft.getMinecraft().isSingleplayer();
			}

			public boolean isDedicatedServer()
			{
				return false;
			}

			@SubscribeEvent
			public void onClientWorldLoad(WorldEvent.Load event)
			{
				
			}

			@SubscribeEvent
			public void onClientWorldUnload(WorldEvent.Unload event)
			{
				
			}


			@SubscribeEvent
			public void onPrePlayerRender(RenderPlayerEvent.Pre event)
			{
				
			}

			@SubscribeEvent
			public void onPostPlayerRender(RenderPlayerEvent.Post event)
			{
				
			}
			public void registerRenderThings()
			{
		    RenderManager renderManager = Minecraft.getMinecraft().getRenderManager();
			}
			public void registerRenders() 
			{
				MovementItems.registerRenders();
					}
			public void init(FMLInitializationEvent e)
		    {
				ModelPlayerAPI.register("HOVERBOARD", PlayerOverrideHoverboard.class);
				ModelPlayerAPI.register("CARGOBOAT", PlayerOverrideCargoBoat.class);
				ModelPlayerAPI.register("UNICYCLE", PlayerOverrideUnicycle.class);
				ModelPlayerAPI.register("SWEGWAY", PlayerOverrideSwegway.class);
				ModelPlayerAPI.register("SEGWAY", PlayerOverrideSegway.class);
				ModelPlayerAPI.register("TARDIS", PlayerOverrideTardis.class);
				ModelPlayerAPI.register("BMX", PlayerOverrideBMX.class);
				
			    UniqueEntitiesRender.loadEntities();
		    }
			public void postInit(FMLPostInitializationEvent e)
			    {
			    	super.postInit(e);
			    }
		}
