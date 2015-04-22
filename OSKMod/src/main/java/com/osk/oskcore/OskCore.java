package com.osk.oskcore;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by ArLE on 2015/04/22.
 */
@Mod(modid=OskCore.MODID,name = OskCore.NAME,version = OskCore.VERSION)
public class OskCore {
	public static final String MODID = "OskCore";
	public static final String NAME = "OSK Core";
	public static final String VERSION = "0.0.0";

	@Mod.Instance(OskCore.MODID)
	public static OskCore INSTANCE;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}