# Compose UI Lab

A collection of standalone **Jetpack Compose** screens used to practice layout fundamentals and Material 3 components — each screen is an isolated `@Preview` composable, meant to be inspected individually rather than a single connected app flow.

## Screens

| Composable | What it practices |
|---|---|
| `MyApp` | Basic `Row`/`Column` composition, `weight()`, padding, and background modifiers. Entry point rendered by `MainActivity`. |
| `SegundaPantalla` | Simple confirmation/success screen layout. |
| `TerceraPantalla` | A 2×2 grid built from nested `Row`/`Column` with `weight()`, each cell as a reusable `CeldaTabla` composable. |
| `MiPantallaDos` | `Scaffold` with `TopAppBar` + `NavigationBar` (`BottomBar`), hosting a form (`BodyScreen`) with `TextField`, `Checkbox`, `Switch`, and buttons. |
| `CuartaPantalla` | Header / content / footer layout using `Arrangement.SpaceBetween`. |
| `QuintaPantalla` | The most complete mockup: a social-profile-style screen with avatar, stats, interest chips (`FlowRow` + `SuggestionChip`), and a project card. Uses placeholder/fictitious profile data. |

## Tech stack

| Layer | Technology |
|---|---|
| UI | Jetpack Compose, Material 3 |
| Language | Kotlin |
| Build | Gradle Kotlin DSL, version catalogs (`libs.versions.toml`) |

## Getting started

**Requirements:** Android Studio (current stable), JDK 17+, Android SDK with API 36.

```bash
git clone https://github.com/eliangilsierra/compose-ui-lab.git
cd compose-ui-lab
./gradlew assembleDebug
```

Each screen is annotated with `@Preview`, so the fastest way to browse them is opening `MainActivity.kt` in Android Studio and inspecting the Compose previews individually. Only `MyApp` is wired to `MainActivity` and renders when the app is actually run on a device or emulator (minSdk 26).

## Academic context

Developed as an exercise for the **Desarrollo de Aplicaciones Móviles** course, taught by professor **Fabián Enrique Suárez Carvajal** — Maestría en Gestión, Aplicación y Desarrollo de Software (MGADS), Universidad Autónoma de Bucaramanga (UNAB).

## License

MIT — see [LICENSE](LICENSE).
