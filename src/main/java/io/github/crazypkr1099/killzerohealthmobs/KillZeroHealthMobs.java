package io.github.crazypkr1099.killzerohealthmobs;


import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.crazypkr1099.killzerohealthmobs.EventListener;



public class KillZeroHealthMobs extends JavaPlugin {
	private Listener eventListener=new EventListener();
	public void onEnable() {
		// Registers ability to use Permission
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(this.eventListener, this);
	}
	
}
