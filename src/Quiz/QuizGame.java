package Quiz;

import java.util.ArrayList;
import java.util.Collections;

public class QuizGame {
    private ArrayList<Question> fragenListe;
    private int punkte;
    private String playerName;
    private int aktuelleFrageIndex;
    private Kategorie kategorie;		// Speichert die aktuelle Kategorie der Frage als Enum-Typ (anstatt als String).

// Konstruktor
public QuizGame() {
	fragenListe = new FragenListe().getQuestions();
    Collections.shuffle(fragenListe); // Fragen mischen
    punkte = 0;
    aktuelleFrageIndex = 0;
    playerName = "";
    }
    
// Setzt den Spielernamen:
public void setPlayerName(String name) {
	this.playerName = name;
    }
    
// Gibt den Spielernamen zurück
public String getplayerName() {
   	return playerName;
    }

// Startet ein neues Spiel (setzt alles zurück)
public void startNewGame() {
	fragenListe = new FragenListe().getQuestions();
		Collections.shuffle(fragenListe);
        punkte = 0;
        aktuelleFrageIndex = 0;
    }

// Startet das Quiz
public String getNextQuestion() {
	if (aktuelleFrageIndex < fragenListe.size()) {
		Question frage = fragenListe.get(aktuelleFrageIndex);
        aktuelleFrageIndex++;
        kategorie = frage.getKategorie();
            return frage.getFrage();
        }
        	return null; // Keine Fragen mehr übrig
    	}

// Gibt die Antwortmöglichkeiten einer Frage zurück
public String[] getAnswers() {
	if (aktuelleFrageIndex <= fragenListe.size()) {
		Question frage = fragenListe.get(aktuelleFrageIndex - 1);
        	return frage.getAntworten();  // Gibt alle Antworten als Array zurück
        }
        	return null;
    	}

// Überprüft die Antwort und gibt Feedback
public boolean checkAnswer(char antwort) {
	Question frage = fragenListe.get(aktuelleFrageIndex - 1);
		if (antwort == frage.getCorrectAnswer()) {
			punkte += 10;
		return true; // Richtig
        }
        return false; // Falsch
    }

// Gibt die aktuelle Punktzahl zurück
public int getPunkte() {
	return punkte;
    }

// Gibt den Link zur Quelle der Frage zurück
public String getLink() {
	if (aktuelleFrageIndex > 0 && aktuelleFrageIndex <= fragenListe.size()) {
		Question frage = fragenListe.get(aktuelleFrageIndex - 1);
	return frage.getLink();
	}
	return null;  // Rückgabe von null, wenn keine Frage angezeigt wird
    }


// Gibt zurück, ob das Quiz zu Ende ist
public boolean isQuizFinished() {
	return aktuelleFrageIndex >= fragenListe.size();
    }
    
// Methode: Gibt die korrekte Antwort der aktuellen Frage zurück
public char getCorrectAnswer() {
	if(aktuelleFrageIndex > 0 && aktuelleFrageIndex <= fragenListe.size()) {
		Question frage = fragenListe.get(aktuelleFrageIndex - 1);
// gibt die korrekte Antwort zurück
	return frage.getCorrectAnswer();
    	}
// Rückgabe eines leeren Zeichens, falls keine Frage vorhanden ist
	return ' ';
    }
    
// Methode: Gibt die Kategorie der aktuellen Frage zurück
public Kategorie getKategorie() {
	return this.kategorie;
}
    
// Methode: setzt die Kategorie in die aktuelle Frage:
public void setKategorie(Kategorie kategorie) {
	this.kategorie = kategorie;
}
   
// Formatiert die Kategorie schön lesbar:
public static String formatKategorie(Kategorie kategorie) {	
	
// EnumName wird in Kleinbuchstaben umgewandelt und von den unterstrichen getrennt
    String[] worte = kategorie.name().toLowerCase().split("_");
    
// StringBuilder: um viele Wörter sauber aneinanderzuhängen, ohne jedes mal neue Strings zu erstellen
    StringBuilder formatierterText = new StringBuilder();
    
// Liste der Wörter, die klein geschrieben werden sollen (außer am Satzanfang)
    String[] kleinschreibung = {"der", "die", "das", "und", "im", "in", "von", "mit", "auf", "für", "am"};
    
// Schleife über alle Wörter im Array:
    for (int i = 0; i < worte.length; i++) {
    	String wort = worte[i];
    	if (wort.length() > 0) {
    		
// Prüfen: ob wir beim ersten Wort sind:
    		boolean istErstesWort = (i==0);
    		
// Prüfen: ob aktuelles Wort in der Kleinschreibungsliste steht und nicht das erste Wort ist:
    		boolean sollKleinSein = !istErstesWort && java.util.Arrays.asList(kleinschreibung).contains(wort);
    		
    	if (sollKleinSein) {
// Wort soll kleingeschrieben bleiben:
   			formatierterText.append(wort);
      }else{
    	  
// Wort wird mit Großbuchstaben am Anfang geschrieben:
    	  	formatierterText.append(Character.toUpperCase(wort.charAt(0)));
    		formatierterText.append(wort.substring(1));
    }
// Leerzeichen nach jedem Wort:
    		formatierterText.append(" ");
    }
    }
    
// Am Ende alle Leerzeichen entfernen (z.B. nach dem letzten Wort)    
    return formatierterText.toString().trim();
	}
	}
 







