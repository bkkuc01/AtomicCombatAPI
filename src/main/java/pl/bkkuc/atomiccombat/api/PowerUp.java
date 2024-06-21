package pl.bkkuc.atomiccombat.api;

import org.jetbrains.annotations.Nullable;
import pl.bkkuc.atomiccombat.manager.powerups.Disabler;

import java.util.List;

public interface PowerUp {

    PowerType getPowerUpType();
    boolean acceptDamage();
    boolean disablePowerUp();
    List<String> getActions();

    @Nullable Disabler getDisabler();

    enum PowerType {
        CREATIVE, GOD, FLY, VANISH
    }
}
