# GradientsEvolved — Multi-Loader / Multi-Version

**Mod ID:** `ge` | **Author:** King_Thenuja | **Group:** `net.thenu.ge`

> Quilt is intentionally excluded — Quilt runs Fabric mods natively, so
> your Fabric jar works on both Fabric and Quilt out of the box.

## Supported Targets

| MC Version | Fabric | NeoForge        | Forge |
|------------|--------|-----------------|-------|
| 1.21.1     | ✅     | ✅ stable       | ✅    |
| 1.21.3     | ✅     | ✅ beta         |       |
| 1.21.4     | ✅     | ✅ stable       |       |
| 1.21.5     | ✅     | ✅ stable       |       |
| 1.21.6     | ✅     | ✅ stable       |       |
| 1.21.7     | ✅     | ✅ beta         |       |
| 1.21.8     | ✅     | ✅ stable       |       |
| 1.21.9     | ✅     | ✅ beta         |       |
| 1.21.10    | ✅     | ✅ beta         |       |
| 1.21.11    | ✅     | ✅ beta         |       |

## ⚠️ Verify These Before First Build

The Yarn, Fabric API, and beta NeoForge versions in `gradle.properties` may
need updating — check:
- https://fabricmc.net/develop/          (Yarn + Fabric API)
- https://maven.neoforged.net/releases/net/neoforged/neoforge/  (NeoForge)

Beta NeoForge versions follow the pattern `21.X.Y-beta` and resolve fine
through NeoGradle — no special config needed beyond the version string.

## Build Commands

```bash
./gradlew build                                       # everything
./gradlew :versions:1.21.6-fabric:build
./gradlew :versions:1.21.6-neoforge:build
./gradlew :versions:1.21.1-forge:build
./gradlew :versions:1.21.6-fabric:runClient
./gradlew :versions:1.21.6-neoforge:runClient
```
# gradients-evolved-multi-version
