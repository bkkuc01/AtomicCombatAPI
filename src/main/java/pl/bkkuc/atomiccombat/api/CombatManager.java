package pl.bkkuc.atomiccombat.api;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface CombatManager {

    void onPluginDisabling();

    void loadCombat(@NotNull ConfigurationSection section);
    void saveCombat(@NotNull CombatUser combatUser);

    CombatUser createCombatUser(@NotNull Player player);

    void startCombat(@NotNull Player target, @Nullable Player attacker);

    void stopCombat(@NotNull CombatUser combatUser, boolean quit, boolean silent);

    boolean isInCombat(@NotNull Player player);

    @Nullable CombatUser getCombatUserByPlayer(@NotNull Player player);

    List<CombatUser> getCombatUsers();
}
