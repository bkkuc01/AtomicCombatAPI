package pl.bkkuc.atomiccombat.manager.powerups;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface Disabler {

    void disablePowerUp(@NotNull Player player);
}
