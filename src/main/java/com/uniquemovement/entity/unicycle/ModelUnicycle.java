package com.uniquemovement.entity.unicycle;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelUnicycle extends ModelBase
{
  //fields
    ModelRenderer Wheel;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape1;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
  
  public ModelUnicycle()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Wheel = new ModelRenderer(this, 0, 0);
      Wheel.addBox(0F, -4F, -4F, 1, 8, 8);
      Wheel.setRotationPoint(-0.5F, 20F, 0F);
      Wheel.setTextureSize(64, 32);
      Wheel.mirror = true;
      setRotation(Wheel, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 16, 30);
      Shape2.addBox(0F, 0F, 0F, 11, 1, 1);
      Shape2.setRotationPoint(-5.5F, 19.5F, -0.5F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 4, 18);
      Shape3.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape3.setRotationPoint(-2.5F, 15.5F, -0.5F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 18);
      Shape4.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape4.setRotationPoint(1.5F, 15.5F, -0.5F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 22);
      Shape1.addBox(0F, 0F, 0F, 5, 1, 1);
      Shape1.setRotationPoint(-2.5F, 14.5F, -0.5F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 24);
      Shape5.addBox(0F, 0F, 0F, 1, 5, 1);
      Shape5.setRotationPoint(-0.5F, 9.5F, -0.5F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 0, 24);
      Shape6.addBox(0F, 0F, 0F, 2, 2, 6);
      Shape6.setRotationPoint(-1F, 7.5F, -3F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 28, 25);
      Shape7.addBox(0F, 0F, 0F, 2, 1, 4);
      Shape7.setRotationPoint(-7.5F, 19.5F, -2F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 16, 25);
      Shape8.addBox(0F, 0F, 0F, 2, 1, 4);
      Shape8.setRotationPoint(5.5F, 19.5F, -2F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 8, 16);
      Shape9.addBox(0F, 0F, 0F, 1, 3, 3);
      Shape9.setRotationPoint(-2.5F, 18.5F, -1.5F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 0F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 16, 16);
      Shape10.addBox(0F, 0F, 0F, 1, 3, 3);
      Shape10.setRotationPoint(1.5F, 18.5F, -1.5F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Wheel.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape1.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
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
    this.Wheel.rotateAngleX = degToRad(f * 20f);
  }

}
