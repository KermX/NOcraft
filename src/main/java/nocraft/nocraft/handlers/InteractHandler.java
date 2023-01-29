package nocraft.nocraft.handlers;

import nocraft.nocraft.NOcraft;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.HashMap;
import java.util.Map;


public class InteractHandler implements Listener {
    public InteractHandler(NOcraft plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    private static final Map<Material, String> MATERIALS = new HashMap<>();

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Block block = event.getClickedBlock();
        if (block == null) {
            return;
        }

        if (!event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            return;
        }

        String permission = MATERIALS.get(block.getType());

        if (permission == null) {
            return;
        }

        if (event.getPlayer().hasPermission("nocraft.bypass")) {
            return;
        }

        if (!event.getPlayer().hasPermission("nocraft.use" + permission)) {
            event.setCancelled(true);
        }
    }

    static {
        MATERIALS.put(Material.CRAFTING_TABLE, "craftingtable");
        MATERIALS.put(Material.BREWING_STAND, "brewingstand");
        MATERIALS.put(Material.FURNACE, "furnace");
        MATERIALS.put(Material.ENCHANTING_TABLE, "enchantingtable");
        MATERIALS.put(Material.LOOM, "loom");
        MATERIALS.put(Material.GRINDSTONE, "grindstone");
        MATERIALS.put(Material.SMITHING_TABLE, "smithingtable");
        MATERIALS.put(Material.SMOKER, "smoker");
        MATERIALS.put(Material.BLAST_FURNACE, "blastfurnace");
        MATERIALS.put(Material.STONECUTTER, "stonecutter");
        MATERIALS.put(Material.CARTOGRAPHY_TABLE, "cartographytable");
        MATERIALS.put(Material.BEACON, "beacon");
        MATERIALS.put(Material.CAMPFIRE, "campfire");
        MATERIALS.put(Material.SOUL_CAMPFIRE, "campfire");
        MATERIALS.put(Material.ANVIL, "anvil");
        MATERIALS.put(Material.CHIPPED_ANVIL, "anvil");
        MATERIALS.put(Material.DAMAGED_ANVIL, "anvil");
    }
}

