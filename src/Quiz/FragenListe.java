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

	
				
				
				


	// Ressourcen der Erde_______________________________________________________________________________________________________

		
		fragen.add(new Question(
				"Wie viel Wasser wird für die Produktion einer Jeans benötigt?",
				"2500 Liter", "5000 Liter", "7500 Liter", "10000 Liter",
				'D',
				"https://www.badenova.de/blog/virtuelles-wasser/",
				Kategorie.RESSOURCEN_DER_ERDE
		));	

		fragen.add(new Question(
				"Wann war der sogenannte Earth Overshoot Day 2025 für Deutschland erreicht?",
				"3. Mai", "1. August", "16. September", "21. November",
				'A',
				"https://www.tagesschau.de/inland/oekologie-ressourcen-erdueberlastung-deutschland-100.html",
				Kategorie.RESSOURCEN_DER_ERDE
		));

		fragen.add(new Question(
				"Welches ist der begehrteste Rohstoff der Erde?",
				"Holz", "Rohöl", "Gold", "Sojabohnen",
				'B',
				"https://www.ig.com/de/trading-strategien/die-top-10-der-am-haeufigsten-gehandelten-rohstoffe-190206",
				Kategorie.RESSOURCEN_DER_ERDE
		));

		fragen.add(new Question(
				"Wie viel Prozent der weltweiten Wasserressourcen sind für Menschen als Trinkwasser nutzbar?",
				"Ca. 10 %", "Ca. 5 %", "Ca. 2,5 %", "Weniger als 1 %",
				'D',
				"https://www.quarks.de/umwelt/faq-so-viel-wasser-gibt-es-auf-der-erde/",
				Kategorie.RESSOURCEN_DER_ERDE
		));

		fragen.add(new Question(
				"Welcher Sektor verbraucht weltweit am meisten Wasser?",
				"Haushalte", "Industrie", "Landwirtschaft", "Energieerzeugung",
				'C',
				"https://www.wwf.de/themen-projekte/fluesse-seen/wasserverbrauch/wasser-verschwendung",
				Kategorie.RESSOURCEN_DER_ERDE
		));

				
		//Plastik und Müll____________________________________________________________________________________________________________


		fragen.add(new Question(
				"Welches Material ist am umweltfreundlichsten, wenn es um Verpackungen geht?",
				"Plastik", "Glas", "Aluminium", "Papier",
				'D',
				"https://www.nabu.de/umwelt-und-ressourcen/ressourcenschonung/einzelhandel-und-umwelt/nachhaltigkeit/30684.html",
				Kategorie.PLASTIK_UND_MUELL
		));

		fragen.add(new Question(
				"Wie viele Plastikflaschen werden weltweit etwa pro Minute verkauft?",
				"Ca. 500.000", "Ca. 750.000", "Ca. 1.000.000", "Ca. 1.250.000",
				'C',
				"https://www.kildwick.com/de/entdecken/wissenswertes/plastik-flaschen-in-deutschland-das-problem-mit-dem-muell",
				Kategorie.PLASTIK_UND_MUELL
				));

		fragen.add(new Question(
				"Wie viele Haushaltsabfälle produziert durchschnitttlich jeder Deutsche im Jahr?",
				"522 Kg", "433 Kg", "344 Kg", "255 Kg",
				'B',
				"https://www.destatis.de/DE/Themen/Gesellschaft-Umwelt/Umwelt/Abfallwirtschaft/_inhalt.html",
				Kategorie.PLASTIK_UND_MUELL
		));

		fragen.add(new Question(
				"Wie viel Liter Wasser verschmutzt ein einziger Zigarettenstummel?",
				"Ca. 40 - 60 Liter", "Ca. 20 - 40 Liter", "Ca. 60 - 80 Liter", "Ca. 100 Liter",
				'A',
				"https://wua-wien.at/umweltmanagement/abfallwirtschaft/2240-zigarettenstummel",
				Kategorie.PLASTIK_UND_MUELL
		));

		fragen.add(new Question(
				"Wie viel Gramm Plastik nimmt ein Mensch innerhalb einer Woche zu sich?",
				"Ca. 5 Gramm", "Ca. 4 Gramm", "Ca. 3 Gramm", "Ca. 2 Gramm",
				'A',
				"https://www.academia-superior.at/pro-woche-nimmt-ein-mensch-ca-5-gramm-mikroplastik-zu-sich/",
				Kategorie.PLASTIK_UND_MUELL
		));

		fragen.add(new Question(
				"Wie lange dauert es, bis eine Plastikflasche in der Natur zerfällt?",
				"100 Jahre", "250 Jahre", "450 Jahre", "1000 Jahre",
				'C',
				"https://www.nabu.de/umwelt-und-ressourcen/abfall-und-recycling/muellkippe-meer/23938.html",
				Kategorie.PLASTIK_UND_MUELL
		));

		//Ernährung und Lebensmittelverschwendung______________________________________________________________________________________


		//Die Parameter werden mit Komma getrennt, weil Sie Argumente einer Methode sind
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

				
						
		//Klimawandel und Energie_______________________________________________________________________________________________________ 


		fragen.add(new Question(
				"Welches Verkehrsmittel verursacht pro Personenkilometer am meisten CO2-Emissionen?",
				"Auto", "Flugzeug", "Zug", "Fahrrad",
				'B',
				"https://www.umweltbundesamt.de/themen/verkehr/emissionsdaten#verkehrsmittelvergleich_personenverkehr_tabelle",
				Kategorie.KLIMAWANDEL_UND_ENERGIE
		));

		fragen.add(new Question(
				"Welcher Industriezweig gilt nach der Energieerzeugung als der zweitgrößte Umweltverschmutzer?",
				"Bau- und Zementindustrie", "Transportwesen", "Landwirtschaft- und Fleischindustrie", "Mode- und Textilindustrie",
				'D',
				"https://www.quarks.de/umwelt/kleidung-so-macht-sie-unsere-umwelt-kaputt/",
				Kategorie.KLIMAWANDEL_UND_ENERGIE
		));

		fragen.add(new Question(
				"Welche der folgenden Energiequelle ist am Umweltfreundlichsten?",
				"Kohlekraft", "Atomkraft", "Geothermie", "Erdöl",
				'C',
				"https://energiewerke-mitteldeutschland.de/blogs/news/geothermie-und-solarenergie-zwei-wichtige-erneuerbare-energiequellen-im-vergleich",
				Kategorie.KLIMAWANDEL_UND_ENERGIE
				));

		fragen.add(new Question(
				"Welcher Sektor verursacht weltweit am meisten CO2-Emmissionen?",
				"Verkehr (Autos, Schiffe, Flugzeuge,...)", "Industrie (Fabriken, Produktion,...", "Haushalte (Strom, Heizung,...)", "Landwirtschaft",
				'B',
				"https://www.europarl.europa.eu/topics/de/article/20180301STO98928/treibhausgasemissionen-nach-landern-und-sektoren-infografik",
				Kategorie.KLIMAWANDEL_UND_ENERGIE
				));

		//Tiere und Artenvielfalt________________________________________________________________________________________________________


		fragen.add(new Question(
				"Welcher der folgenden Faktoren ist die größte Bedrohung für die Artenvielfalt weltweit?",
				"Natürliche Feinde und Räuber-Beute-Beziehungen", "Natürliche Klimaveränderungen", "Menschliche Aktivitäten wie Abholzung und Umweltverschmutzung", "Natürliche Umwelteinflüsse wie Erdbeben und Vulkanausbrüche",
				'C',
				"https://www.wwf.de/themen-projekte/artensterben",
				Kategorie.TIERE_UND_ARTENVIELFALT
		));

		fragen.add(new Question(
				"Warum sind Bienen besonders wichtig für die Artenvielfalt?",
				"Sie produzieren Honig, der für viele Tiere Lebenswichtig ist", "Sie bestäuben Pflanzen und sorgen für die Vermehrung zahlreicher Arten", "Sie dienen als Nahrung für viele Raubtiere", "Ohne Bienen gäbe es keine Regenwälder",
				'B',
				"https://www.bmel.de/DE/themen/landwirtschaft/artenvielfalt/bienen-fuettern/bienen-fuettern_node.html",
				Kategorie.TIERE_UND_ARTENVIELFALT
		));

		fragen.add(new Question(
				"Wie viele Tier- und Pflanzenarten sterben schätzungsweise jeden Tag aus?",
				"Ca. 20 - 30 Arten", "Ca. 50 - 80 Arten", "Ca. 100 - 120 Arten", "Ca. 130 - 150 Arten",
				'D',
				"https://www.greenpeace.de/biodiversitaet/artenkrise/artensterben",
				Kategorie.TIERE_UND_ARTENVIELFALT
		));

		fragen.add(new Question(
				"Wie viele Tier- und Pflanzenarten sind schätzungsweise aktuell von aussterben bedroht?",
				"Ca. 500.000 Arten", "Ca. 750.000 Arten", "Ca. 1.000.000 Arten", "Ca. 1.250.000 Arten",
				'D',
				"https://www.europarl.europa.eu/topics/de/article/20200519STO79424/bedrohte-arten-in-europa-zahlen-und-fakten-infografik",
				Kategorie.TIERE_UND_ARTENVIELFALT
		));

		fragen.add(new Question(
				"Wie hoch ist der Anteil der in freier Wildbahn lebenden Vögel im Vergleich zum gesamten Vogelbestand auf der Erde?",
				"Ca. 90 % – die meisten Vögel leben wild", "Ca. 50 % – die Hälfte lebt in Freiheit", "Nur ca. 30 % – der Rest ist Geflügel für den menschlichen Gebrauch",
				"Unter 10 % – fast alle Vögel werden vom Menschen gehalten",
				'C',
				"https://albert-schweitzer-stiftung.de/aktuell/jedes-zweite-saeugetier-ist-ein-nutztier",
				Kategorie.TIERE_UND_ARTENVIELFALT
		));

		fragen.add(new Question(
				"Welchen Anteil macht die menschliche Biomasse an der gesamten Biomasse auf der Erde aus?",
				"Ca. 0,01 % – der Mensch ist biologisch kaum ins Gewicht fallend", "Ca. 0,06 % – trotz technischer Dominanz biologisch gering vertreten",
				"Ca. 1 % – der Mensch stellt einen bedeutenden Anteil dar", "Über 10 % – der Mensch überwiegt die meisten Lebensformen deutlich",
				'A',
				"https://www.goclimate.de/glossar/biomasse/weltweit/#biomasseverteilung-der-biomasse-der-erde",
				Kategorie.TIERE_UND_ARTENVIELFALT
		));

		fragen.add(new Question(
				"Wie hoch ist der Anteil der vom Menschen gehaltenen Nutztiere, gemessen an der weltweiten Säugetierpopulation?",
				"Ca. 20 % – der Großteil sind wildlebende Tiere", "Ca. 40 % – knapp die Hälfte sind Nutztiere",
				"Ca. 60 % – mehr als die Hälfte sind Nutztiere", "Über 80 % – fast alle Säugetiere sind Nutztiere",
				'C',
				"https://albert-schweitzer-stiftung.de/aktuell/jedes-zweite-saeugetier-ist-ein-nutztier",
				Kategorie.TIERE_UND_ARTENVIELFALT
		));
				
				
				
				
		//Was kann ICH tun?______________________________________________________________________________________________________________


		fragen.add(new Question(
				"Welche Art der Beleuchtung ist am energieeffizientesten?",
				"Glühlampen", "Halogenlampen", "LED-Lampen", "Leuchtstoffröhren",
				'C',
				"https://www.verbraucherzentrale.de/wissen/energie/strom-sparen/strom-sparen-im-haushalt-einfache-tipps-10734",
				Kategorie.WAS_KANN_ICH_TUN
		));

		fragen.add(new Question(
				"Was kann ich tun, um die Artenvielfalt im eigenen Garten zu fördern?",
				"Einen Steingarten anlegen und regelmäßig mähen", "Exotische Zierpflanzen anpflanzen und Pestizide nutzen", "Wildblumen pflanzen und Insektenhotels aufstellen", "Den Garten komplett versiegeln und Unkraut vermeiden",
				'C',
				"https://www.nabu.de/umwelt-und-ressourcen/oekologisch-leben/balkon-und-garten/tiere/index.html",
				Kategorie.WAS_KANN_ICH_TUN
		));

		fragen.add(new Question(
				"Was ist eine effektive Maßnahme, um den Stromverbrauch im Haushalt zu senken?",
				"Energiesparlampen durch LED-Lampen ersetzen", "Küchengeräte nachts eingeschaltet lassen, um Stromspitzen zu vermeiden",
				"Elektrische Geräte an mehreren Einzelsteckdosen anschließen", "Kühlschrank regelmäßig offen stehen lassen zur Lüftung",
				'A',
				"https://www.co2online.de/energie-sparen/strom-sparen/strom-sparen-stromspartipps/strom-sparen-tipps-und-tricks/",
				Kategorie.WAS_KANN_ICH_TUN
		));

		fragen.add(new Question(
				"Wodurch kann man beim Einkauf die Umwelt besonders gut entlasten?",
				"Obst und Gemüse einzeln kaufen, auch wenn sie in Plastik verpackt sind", "Produkte in großen Mengen kaufen, auch wenn man sie nicht vollständig braucht",
				"Auf regionale und saisonale Produkte achten", "Tiefkühlware bevorzugen, da sie länger haltbar ist",
				'C',
				"https://www.nabu.de/umwelt-und-ressourcen/ressourcenschonung/einzelhandel-und-umwelt/nachhaltigkeit/21716.html",
				Kategorie.WAS_KANN_ICH_TUN
		));

		fragen.add(new Question(
				"Wie kann man beim Duschen Wasser und Energie sparen?",
				"Warmwasser vorlaufen lassen, bis es heiß genug ist", "Energiespar-Duschkopf verwenden und kürzer duschen",
				"Mit heißem Wasser duschen, aber dafür seltener", "Am besten morgens und abends kurz duschen",
				'B',
				"https://www.ndr.de/ratgeber/verbraucher/So-laesst-sich-beim-Duschen-Wasser-und-Geld-sparen,wassersparen104.html",
				Kategorie.WAS_KANN_ICH_TUN
		));

		fragen.add(new Question(
				"Was ist eine nachhaltige Alternative zu Fast Fashion?",
				"Kleidung beim Discountern kaufen", "Hochwertige Markenprodukte kaufen, unabhängig von Produktionsbedingungen",
				"Secondhand oder Kleidertauschbörsen nutzen", "Kleidung entsorgen und regelmäßig neu kaufen",
				'C',
				"https://www.wissenmachtklima.de/fast-fashion-slow-fashion/",
				Kategorie.WAS_KANN_ICH_TUN
		));

		fragen.add(new Question(
				"Wie kann man den CO₂-Ausstoß in der Ernährung deutlich senken?",
				"Möglichst viel tiefgekühlte Fertiggerichte verwenden", "Auf regionale Fleischprodukte umsteigen",
				"Mehr pflanzliche Lebensmittel essen und Fleisch reduzieren", "Lebensmittel immer aus dem Supermarkt kaufen, egal woher sie stammen",
				'C',
				"https://www.naturefund.de/wissen/kompensation/reduzieren/ernaehrungsweise",
				Kategorie.WAS_KANN_ICH_TUN
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

