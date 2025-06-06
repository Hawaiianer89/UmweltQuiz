package Quiz;

import java.util.ArrayList;
import java.util.Collections;

public class FragenListe {
	private ArrayList<Question> fragen;
	
	
//Konstruktor: erstellt die Liste und fügt Fragen hinzu
public FragenListe() {
	fragen = new ArrayList<>();
	fragenHinzufuegen();
	shuffleQuestions(); 		//Fragen direkt beim erstellen mischen
}
	

//Methode zum hinzufügen von Beispielfragen
private void fragenHinzufuegen() {

	



//Ernährung und Lebensmittelverschwendung______________________________________________________________________________________

		fragen.add(new Question(
				"Wie viel der von uns weltweit produzierten Lebensmittel landen in der Mülltonne?",
				"Ca. 20%", "Ca. 30%", "Ca. 40%", "Ca. 50%",
				'C',
				"https://www.wwf.at/wwf-report-40-prozent-der-weltweit-produzierten-lebensmittel-werden-verschwendet/",
				Kategorie.ERNAEHRUNG_UND_LEBENSMITTELVERSCHWENDUNG
		));

		fragen.add(new Question(
				"Welcher Fleischkonsum verursacht am meisten Treibhausgasemissionen?",
				"Schweinefleisch", "Rindfleisch", "Hühnerfleisch", "Fisch",
				'B',
				"https://www.wwf.de/themen-projekte/landwirtschaft/ernaehrung-konsum/fleisch/der-appetit-auf-fleisch-und-seine-folgen",
				Kategorie.ERNAEHRUNG_UND_LEBENSMITTELVERSCHWENDUNG
		));

		fragen.add(new Question(
				"Welches Lebensmittel wird in deutschen Haushalten am häufigsten weggeworfen?",
				"Brot- und Backwaren", "Obst und Gemüse", "Fleisch und Fisch", "Milchprodukte",
				'B',
				"https://www.bmel.de/DE/themen/ernaehrung/lebensmittelverschwendung/gfk-studie.html",
				Kategorie.ERNAEHRUNG_UND_LEBENSMITTELVERSCHWENDUNG
				));

		fragen.add(new Question(
				"Welches dieser Lebensmittel kann meistens noch nach Ablauf des MHD bedenkenlos essen?",
				"Joghurt", "Eier", "Frischer Fisch", "Milchprodukte",
				'A',
				"https://www.ndr.de/ratgeber/verbraucher/Mindesthaltbarkeitsdatum-ist-kein-Verfallsdatum,lebensmittel662.html",
				Kategorie.ERNAEHRUNG_UND_LEBENSMITTELVERSCHWENDUNG
				));

		fragen.add(new Question(
				"Welche Ernährung hat den geringsten ökologischen Fußabdruck?",
				"Mischkost mit Fleisch", "Vegetarische Ernährung", "Paleo-Diät", "Vegane Ernährung",
				'D',
				"https://www.umweltbundesamt.de/umwelttipps-fuer-den-alltag/essen-trinken/klima-umweltfreundliche-ernaehrung#so-ernahren-sie-sich-nachhaltig-und-gesund",
				Kategorie.ERNAEHRUNG_UND_LEBENSMITTELVERSCHWENDUNG
				));

		fragen.add(new Question(
				"Wieviel Liter Wasser wird für die Produktion von einem Kilo Rindfleisch benötigt?",
				"Ca. 500 Liter", "Ca. 1500 Liter", "Ca. 5000 Liter", "Ca. 15.000 Liter",
				'D',
				"https://wfd.de/themen/wasserfussabdruck-von-fleisch/",
				Kategorie.ERNAEHRUNG_UND_LEBENSMITTELVERSCHWENDUNG
				));

	
	
}


//Methode um die Liste der Fragen zu erhalten
public ArrayList<Question> getQuestions() {
	return fragen;
}

//Methode um die Reihenfolge der Fragen zu mischen
public void shuffleQuestions() {
	Collections.shuffle(fragen);
}
}

