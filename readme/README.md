# UmweltQuiz

Ein interaktives JavaFX-Quiz rund um Umwelt, Nachhaltigkeit und Klimaschutz.

Das Projekt kombiniert Quiz-Logik mit einer grafischen Oberfläche und kategoriespezifischen Animationen/Bildhintergründen.

## Inhalt

- [Projektidee](#projektidee)
- [Funktionen](#funktionen)
- [Technologien](#technologien)
- [Projektstruktur](#projektstruktur)
- [Voraussetzungen](#voraussetzungen)
- [Projekt lokal starten](#projekt-lokal-starten)
- [GitHub Upload](#github-upload)
- [Hinweise](#hinweise)

## Projektidee

`UmweltQuiz` vermittelt Wissen zu Umweltthemen in Form eines Multiple-Choice-Quiz.
Jede Frage ist einer Kategorie zugeordnet, enthält vier Antwortmöglichkeiten und eine Quelle zur Vertiefung.

## Funktionen

- Fragenpool mit mehreren Umwelt-Kategorien
- Zufällige Reihenfolge der Fragen
- Punktevergabe (richtig beantwortete Frage = 10 Punkte)
- Anzeige der aktuellen Kategorie
- Anzeige eines Quellen-Links pro Frage
- JavaFX-Oberfläche mit kategoriespezifischen Hintergrundbildern und Animationen

## Technologien

- Java (Modulprojekt)
- JavaFX (`controls`, `fxml`, `graphics`, `media`)
- Eclipse (empfohlen durch aktuelle Projektstruktur)

## Projektstruktur

```text
UmweltQuiz/
├─ src/
│  ├─ module-info.java
│  └─ Quiz/
│     ├─ FragenListe.java
│     ├─ Kategorie.java
│     ├─ Question.java
│     ├─ QuizGame.java
│     └─ QuizGui.java
├─ ressources/
│  └─ images/
├─ bin/
└─ readme/
```

## Voraussetzungen

- JDK 17 oder neuer
- JavaFX SDK (passend zur Java-Version)
- IDE mit JavaFX-Unterstützung (z. B. Eclipse)

## Projekt lokal starten

### Variante A: Eclipse (empfohlen)

1. Projekt in Eclipse importieren.
2. Sicherstellen, dass JavaFX im Build Path eingebunden ist.
3. Run Configuration fuer `Quiz.QuizGui` erstellen.
4. Bei Bedarf VM-Argumente setzen:

```bash
--module-path "PFAD_ZUM_JAVAFX_LIB" --add-modules javafx.controls,javafx.fxml,javafx.media
```

5. Anwendung starten.

### Variante B: Kommandozeile (Modulstart)

Beispiel (Pfade anpassen):

```bash
javac --module-path "PFAD_ZUM_JAVAFX_LIB" --add-modules javafx.controls,javafx.fxml,javafx.media -d out src/module-info.java src/Quiz/*.java
java --module-path "PFAD_ZUM_JAVAFX_LIB" --add-modules javafx.controls,javafx.fxml,javafx.media -cp out Quiz.QuizGui
```

## GitHub Upload

Falls das Projekt noch nicht versioniert ist:

```bash
git init
git add .
git commit -m "Initial commit: UmweltQuiz"
```

Repository auf GitHub erstellen (z. B. `UmweltQuiz`) und danach lokal verknuepfen:

```bash
git remote add origin https://github.com/<USERNAME>/UmweltQuiz.git
git branch -M main
git push -u origin main
```

Wenn bereits ein Git-Repository vorhanden ist, reichen meist:

```bash
git add .
git commit -m "Update Dokumentation"
git push
```

## Hinweise

- Bilder werden ueber Ressourcenpfade (`/images/...`) geladen. Achte darauf, dass der `images`-Ordner als Resource-Folder ins Build-Ergebnis aufgenommen wird.
- Es existiert ein Ordnername `ressources` (franzoesische Schreibweise). Falls in der IDE keine Bilder geladen werden, Build-Path und Resource-Konfiguration pruefen.
- Weiterfuehrende technische Details stehen in [DOKUMENTATION.md](DOKUMENTATION.md).
