package pl.bkkuc.atomiccombat.api;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;
import org.jetbrains.annotations.Nullable;

public interface CombatUser {

    Player getPlayer();
    ItemCooldown getItemCooldown();

    int getTimeToEnd();
    void setTimeToEnd(int time);

    BukkitTask getTask();

    /**
     * Get current enemy
     * @return Enemy CU obj.
     */
    CombatUser getEnemy();

    /**
     * Update current enemy to new.
     */
    void setEnemy(@Nullable CombatUser newEnemy);

    void updateBossBar();

    void stopPvP(boolean quit, boolean silent);
}
