package nocraft.nocraft.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import nocraft.nocraft.NOcraft;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;

import java.util.ArrayList;
import java.util.List;

public class CraftUtil implements Listener {
    private ConfigUtil config;

    public CraftUtil(NOcraft plugin){
        Bukkit.getPluginManager().registerEvents(this,plugin);
        config = new ConfigUtil(plugin, "config.yml");
    }
    @EventHandler
    public void onCraft(CraftItemEvent event) {
        if (event.getWhoClicked().hasPermission("NOcraft.bypass"))
            return;
        boolean disableAllRecipes = config.getConfig().getBoolean("NOcraft.disable-all-crafting-recipes");
        if (disableAllRecipes) {
            event.setCancelled(true);
        } else {
        List<Material> disabledRecipes = new ArrayList<>();
        for (String recipes : config.getConfig().getStringList("NOcraft.disabled-crafting-recipes"))
            try {
                disabledRecipes.add(Material.valueOf(recipes));
            } catch (Exception e){
                Bukkit.getLogger().info("disabled-recipes contains an invalid crafting result. https://hub.spigotmc.org/javadocs/bukkit/org/bukkit/Material.html ");
                return;
            }
        for (Material indRecipes : disabledRecipes) {
            if (event.getCurrentItem().getType() == indRecipes) {
                event.setCancelled(true);
            }
        }
        }
    }
    public void onSmelt(FurnaceSmeltEvent sevent) {
        boolean disableAllSmeltingRecipes = config.getConfig().getBoolean("NOcraft.disable-all-smelting-recipes");
        if (disableAllSmeltingRecipes) {
            sevent.setCancelled(true);
        }
    }
}
