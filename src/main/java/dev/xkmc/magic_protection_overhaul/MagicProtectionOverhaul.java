package dev.xkmc.magic_protection_overhaul;

import com.mojang.logging.LogUtils;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MagicProtectionOverhaul.MODID)
public class MagicProtectionOverhaul {
	// Define mod id in a common place for everything to reference
	public static final String MODID = "magic_protection_overhaul";
	// Directly reference a slf4j logger
	private static final Logger LOGGER = LogUtils.getLogger();

	public MagicProtectionOverhaul() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
	}

}
