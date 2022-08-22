package furkan.studio.mongodbdependency.velocity;

import com.google.inject.Inject;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.plugin.Plugin;
import org.slf4j.Logger;

@Plugin(
        id = "mongodbdependency",
        name = "MongoDBDependency",
        version = "0.1",
        url = "furkan.studio",
        authors = {"OnwexryS"}
)
public class MongoDBDependency {
    private final Logger logger;


    @Inject
    public MongoDBDependency(Logger logger) {
        this.logger = logger;
    }
    @Subscribe
    public void onProxyInitialization(ProxyInitializeEvent event) {
        logger.info("Jedis Dependency initialized");
    }
}
