package dev.xkmc.magic_protection_overhaul;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MagicProtectionOverhaul.MODID)
public class MagicProtectionOverhaul {
	// Define mod id in a common place for everything to reference
	public static final String MODID = "magic_protection_overhaul";
	// Directly reference a slf4j logger
	private static final Logger LOGGER = LogUtils.getLogger();

	public MagicProtectionOverhaul() {
		ModConfig.init();
	}

}
