# API dependency

### Maven dependency
```xml

    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>com.github.bkku01</groupId>
            <artifactId>AtomicCombatAPI</artifactId>
            <version>1.1.6.1</version>
        </dependency>
    </dependencies>

```

### Gradle dependency
```groovy
repositories {
    mavenCentral()
    maven {
        name = "jitpack.io"
        url = "https://jitpack.io/"
    }
}

dependencies {
    compileOnly "com.github.bkkuc01:AtomicCombatAPI:1.1.6.1"
}
```

### plugin.yml dependency
```YAML
depend: [AtomicCombat]
```

# Examples

### Start Combat without enemy
```java
@EventHandler
private void onPlayerJump(PlayerJumpEvent e){
    Player player = e.getPlayer();
    CombatAPI api = (CombatAPI) Bukkit.getPluginManager().getPlugin("AtomicCombat");
    if(api == null) return;
        
    api.getCombatManager().startCombat(player, null);
}
```

### Silent stop pvp
```java
public static void silentStopCombat(@NotNull final Player player){
    CombatAPI api = (CombatAPI) Bukkit.getPluginManager().getPlugin("AtomicCombat");
    if(api == null) return;

    CombatUser combatUser = api.getCombatManager().getCombatUserByPlayer(player);
    if(combatUser == null) return;
        
    // CombatManager#stopCombat (CombatUser, quit, silent)
    api.getCombatManager().stopCombat(combatUser, false, true);
}
```

# Events

CombatStartEvent - When combat starts.

CombatEndEvent - When combat ended.

### CombatStartEvent
```java
@EventHandler
private void onCombatStart(CombatStartEvent e){
    CombatUser attacker = e.getAttackerCU();
    if(attacker == null) return;

    Bukkit.broadcastMessage(attacker.getPlayer().getName() + " started pvp with " + e.getTargetCU().getPlayer().getName());
}
```

### CombatEndEvent
```java
@EventHandler
private void onCombatEnd(CombatEndEvent e){
    if(e.getReason() == CombatEndEvent.Reason.QUIT) {
      for(Player admin: Bukkit.getOnlinePlayers().stream().filter(player -> player.isOnline()).collect(Collectors.toList())) {
        admin.sendMessage(e.getCombatUser().getPlayer().getName() + " quited in combat time and was killed by punish!");
      }
    }
}
```



