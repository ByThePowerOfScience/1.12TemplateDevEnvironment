// package TODO

import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogFactory;

@Mod(modid = ModId.MOD_ID, name = ModId.MOD_NAME, version = ModId.VERSION, dependencies = ModId.DEPENDENCIES)
public class ModId {
	public static final String MOD_ID = ""; // TODO
	public static final String MOD_NAME = ""; // TODO
	public static final String VERSION = "@VERSION@";
	
	// public static final String DEPENDENCIES = "";
	
	public static final Logger LOGGER = LogFactory.getLogger(MOD_NAME);
	
	/**
	 * This is the instance of your mod as created by Forge. It will never be null.
	 */
	@Mod.Instance(MOD_ID)
	public static ModId INSTANCE;
	
	// @SidedProxy(clientSide="", serverSide="")
	// public static CommonProxy proxy;
	
	/**
	 * This is the first initialization event. Register tile entities here.
	 * The registry events below will have fired prior to entry to this method.
	 */
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event) {}
  
	/**
	 * This is the second initialization event. Register custom recipes.
	 */
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {}
	
	/**
	 * This is the final initialization event. Register actions from other mods here
	 */
	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event) {}
	
//	@GameRegistry.ObjectHolder(MOD_ID)
//	public static class Blocks {
//      public static final Block resourcename = null;
//	}

	
	
	
	/**
	 * This is a special class that listens to registry events, to allow creation of mod blocks and items at the proper time.
	 */
	@Mod.EventBusSubscriber(modid=ModId.MOD_ID)
	public static class ObjectRegistryHandler {
		
		
	
//		@SubscribeEvent
//		public static void addBlocks(RegistryEvent.Register<Block> evt) {
//			ModBlocks.registerBlocks(evt.getRegistry());
//		}
//
//		@SubscribeEvent
//		public static void addItems(RegistryEvent.Register<Item> evt) {
//			ModBlocks.registerBlockItems(evt.getRegistry());
//			//ModItems.registerItems(evt.getRegistry());
//		}
	}
	
	
}
