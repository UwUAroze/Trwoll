package me.aroze.twroll;

import me.aroze.twroll.command.TrollCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Twroll extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getPluginCommand("troll").setExecutor(new TrollCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
