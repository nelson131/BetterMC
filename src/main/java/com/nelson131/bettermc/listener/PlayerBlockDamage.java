package com.nelson131.bettermc.listener;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByBlockEvent;

public class PlayerBlockDamage implements Listener {
    int a = 3 * 20;
    @EventHandler
    public void onDamage(EntityDamageByBlockEvent event){
        Player player = (Player) event.getEntity();
        Block block = (Block) event.getDamager();

        if(block.getType() == Material.CAMPFIRE){
            player.setFireTicks(a);
        }
    }
}
