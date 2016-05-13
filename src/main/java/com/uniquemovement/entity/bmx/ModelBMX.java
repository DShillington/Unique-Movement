package com.uniquemovement.entity.bmx;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBMX extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer WheelFront;
    ModelRenderer WheelBack;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer Shape19;
    ModelRenderer Shape20;
    ModelRenderer Shape21;
    ModelRenderer Shape22;
    ModelRenderer Shape23;
    ModelRenderer Shape24;
    ModelRenderer Shape25;
    ModelRenderer Shape26;
    ModelRenderer Shape27;
  
  public ModelBMX()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Shape1 = new ModelRenderer(this, 0, 32);
      Shape1.addBox(0F, 0F, 0F, 1, 1, 12);
      Shape1.setRotationPoint(-0.5F, 10F, -10F);
      Shape1.setTextureSize(64, 64);
      Shape1.mirror = true;
      setRotation(Shape1, -0.1745329F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 0, 50);
      Shape2.addBox(0F, 0F, 0F, 1, 3, 1);
      Shape2.setRotationPoint(-0.5F, 9.8F, -10.9F);
      Shape2.setTextureSize(64, 64);
      Shape2.mirror = true;
      setRotation(Shape2, -0.1745329F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 14, 30);
      Shape3.addBox(0F, 0F, 0F, 1, 1, 13);
      Shape3.setRotationPoint(-0.5F, 11.5F, -10.8F);
      Shape3.setTextureSize(64, 64);
      Shape3.mirror = true;
      setRotation(Shape3, -0.4848711F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 36);
      Shape4.addBox(0F, 0F, 0F, 1, 7, 1);
      Shape4.setRotationPoint(-0.5F, 11F, 1.5F);
      Shape4.setTextureSize(64, 64);
      Shape4.mirror = true;
      setRotation(Shape4, -0.1745329F, 0F, 0F);
      WheelFront = new ModelRenderer(this, 0, 46);
      WheelFront.addBox(0F, -4.5F, -4.5F, 1, 9, 9);
      WheelFront.setRotationPoint(-0.5F, 19.5F, -12.5F);
      WheelFront.setTextureSize(64, 64);
      WheelFront.mirror = true;
      setRotation(WheelFront, 0F, 0F, 0F);
      WheelBack = new ModelRenderer(this, 0, 46);
      WheelBack.addBox(0F, -4.5F, -4.5F, 1, 9, 9);
      WheelBack.setRotationPoint(-0.5F, 19.5F, 8.5F);
      WheelBack.setTextureSize(64, 64);
      WheelBack.mirror = true;
      setRotation(WheelBack, 0F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 0, 29);
      Shape7.addBox(0F, 0F, 0F, 9, 1, 1);
      Shape7.setRotationPoint(-4.5F, 19F, -13F);
      Shape7.setTextureSize(64, 64);
      Shape7.mirror = true;
      setRotation(Shape7, 0F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 0, 26);
      Shape8.addBox(0F, 0F, 0F, 9, 1, 1);
      Shape8.setRotationPoint(-4.4F, 19F, 8F);
      Shape8.setTextureSize(64, 64);
      Shape8.mirror = true;
      setRotation(Shape8, 0F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 0, 15);
      Shape9.addBox(0F, 0F, 0F, 1, 1, 9);
      Shape9.setRotationPoint(-1F, 17.5F, 0F);
      Shape9.setTextureSize(64, 64);
      Shape9.mirror = true;
      setRotation(Shape9, -0.1745329F, -0.1396263F, 0F);
      Shape10 = new ModelRenderer(this, 29, 33);
      Shape10.addBox(0F, 0F, 0F, 1, 1, 9);
      Shape10.setRotationPoint(0F, 17.5F, 0F);
      Shape10.setTextureSize(64, 64);
      Shape10.mirror = true;
      setRotation(Shape10, -0.1745329F, 0.1396263F, 0F);
      Shape11 = new ModelRenderer(this, 11, 13);
      Shape11.addBox(-1F, 0F, 0F, 1, 1, 10);
      Shape11.setRotationPoint(0F, 12F, 2F);
      Shape11.setTextureSize(64, 64);
      Shape11.mirror = true;
      setRotation(Shape11, -0.8028515F, -0.1396263F, 0.0349066F);
      Shape12 = new ModelRenderer(this, 23, 12);
      Shape12.addBox(0F, 0F, 0F, 1, 1, 10);
      Shape12.setRotationPoint(0F, 12F, 2F);
      Shape12.setTextureSize(64, 64);
      Shape12.mirror = true;
      setRotation(Shape12, -0.8028515F, 0.1396263F, -0.0349066F);
      Shape13 = new ModelRenderer(this, 0, 20);
      Shape13.addBox(0F, 0F, 0F, 2, 2, 2);
      Shape13.setRotationPoint(-1F, 17F, -1F);
      Shape13.setTextureSize(64, 64);
      Shape13.mirror = true;
      setRotation(Shape13, 0F, 0F, 0F);
      Shape14 = new ModelRenderer(this, 0, 13);
      Shape14.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape14.setRotationPoint(-2F, 12.7F, -11.4F);
      Shape14.setTextureSize(64, 64);
      Shape14.mirror = true;
      setRotation(Shape14, -0.1745329F, 0F, 0F);
      Shape15 = new ModelRenderer(this, 6, 36);
      Shape15.addBox(0F, 0F, 0F, 1, 6, 1);
      Shape15.setRotationPoint(-2F, 13.6F, -11.56F);
      Shape15.setTextureSize(64, 64);
      Shape15.mirror = true;
      setRotation(Shape15, -0.1745329F, 0F, 0F);
      Shape16 = new ModelRenderer(this, 13, 47);
      Shape16.addBox(0F, 0F, 0F, 1, 6, 1);
      Shape16.setRotationPoint(1F, 13.6F, -11.6F);
      Shape16.setTextureSize(64, 64);
      Shape16.mirror = true;
      setRotation(Shape16, -0.1745329F, 0F, 0F);
      Shape17 = new ModelRenderer(this, 20, 58);
      Shape17.addBox(0F, 0F, 0F, 2, 1, 5);
      Shape17.setRotationPoint(-1F, 10.2F, -1F);
      Shape17.setTextureSize(64, 64);
      Shape17.mirror = true;
      setRotation(Shape17, 0F, 0F, 0F);
      Shape18 = new ModelRenderer(this, 0, 16);
      Shape18.addBox(0F, 0F, 0F, 1, 1, 2);
      Shape18.setRotationPoint(-0.5F, 8.6F, -11.8F);
      Shape18.setTextureSize(64, 64);
      Shape18.mirror = true;
      setRotation(Shape18, -0.1745329F, 0F, 0F);
      Shape19 = new ModelRenderer(this, 0, 33);
      Shape19.addBox(0F, 0F, 0F, 4, 1, 1);
      Shape19.setRotationPoint(-2F, 8.5F, -12F);
      Shape19.setTextureSize(64, 64);
      Shape19.mirror = true;
      setRotation(Shape19, -0.1745329F, 0F, 0F);
      Shape20 = new ModelRenderer(this, 12, 15);
      Shape20.addBox(0F, 0F, 0F, 1, 7, 1);
      Shape20.setRotationPoint(-3.7F, 2F, -10.8F);
      Shape20.setTextureSize(64, 64);
      Shape20.mirror = true;
      setRotation(Shape20, -0.1745329F, 0F, -0.2617994F);
      Shape21 = new ModelRenderer(this, 15, 32);
      Shape21.addBox(-1F, 0F, 0F, 1, 7, 1);
      Shape21.setRotationPoint(3.7F, 2F, -10.8F);
      Shape21.setTextureSize(64, 64);
      Shape21.mirror = true;
      setRotation(Shape21, -0.1745329F, 0F, 0.2617994F);
      Shape22 = new ModelRenderer(this, 0, 10);
      Shape22.addBox(0F, 0F, 0F, 6, 1, 1);
      Shape22.setRotationPoint(-3F, 3F, -11F);
      Shape22.setTextureSize(64, 64);
      Shape22.mirror = true;
      setRotation(Shape22, -0.1745329F, 0F, 0F);
      Shape23 = new ModelRenderer(this, 0, 7);
      Shape23.addBox(0F, 0F, 0F, 5, 1, 1);
      Shape23.setRotationPoint(-7.8F, 1.8F, -10.9F);
      Shape23.setTextureSize(64, 64);
      Shape23.mirror = true;
      setRotation(Shape23, 0F, 0F, 0F);
      Shape24 = new ModelRenderer(this, 0, 4);
      Shape24.addBox(0F, 0F, 0F, 5, 1, 1);
      Shape24.setRotationPoint(2.8F, 1.8F, -10.9F);
      Shape24.setTextureSize(64, 64);
      Shape24.mirror = true;
      setRotation(Shape24, 0F, 0F, 0F);
      Shape25 = new ModelRenderer(this, 0, 0);
      Shape25.addBox(0F, 0F, 0F, 6, 1, 1);
      Shape25.setRotationPoint(-3F, 18F, -0.5F);
      Shape25.setTextureSize(64, 64);
      Shape25.mirror = true;
      setRotation(Shape25, 0F, 0F, 0F);
      Shape26 = new ModelRenderer(this, 15, 0);
      Shape26.addBox(0F, 0F, 0F, 2, 1, 3);
      Shape26.setRotationPoint(3F, 18F, -1.5F);
      Shape26.setTextureSize(64, 64);
      Shape26.mirror = true;
      setRotation(Shape26, 0F, 0F, 0F);
      Shape27 = new ModelRenderer(this, 15, 5);
      Shape27.addBox(0F, 0F, 0F, 2, 1, 3);
      Shape27.setRotationPoint(-5F, 18F, -1.5F);
      Shape27.setTextureSize(64, 64);
      Shape27.mirror = true;
      setRotation(Shape27, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    WheelFront.render(f5);
    WheelBack.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
    Shape15.render(f5);
    Shape16.render(f5);
    Shape17.render(f5);
    Shape18.render(f5);
    Shape19.render(f5);
    Shape20.render(f5);
    Shape21.render(f5);
    Shape22.render(f5);
    Shape23.render(f5);
    Shape24.render(f5);
    Shape25.render(f5);
    Shape26.render(f5);
    Shape27.render(f5);
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
    this.WheelFront.rotateAngleX = degToRad(f * 20f);
    this.WheelBack.rotateAngleX = degToRad(f * 20f);
  }

}
