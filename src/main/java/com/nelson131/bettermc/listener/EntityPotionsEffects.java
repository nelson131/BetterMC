package com.nelson131.bettermc.listener;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EntityPotionsEffects implements Listener {
    int a = 3 * 20;
    @EventHandler
    public void onDamageMobs(EntityDamageByEntityEvent event){
        Player player = (Player) event.getEntity();
        Entity entity = (Entity) event.getDamager();
        if(entity.getType() == EntityType.IRON_GOLEM){
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 150, 2));
        }
        if(entity.getType() == EntityType.ENDERMAN){
            player.addPotionEffect(new PotionEffect(PotionEffectType.DARKNESS, 150, 2));
        }
        if(entity.getType() == EntityType.ZOMBIE_VILLAGER){
            player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, 70, 1));
        }
        if(entity.getType() == EntityType.DRAGON_FIREBALL){
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 2));
        }
        if(entity.getType() == EntityType.ENDER_CRYSTAL){
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 130, 2));
        }
        if(entity.getType() == EntityType.GHAST){
            player.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 1));
            player.setFireTicks(a);
        }
        if(entity.getType() == EntityType.EVOKER){
            player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 100, 1));
        }
        if(entity.getType() == EntityType.WITHER_SKULL){
            player.addPotionEffect(new PotionEffect(PotionEffectType.WEAKNESS, 50, 1));
        }
    }
}
