package furkan.studio.mongodbdependency.bukkit;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class MongoDBDependency extends JavaPlugin {

    public void onEnable() {
        getLogger().setLevel(Level.WARNING);
        getServer().getConsoleSender().sendMessage("MongoDB Dependency initialized");
    }

    @Override
    public void onDisable() {
    }
}
