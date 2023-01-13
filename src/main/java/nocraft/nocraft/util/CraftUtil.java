package nocraft.nocraft.util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import nocraft.nocraft.NOcraft;
import org.bukkit.event.inventory.CraftItemEvent;

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
        boolean disableAllRecipes = config.getConfig().getBoolean("NOcraft.disable-all-recipes");
        if (disableAllRecipes) {
            event.setCancelled(true);
        } else {
        List<Material> disabledRecipes = new ArrayList<>();
        for (String recipes : config.getConfig().getStringList("NOcraft.disabled-recipes"))
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
}
