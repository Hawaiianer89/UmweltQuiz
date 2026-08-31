# Technische Dokumentation - UmweltQuiz

## 1. Ueberblick

`UmweltQuiz` ist eine JavaFX-Anwendung mit klarer Trennung zwischen:

- Datenmodell (`Question`, `Kategorie`)
- Datenquelle (`FragenListe`)
- Spiellogik (`QuizGame`)
- Benutzeroberflaeche (`QuizGui`)

Die Anwendung praesentiert Fragen zu Umweltthemen, wertet Antworten aus und zeigt eine Gesamtpunktzahl an.

## 2. Architektur

### 2.1 Komponenten

1. `Kategorie` (Enum)
- Definiert feste Themenbereiche:
  - `RESSOURCEN_DER_ERDE`
  - `PLASTIK_UND_MUELL`
  - `ERNAEHRUNG_UND_LEBENSMITTELVERSCHWENDUNG`
  - `KLIMAWANDEL_UND_ENERGIE`
  - `TIERE_UND_ARTENVIELFALT`
  - `WAS_KANN_ICH_TUN`

2. `Question`
- Datenklasse fuer eine einzelne Frage.
- Enthaltene Felder:
  - Fragetext
  - 4 Antwortoptionen (A-D)
  - Richtige Antwort (`char`)
  - Quellen-Link
  - Kategorie (`Kategorie`)

3. `FragenListe`
- Erstellt und verwaltet den gesamten Fragenpool.
- Fuellt die Liste in `fragenHinzufuegen()`.
- Mischt Fragen per `shuffleQuestions()`.

4. `QuizGame`
- Zentrale Spiellogik:
  - Aktuelle Frage verwalten
  - Punkte zaehlen
  - Antworten pruefen
  - Quiz-Ende erkennen
  - Kategorie/Link der aktuellen Frage bereitstellen

5. `QuizGui`
- JavaFX-Frontend mit:
  - Frageanzeige
  - Antwortbuttons
  - Punkteanzeige
  - Linkanzeige
  - Kategorien-Layout und Animationen je Themenbereich

### 2.2 Ablauf (vereinfacht)

1. `QuizGui` startet die Anwendung.
2. `QuizGame` laedt die Fragen ueber `FragenListe`.
3. GUI ruft naechste Frage ab (`getNextQuestion()`).
4. Nutzer waehlt Antwort.
5. `checkAnswer(...)` bewertet die Eingabe und aktualisiert Punkte.
6. Nach letzter Frage zeigt GUI das Endergebnis.

## 3. Klassen im Detail

## `Kategorie`

Verantwortung:
- Typensichere Festlegung der Themenbereiche.

Vorteil:
- Keine fehleranfaelligen Freitext-Kategorien in der Logik.

## `Question`

Wichtige Methoden:

- `getFrage()` liefert den Fragetext.
- `getAntworten()` liefert Antworten als Array in Reihenfolge A-D.
- `getCorrectAnswer()` liefert den korrekten Buchstaben.
- `getLink()` liefert die Quellen-URL.
- `getKategorie()` liefert die zugehoerige Kategorie.

Hinweis:
- Es existieren sowohl `getRichtigeAntwort()` als auch `getCorrectAnswer()`. Funktional liefern beide dieselbe Information.

## `FragenListe`

Wichtige Methoden:

- `fragenHinzufuegen()`
  - Fuellt die interne Liste mit fest hinterlegten Fragen.
- `getQuestions()`
  - Gibt den Fragenpool zurueck.
- `shuffleQuestions()`
  - Mischt die Reihenfolge.


## `QuizGame`

Wichtige Felder:

- `fragenListe`: alle Fragen
- `punkte`: aktueller Punktestand
- `aktuelleFrageIndex`: Fortschritt
- `playerName`: Name der spielenden Person
- `kategorie`: aktuelle Kategorie

Wichtige Methoden:

- `startNewGame()` setzt den Spielzustand zurueck.
- `getNextQuestion()` liefert die naechste Frage.
- `getAnswers()` liefert Antworttexte zur aktuellen Frage.
- `checkAnswer(char antwort)` prueft Antwort und vergibt Punkte.
- `isQuizFinished()` meldet Quiz-Ende.
- `getCorrectAnswer()` liefert die korrekte Antwort zur aktuellen Frage.
- `formatKategorie(Kategorie)` formatiert Enum-Namen lesbar.

Punktelogik:
- Richtige Antwort: +10 Punkte
- Falsche Antwort: +0 Punkte

## `QuizGui`

Verantwortung:
- Komplettes UI und Nutzerinteraktion.

Besonderheiten:
- Viele `ImageView`-Objekte fuer kategoriespezifische Szenen.
- Animationsklassen wie `FadeTransition`, `TranslateTransition`, `SequentialTransition`.
- Methoden fuer:
  - Quizstart
  - Fragewechsel
  - Antwortauswertung
  - Endbildschirm
  - Regeldialog

## 4. Ressourcen und Assets

Bilder liegen in `ressources/images/...` bzw. im Build-Ergebnis unter `bin/images/...`.
Die GUI laedt Assets ueber Klassenpfade wie:

- `/images/Klimawandel_und_Energie/AKW.png`

Wichtig:
- Der `images`-Ordner muss als Ressourcenordner mitkopiert werden.

## 5. Build- und Laufzeitumgebung

Moduldefinition in `module-info.java`:

- `requires javafx.controls;`
- `requires javafx.fxml;`
- `requires transitive javafx.graphics;`
- `requires javafx.media;`
- `exports Quiz;`

Startklasse:
- `Quiz.QuizGui`

## 6. Bekannte Auffaelligkeiten

1. Doppelte Durchmischung der Fragen
- `FragenListe` mischt bereits im Konstruktor.
- `QuizGame` mischt erneut nach dem Laden.
- Funktional in Ordnung, aber redundant.

2. Sprachkonsistenz
- Methodennamen sind gemischt (Deutsch/Englisch), z. B. `getRichtigeAntwort()` und `getCorrectAnswer()`.

## 7. Erweiterungsideen

- Fragen aus JSON/CSV statt hartkodiert laden.
- Kategorien als Filter im Startmenue auswahlen.
- Highscore-System (lokal speichern).
- Unit-Tests fuer `QuizGame` und `Question`.
- Internationalisierung (Deutsch/Englisch).

---

Stand: 2026-08-31
