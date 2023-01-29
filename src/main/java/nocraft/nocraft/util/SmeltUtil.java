package nocraft.nocraft.util;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import nocraft.nocraft.NOcraft;
import org.bukkit.event.inventory.FurnaceBurnEvent;

public class SmeltUtil implements Listener {
    private ConfigUtil config;

    public SmeltUtil(NOcraft plugin){
        Bukkit.getPluginManager().registerEvents(this,plugin);
        config = new ConfigUtil(plugin, "config.yml");
    }
    @EventHandler
    public void onSmelt(FurnaceBurnEvent event) {
        boolean disableAllSmeltingRecipes = config.getConfig().getBoolean("NOcraft.disable-all-smelting-recipes");
        if (disableAllSmeltingRecipes) {
            event.setCancelled(true);
        }
    }
}