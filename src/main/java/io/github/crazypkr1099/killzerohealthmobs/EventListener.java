package io.github.crazypkr1099.killzerohealthmobs;

import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EventListener implements Listener {
	@EventHandler
	public void monsterSpawn(EntityDamageEvent event){ // Method for checking entity damage
		if (event.getEntity() instanceof Monster){ // If entity is a monster
			Monster monster = (Monster) event.getEntity();
			if (monster.getHealth() == 0){ // If Monster is 0 health (Invincible)
				monster.remove(); // Remove it.
			}
		}
	}
}
