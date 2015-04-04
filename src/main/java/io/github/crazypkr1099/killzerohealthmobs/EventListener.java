package io.github.crazypkr1099.killzerohealthmobs;

import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EventListener implements Listener {
	@EventHandler
	public void monsterSpawn(EntityDamageEvent event){
		if (event.getEntity() instanceof Monster){
			Monster monster = (Monster) event.getEntity();
			if (monster.getHealth() == 0){
				monster.remove();
			}
		}
	}
}
