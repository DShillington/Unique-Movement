package com.uniquemovement.player;

import net.minecraft.client.renderer.GlStateManager;

import org.lwjgl.opengl.GL11;

import com.uniquemovement.entity.hoverboard.EntityHoverboardBlue;
import com.uniquemovement.entity.hoverboard.EntityHoverboardGreen;
import com.uniquemovement.entity.hoverboard.EntityHoverboardMcFly;
import com.uniquemovement.entity.hoverboard.EntityHoverboardOrange;
import com.uniquemovement.entity.hoverboard.EntityHoverboardPink;
import com.uniquemovement.entity.hoverboard.EntityHoverboardPopularMMO;
import com.uniquemovement.entity.hoverboard.EntityHoverboardPurple;
import com.uniquemovement.entity.hoverboard.EntityHoverboardRed;
import com.uniquemovement.entity.hoverboard.EntityHoverboardSuperGirlyGamer;
import com.uniquemovement.entity.hoverboard.EntityHoverboardWhite;
import com.uniquemovement.entity.hoverboard.EntityHoverboardYellow;


import api.player.model.ModelPlayerAPI;
import api.player.model.ModelPlayerBase;

public class PlayerOverrideHoverboard extends ModelPlayerBase
{
	public PlayerOverrideHoverboard(ModelPlayerAPI modelPlayerAPI)
	{
		super(modelPlayerAPI);
	}

	@Override
	public void afterSetRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, net.minecraft.entity.Entity paramEntity)
	{
		if (paramEntity.ridingEntity != null && 
			(paramEntity.ridingEntity instanceof EntityHoverboardMcFly) || 
			(paramEntity.ridingEntity instanceof EntityHoverboardBlue) || 
			(paramEntity.ridingEntity instanceof EntityHoverboardGreen) || 
			(paramEntity.ridingEntity instanceof EntityHoverboardYellow) || 
			(paramEntity.ridingEntity instanceof EntityHoverboardOrange) || 
			(paramEntity.ridingEntity instanceof EntityHoverboardRed) || 
			(paramEntity.ridingEntity instanceof EntityHoverboardPink) || 
			(paramEntity.ridingEntity instanceof EntityHoverboardPurple) || 
			(paramEntity.ridingEntity instanceof EntityHoverboardWhite) ||
			(paramEntity.ridingEntity instanceof EntityHoverboardPopularMMO) || 
			(paramEntity.ridingEntity instanceof EntityHoverboardSuperGirlyGamer))
		{
			//First Skin Layer
			this.modelPlayer.bipedLeftLeg.rotateAngleX = 0.5F;
			this.modelPlayer.bipedLeftLeg.rotateAngleY = -1.25F;
			this.modelPlayer.bipedLeftLeg.rotateAngleZ = -0.5F;
			this.modelPlayer.bipedLeftLeg.rotationPointZ = 1.8F;
			this.modelPlayer.bipedLeftLeg.rotationPointX = 0.6F;
			this.modelPlayer.bipedRightLeg.rotateAngleX = -0.5F;
			this.modelPlayer.bipedRightLeg.rotateAngleY = -1.25F;
			this.modelPlayer.bipedRightLeg.rotateAngleZ = 0.5F;
			
			this.modelPlayer.bipedBody.rotateAngleY = -1.25F;
			this.modelPlayer.bipedLeftArm.rotateAngleX = 0.5F;
			this.modelPlayer.bipedLeftArm.rotateAngleY = -1.25F;
			this.modelPlayer.bipedLeftArm.rotateAngleZ = -0.5F;
			this.modelPlayer.bipedLeftArm.rotationPointZ = 5F;
			this.modelPlayer.bipedLeftArm.rotationPointY = 2F;
			this.modelPlayer.bipedLeftArm.rotationPointX = 1.6F;
			this.modelPlayer.bipedRightArm.rotateAngleX = -0.5F;
			this.modelPlayer.bipedRightArm.rotateAngleY = -1.25F;
			this.modelPlayer.bipedRightArm.rotateAngleZ = 0.5F;
			this.modelPlayer.bipedRightArm.rotationPointZ = -5F;
			this.modelPlayer.bipedRightArm.rotationPointY = 2F;
			this.modelPlayer.bipedRightArm.rotationPointX = -1.6F;
			//Second Skin layer
			this.modelPlayer.bipedLeftLegwear.rotateAngleX = 0.5F;
			this.modelPlayer.bipedLeftLegwear.rotateAngleY = -1.25F;
			this.modelPlayer.bipedLeftLegwear.rotateAngleZ = -0.5F;
			this.modelPlayer.bipedLeftLegwear.rotationPointZ = 1.8F;
			this.modelPlayer.bipedLeftLegwear.rotationPointX = 0.6F;
			this.modelPlayer.bipedRightLegwear.rotateAngleX = -0.5F;
			this.modelPlayer.bipedRightLegwear.rotateAngleY = -1.25F;
			this.modelPlayer.bipedRightLegwear.rotateAngleZ = 0.5F;
			this.modelPlayer.bipedRightLegwear.rotationPointZ = -1.9F;
			this.modelPlayer.bipedRightLegwear.rotationPointX = -0.6F;
			this.modelPlayer.bipedBodyWear.rotateAngleY = -1.25F;
			this.modelPlayer.bipedLeftArmwear.rotateAngleX = 0.5F;
			this.modelPlayer.bipedLeftArmwear.rotateAngleY = -1.25F;
			this.modelPlayer.bipedLeftArmwear.rotateAngleZ = -0.5F;
			this.modelPlayer.bipedLeftArmwear.rotationPointZ = 5F;
			this.modelPlayer.bipedLeftArmwear.rotationPointY = 2F;
			this.modelPlayer.bipedLeftArmwear.rotationPointX = 1.6F;
			this.modelPlayer.bipedRightArmwear.rotateAngleX = -0.5F;
			this.modelPlayer.bipedRightArmwear.rotateAngleY = -1.25F;
			this.modelPlayer.bipedRightArmwear.rotateAngleZ = 0.5F;
			this.modelPlayer.bipedRightArmwear.rotationPointZ = -5F;
			this.modelPlayer.bipedRightArmwear.rotationPointY = 2F;
			this.modelPlayer.bipedRightArmwear.rotationPointX = -1.6F;
				}
		else
		{
			
		}
		
	}
}