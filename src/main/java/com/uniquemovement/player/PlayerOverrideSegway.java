package com.uniquemovement.player;

import net.minecraft.client.renderer.GlStateManager;

import org.lwjgl.opengl.GL11;

import com.uniquemovement.entity.segway.EntitySegwayBlue;
import com.uniquemovement.entity.segway.EntitySegwayGreen;
import com.uniquemovement.entity.segway.EntitySegwayOrange;
import com.uniquemovement.entity.segway.EntitySegwayPink;
import com.uniquemovement.entity.segway.EntitySegwayPurple;
import com.uniquemovement.entity.segway.EntitySegwayRed;
import com.uniquemovement.entity.segway.EntitySegwayWhite;
import com.uniquemovement.entity.segway.EntitySegwayYellow;

import api.player.model.ModelPlayerAPI;
import api.player.model.ModelPlayerBase;

public class PlayerOverrideSegway extends ModelPlayerBase
{
	public PlayerOverrideSegway(ModelPlayerAPI modelPlayerAPI)
	{
		super(modelPlayerAPI);
	}

	@Override
	public void afterSetRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, net.minecraft.entity.Entity paramEntity)
	{
		if (paramEntity.ridingEntity != null && 
				
				(paramEntity.ridingEntity instanceof EntitySegwayWhite) || 
				(paramEntity.ridingEntity instanceof EntitySegwayBlue) || 
				(paramEntity.ridingEntity instanceof EntitySegwayGreen) || 
				(paramEntity.ridingEntity instanceof EntitySegwayYellow) || 
				(paramEntity.ridingEntity instanceof EntitySegwayOrange) || 
				(paramEntity.ridingEntity instanceof EntitySegwayPurple) || 
				(paramEntity.ridingEntity instanceof EntitySegwayPink) ||
				(paramEntity.ridingEntity instanceof EntitySegwayRed))
			{
			//First Skin Layer
			this.modelPlayer.bipedLeftArm.rotateAngleX = -1.2F;
			this.modelPlayer.bipedRightArm.rotateAngleX = -1.2F;
			this.modelPlayer.bipedLeftLeg.rotateAngleZ = -0.1F;
			this.modelPlayer.bipedRightLeg.rotateAngleZ = 0.1F;
			this.modelPlayer.bipedLeftLeg.rotateAngleY = 0.0F;
			this.modelPlayer.bipedRightLeg.rotateAngleY = 0.0F;
			this.modelPlayer.bipedLeftLeg.rotateAngleX = -0.0F;
			this.modelPlayer.bipedRightLeg.rotateAngleX = 0.0F;
			this.modelPlayer.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
			this.modelPlayer.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
			//Second Skin Layer
			this.modelPlayer.bipedLeftArmwear.rotateAngleX = -1.2F;
			this.modelPlayer.bipedRightArmwear.rotateAngleX = -1.2F;
			this.modelPlayer.bipedLeftLegwear.rotateAngleZ = -0.1F;
			this.modelPlayer.bipedRightLegwear.rotateAngleZ = 0.1F;
			this.modelPlayer.bipedLeftLegwear.rotateAngleY = 0.0F;
			this.modelPlayer.bipedRightLegwear.rotateAngleY = 0.0F;
			this.modelPlayer.bipedLeftLegwear.rotateAngleX = -0.0F;
			this.modelPlayer.bipedRightLegwear.rotateAngleX = 0.0F;
			this.modelPlayer.bipedLeftLegwear.setRotationPoint(1.9F, 12.0F, 0.0F);
			this.modelPlayer.bipedRightLegwear.setRotationPoint(-1.9F, 12.0F, 0.0F);
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