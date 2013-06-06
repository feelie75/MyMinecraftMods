package com.kittykonnection.com.testplugin;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class testplugin extends JavaPlugin {
 
		public final MyPlayerListener playerListener = new MyPlayerListener();
	
	   @Override
	    public void onEnable(){
	        // TODO Insert logic to be performed when the plugin is enabled
			getLogger().info("onEnable moobreath has been invoked!");
			
			PluginManager pm = getServer().getPluginManager();
			
			pm.registerEvents(this.playerListener, this);
			
			
			// Look, a new Recipe!! I think...
			//ShapedRecipe money = new ShapedRecipe(new ItemStack(Material.EMERALD)).shape("","*%*","")
	        //        .setIngredient('%', Material.EMERALD)
	        //        .setIngredient('*', Material.AIR);
	        //getServer().addRecipe(money);
			
			
			
	    }
	 
	    @Override
	    public void onDisable() {
	        // TODO Insert logic to be performed when the plugin is disabled
	    	getLogger().info("onDisable moobreath has been invoked!");
	    }
	
	    
	   
	    
	    
	
	
	    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	    	if (cmd.getName().equalsIgnoreCase("basic")){ // If the player typed /basic then do the following...
	    		// do something...
	    		return true;
	    	} else if (cmd.getName().equalsIgnoreCase("moo")) {

	    		if (!(sender instanceof Player)) {
	    			sender.sendMessage("This command can only be run by a player.");
	    		} else {
	    			Player player = (Player) sender;
	    			// do something  1200 ticks = 1 minute. 200 ticks = 10 seconds. 20ticks/sec.
	    			player.setFireTicks(200);
	    			player.sendMessage("Mooo MOOOOOO!!! MoOOOOOoOoOoOOOO!");
	    		}
	    		
	    		return true;
	    	} else if (cmd.getName().equalsIgnoreCase("flame")) {

	    		if (!(sender instanceof Player)) {
	    			sender.sendMessage("This command can only be run by a player, not console.");
	    		} else {
	    			Player player = (Player) sender;
	    			
	    			if (args.length < 1) {
	    				sender.sendMessage("You need to pass the player name!");
	    				return false;
	    			}
	    			
	    			Player target = (Bukkit.getServer().getPlayer(args[0]));
	    	        if (target == null) {
	    	           sender.sendMessage(args[0] + " is not online!");
	    	           return false;
	    	        }
	    			
	    			target.setFireTicks(100);
	    			player.sendMessage("OMG WHAT KIND OF MONSTER ARE YOU!?");
	    		}
	    		
	    		return true;
	    	}

	    	
	    	return false;
	    }
	
}




