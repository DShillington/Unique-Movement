package com.uniquemovement.proxy;

import java.util.logging.Level;

import com.uniquemovement.events.DonatorEventHandler;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy
{
	
public void registerRenders(){}

public void register(){}

public void preInit(FMLPreInitializationEvent event){
	MinecraftForge.EVENT_BUS.register(new DonatorEventHandler());
}

public void registerNetworkStuff(){}

public void registerTileEntities(){}

public World getClientWorld(){
				return null;
			}

public EntityPlayer getClientPlayer(){
				return null;
			}

public boolean isSinglePlayer(){
				return false;
			}

public boolean isDedicatedServer(){
				return MinecraftServer.getServer().isDedicatedServer();
			}
    
public ModelBiped getArmorModelHalo(){
				return null;
				}
			
public ModelBiped getArmorModel(){
				return null;
				}

public ModelBiped getArmorModelWings() {
				
				return null;
			}
public void init(FMLInitializationEvent e)
{
	
}

public void postInit(FMLPostInitializationEvent e)
{

}
}