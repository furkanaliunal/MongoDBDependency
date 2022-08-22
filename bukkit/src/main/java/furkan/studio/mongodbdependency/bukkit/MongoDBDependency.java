package furkan.studio.mongodbdependency.bukkit;

import org.bukkit.plugin.java.JavaPlugin;

public class MongoDBDependency extends JavaPlugin {

    public void onEnable() {
        getServer().getConsoleSender().sendMessage("MongoDB Dependency initialized");
    }

    @Override
    public void onDisable() {
    }
}
