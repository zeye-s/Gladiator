// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class Warrior_helmet_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "warrior_helmet_model"), "main");
	private final ModelPart Helmet;

	public Warrior_helmet_model(ModelPart root) {
		this.Helmet = root.getChild("Helmet");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Helmet = partdefinition.addOrReplaceChild("Helmet", CubeListBuilder.create().texOffs(0, 27).addBox(-5.0F, -32.0F, -1.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(14, 27).addBox(4.0F, -32.0F, -1.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(28, 13).addBox(4.0F, -32.0F, -5.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(28, 21).addBox(-5.0F, -32.0F, -5.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition front_r1 = Helmet.addOrReplaceChild("front_r1", CubeListBuilder.create().texOffs(0, 20).addBox(-6.0F, -31.0F, -12.0F, 12.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -2.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition back_r1 = Helmet.addOrReplaceChild("back_r1", CubeListBuilder.create().texOffs(22, 0).addBox(-1.0F, -32.0F, -3.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 5.0F, 0.0F, -1.5708F, 0.0F));

		PartDefinition top_r1 = Helmet.addOrReplaceChild("top_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -34.0F, -5.0F, 1.0F, 10.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(29.0F, -33.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Helmet.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}