package me.eccentric_nz.tardis.extension;

import org.geysermc.event.subscribe.Subscribe;
import org.geysermc.geyser.api.event.lifecycle.GeyserDefineCustomItemsEvent;
import org.geysermc.geyser.api.event.lifecycle.GeyserLoadResourcePacksEvent;
import org.geysermc.geyser.api.event.lifecycle.GeyserPostInitializeEvent;
import org.geysermc.geyser.api.extension.Extension;
import org.geysermc.geyser.api.item.custom.CustomItemData;
import org.geysermc.geyser.api.item.custom.CustomItemOptions;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;

// The main class of your extension - must implement extension, and be in the extension.yml file.
// see https://github.com/GeyserMC/Geyser/blob/master/api/src/main/java/org/geysermc/geyser/api/extension/Extension.java for more info on available methods
public class CustomItems implements Extension {

    // Registering custom items/blocks, or adding resource packs (and basically all other events that are fired before Geyser initializes fully)
    // are done in their respective events. See below for an example:
    @Subscribe
    public void onGeyserLoadResourcePacks(GeyserLoadResourcePacksEvent event) {
        logger().info("Loading: " + event.resourcePacks().size() + " resource packs.");
        // you could add a resource pack with event.resourcePacks().add(path-to-pack)
        String uri = "";
        try {
            Path path = Path.of(new URI(uri));
            event.resourcePacks().add(path);
        } catch (URISyntaxException e) {
            logger().error("Loading: [" + uri + "] resource pack failed.");
        }
    }

    @Subscribe
    public void onGeyserDefineCustomItem(GeyserDefineCustomItemsEvent event) {

        CustomItemOptions tardisBlueOptions = CustomItemOptions.builder().customModelData(1001).build();
        CustomItemOptions tardisBlueOpenOptions = CustomItemOptions.builder().customModelData(1002).build();
        CustomItemOptions tardisBlueStainedOptions = CustomItemOptions.builder().customModelData(1003).build();
        CustomItemOptions tardisGlassOptions = CustomItemOptions.builder().customModelData(1004).build();
        CustomItemOptions blueFlying0Options = CustomItemOptions.builder().customModelData(1005).build();
        CustomItemOptions blueFlying1Options = CustomItemOptions.builder().customModelData(1006).build();
        CustomItemOptions blueFlying2Options = CustomItemOptions.builder().customModelData(1007).build();
        CustomItemOptions blueFlying3Options = CustomItemOptions.builder().customModelData(1008).build();
        CustomItemOptions blueFlying4Options = CustomItemOptions.builder().customModelData(1009).build();
        CustomItemOptions blueFlying5Options = CustomItemOptions.builder().customModelData(1010).build();
        CustomItemOptions blueFlying6Options = CustomItemOptions.builder().customModelData(1011).build();
        CustomItemOptions blueFlying7Options = CustomItemOptions.builder().customModelData(1012).build();
        CustomItemOptions blueFlying8BlueOptions = CustomItemOptions.builder().customModelData(1013).build();
        CustomItemOptions blueFlying9Options = CustomItemOptions.builder().customModelData(1014).build();
        CustomItemOptions blueFlying10Options = CustomItemOptions.builder().customModelData(1015).build();
        CustomItemOptions blueFlying11Options = CustomItemOptions.builder().customModelData(1016).build();
        CustomItemOptions blueFlying12Options = CustomItemOptions.builder().customModelData(1017).build();
        CustomItemOptions blueFlying13Options = CustomItemOptions.builder().customModelData(1018).build();
        CustomItemOptions blueFlying14Options = CustomItemOptions.builder().customModelData(1019).build();
        CustomItemOptions blueFlying15Options = CustomItemOptions.builder().customModelData(1020).build();
        CustomItemData blueDye = CustomItemData.builder().name("blue_police_box").customItemOptions(tardisBlueOptions).build();
        event.register("minecraft:blue_dye", blueDye);
    }

    // You can use the GeyserPostInitializeEvent to run anything after Geyser fully initialized and is ready to accept bedrock player connections.
    @Subscribe
    public void onPostInitialize(GeyserPostInitializeEvent event) {
        // example: show that your extension is loading.
        this.logger().info("Loading example extension...");
        
        //example: accessing extension data folder
        Path exampleDataFolder = this.dataFolder();
        this.logger().info(exampleDataFolder.toString());
    }

}
