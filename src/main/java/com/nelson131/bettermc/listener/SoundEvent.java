package com.nelson131.bettermc.listener;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.inventory.ItemStack;

import static org.bukkit.Sound.BLOCK_NOTE_BLOCK_GUITAR;

public class SoundEvent implements Listener {

    @EventHandler
    public void onPick(PlayerPickupItemEvent event){
        Player player = (Player) event.getPlayer();
        ItemStack item = event.getItem().getItemStack();
        Material itemtype = item.getType();
        Location loc = player.getLocation();

        if(itemtype == Material.NETHER_STAR){
            player.playSound(loc, BLOCK_NOTE_BLOCK_GUITAR, 2.0F, 1.0F);
        }
        if(itemtype == Material.DRAGON_EGG){
            player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 2.0F, 1.0F);
        }
        if(itemtype == Material.TRIDENT){
            player.playSound(loc, Sound.BLOCK_AMETHYST_BLOCK_STEP, 2.0F, 1.0F);
        }
        if(itemtype == Material.ECHO_SHARD){
            player.playSound(loc, Sound.BLOCK_SCULK_PLACE, 2.0F, 1.0F);
        }
        if(itemtype == Material.BEACON){
            player.playSound(loc, Sound.BLOCK_AMETHYST_BLOCK_STEP, 2.0F, 1.0F);
        }
    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent event){
        Player player = (Player) event.getPlayer();
        ItemStack item = event.getItemDrop().getItemStack();
        Material itemtype = item.getType();
        Location loc = player.getLocation();

        if(itemtype == Material.NETHER_STAR){
            player.playSound(loc, BLOCK_NOTE_BLOCK_GUITAR, 2.0F, 1.0F);
        }
        if(itemtype == Material.DRAGON_EGG){
            player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_FLUTE, 2.0F, 1.0F);
        }
        if(itemtype == Material.TRIDENT){
            player.playSound(loc, Sound.BLOCK_AMETHYST_BLOCK_STEP, 2.0F, 1.0F);
        }
        if(itemtype == Material.ECHO_SHARD){
            player.playSound(loc, Sound.BLOCK_SCULK_BREAK, 2.0F, 1.0F);
        }
        if(itemtype == Material.BEACON){
            player.playSound(loc, Sound.BLOCK_AMETHYST_BLOCK_STEP, 2.0F, 1.0F);
        }
    }

    @EventHandler
    public void onDeath(EntityDeathEvent event){
        Entity entity = (Entity) event.getEntity();
        Player player = (Player) event.getEntity();
        Location loc = player.getLocation();
        if(entity.getType() == EntityType.WARDEN){
            player.playSound(loc, Sound.AMBIENT_CAVE, 2.0F, 1.0F);
        }
        if(entity.getType() == EntityType.EVOKER){
            player.playSound(loc, Sound.AMBIENT_BASALT_DELTAS_LOOP, 2.0F, 1.0F);
        }
    }
}
