package com.kittykonnection.com.testplugin;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;


public class MyPlayerListener implements Listener {
    @EventHandler
    public void onPlayerLogin(PlayerLoginEvent event) {
        // Your code here...
    	//getLogger().info("PlayerLogin Event!");
    }
    
    @EventHandler 
    public void onPlayerJoin(PlayerJoinEvent evt) {
    	//getLogger().info("playerJoinEvent!");
    	
        Player player = evt.getPlayer(); // The player who joined
        PlayerInventory inventory = player.getInventory(); // The player's inventory
        ItemStack itemstack = new ItemStack(Material.DIAMOND, 6); // A stack of diamonds
     
        //if (inventory.contains(itemstack)) {
            inventory.addItem(itemstack); // Adds a stack of diamonds to the player's inventory
            player.sendMessage("Welcome! I heard you like diamonds, so here's some!! ENJOY!!!");
        //}
    }
    
    //@EventHandler
    public void onPlayerMove(PlayerMoveEvent evt) {
    	Location loc = evt.getPlayer().getLocation();
    	World w = loc.getWorld();
    	loc.setY(loc.getY() + 5);
    	Block b = w.getBlockAt(loc);
    	b.setTypeId(1);
    }
    
    
}

