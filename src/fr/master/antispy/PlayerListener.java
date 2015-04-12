package fr.master.antispy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class PlayerListener implements Listener{
	
	@EventHandler
	public void antispy(PlayerCommandPreprocessEvent e1){
		Player p = e1.getPlayer();
		Player op = (Player) Bukkit.getServer().getOperators();
		
		if(!p.isOp()){
			if(e1.getMessage().equalsIgnoreCase("/?") || e1.getMessage().equalsIgnoreCase("/pl") || e1.getMessage().equalsIgnoreCase("/plugin") || e1.getMessage().equalsIgnoreCase("/plugins") || e1.getMessage().equalsIgnoreCase("/bukkit:help")){
				e1.setCancelled(true);
				p.sendMessage(ChatColor.DARK_BLUE+"[AntiSpy]You doesn't have the permissions to view our plugin");
				op.sendMessage(ChatColor.DARK_RED+"[AntiSpy]"+p.getPlayer()+" tried to look your plugins");
			}
		}
	}

}
