package com.kittykonnection.minecraft.testplugin;

import me.cybermaxke.materialapi.inventory.CustomItemStack;
import me.cybermaxke.materialapi.material.CustomMaterial;

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
    
    public static CustomMaterial FOOBAR_ITEM;
    
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
            
        //Creating the item.
        FOOBAR_ITEM = new FooBarItem("phoenixsword", Material.GOLD_SWORD);
        CustomItemStack is = new CustomItemStack(FOOBAR_ITEM);
        inventory.addItem(is.getItem());
    }
    
    @SuppressWarnings("unused")
	@EventHandler
    public void onPlayerMove(PlayerMoveEvent evt) {
    	if (1==2) {
    		// Dumb code follows
    		Location loc = evt.getPlayer().getLocation();
    		World w = loc.getWorld();
    		int randX = (int) (-3 + (Math.random() * 6));
    		int randZ = (int) (-3 + (Math.random() * 6));
    		double x = loc.getX() + randX;
    		double y = loc.getY() - 1;
    		double z = loc.getZ() + randZ;
    		int randBlock = (int) (Math.random() * 100);
    		Block b = w.getBlockAt((int) x, (int) y, (int) z);
    		b.setTypeId(randBlock);
    		b = w.getBlockAt((int) z, (int) y, (int) x);
    		b.setTypeId(randBlock);
    	}
    	
    	Player player = evt.getPlayer();
    	int health = player.getHealth();
    	    	
    }
    
    
}

