package com.nelson131.bettermc.listener;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Evoker;
import org.bukkit.entity.Warden;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class EntityDrops implements Listener {
    ItemStack ed = new ItemStack(Material.EMERALD, 3);
    ItemStack ex = new ItemStack(Material.EXPERIENCE_BOTTLE, 5);
    ItemStack t = new ItemStack(Material.TOTEM_OF_UNDYING, 1);
    ItemStack echo = new ItemStack(Material.ECHO_SHARD, 4);
    @EventHandler
    public void onDeath(EntityDeathEvent event){
        Entity entity = (Entity) event.getEntity();
        if(entity instanceof Evoker){
            event.getDrops().clear();
            event.getDrops().add(ed);
        }
        if(entity instanceof Warden){
            event.getDrops().add(ex);
            event.getDrops().add(t);
            event.getDrops().add(echo);
        }
    }

}
