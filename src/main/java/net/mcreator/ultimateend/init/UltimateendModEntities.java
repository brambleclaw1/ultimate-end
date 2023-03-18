
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.ultimateend.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.ultimateend.entity.Entity303Entity;
import net.mcreator.ultimateend.entity.EnderiteBowEntity;
import net.mcreator.ultimateend.UltimateendMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class UltimateendModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, UltimateendMod.MODID);
	public static final RegistryObject<EntityType<Entity303Entity>> ENTITY_303 = register("entity_303", EntityType.Builder.<Entity303Entity>of(Entity303Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
			.setUpdateInterval(3).setCustomClientFactory(Entity303Entity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnderiteBowEntity>> ENDERITE_BOW = register("projectile_enderite_bow",
			EntityType.Builder.<EnderiteBowEntity>of(EnderiteBowEntity::new, MobCategory.MISC).setCustomClientFactory(EnderiteBowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Entity303Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ENTITY_303.get(), Entity303Entity.createAttributes().build());
	}
}
