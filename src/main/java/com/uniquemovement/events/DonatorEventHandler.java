package com.uniquemovement.events;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.UUID;

import com.mojang.authlib.GameProfile;
import com.uniquemovement.UniqueMovementMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.launchwrapper.LogWrapper;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class DonatorEventHandler {
	
 @SubscribeEvent
 public void onPlayerLogin(PlayerLoggedInEvent e) {
  EntityPlayer player = (EntityPlayer) e.player;
   if (!player.worldObj.isRemote) {
     player.addChatMessage(new ChatComponentText(
       EnumChatFormatting.AQUA
         + "Thanks for using Unique Movement, " +  EnumChatFormatting.WHITE + player.getName() +  EnumChatFormatting.AQUA + "!!"));
    }
   }
  }
