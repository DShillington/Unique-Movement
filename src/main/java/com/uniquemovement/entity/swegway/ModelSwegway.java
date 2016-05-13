package com.uniquemovement.entity.swegway;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelSwegway extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3Wheel;
    ModelRenderer Shape4Wheel;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
  
  public ModelSwegway()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 46, 12);
      Shape1.addBox(0F, 0F, 0F, 1, 4, 6);
      Shape1.setRotationPoint(6F, 18F, -3F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 46, 0);
      Shape2.addBox(0F, 0F, 0F, 1, 4, 6);
      Shape2.setRotationPoint(-7F, 18F, -3F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3Wheel = new ModelRenderer(this, 23, 6);
      Shape3Wheel.addBox(0F, -2.5F, -2.5F, 1, 5, 5);
      Shape3Wheel.setRotationPoint(7F, 21.5F, 0F);
      Shape3Wheel.setTextureSize(64, 32);
      Shape3Wheel.mirror = true;
      setRotation(Shape3Wheel, 0F, 0F, 0F);
      Shape4Wheel = new ModelRenderer(this, 23, 6);
      Shape4Wheel.addBox(0F, -2.5F, -2.5F, 1, 5, 5);
      Shape4Wheel.setRotationPoint(-8F, 21.5F, 0F);
      Shape4Wheel.setTextureSize(64, 32);
      Shape4Wheel.mirror = true;
      setRotation(Shape4Wheel, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 10);
      Shape5.addBox(0F, 0F, 0F, 5, 1, 6);
      Shape5.setRotationPoint(-6F, 21F, -3F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 3);
      Shape6.addBox(0F, 0F, 0F, 5, 1, 6);
      Shape6.setRotationPoint(1F, 21F, -3F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(0F, 0F, 0F, 2, 1, 2);
      Shape7.setRotationPoint(-1F, 21F, -1F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3Wheel.render(f5);
    Shape4Wheel.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  protected float degToRad(float degrees)
  {
      return degrees * (float)Math.PI / 180 ;
  }
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Shape3Wheel.rotateAngleX = degToRad(f * 20f);
    this.Shape4Wheel.rotateAngleX = degToRad(f * 20f);
  }

}
