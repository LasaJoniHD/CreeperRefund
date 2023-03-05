package joni.creeper.refund;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class CreeperRefund extends JavaPlugin implements Listener, CommandExecutor {

	@Override
	public void onEnable() {
		System.out.println("Thanks for using CreeperRefund!");
		Bukkit.getPluginManager().registerEvents(this, this);
	}

	@EventHandler(priority = EventPriority.HIGH)
	public void onEntityExplode(EntityExplodeEvent e) {
		if (e.getEntityType() != EntityType.CREEPER) {
			return;
		}
		e.setYield(100);
	}

}
