package com.nelson131.bettermc;

import com.nelson131.bettermc.Item.ItemManager;
import com.nelson131.bettermc.commands.GetPing;
import com.nelson131.bettermc.listener.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class BetterMC extends JavaPlugin {
    Logger log = getLogger();

    @Override
    public void onEnable() {
        log.info("Enabled BetterMC");
        getServer().getPluginManager().registerEvents(new EntityPotionsEffects(), this);
        getServer().getPluginManager().registerEvents(new PlayerBlockDamage(), this);
        getServer().getPluginManager().registerEvents(new EntityDrops(), this);
        getServer().getPluginManager().registerEvents(new CompassClick(), this);
        getServer().getPluginManager().registerEvents(new WitherSpawn(), this);
        getServer().getPluginManager().registerEvents(new SoundEvent(), this);
        getServer().getPluginManager().registerEvents(new HideNicknames(), this);
        ItemManager.init();
        getCommand("ping").setExecutor(new GetPing());
    }

    @Override
    public void onDisable() {
    }
}
