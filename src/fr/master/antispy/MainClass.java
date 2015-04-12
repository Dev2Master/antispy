package fr.master.antispy;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin implements Listener{
	
	
	public void onEnable(){
		saveDefaultConfig();
		Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
		Bukkit.getPluginManager().registerEvents(this, this);
		
	}
	
	@EventHandler
	public void pcp(PlayerCommandPreprocessEvent e2){
		Player p = e2.getPlayer();
		
		if(!p.isOp()){
			if(e2.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command1"))){
				e2.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	
	@EventHandler
	public void pcp2(PlayerCommandPreprocessEvent e3){
		Player p = e3.getPlayer();
		
		if(!p.isOp()){
			if(e3.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command2"))){
				e3.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	
	@EventHandler
	public void pcp3(PlayerCommandPreprocessEvent e3){
		Player p = e3.getPlayer();
		
		if(!p.isOp()){
			if(e3.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command3"))){
				e3.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	
	@EventHandler
	public void pcp4(PlayerCommandPreprocessEvent e4){
		Player p = e4.getPlayer();
		
		if(!p.isOp()){
			if(e4.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command4"))){
				e4.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	
	@EventHandler
	public void pcp5(PlayerCommandPreprocessEvent e5){
		Player p = e5.getPlayer();
		
		if(!p.isOp()){
			if(e5.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command5"))){
				e5.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	
	@EventHandler
	public void pcp6(PlayerCommandPreprocessEvent e6){
		Player p = e6.getPlayer();
		
		if(!p.isOp()){
			if(e6.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command6"))){
				e6.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	@EventHandler
	public void pcp7(PlayerCommandPreprocessEvent e7){
		Player p = e7.getPlayer();
		
		if(!p.isOp()){
			if(e7.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command7"))){
				e7.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	
	@EventHandler
	public void pcp8(PlayerCommandPreprocessEvent e8){
		Player p = e8.getPlayer();
		
		if(!p.isOp()){
			if(e8.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command8"))){
				e8.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	@EventHandler
	public void pcp9(PlayerCommandPreprocessEvent e9){
		Player p = e9.getPlayer();
		
		if(!p.isOp()){
			if(e9.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command9"))){
				e9.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	@EventHandler
	public void pcp10(PlayerCommandPreprocessEvent e10){
		Player p = e10.getPlayer();
		
		if(!p.isOp()){
			if(e10.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command10"))){
				e10.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	@EventHandler
	public void pcp11(PlayerCommandPreprocessEvent e11){
		Player p = e11.getPlayer();
		
		if(!p.isOp()){
			if(e11.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command11"))){
				e11.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	@EventHandler
	public void pcp12(PlayerCommandPreprocessEvent e12){
		Player p = e12.getPlayer();
		
		if(!p.isOp()){
			if(e12.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command12"))){
				e12.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	@EventHandler
	public void pcp13(PlayerCommandPreprocessEvent e13){
		Player p = e13.getPlayer();
		
		if(!p.isOp()){
			if(e13.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command13"))){
				e13.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	@EventHandler
	public void pcp14(PlayerCommandPreprocessEvent e14){
		Player p = e14.getPlayer();
		
		if(!p.isOp()){
			if(e14.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command14"))){
				e14.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	@EventHandler
	public void pcp15(PlayerCommandPreprocessEvent e15){
		Player p = e15.getPlayer();
		
		if(!p.isOp()){
			if(e15.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command15"))){
				e15.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	@EventHandler
	public void pcp16(PlayerCommandPreprocessEvent e16){
		Player p = e16.getPlayer();
		
		if(!p.isOp()){
			if(e16.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command16"))){
				e16.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	@EventHandler
	public void pcp17(PlayerCommandPreprocessEvent e17){
		Player p = e17.getPlayer();
		
		if(!p.isOp()){
			if(e17.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command17"))){
				e17.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	@EventHandler
	public void pcp18(PlayerCommandPreprocessEvent e18){
		Player p = e18.getPlayer();
		
		if(!p.isOp()){
			if(e18.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command18"))){
				e18.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	@EventHandler
	public void pcp19(PlayerCommandPreprocessEvent e19){
		Player p = e19.getPlayer();
		
		if(!p.isOp()){
			if(e19.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command19"))){
				e19.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}
	@EventHandler
	public void pcp20(PlayerCommandPreprocessEvent e20){
		Player p = e20.getPlayer();
		
		if(!p.isOp()){
			if(e20.getMessage().equalsIgnoreCase(getConfig().getString("Blocked Command20"))){
				e20.setCancelled(true);
				p.sendMessage(ChatColor.DARK_RED+"This Command is Blocked");
			}
		}
	}

}
