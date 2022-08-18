package furkan.studio.mongodbdependency.bukkit;

import org.bukkit.plugin.java.JavaPlugin;

public class JedisDependency extends JavaPlugin {

    public void onEnable() {
        getServer().getConsoleSender().sendMessage("Jedis Dependency initialized");
    }

    @Override
    public void onDisable() {
    }
}
