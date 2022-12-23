
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.arcmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.arcmod.item.PulseCannonItem;
import net.mcreator.arcmod.ArcModMod;

public class ArcModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ArcModMod.MODID);
	public static final RegistryObject<Item> PULSE_CANNON = REGISTRY.register("pulse_cannon", () -> new PulseCannonItem());
}
