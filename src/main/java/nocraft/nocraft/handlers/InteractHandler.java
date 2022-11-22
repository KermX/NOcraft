package nocraft.nocraft.handlers;

import nocraft.nocraft.NOcraft;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;


public class InteractHandler implements Listener {
    public InteractHandler(NOcraft plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Action action = event.getAction();
        Block block = event.getClickedBlock();
    if (block == null) {
        return;
    }
    if(action.equals(Action.RIGHT_CLICK_BLOCK)){
        if (!event.getPlayer().hasPermission("nocraft.usecraftingtable")) {
            if (block.getType().equals(Material.CRAFTING_TABLE)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.usebrewingstand")) {
            if(block.getType().equals(Material.BREWING_STAND)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.usefurnace")) {
            if(block.getType().equals(Material.FURNACE)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.useenchantingtable")) {
            if(block.getType().equals(Material.ENCHANTING_TABLE)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.useloom")) {
            if(block.getType().equals(Material.LOOM)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.usegrindstone")) {
            if(block.getType().equals(Material.GRINDSTONE)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.usesmithingtable")) {
            if(block.getType().equals(Material.SMITHING_TABLE)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.usestonecutter")) {
            if(block.getType().equals(Material.STONECUTTER)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.useblastfurnace")) {
            if(block.getType().equals(Material.BLAST_FURNACE)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.usesmoker")) {
            if(block.getType().equals(Material.SMOKER)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.usecartographytable")) {
            if(block.getType().equals(Material.CARTOGRAPHY_TABLE)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.usebeacon")) {
            if(block.getType().equals(Material.BEACON)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.useanvil")) {
            if (block.getType().equals(Material.ANVIL)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.useanvil")) {
            if(block.getType().equals(Material.CHIPPED_ANVIL)) {
                event.setCancelled(true);
            }
        }
        if (!event.getPlayer().hasPermission("nocraft.useanvil")) {
            if(block.getType().equals(Material.DAMAGED_ANVIL)) {
                event.setCancelled(true);
            }
        }
    }
}
    }

