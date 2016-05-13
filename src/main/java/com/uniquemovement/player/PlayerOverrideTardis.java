package com.uniquemovement.player;

import net.minecraft.client.renderer.GlStateManager;

import org.lwjgl.opengl.GL11;

import com.uniquemovement.entity.tardis.EntityTardis;

import api.player.model.ModelPlayerAPI;
import api.player.model.ModelPlayerBase;

public class PlayerOverrideTardis extends ModelPlayerBase
{
	public PlayerOverrideTardis(ModelPlayerAPI modelPlayerAPI)
	{
		super(modelPlayerAPI);
	}

	@Override
	public void afterSetRotationAngles(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, net.minecraft.entity.Entity paramEntity)
	{
		if (paramEntity.ridingEntity != null && 
		(paramEntity.ridingEntity instanceof EntityTardis))
		{
			//First Skin Layer
					this.modelPlayer.bipedLeftArm.rotateAngleZ = -0F;
					this.modelPlayer.bipedRightArm.rotateAngleZ = 0F;
					this.modelPlayer.bipedLeftArm.rotateAngleX = 0F;
					this.modelPlayer.bipedRightArm.rotateAngleX = 0F;
					this.modelPlayer.bipedLeftLeg.rotateAngleZ = -0.1F;
					this.modelPlayer.bipedRightLeg.rotateAngleZ = 0.1F;
					this.modelPlayer.bipedLeftLeg.rotateAngleY = 0.0F;
					this.modelPlayer.bipedRightLeg.rotateAngleY = 0.0F;
					this.modelPlayer.bipedLeftLeg.rotateAngleX = -0.0F;
					this.modelPlayer.bipedRightLeg.rotateAngleX = 0.0F;
					this.modelPlayer.bipedRightArm.setRotationPoint(-5F, 2.0F, 0.0F);
					this.modelPlayer.bipedLeftArm.setRotationPoint(5F, 2.0F, 0.0F);
					this.modelPlayer.bipedLeftLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
					this.modelPlayer.bipedRightLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
					//Second Skin Layer
					this.modelPlayer.bipedLeftArmwear.rotateAngleZ = -0F;
					this.modelPlayer.bipedRightArmwear.rotateAngleZ = 0F;
					this.modelPlayer.bipedLeftArmwear.rotateAngleX = 0F;
					this.modelPlayer.bipedRightArmwear.rotateAngleX = 0F;
					this.modelPlayer.bipedLeftLegwear.rotateAngleZ = -0.1F;
					this.modelPlayer.bipedRightLegwear.rotateAngleZ = 0.1F;
					this.modelPlayer.bipedLeftLegwear.rotateAngleY = 0.0F;
					this.modelPlayer.bipedRightLegwear.rotateAngleY = 0.0F;
					this.modelPlayer.bipedLeftLegwear.rotateAngleX = -0.0F;
					this.modelPlayer.bipedRightLegwear.rotateAngleX = 0.0F;
					this.modelPlayer.bipedRightArmwear.setRotationPoint(-5F, 2.0F, 0.0F);
					this.modelPlayer.bipedLeftArmwear.setRotationPoint(5F, 2.0F, 0.0F);
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