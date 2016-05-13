package com.uniquemovement.items.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHelmet extends ModelBiped
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
  
    public ModelHelmet(float f)
    {
  	    super(f, 0, 64,32);
  	  textureWidth = 64;
      textureHeight = 32;
      
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(0F, 0F, 0F, 9, 3, 9);
      Shape1.setRotationPoint(-4.5F, -9F, -4.5F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 12);
      Shape3.addBox(0F, 0F, 0F, 9, 4, 1);
      Shape3.setRotationPoint(-4.5F, -6F, -3F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0.8597554F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 17);
      Shape4.addBox(0F, 0F, 0F, 9, 9, 1);
      Shape4.setRotationPoint(-4.5F, -7F, 2F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, -0.6822275F, 0F, 0F);
      
      this.bipedHead.addChild(Shape1);
      this.bipedHead.addChild(Shape3);
      this.bipedHead.addChild(Shape4);
  }
  
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
      super.render(entity, f, f1, f2, f3, f4, f5);
      setRotationAngles(f, f1, f2, f3, f4, f5, entity);

    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
    }

  }
