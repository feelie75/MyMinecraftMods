package com.kittykonnection.minecraft.testplugin;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;

import me.cybermaxke.materialapi.material.CustomMaterial;

public class FooBarItem extends CustomMaterial {
   
	
    public FooBarItem(String id, Material material) {
        super(id, material);
        
      
        this.setDamage(1);
    	this.setName("Sword Of Dung!");
    	this.setLore("Mysterious weapon!", "Knock Back!");
    	this.addEnchantment(Enchantment.KNOCKBACK, 1);
    	
    }
    
    //Called when damaging a entity.
    public void onHit(EntityDamageByEntityEvent event) { 
    	
    }
 
    //Called when you interact right click, left click, ect.
    public void onInteract(PlayerInteractEvent event) { }
 
    //Called when right clicking a entity.
    public void onInteractEntity(PlayerInteractEntityEvent event) { }
 
    //Called when placing the block.
    public void onBlockPlaced(BlockPlaceEvent event) { }
 
    //Called when breaking the block.
    public void onBlockBreak(BlockBreakEvent event) { }
 
    //Called when damaging the block.
    public void onBlockDamage(BlockDamageEvent event) { }
 
    //Called when right clicking on the block.
    public void onBlockInteract(PlayerInteractEvent event) { }
 
    //Called when switching to the item.
    public void onHold(PlayerItemHeldEvent event) { }
    
    public void onDrop(PlayerDropItemEvent event) { }
    
    
}


