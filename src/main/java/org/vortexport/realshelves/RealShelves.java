package org.vortexport.realshelves;

import java.util.logging.Logger;

import org.bukkit.event.Event.Priority;
import org.bukkit.event.Event.Type;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class RealShelves extends JavaPlugin {

	Logger log = Logger.getLogger("Minecraft");

	RealShelvesPlayerListener pl = new RealShelvesPlayerListener(this);

	@Override
	public void onEnable()
	{

		log.info("RealShelves has been enabled!");

        PluginManager pm = this.getServer().getPluginManager();

        pm.registerEvent(Type.PLAYER_INTERACT, pl, Priority.Normal, this);
	}

	@Override
	public void onDisable()
	{

		log.info("RealShelves has been disabled.");

	}

}