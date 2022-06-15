package com.nelson131.bettermc.listener;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class WitherSpawn implements Listener {
    @EventHandler
    public void onSpawn(EntityDeathEvent event){
        Entity entity = (Entity) event.getEntity();
        Location loc = entity.getLocation();
        double x = loc.getX();
        double y = loc.getY()+1;
        double z = loc.getZ();

        if(entity.getType() == EntityType.WITHER) {
            entity.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
            entity.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
            entity.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
            entity.getWorld().spawnEntity(loc, EntityType.WITHER_SKELETON);
        }
    }
}
