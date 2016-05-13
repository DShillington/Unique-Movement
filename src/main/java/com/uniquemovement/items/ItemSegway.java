package com.uniquemovement.items;

import java.util.List;

import com.uniquemovement.entity.bmx.EntityBMXBlue;
import com.uniquemovement.entity.bmx.EntityBMXGreen;
import com.uniquemovement.entity.bmx.EntityBMXOrange;
import com.uniquemovement.entity.bmx.EntityBMXPink;
import com.uniquemovement.entity.bmx.EntityBMXPurple;
import com.uniquemovement.entity.bmx.EntityBMXRed;
import com.uniquemovement.entity.bmx.EntityBMXWhite;
import com.uniquemovement.entity.bmx.EntityBMXYellow;
import com.uniquemovement.entity.hovercraft.EntityHovercraftBlue;
import com.uniquemovement.entity.hovercraft.EntityHovercraftGreen;
import com.uniquemovement.entity.hovercraft.EntityHovercraftOrange;
import com.uniquemovement.entity.hovercraft.EntityHovercraftPink;
import com.uniquemovement.entity.hovercraft.EntityHovercraftPurple;
import com.uniquemovement.entity.hovercraft.EntityHovercraftRed;
import com.uniquemovement.entity.hovercraft.EntityHovercraftWhite;
import com.uniquemovement.entity.hovercraft.EntityHovercraftYellow;
import com.uniquemovement.entity.segway.EntitySegwayBlue;
import com.uniquemovement.entity.segway.EntitySegwayGreen;
import com.uniquemovement.entity.segway.EntitySegwayOrange;
import com.uniquemovement.entity.segway.EntitySegwayPink;
import com.uniquemovement.entity.segway.EntitySegwayPurple;
import com.uniquemovement.entity.segway.EntitySegwayRed;
import com.uniquemovement.entity.segway.EntitySegwayWhite;
import com.uniquemovement.entity.segway.EntitySegwayYellow;

import papertazer.items.ItemBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemWritableBook;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSegway extends ItemBase{
	public ItemSegway()
	{
		super();
	}

	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,EntityPlayer par3EntityPlayer) 
	{
		float f = 1.0F;
		float f1 = par3EntityPlayer.prevRotationPitch + (par3EntityPlayer.rotationPitch - par3EntityPlayer.prevRotationPitch) * f;
		float f2 = par3EntityPlayer.prevRotationYaw + (par3EntityPlayer.rotationYaw - par3EntityPlayer.prevRotationYaw) * f;
		double d0 = par3EntityPlayer.prevPosX + (par3EntityPlayer.posX - par3EntityPlayer.prevPosX) * (double)f;
		double d1 = par3EntityPlayer.prevPosY + (par3EntityPlayer.posY - par3EntityPlayer.prevPosY) * (double)f; // Entity.yOffset doesn't exist any more
		double d2 = par3EntityPlayer.prevPosZ + (par3EntityPlayer.posZ - par3EntityPlayer.prevPosZ) * (double)f;
		Vec3 vec3 = new Vec3(d0, d1, d2); // Use Vec3 constructor instead of Vec3.createVectorHelper
		float f3 = MathHelper.cos(-f2 * 0.017453292F - (float)Math.PI);
		float f4 = MathHelper.sin(-f2 * 0.017453292F - (float)Math.PI);
		float f5 = -MathHelper.cos(-f1 * 0.017453292F);
		float f6 = MathHelper.sin(-f1 * 0.017453292F);
		float f7 = f4 * f5;
		float f8 = f3 * f5;
		double d3 = 5.0D;
		Vec3 vec31 = vec3.addVector((double)f7 * d3, (double)f6 * d3, (double)f8 * d3);
		MovingObjectPosition movingobjectposition = par2World.rayTraceBlocks(vec3, vec31, true);
 
		if (movingobjectposition == null)
		{
			return par1ItemStack;
		}
		else
		{
			Vec3 vec32 = par3EntityPlayer.getLook(f);
			boolean flag = false;
			float f9 = 1.0F;
			List list = par2World.getEntitiesWithinAABBExcludingEntity(par3EntityPlayer, par3EntityPlayer.getEntityBoundingBox().addCoord(vec32.xCoord * d3, vec32.yCoord * d3, vec32.zCoord * d3).expand((double)f9, (double)f9, (double)f9)); // Use entity.getEntityBoundingBox() instead of entity.boundingBox
			int i;
 
			for (i = 0; i < list.size(); ++i)
			{
				Entity entity = (Entity)list.get(i);
 
				if (entity.canBeCollidedWith())
				{
					float f10 = entity.getCollisionBorderSize();
					AxisAlignedBB axisalignedbb = entity.getEntityBoundingBox().expand((double) f10, (double) f10, (double) f10);
 
					if (axisalignedbb.isVecInside(vec3))
					{
						flag = true;
					}
				}
			}
 
			if (flag)
			{
				return par1ItemStack;
			}
			else
			{
				if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
				{
					BlockPos blockPos = movingobjectposition.getBlockPos(); // Use blockPos instead of coordinate variables
 
					if (par2World.getBlockState(blockPos).getBlock() == Blocks.snow) // Use world.getBlockState().getBlock() instead of world.getBlock()
					{
						blockPos = blockPos.down(1); // Use blockPos.down(1) instead of subtracting 1 from y coordinate
					}
					 if(par3EntityPlayer.getCurrentEquippedItem() != null)
				      {
				         
				         ItemStack hand = par3EntityPlayer.getCurrentEquippedItem();
				         
				         if(hand.getItem() == MovementItems.Segway_blue){
				        	 EntitySegwayBlue entity3 = new EntitySegwayBlue(par2World);
							 entity3.rotationYaw = (float)(((MathHelper.floor_double((double)(par3EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90);
							 entity3.setPosition(blockPos.getX(), blockPos.getY() + 2, blockPos.getZ());
			                 if (!par2World.getCollidingBoundingBoxes(entity3, entity3.getEntityBoundingBox().expand(-0.1D, -0.1D, -0.1D)).isEmpty()){return par1ItemStack;}
			                 if (!par2World.isRemote){par2World.spawnEntityInWorld(entity3);}
			                 if (!par3EntityPlayer.capabilities.isCreativeMode){--par1ItemStack.stackSize;} }
				        
				         if(hand.getItem() == MovementItems.Segway_green){
				        	 EntitySegwayGreen entity3 = new EntitySegwayGreen(par2World);
							 entity3.rotationYaw = (float)(((MathHelper.floor_double((double)(par3EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90);
							 entity3.setPosition(blockPos.getX(), blockPos.getY() + 2, blockPos.getZ());
			                 if (!par2World.getCollidingBoundingBoxes(entity3, entity3.getEntityBoundingBox().expand(-0.1D, -0.1D, -0.1D)).isEmpty()){return par1ItemStack;}
			                 if (!par2World.isRemote){par2World.spawnEntityInWorld(entity3);}
			                 if (!par3EntityPlayer.capabilities.isCreativeMode){--par1ItemStack.stackSize;} }
				         
				         if(hand.getItem() == MovementItems.Segway_orange){
				        	 EntitySegwayOrange entity3 = new EntitySegwayOrange(par2World);
							 entity3.rotationYaw = (float)(((MathHelper.floor_double((double)(par3EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90);
							 entity3.setPosition(blockPos.getX(), blockPos.getY() + 2, blockPos.getZ());
			                 if (!par2World.getCollidingBoundingBoxes(entity3, entity3.getEntityBoundingBox().expand(-0.1D, -0.1D, -0.1D)).isEmpty()){return par1ItemStack;}
			                 if (!par2World.isRemote){par2World.spawnEntityInWorld(entity3);}
			                 if (!par3EntityPlayer.capabilities.isCreativeMode){--par1ItemStack.stackSize;} }
				         
				         if(hand.getItem() == MovementItems.Segway_pink){
				        	 EntitySegwayPink entity3 = new EntitySegwayPink(par2World);
							 entity3.rotationYaw = (float)(((MathHelper.floor_double((double)(par3EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90);
							 entity3.setPosition(blockPos.getX(), blockPos.getY() + 2, blockPos.getZ());
			                 if (!par2World.getCollidingBoundingBoxes(entity3, entity3.getEntityBoundingBox().expand(-0.1D, -0.1D, -0.1D)).isEmpty()){return par1ItemStack;}
			                 if (!par2World.isRemote){par2World.spawnEntityInWorld(entity3);}
			                 if (!par3EntityPlayer.capabilities.isCreativeMode){--par1ItemStack.stackSize;} }
				         
				         if(hand.getItem() == MovementItems.Segway_purple){
				        	 EntitySegwayPurple entity3 = new EntitySegwayPurple(par2World);
							 entity3.rotationYaw = (float)(((MathHelper.floor_double((double)(par3EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90);
							 entity3.setPosition(blockPos.getX(), blockPos.getY() + 2, blockPos.getZ());
			                 if (!par2World.getCollidingBoundingBoxes(entity3, entity3.getEntityBoundingBox().expand(-0.1D, -0.1D, -0.1D)).isEmpty()){return par1ItemStack;}
			                 if (!par2World.isRemote){par2World.spawnEntityInWorld(entity3);}
			                 if (!par3EntityPlayer.capabilities.isCreativeMode){--par1ItemStack.stackSize;} }
				         
				         if(hand.getItem() == MovementItems.Segway_red){
				        	 EntitySegwayRed entity3 = new EntitySegwayRed(par2World);
							 entity3.rotationYaw = (float)(((MathHelper.floor_double((double)(par3EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90);
							 entity3.setPosition(blockPos.getX(), blockPos.getY() + 2, blockPos.getZ());
			                 if (!par2World.getCollidingBoundingBoxes(entity3, entity3.getEntityBoundingBox().expand(-0.1D, -0.1D, -0.1D)).isEmpty()){return par1ItemStack;}
			                 if (!par2World.isRemote){par2World.spawnEntityInWorld(entity3);}
			                 if (!par3EntityPlayer.capabilities.isCreativeMode){--par1ItemStack.stackSize;} }
				         
				         if(hand.getItem() == MovementItems.Segway_white){
				        	 EntitySegwayWhite entity3 = new EntitySegwayWhite(par2World);
							 entity3.rotationYaw = (float)(((MathHelper.floor_double((double)(par3EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90);
							 entity3.setPosition(blockPos.getX(), blockPos.getY() + 2, blockPos.getZ());
			                 if (!par2World.getCollidingBoundingBoxes(entity3, entity3.getEntityBoundingBox().expand(-0.1D, -0.1D, -0.1D)).isEmpty()){return par1ItemStack;}
			                 if (!par2World.isRemote){par2World.spawnEntityInWorld(entity3);}
			                 if (!par3EntityPlayer.capabilities.isCreativeMode){--par1ItemStack.stackSize;} }
				         
				         if(hand.getItem() == MovementItems.Segway_yellow){
				        	 EntitySegwayYellow entity3 = new EntitySegwayYellow(par2World);
							 entity3.rotationYaw = (float)(((MathHelper.floor_double((double)(par3EntityPlayer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90);
							 entity3.setPosition(blockPos.getX(), blockPos.getY() + 2, blockPos.getZ());
			                 if (!par2World.getCollidingBoundingBoxes(entity3, entity3.getEntityBoundingBox().expand(-0.1D, -0.1D, -0.1D)).isEmpty()){return par1ItemStack;}
			                 if (!par2World.isRemote){par2World.spawnEntityInWorld(entity3);}
			                 if (!par3EntityPlayer.capabilities.isCreativeMode){--par1ItemStack.stackSize;} }
				      
				      
				      }
				return par1ItemStack;
			}
		}
	}
		return par1ItemStack;
	
}
}
