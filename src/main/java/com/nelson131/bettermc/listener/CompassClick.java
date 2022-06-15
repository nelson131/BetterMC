package com.nelson131.bettermc.listener;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class CompassClick implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEvent event){
        Player player = (Player) event.getPlayer();
        int X = player.getLocation().getBlockX();
        int Y = player.getLocation().getBlockY();
        int Z = player.getLocation().getBlockZ();
        Action action = event.getAction();
        String cords = ChatColor.GOLD + "X:" + X + " " + ChatColor.GOLD + "Y:" + Y + " " + ChatColor.GOLD + "Z:" + Z;
        if ((action.equals(Action.RIGHT_CLICK_AIR) || action.equals(Action.RIGHT_CLICK_BLOCK))) {
            if(player.getItemInHand().getType().equals(Material.COMPASS)){
                player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(cords));
            }
        }
    }
}