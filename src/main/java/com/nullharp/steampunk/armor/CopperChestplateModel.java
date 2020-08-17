package com.nullharp.steampunk.armor;

// Made with Blockbench 3.6.5
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;

public class CopperChestplateModel extends BipedModel<LivingEntity> {
	public final ModelRenderer Body;
	public final ModelRenderer LeftArm;
	private final ModelRenderer Angle;
	public final ModelRenderer RightArm;
	private final ModelRenderer Angle2;

	public CopperChestplateModel(float size) {
		super(size);
		textureWidth = 128;
		textureHeight = 128;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-2.0F, 12.0F, 0.0F);
		Body.setTextureOffset(16, 16).addBox(-2.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.5F, false);
		Body.setTextureOffset(52, 9).addBox(-0.5F, -8.0F, -3.0F, 5.0F, 5.0F, 1.0F, -0.75F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(32, 48).addBox(-0.75F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.45F, false);

		Angle = new ModelRenderer(this);
		Angle.setRotationPoint(14.0F, -2.0F, 0.0F);
		LeftArm.addChild(Angle);
		setRotationAngle(Angle, 0.0F, 0.0F, -0.1745F);
		Angle.setTextureOffset(59, 10).addBox(-12.175F, -2.75F, -2.5F, 2.0F, 1.0F, 5.0F, -0.05F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(40, 16).addBox(-3.25F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.45F, false);

		Angle2 = new ModelRenderer(this);
		Angle2.setRotationPoint(-14.0F, -2.0F, 0.0F);
		RightArm.addChild(Angle2);
		setRotationAngle(Angle2, 0.0F, 0.0F, 0.1745F);
		Angle2.setTextureOffset(59, 10).addBox(10.175F, -2.75F, -2.5F, 2.0F, 1.0F, 5.0F, -0.05F, false);

		this.bipedBody.addChild(this.Body);
		this.bipedLeftArm.addChild(this.LeftArm);
		this.bipedRightArm.addChild(this.RightArm);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}