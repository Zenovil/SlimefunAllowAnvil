package io.github.anvilfix;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.plugin.java.JavaPlugin;

public class AnvilFix extends JavaPlugin implements Listener {
    
    @Override
    public void onEnable() {
        if (!getServer().getPluginManager().isPluginEnabled("Slimefun")) {
            getLogger().severe("Slimefun is not installed or enabled!");
            getServer().getPluginManager().disablePlugin(this);
            return;
        }
        
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("AnvilFix v" + getDescription().getVersion() + " has been enabled!");
        getLogger().info("Slimefun items can now be used in vanilla anvils!");
    }
    
    @Override
    public void onDisable() {
        getLogger().info("AnvilFix has been disabled.");
    }
    
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onInventoryClick(InventoryClickEvent event) {
        // Only check anvil result slot clicks (slot 2)
        if (event.getRawSlot() == 2 && event.getInventory().getType() == InventoryType.ANVIL) {
            // If Slimefun blocked it (Result.DENY), allow it
            if (event.getResult() == org.bukkit.event.Event.Result.DENY) {
                event.setResult(org.bukkit.event.Event.Result.ALLOW);
                getLogger().fine("Bypassed Slimefun anvil restriction");
            }
        }
    }
}