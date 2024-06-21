package pl.bkkuc.atomiccombat.handlers;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pl.bkkuc.atomiccombat.api.CombatUser;

/**
 * Call when player start pvp.
 */
public class CombatStartEvent extends Event {

    HandlerList handlerList = new HandlerList();

    @NotNull CombatUser targetCU;
    @Nullable CombatUser attackerCU;

    public CombatStartEvent(@NotNull CombatUser targetCU, @Nullable CombatUser attackerCU) {
        this.targetCU = targetCU;
        this.attackerCU = attackerCU;
    }

    public @NotNull CombatUser getTargetCU() {
        return targetCU;
    }

    public @Nullable CombatUser getAttackerCU() {
        return attackerCU;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlerList;
    }
}
