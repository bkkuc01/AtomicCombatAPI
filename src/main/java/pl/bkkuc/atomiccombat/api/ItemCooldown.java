package pl.bkkuc.atomiccombat.api;

import org.bukkit.Material;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface ItemCooldown {

    List<CooldownedItem> getCooldownedItems();

    void setCooldown(Material material, int time);
    boolean hasCooldown(Material material);
    int getCooldown(Material material);

    @Nullable CooldownedItem getCooldownItemByMaterial(@NotNull Material material);
}
