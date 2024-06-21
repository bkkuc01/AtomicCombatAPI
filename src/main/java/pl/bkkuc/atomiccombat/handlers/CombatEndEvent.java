package pl.bkkuc.atomiccombat.handlers;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;
import pl.bkkuc.atomiccombat.api.CombatUser;

public class CombatEndEvent extends Event {

    HandlerList handlerList = new HandlerList();

    @NotNull CombatUser combatUser;
    Reason reason;
    boolean silent;

    public CombatEndEvent(@NotNull CombatUser combatUser, Reason reason, boolean silent) {
        this.combatUser = combatUser;
        this.reason = reason;
        this.silent = silent;
    }

    public CombatEndEvent(@NotNull CombatUser combatUser) {
        this.combatUser = combatUser;
        this.reason = Reason.TIMEOUT;
        this.silent = false;
    }

    public CombatUser getCombatUser() {
        return combatUser;
    }

    public Reason getReason() {
        return reason;
    }

    public boolean isSilent() {
        return silent;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlerList;
    }

    public enum Reason {
        TIMEOUT, QUIT
    }
}
