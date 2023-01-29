package nocraft.nocraft;

import nocraft.nocraft.handlers.InteractHandler;
import nocraft.nocraft.util.ConfigUtil;
import nocraft.nocraft.util.CraftUtil;
import nocraft.nocraft.util.SmeltUtil;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class NOcraft extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("NOcraft has started");

        saveDefaultConfig();

        ConfigUtil config = new ConfigUtil(this, "config.yml");
        CraftUtil CraftUtil = new CraftUtil(this);
        SmeltUtil SmeltUtil = new SmeltUtil(this);



        new InteractHandler(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("NOcraft has stopped");
    }
}
