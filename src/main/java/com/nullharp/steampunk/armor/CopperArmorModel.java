package com.nullharp.steampunk.armor;


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CopperArmorModel extends EntityModel<Entity> {
	public final ModelRenderer RightLeg;
	public final ModelRenderer LeftLeg;
	public final ModelRenderer RightBoot;
	public final ModelRenderer LeftBoot;
	public final ModelRenderer Body;
	public final ModelRenderer Head;
	private final ModelRenderer Eye;
	private final ModelRenderer PipesR;
	private final ModelRenderer PipesL;
	private final ModelRenderer Gears;
	private final ModelRenderer Gear1;
	private final ModelRenderer GearsRot;
	private final ModelRenderer Gear2;
	private final ModelRenderer GearsRot2;
	public final ModelRenderer LeftArm;
	private final ModelRenderer Angle;
	public final ModelRenderer RightArm;
	private final ModelRenderer Angle2;

	public CopperArmorModel() {
		textureWidth = 128;
		textureHeight = 128;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 16).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.475F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(16, 48).addBox(2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.475F, false);

		RightBoot = new ModelRenderer(this);
		RightBoot.setTextureOffset(0, 32).addBox(-5.0F, 8.75F, -4.0F, 6.0F, 4.0F, 7.0F, -0.45F, false);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setTextureOffset(0, 32).addBox(-1.0F, 8.75F, -4.0F, 6.0F, 4.0F, 7.0F, -0.45F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-2.0F, 12.0F, 0.0F);
		Body.setTextureOffset(16, 16).addBox(-2.0F, -0.5F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.setTextureOffset(52, 9).addBox(-0.5F, 3.5F, -3.0F, 5.0F, 5.0F, 1.0F, -0.75F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.525F, false);
		Head.setTextureOffset(0, 0).addBox(1.75F, -5.625F, -4.75F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		Head.setTextureOffset(32, 6).addBox(-3.5F, -4.25F, -6.0F, 7.0F, 7.0F, 3.0F, -2.0F, false);
		Head.setTextureOffset(26, 32).addBox(-3.475F, -4.25F, -7.175F, 7.0F, 7.0F, 6.0F, -1.9F, false);

		Eye = new ModelRenderer(this);
		Eye.setRotationPoint(0.0F, -5.0F, 0.0F);
		Head.addChild(Eye);
		Eye.setTextureOffset(24, 0).addBox(-4.75F, -2.25F, -5.5F, 5.0F, 2.0F, 2.0F, -0.9F, false);
		Eye.setTextureOffset(24, 0).addBox(-4.375F, -2.625F, -5.55F, 2.0F, 5.0F, 2.0F, -0.9F, false);
		Eye.setTextureOffset(24, 0).addBox(-4.75F, 0.0F, -5.5F, 5.0F, 2.0F, 2.0F, -0.9F, false);
		Eye.setTextureOffset(24, 0).addBox(-2.125F, -2.625F, -5.55F, 2.0F, 5.0F, 2.0F, -0.9F, false);
		Eye.setTextureOffset(24, 0).addBox(-0.25F, -2.25F, -5.5F, 5.0F, 2.0F, 2.0F, -0.9F, false);
		Eye.setTextureOffset(24, 0).addBox(0.125F, -2.625F, -5.55F, 2.0F, 5.0F, 2.0F, -0.9F, false);
		Eye.setTextureOffset(24, 0).addBox(-0.25F, 0.0F, -5.5F, 5.0F, 2.0F, 2.0F, -0.9F, false);
		Eye.setTextureOffset(24, 0).addBox(2.375F, -2.625F, -5.55F, 2.0F, 5.0F, 2.0F, -0.9F, false);

		PipesR = new ModelRenderer(this);
		PipesR.setRotationPoint(-2.75F, -2.25F, 0.5F);
		Head.addChild(PipesR);
		setRotationAngle(PipesR, 0.1745F, -0.0873F, 0.1309F);
		PipesR.setTextureOffset(24, 2).addBox(-3.0F, -1.0F, -6.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		PipesR.setTextureOffset(24, 0).addBox(-3.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F, -0.25F, false);
		PipesR.setTextureOffset(24, 0).addBox(-3.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);
		PipesR.setTextureOffset(24, 2).addBox(-1.0F, -1.0F, -6.0F, 1.0F, 1.0F, 2.0F, -0.25F, false);

		PipesL = new ModelRenderer(this);
		PipesL.setRotationPoint(2.75F, -2.25F, 0.5F);
		Head.addChild(PipesL);
		setRotationAngle(PipesL, 0.1745F, 0.0873F, -0.1309F);
		PipesL.setTextureOffset(24, 2).addBox(0.0F, -1.0F, -6.0F, 1.0F, 1.0F, 2.0F, -0.25F, false);
		PipesL.setTextureOffset(24, 2).addBox(0.0F, -1.0F, -6.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		PipesL.setTextureOffset(24, 0).addBox(2.5F, -1.0F, -6.0F, 1.0F, 1.0F, 6.0F, -0.25F, false);
		PipesL.setTextureOffset(24, 0).addBox(1.5F, -1.0F, -1.0F, 2.0F, 1.0F, 1.0F, -0.25F, false);

		Gears = new ModelRenderer(this);
		Gears.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(Gears);
		

		Gear1 = new ModelRenderer(this);
		Gear1.setRotationPoint(1.25F, -5.25F, 0.0F);
		Gears.addChild(Gear1);
		Gear1.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(0.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		Gear1.setTextureOffset(24, 1).addBox(-1.5F, 0.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);

		GearsRot = new ModelRenderer(this);
		GearsRot.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gear1.addChild(GearsRot);
		setRotationAngle(GearsRot, 0.0F, 0.0F, 0.7854F);
		GearsRot.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		GearsRot.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);

		Gear2 = new ModelRenderer(this);
		Gear2.setRotationPoint(-1.5F, -2.5F, 0.0F);
		Gears.addChild(Gear2);
		setRotationAngle(Gear2, 0.0F, 0.0F, 0.3927F);
		Gear2.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(0.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(-1.5F, -1.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		Gear2.setTextureOffset(24, 1).addBox(-1.5F, 0.5F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);

		GearsRot2 = new ModelRenderer(this);
		GearsRot2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gear2.addChild(GearsRot2);
		setRotationAngle(GearsRot2, 0.0F, 0.0F, 0.7854F);
		GearsRot2.setTextureOffset(24, 1).addBox(-0.5F, -2.5F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		GearsRot2.setTextureOffset(24, 1).addBox(-2.5F, -0.5F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-9.75F, 0.0F, 0.0F);
		LeftArm.setTextureOffset(32, 48).addBox(9.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.45F, false);

		Angle = new ModelRenderer(this);
		Angle.setRotationPoint(11.0F, -2.0F, 0.0F);
		LeftArm.addChild(Angle);
		setRotationAngle(Angle, 0.0F, 0.0F, -0.1745F);
		Angle.setTextureOffset(59, 10).addBox(0.25F, -0.425F, -2.5F, 2.0F, 1.0F, 5.0F, -0.05F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(9.75F, 0.0F, 0.0F);
		RightArm.setTextureOffset(40, 16).addBox(-13.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.45F, false);

		Angle2 = new ModelRenderer(this);
		Angle2.setRotationPoint(-9.0F, -2.0F, 0.0F);
		RightArm.addChild(Angle2);
		setRotationAngle(Angle2, 0.0F, 0.0F, 0.1745F);
		Angle2.setTextureOffset(59, 10).addBox(-4.25F, -0.075F, -2.5F, 2.0F, 1.0F, 5.0F, -0.05F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}