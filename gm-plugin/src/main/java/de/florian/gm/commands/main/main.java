package de.florian.gm.commands.main;

import de.florian.gm.commands.commands.GmCommand;
import de.florian.gm.commands.listeners.JoinListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gm").setExecutor(new GmCommand());

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
    }

    @Override
    public void onDisable() {

    }
}
