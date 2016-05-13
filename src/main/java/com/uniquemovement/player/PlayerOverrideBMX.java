package com.uniquemovement.player;

import net.minecraft.client.renderer.GlStateManager;

import org.lwjgl.opengl.GL11;

import com.uniquemovement.entity.bmx.EntityBMXBlue;
import com.uniquemovement.entity.bmx.EntityBMXGreen;
import com.uniquemovement.entity.bmx.EntityBMXOrange;
import com.uniquemovement.entity.bmx.EntityBMXPink;
import com.uniquemovement.entity.bmx.EntityBMXPurple;
import com.uniquemovement.entity.bmx.EntityBMXRed;
import com.uniquemovement.entity.bmx.EntityBMXWhite;
import com.uniquemovement.entity.bmx.EntityBMXYellow;

import api.player.model.ModelPlayerAPI;
import api.player.model.ModelPlayerBase;

public class PlayerOverrideBMX extends ModelPlayerBase
{
	public PlayerOverrideBMX(ModelPlayerAPI modelPlayerAPI)
	{
		super(modelPlayerAPI);
	}

	@Override
	public void afterSetRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, net.minecraft.entity.Entity paramEntity)
	{
		if (paramEntity.ridingEntity != null && 
		(paramEntity.ridingEntity instanceof EntityBMXWhite) || 
		(paramEntity.ridingEntity instanceof EntityBMXBlue) || 
		(paramEntity.ridingEntity instanceof EntityBMXGreen) || 
		(paramEntity.ridingEntity instanceof EntityBMXOrange) || 
		(paramEntity.ridingEntity instanceof EntityBMXRed) || 
		(paramEntity.ridingEntity instanceof EntityBMXPurple) || 
		(paramEntity.ridingEntity instanceof EntityBMXPink) || 
		(paramEntity.ridingEntity instanceof EntityBMXYellow))
		{
			        //First Skin Layer
					this.modelPlayer.bipedLeftArm.rotateAngleX = -1.3F;
					this.modelPlayer.bipedRightArm.rotateAngleX = -1.3F;
					this.modelPlayer.bipedLeftLeg.rotateAngleZ = -0.3F;
					this.modelPlayer.bipedRightLeg.rotateAngleZ = 0.3F;
					this.modelPlayer.bipedLeftLeg.rotateAngleY = 0.0F;
					this.modelPlayer.bipedRightLeg.rotateAngleY = 0.0F;
					this.modelPlayer.bipedLeftLeg.rotateAngleX = -0.0F;
					this.modelPlayer.bipedRightLeg.rotateAngleX = 0.0F;
					this.modelPlayer.bipedRightArm.setRotationPoint(-5F, 2.0F, -1.0F);
					this.modelPlayer.bipedLeftArm.setRotationPoint(5F, 2.0F, -1.0F);
					this.modelPlayer.bipedLeftLeg.setRotationPoint(1.9F, 11.0F, 0.0F);
					this.modelPlayer.bipedRightLeg.setRotationPoint(-1.9F, 11.0F, 0.0F);
					this.modelPlayer.bipedBody.rotateAngleX = 0.1F;
					this.modelPlayer.bipedBody.setRotationPoint(0.0f, 0.0f, -1.0f);
					this.modelPlayer.bipedHead.setRotationPoint(0.0f, 0.0f, -1.0f);
					
					//Second Skin Layer
					this.modelPlayer.bipedBodyWear.rotateAngleX = 0.1F;
					this.modelPlayer.bipedBodyWear.setRotationPoint(0.0f, 0.0f, -1.0f);
					this.modelPlayer.bipedRightArmwear.setRotationPoint(-5F, 2.0F, -1.0F);
					this.modelPlayer.bipedLeftArmwear.setRotationPoint(5F, 2.0F, -1.0F);
					this.modelPlayer.bipedLeftArmwear.rotateAngleX = -1.3F;
					this.modelPlayer.bipedRightArmwear.rotateAngleX = -1.3F;
					this.modelPlayer.bipedLeftLegwear.setRotationPoint(1.9F, 11.0F, 0.0F);
					this.modelPlayer.bipedRightLegwear.setRotationPoint(-1.9F, 11.0F, 0.0F);
					this.modelPlayer.bipedLeftLegwear.rotateAngleZ = -0.3F;
					this.modelPlayer.bipedRightLegwear.rotateAngleZ = 0.3F;
					this.modelPlayer.bipedLeftLegwear.rotateAngleY = 0.0F;
					this.modelPlayer.bipedRightLegwear.rotateAngleY = 0.0F;
					this.modelPlayer.bipedLeftLegwear.rotateAngleX = -0.0F;
					this.modelPlayer.bipedRightLegwear.rotateAngleX = 0.0F;
					
				}
		else
		{
			this.modelPlayer.bipedLeftLeg.rotateAngleZ = 0F;
			this.modelPlayer.bipedRightLeg.rotateAngleZ = 0F;
			this.modelPlayer.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			this.modelPlayer.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		}
	}
}