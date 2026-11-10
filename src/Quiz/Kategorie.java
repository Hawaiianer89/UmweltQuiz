



/**
 *  Ein Enum (kurz für Enumeration / Aufzählung) in Java ist ein spezieller Datentyp, 
 *  der eine feste, unveränderliche Menge von vordefinierten Konstanten repräsentiert.
 *  
 *  
 *  Hier definieren wir die Kategorien der Fragen welche im Quiz vorkommen.
 *  
 *  
 *  Repräsentiert die verschiedenen Themenkategorien für die Fragen im Quiz.
 *
 *  Dieses Enum dient der Typensicherheit in der Klasse FragenListe,
 *  um sicherzustellen, dass jede Frage einer vordefinierten und gültigen 
 *  Kategorie zugeordnet wird.
 */

//=====================================================================================================================

package Quiz;

//=====================================================================================================================

public enum Kategorie {

//=====================================================================================================================
	
	// Kategorien in die die Fragen aufgeteilt sind:
	// Formatierung
	
	RESSOURCEN_DER_ERDE,
	PLASTIK_UND_MUELL,
	ERNAEHRUNG_UND_LEBENSMITTELVERSCHWENDUNG,
	KLIMAWANDEL_UND_ENERGIE,
	TIERE_UND_ARTENVIELFALT,
	WAS_KANN_ICH_TUN
}

