package pl.bkkuc.atomiccombat.api;

import pl.bkkuc.purutils.file.IFile;

public interface CombatAPI {

    CombatManager getCombatManager();
    IFile getCacheFile();

    String getPluginVersion();
}
