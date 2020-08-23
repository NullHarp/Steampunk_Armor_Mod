package com.nullharp.steampunk.armor;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class IronArmorModel extends EntityModel<Entity> {
	public final ModelRenderer RightLeg;
	public final ModelRenderer LeftLeg;
	public final ModelRenderer RightBoot;
	public final ModelRenderer LeftBoot;
	public final ModelRenderer Body;
	private final ModelRenderer AngledPlate;
	private final ModelRenderer AngledPlate2;
	private final ModelRenderer Gear3;
	private final ModelRenderer GearsRot3;
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
	private final ModelRenderer AngleBack;
	private final ModelRenderer AngleBack2;
	public final ModelRenderer RightArm;
	private final ModelRenderer Angle2;
	private final ModelRenderer AngleBack3;
	private final ModelRenderer AngleBack4;

	public IronArmorModel() {
		textureWidth = 128;
		textureHeight = 128;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(0, 16).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.475F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-6.0F, 0.0F, -2.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-6.0F, 6.0F, -2.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		RightLeg.setTextureOffset(9, 39).addBox(-5.5F, 3.5F, -2.625F, 3.0F, 2.0F, 1.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-2.375F, 6.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-6.0F, 0.0F, 1.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-6.0F, 6.0F, 1.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-2.375F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-6.625F, 6.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);
		RightLeg.setTextureOffset(63, 14).addBox(-6.625F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(16, 48).addBox(2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.475F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(2.0F, 0.0F, -2.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(2.0F, 6.0F, -2.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		LeftLeg.setTextureOffset(9, 39).addBox(2.5F, 3.5F, -2.625F, 3.0F, 2.0F, 1.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(2.0F, 0.0F, 1.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(2.0F, 6.0F, 1.625F, 4.0F, 3.0F, 1.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(5.625F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(1.4F, 6.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(1.4F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);
		LeftLeg.setTextureOffset(63, 14).addBox(5.625F, 6.0F, -2.0F, 1.0F, 3.0F, 4.0F, -0.05F, false);

		RightBoot = new ModelRenderer(this);
		RightBoot.setTextureOffset(0, 32).addBox(-5.0F, 8.75F, -4.0F, 6.0F, 4.0F, 7.0F, -0.45F, false);

		LeftBoot = new ModelRenderer(this);
		LeftBoot.setTextureOffset(0, 32).addBox(-1.0F, 8.75F, -4.0F, 6.0F, 4.0F, 7.0F, -0.45F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-2.0F, 12.0F, 0.0F);
		Body.setTextureOffset(52, 9).addBox(-0.5F, 3.5F, -3.0F, 5.0F, 5.0F, 1.0F, -0.75F, false);
		Body.setTextureOffset(16, 16).addBox(-2.0F, -0.5F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.setTextureOffset(63, 14).addBox(-2.25F, 5.5F, -2.625F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(63, 14).addBox(4.25F, 5.5F, -2.625F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(59, 15).addBox(-2.0F, 1.5F, 1.625F, 8.0F, 10.0F, 1.0F, 0.0F, false);

		AngledPlate = new ModelRenderer(this);
		AngledPlate.setRotationPoint(0.0F, 0.0F, -3.0F);
		Body.addChild(AngledPlate);
		setRotationAngle(AngledPlate, 0.0F, 0.0F, 0.0873F);
		AngledPlate.setTextureOffset(63, 14).addBox(-1.9973F, 1.4562F, 0.375F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		AngledPlate.setTextureOffset(63, 14).addBox(3.2091F, 8.2081F, 0.375F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		AngledPlate2 = new ModelRenderer(this);
		AngledPlate2.setRotationPoint(4.0F, 0.0F, -3.0F);
		Body.addChild(AngledPlate2);
		setRotationAngle(AngledPlate2, 0.0F, 0.0F, -0.0873F);
		AngledPlate2.setTextureOffset(63, 14).addBox(-2.0027F, 1.4562F, 0.375F, 4.0F, 4.0F, 1.0F, 0.0F, false);
		AngledPlate2.setTextureOffset(63, 14).addBox(-7.2091F, 8.2081F, 0.375F, 4.0F, 3.0F, 1.0F, 0.0F, false);

		Gear3 = new ModelRenderer(this);
		Gear3.setRotationPoint(2.0F, -5.25F, -2.0F);
		Body.addChild(Gear3);
		Gear3.setTextureOffset(24, 1).addBox(-2.5F, 11.0F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);
		Gear3.setTextureOffset(24, 1).addBox(0.5F, 10.0F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear3.setTextureOffset(24, 1).addBox(-1.5F, 10.0F, 4.0F, 1.0F, 3.0F, 1.0F, -0.25F, false);
		Gear3.setTextureOffset(24, 1).addBox(-0.5F, 9.0F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		Gear3.setTextureOffset(24, 1).addBox(-1.5F, 10.0F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);
		Gear3.setTextureOffset(24, 1).addBox(-1.5F, 12.0F, 4.0F, 3.0F, 1.0F, 1.0F, -0.25F, false);

		GearsRot3 = new ModelRenderer(this);
		GearsRot3.setRotationPoint(0.0F, 0.0F, 0.0F);
		Gear3.addChild(GearsRot3);
		setRotationAngle(GearsRot3, 0.0F, 0.0F, 0.7854F);
		GearsRot3.setTextureOffset(24, 1).addBox(7.6317F, 5.6317F, 4.0F, 1.0F, 5.0F, 1.0F, -0.25F, false);
		GearsRot3.setTextureOffset(24, 1).addBox(5.6317F, 7.6317F, 4.0F, 5.0F, 1.0F, 1.0F, -0.25F, false);

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
		Angle.setTextureOffset(59, 10).addBox(0.25F, -0.425F, -2.5F, 2.0F, 1.0F, 5.0F, -0.025F, false);
		Angle.setTextureOffset(60, 10).addBox(1.3863F, 0.5071F, -2.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		Angle.setTextureOffset(60, 10).addBox(0.8653F, 3.4615F, -2.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		AngleBack = new ModelRenderer(this);
		AngleBack.setRotationPoint(11.0F, -2.0F, 0.0F);
		LeftArm.addChild(AngleBack);
		setRotationAngle(AngleBack, -0.1745F, 0.0F, 0.0F);
		AngleBack.setTextureOffset(63, 14).addBox(-2.5F, 0.5071F, -2.3863F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		AngleBack.setTextureOffset(63, 14).addBox(-2.5F, 3.4615F, -1.8653F, 5.0F, 3.0F, 1.0F, 0.0F, false);

		AngleBack2 = new ModelRenderer(this);
		AngleBack2.setRotationPoint(11.0F, -2.0F, 0.0F);
		LeftArm.addChild(AngleBack2);
		setRotationAngle(AngleBack2, 0.1745F, 0.0F, 0.0F);
		AngleBack2.setTextureOffset(63, 14).addBox(-2.5F, 0.5071F, 1.3863F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		AngleBack2.setTextureOffset(63, 14).addBox(-2.5F, 3.4615F, 0.8653F, 5.0F, 3.0F, 1.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(9.75F, 0.0F, 0.0F);
		RightArm.setTextureOffset(40, 16).addBox(-13.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.45F, false);

		Angle2 = new ModelRenderer(this);
		Angle2.setRotationPoint(-9.0F, -2.0F, 0.0F);
		RightArm.addChild(Angle2);
		setRotationAngle(Angle2, 0.0F, 0.0F, 0.1745F);
		Angle2.setTextureOffset(59, 10).addBox(-4.25F, -0.075F, -2.5F, 2.0F, 1.0F, 5.0F, -0.025F, false);
		Angle2.setTextureOffset(60, 10).addBox(-4.3863F, 0.8571F, -2.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);
		Angle2.setTextureOffset(60, 10).addBox(-3.8653F, 3.7865F, -2.5F, 1.0F, 3.0F, 5.0F, 0.0F, false);

		AngleBack3 = new ModelRenderer(this);
		AngleBack3.setRotationPoint(-8.5F, -2.0F, 0.0F);
		RightArm.addChild(AngleBack3);
		setRotationAngle(AngleBack3, -0.1745F, 0.0F, 0.0F);
		AngleBack3.setTextureOffset(63, 14).addBox(-5.0F, 3.4615F, -1.8653F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		AngleBack3.setTextureOffset(63, 14).addBox(-5.0F, 0.5071F, -2.3863F, 5.0F, 3.0F, 1.0F, 0.0F, false);

		AngleBack4 = new ModelRenderer(this);
		AngleBack4.setRotationPoint(-8.5F, -2.675F, 3.7F);
		RightArm.addChild(AngleBack4);
		setRotationAngle(AngleBack4, 0.1745F, 0.0F, 0.0F);
		AngleBack4.setTextureOffset(63, 14).addBox(-5.0F, 3.4848F, -2.8849F, 5.0F, 3.0F, 1.0F, 0.0F, false);
		AngleBack4.setTextureOffset(63, 14).addBox(-5.0F, 0.5071F, -2.3863F, 5.0F, 3.0F, 1.0F, 0.0F, false);
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