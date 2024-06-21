package pl.bkkuc.atomiccombat.api;

import org.bukkit.Material;
import org.bukkit.scheduler.BukkitTask;

import java.util.List;

public interface CooldownedItem {

    /**
     * @return Origin cooldowned items from a player.
     */
    List<CooldownedItem> originCooldownedItems();

    Material getMaterial();
    int getTime();
    BukkitTask getTask();
}