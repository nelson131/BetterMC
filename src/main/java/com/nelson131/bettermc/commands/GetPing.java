package com.nelson131.bettermc.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GetPing implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player)){
            System.out.println("This command can use only player!");
            return false;
        }
        if(command.getName().equalsIgnoreCase("ping")){
            Player player = (Player) sender;
            sender.sendMessage(ChatColor.GOLD + "Your ping: " + player.getPing() + "ms");
        }
        return true;
    }
}
