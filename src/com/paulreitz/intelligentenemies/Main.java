package com.paulreitz.intelligentenemies;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {




    @Override
    public void onEnable() {

        //Log
        getLogger().info("onEnable is called!");

        //Register Events
        getServer().getPluginManager().registerEvents(new DoorAggro(), this);
    }
    @Override
    public void onDisable() {
        getLogger().info("onDisable is called!");
    }

}
