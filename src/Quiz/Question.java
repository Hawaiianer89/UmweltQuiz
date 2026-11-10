



package Quiz;

//=====================================================================================================================

// Die Klasse speichert die einzelnen Fragen
public class Question {		

//=====================================================================================================================
	
	// Variablen deklarieren:
	private String frage;				// Fragetext
	private String antwortA;			// Antwortmöglichkeit A
	private String antwortB;			// Antwortmöglichkeit B
	private String antwortC;			// Antwortmöglichkeit C
	private String antwortD;			// Antwortmöglichkeit D
	private char richtigeAntwort;		// Die Richtige Antwort ('A', 'B', 'C', 'D')
	private String link;				// Link für mehr infos
	private Kategorie kategorie;		// Fragen in Kategorien einteilen
	
//=====================================================================================================================

	// Konstruktor, wird aufgerufen, wenn eine neue Frage erstellt wird:
	// befüllt Variablen (frage, antwortA, antwortB...) mit den richtigen Werten
	public Question(String frage, String antwortA, String antwortB, String antwortC, String antwortD, char richtigeAntwort, String link, Kategorie kategorie) {
		this.frage = frage;							// setzt den Fragetext
		this.antwortA = antwortA;					// setzt Antwort A
		this.antwortB = antwortB;					// setzt Antwort B
		this.antwortC = antwortC;					// setzt Antwort C
		this.antwortD = antwortD;					// setzt Antwort D
		this.richtigeAntwort = richtigeAntwort; 	// speichert die richtige Antwort
		this.link = link;							// speichert den Link zur Erklärung
		this.kategorie = kategorie;					// speichert die Kategorie der Frage
	}

// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -
	
// Getter Methoden: ermöglicht Zugriff auf Variablen von außen
// können von außen nicht direkt verändert werden

	// Gibt den Fragetext zurück:
	public String getFrage() {
		return frage;
	}

// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -
	
	// Gibt die Antworten A - D zurück:
	public String getAntwortA() {
		return antwortA;
	}	
	public String getAntwortB() {
		return antwortB;
	}
	public String getAntwortC() {
		return antwortC;
	}
	public String getAntwortD() {
		return antwortD;
	}
	
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -

	// Gibt die richtige Antwort zurück	
	public char getRichtigeAntwort() {
		return richtigeAntwort;
	}
	
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -

	// Gibt den info Link zurück	
	public String getLink() {
		return link;
	}

// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -
	
	// Gibt Kategorie zurück:
	public Kategorie getKategorie() {
		return kategorie;
	}
	
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -

	// Methode: gibt Antwortmöglichkeiten in einem Array zurück:
	public String[] getAntworten() {
		return new String[] {antwortA, antwortB, antwortC, antwortD};
	}
	
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -

	// Methode: gibt korrekte Antwort zurück:
	public char getCorrectAnswer() {
		return richtigeAntwort;
	}
	
// -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -   -
	
}




