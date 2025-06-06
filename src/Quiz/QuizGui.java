package Quiz;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;			// Importiert die KeyFrame-Klasse für Animationen in JavaFX -> definiert eine Aktion, die zu einem bestimmten Zeitpunkt in einer Animation ausgeführt wird						 
import javafx.animation.Timeline;			// Importiert Timeline-Klasse, die eine Abfolge von KeyFrames für Animationen verwaltet.
import javafx.animation.TranslateTransition;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.animation.Animation;

import javafx.scene.Scene;					// Importiert Scene-Klasse, die die "Bühne" für alle visuellen JavaFX-Elemente darstellt.
import javafx.scene.control.*;				// Importiert alle Bedienelemente (Controls) wie Label, Button, TextField usw. -> Gehört zur GUI.
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;			// Importiert-Layout, ein generisches Layout zur Positionierung von GUI-Elementen.
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;			// Importiert VBox-Layout, das Elemente vertikal untereinander anordnet.
import javafx.scene.text.Font;				// Schriftarten, größe eines Textes in der GUI
import javafx.scene.text.TextAlignment;
import javafx.scene.transform.Rotate;

import javafx.application.Application;		// Importiert Application-Klasse, die die Einstiegsklasse für jede JavaFX-Anwendung darstellt.
import javafx.application.Platform;

import javafx.geometry.Rectangle2D;
import javafx.geometry.Bounds;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;					// Importiert Stage-Klasse, die das Hauptfenster einer JavaFX-Anwendung repräsentiert.
import javafx.util.Duration;				// Importiert Duration-Klasse, die für zeitbasierte Operationen wie Animationen verwendet wird.





public class QuizGui extends Application {					// Die Klasse QuizGui erbt von Application und ist somit eine JavaFX-Anwendung.
    private QuizGame quizGame;								// Ein Objekt der Klasse QuizGame, das die Spiellogik verwaltet (Fragen, Punkte, etc.).

// GUI-Elemente
    private Label questionLabel;
    private Button answerA, answerB, answerC, answerD;
    private Label pointsLabel;
    private Hyperlink linkLabel;
    private Label kategorieLabel;
    private Stage rulesStage; 

// Hintergrund-Bilder
    private Pane backgroundPane;

// Klimawandel und Energie
    private ImageView akwImageView;
    private ImageView rauchImageView1;
    private ImageView rauchImageView2;

// Ernährung und Lebensmittelverschwendung    
    private ImageView tischImageView;
    private ImageView essen1ImageView;
    private ImageView essen2ImageView;
    private ImageView essen3ImageView;
    private ImageView essen4ImageView;
    private ImageView essen5ImageView;
    private ImageView essen6ImageView;
    private ImageView essen7ImageView;
    
// Plastik und Müll    
    private ImageView muellDeponieImageView;
    private ImageView voegelImageView1;
    private ImageView voegelImageView2;
    
// Ressoiuren der Erde     
    private ImageView waldWegImageView;
    private ImageView baum1ImageView;
    private ImageView baum2ImageView;
    private ImageView baum3ImageView;
    private ImageView baum4ImageView;
       
// Tiere und Artenvielfalt    
    private ImageView erdlochImageView;
    private ImageView erdmaennchen1ImageView;
    private ImageView erdlochPatch1ImageView;    
    private ImageView erdmaennchen2ImageView;
    private ImageView erdlochPatch2ImageView;
    private ImageView erdmaennchen3ImageView;
    private ImageView erdlochPatch3ImageView;
    private ImageView erdmaennchen4ImageView;
    
// Was kann ich tun 
    private ImageView mondBlickImageView;
    private ImageView erdRotationImageView;
    private ImageView sterneImageView;
    private ImageView komet1ImageView;
    private ImageView komet2ImageView;
    private ImageView komet3ImageView;

// VBoxen wo Text und Buttons drin sind    
    private VBox infoBox;		// Kategorie und Frage
    private VBox antwortBox;	// AntwortButtons
    private VBox bottomBox;		// Punktzahl und Link

    
    


    public static void main(String[] args) {			// main-Methode ist der Einstiegspunkt der Anwendung.
    	launch(args);									// Startet die JavaFX-Anwendung – ruft automatisch die start(Stage stage)-Methode auf
    	}

    
    
    @Override
    public void start(Stage primaryStage) {
        quizGame = new QuizGame();
                   
        backgroundPane = new Pane();
        Scene scene1 = new Scene(backgroundPane, 800, 600);
        primaryStage.setScene(scene1);
        primaryStage.show();

//===========================================================
// =================[Klimawandel und Energie]================
//===========================================================
        
// AKW als Hintergrund
        akwImageView = new ImageView(new Image(getClass().getResource("/images/Klimawandel_und_Energie/AKW.png").toExternalForm()));
        akwImageView.setFitWidth(800);
        akwImageView.setFitHeight(600);
        akwImageView.setPreserveRatio(false);
        akwImageView.setVisible(false);
        
// Rauchbild für AKW_Turm 1: links
        rauchImageView1 = new ImageView(new Image(getClass().getResource("/images/Klimawandel_und_Energie/AKWRauch.png").toExternalForm()));
        rauchImageView1.setX(450);
        rauchImageView1.setY(60);
        rauchImageView1.setFitWidth(100);
        rauchImageView1.setFitHeight(160);
        rauchImageView1.setVisible(false);
// Rauch 1 animieren für AKW Bild: 
        TranslateTransition moveRauch1 = new TranslateTransition(Duration.seconds(4), rauchImageView1);
        moveRauch1.setByY(-30);
        moveRauch1.setAutoReverse(true);
        moveRauch1.setCycleCount(TranslateTransition.INDEFINITE);
        moveRauch1.play();
// leichte Transparenz-Animation damit es vernebelt aussieht (Rauch 1):
        FadeTransition fadeRauch = new FadeTransition(Duration.seconds(4), rauchImageView1);
        fadeRauch.setFromValue(1.0);
        fadeRauch.setToValue(0.3);
        fadeRauch.setAutoReverse(true);
        fadeRauch.setCycleCount(FadeTransition.INDEFINITE);
        fadeRauch.play();
        
// Rauchbild für AKW_Turm 2: rechts
        rauchImageView2 = new ImageView(new Image(getClass().getResource("/images/Klimawandel_und_Energie/AKWRauch.png").toExternalForm()));
        rauchImageView2.setX(550);
        rauchImageView2.setY(60);
        rauchImageView2.setFitWidth(100);
        rauchImageView2.setFitHeight(160);
        rauchImageView2.setVisible(false);     
// Rauch 2 animieren für AKW Bild:
        TranslateTransition moveRauch2 = new TranslateTransition(Duration.seconds(4), rauchImageView2);
        moveRauch2.setByY(-30);
        moveRauch2.setAutoReverse(true);
        moveRauch2.setCycleCount(TranslateTransition.INDEFINITE);
        moveRauch2.play();       
// leichte Transparenz-Animation damit es vernebelt aussieht(Rauch 2):
        FadeTransition fadeRauch1 = new FadeTransition(Duration.seconds(4), rauchImageView2);
        fadeRauch1.setFromValue(1.0);
        fadeRauch1.setToValue(0.3);
        fadeRauch1.setAutoReverse(true);
        fadeRauch1.setCycleCount(FadeTransition.INDEFINITE);
        fadeRauch1.play();
       
        
        
//============================================================================
//=================[Ernaehrung und Lebensmittelverschwendung]=================
//============================================================================
        
// Tisch als Hintergrund
        tischImageView = new ImageView(new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/Tisch.png").toExternalForm()));
        tischImageView.setFitWidth(800);
        tischImageView.setFitHeight(600);
        tischImageView.setPreserveRatio(false);
        tischImageView.setVisible(false);   
        
// Lebensmittel1 hinzufügen:
        essen1ImageView = new ImageView (new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/Lebensmittel1.png").toExternalForm()));
        essen1ImageView.setX(570);
        essen1ImageView.setY(350);
        essen1ImageView.setFitWidth(250);
        essen1ImageView.setFitHeight(250);
        essen1ImageView.setVisible(false);
// Lebensmittel1: Einblenden
        FadeTransition essen1Einblenden = new FadeTransition(Duration.seconds(3.5), essen1ImageView);
        essen1Einblenden.setFromValue(0.0);
        essen1Einblenden.setToValue(1.0);
        essen1Einblenden.setCycleCount(1);
// Kurze Pause nach dem ersten Einblenden
        PauseTransition pause1NachEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel1: Ausblenden
        FadeTransition essen1Ausblenden = new FadeTransition(Duration.seconds(3.5), essen1ImageView);
        essen1Ausblenden.setFromValue(1.0);
        essen1Ausblenden.setToValue(0.0);
        essen1Ausblenden.setCycleCount(1);
// Kurze Pause vor dem zweiten Einblenden
        PauseTransition pause1VorZweitemEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel1: Zweites Einblenden
        FadeTransition essen1ZweitesEinblenden = new FadeTransition(Duration.seconds(3.5), essen1ImageView);
        essen1ZweitesEinblenden.setFromValue(0.0);
        essen1ZweitesEinblenden.setToValue(1.0);
        essen1ZweitesEinblenden.setCycleCount(1);
// Startverzögerung
        PauseTransition warteKurz1 = new PauseTransition(Duration.seconds(6));
// Alles zusammen in eine Sequenz
        SequentialTransition animationEssen1 = new SequentialTransition(
            warteKurz1,
            essen1Einblenden,
            pause1NachEinblenden,
            essen1Ausblenden,
            pause1VorZweitemEinblenden,
            essen1ZweitesEinblenden
        	);
// Animation starten
        	animationEssen1.play();
// Animation endlos wiederholen:
        	animationEssen1.setCycleCount(Animation.INDEFINITE);
 
        
// Lebensmittel2 hinzufügen:
        essen2ImageView = new ImageView(new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/ServierVorschlag1.png").toExternalForm()));
        essen2ImageView.setX(200);
        essen2ImageView.setY(300);
        essen2ImageView.setFitWidth(300);
        essen2ImageView.setFitHeight(300);
        essen2ImageView.setVisible(false);
// Lebensmittel2: Einblenden
        FadeTransition essen2Einblenden = new FadeTransition(Duration.seconds(3.5), essen2ImageView);
        essen2Einblenden.setFromValue(0.0);
        essen2Einblenden.setToValue(1.0);
        essen2Einblenden.setCycleCount(1);
// Kurze Pause nach dem ersten Einblenden
        PauseTransition pause2NachEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel2: Ausblenden
        FadeTransition essen2Ausblenden = new FadeTransition(Duration.seconds(3.5), essen2ImageView);
        essen2Ausblenden.setFromValue(1.0);
        essen2Ausblenden.setToValue(0.0);
        essen2Ausblenden.setCycleCount(1);
// Kurze Pause vor dem zweiten Einblenden
        PauseTransition pause2VorZweitemEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel2: Zweites Einblenden
        FadeTransition essen2ZweitesEinblenden = new FadeTransition(Duration.seconds(3.5), essen2ImageView);
        essen2ZweitesEinblenden.setFromValue(0.0);
        essen2ZweitesEinblenden.setToValue(1.0);
        essen2ZweitesEinblenden.setCycleCount(1);
// Startverzögerung
        PauseTransition warteKurz2 = new PauseTransition(Duration.seconds(6));
// Alles zusammen in eine Sequenz
        SequentialTransition animationEssen2 = new SequentialTransition(
            warteKurz2,
            essen2Einblenden,
            pause2NachEinblenden,
            essen2Ausblenden,
            pause2VorZweitemEinblenden,
            essen2ZweitesEinblenden
        	);
// Animation starten
        	animationEssen2.play();
// Animation endlos wiederholen:
        	animationEssen2.setCycleCount(Animation.INDEFINITE);
     
        
// Lebensmittel3 hinzufügen:
        essen3ImageView = new ImageView (new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/Trocken2.png").toExternalForm()));
        essen3ImageView.setX(400);
        essen3ImageView.setY(380);
        essen3ImageView.setFitWidth(250);
        essen3ImageView.setFitHeight(230);
        essen3ImageView.setVisible(false);
// Lebensmittel3: Einblenden
        FadeTransition essen3Einblenden = new FadeTransition(Duration.seconds(3.5), essen3ImageView);
        essen3Einblenden.setFromValue(0.0);
        essen3Einblenden.setToValue(1.0);
        essen3Einblenden.setCycleCount(1);
// Kurze Pause nach dem ersten Einblenden
        PauseTransition pause3NachEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel3: Ausblenden
        FadeTransition essen3Ausblenden = new FadeTransition(Duration.seconds(3.5), essen3ImageView);
        essen3Ausblenden.setFromValue(1.0);
        essen3Ausblenden.setToValue(0.0);
        essen3Ausblenden.setCycleCount(1);
// Kurze Pause vor dem zweiten Einblenden
        PauseTransition pause3VorZweitemEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel3: Zweites Einblenden
        FadeTransition essen3ZweitesEinblenden = new FadeTransition(Duration.seconds(3.5), essen3ImageView);
        essen3ZweitesEinblenden.setFromValue(0.0);
        essen3ZweitesEinblenden.setToValue(1.0);
        essen3ZweitesEinblenden.setCycleCount(1);
// Startverzögerung
        PauseTransition warteKurz3 = new PauseTransition(Duration.seconds(6));
// Alles zusammen in eine Sequenz
        SequentialTransition animationEssen3 = new SequentialTransition(
            warteKurz3,
            essen3Einblenden,
            pause3NachEinblenden,
            essen3Ausblenden,
            pause3VorZweitemEinblenden,
            essen3ZweitesEinblenden
        );
// Animation starten
        	animationEssen3.play();
// Animation endlos wiederholen:
        	animationEssen3.setCycleCount(Animation.INDEFINITE);
              
        	
// Lebensmittel4 hinzufügen:
        essen4ImageView = new ImageView (new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/Trocken3.png").toExternalForm()));
        essen4ImageView.setX(180);
        essen4ImageView.setY(250);
        essen4ImageView.setFitWidth(350);
        essen4ImageView.setFitHeight(300);
        essen4ImageView.setVisible(false); 
// Lebensmittel4: Einblenden
        FadeTransition essen4Einblenden = new FadeTransition(Duration.seconds(3.5), essen4ImageView);
        essen4Einblenden.setFromValue(0.0);
        essen4Einblenden.setToValue(1.0);
        essen4Einblenden.setCycleCount(1);
// Kurze Pause nach dem ersten Einblenden
        PauseTransition pause4NachEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel4: Ausblenden
        FadeTransition essen4Ausblenden = new FadeTransition(Duration.seconds(3.5), essen4ImageView);
        essen4Ausblenden.setFromValue(1.0);
        essen4Ausblenden.setToValue(0.0);
        essen4Ausblenden.setCycleCount(1);
// Kurze Pause vor dem zweiten Einblenden
        PauseTransition pause4VorZweitemEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel4: Zweites Einblenden
        FadeTransition essen4ZweitesEinblenden = new FadeTransition(Duration.seconds(3.5), essen4ImageView);
        essen4ZweitesEinblenden.setFromValue(0.0);
        essen4ZweitesEinblenden.setToValue(1.0);
        essen4ZweitesEinblenden.setCycleCount(1);
// Startverzögerung
        PauseTransition warteKurz4 = new PauseTransition(Duration.seconds(6));
// Alles zusammen in eine Sequenz
        SequentialTransition animationEssen4 = new SequentialTransition(
            warteKurz4,
            essen4Einblenden,
            pause4NachEinblenden,
            essen4Ausblenden,
            pause4VorZweitemEinblenden,
            essen4ZweitesEinblenden
        );
// Animation starten
        	animationEssen4.play();
// Animation endlos wiederholen:
        	animationEssen4.setCycleCount(Animation.INDEFINITE);
              
        	
// Lebensmittel5 hinzufügen:
        essen5ImageView = new ImageView (new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/TüteLebensmittel1.png").toExternalForm()));
        essen5ImageView.setX(-20);
        essen5ImageView.setY(320);
        essen5ImageView.setFitWidth(300);
        essen5ImageView.setFitHeight(300);
        essen5ImageView.setVisible(false);
        essen5ImageView.setRotate(-10);
// Lebensmittel5: Einblenden
        FadeTransition essen5Einblenden = new FadeTransition(Duration.seconds(3.5), essen5ImageView);
        essen5Einblenden.setFromValue(0.0);
        essen5Einblenden.setToValue(1.0);
        essen5Einblenden.setCycleCount(1);
// Kurze Pause nach dem ersten Einblenden
        PauseTransition pause5NachEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel5: Ausblenden
        FadeTransition essen5Ausblenden = new FadeTransition(Duration.seconds(3.5), essen5ImageView);
        essen5Ausblenden.setFromValue(1.0);
        essen5Ausblenden.setToValue(0.0);
        essen5Ausblenden.setCycleCount(1);
// Kurze Pause vor dem zweiten Einblenden
        PauseTransition pause5VorZweitemEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel5: Zweites Einblenden
        FadeTransition essen5ZweitesEinblenden = new FadeTransition(Duration.seconds(3.5), essen5ImageView);
        essen5ZweitesEinblenden.setFromValue(0.0);
        essen5ZweitesEinblenden.setToValue(1.0);
        essen5ZweitesEinblenden.setCycleCount(1);
// Startverzögerung
        PauseTransition warteKurz5 = new PauseTransition(Duration.seconds(6));
// Alles zusammen in eine Sequenz
        SequentialTransition animationEssen5 = new SequentialTransition(
            warteKurz5,
            essen5Einblenden,
            pause5NachEinblenden,
            essen5Ausblenden,
            pause5VorZweitemEinblenden,
            essen5ZweitesEinblenden
        	);
// Animation starten
        	animationEssen5.play(); 
// Animation endlos wiederholen:
        	animationEssen5.setCycleCount(Animation.INDEFINITE);
        	
              
// Lebensmittel6 hinzufügen:
        essen6ImageView = new ImageView (new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/TüteLebensmittel2.png").toExternalForm()));
        essen6ImageView.setX(10);
        essen6ImageView.setY(200);
        essen6ImageView.setFitWidth(250);
        essen6ImageView.setFitHeight(250);
        essen6ImageView.setVisible(false); 
// Lebensmittel6: Einblenden
        FadeTransition essen6Einblenden = new FadeTransition(Duration.seconds(3.5), essen6ImageView);
        essen6Einblenden.setFromValue(0.0);
        essen6Einblenden.setToValue(1.0);
        essen6Einblenden.setCycleCount(1);
// Kurze Pause nach dem ersten Einblenden
        PauseTransition pause6NachEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel6: Ausblenden
        FadeTransition essen6Ausblenden = new FadeTransition(Duration.seconds(3.5), essen6ImageView);
        essen6Ausblenden.setFromValue(1.0);
        essen6Ausblenden.setToValue(0.0);
        essen6Ausblenden.setCycleCount(1);
// Kurze Pause vor dem zweiten Einblenden
        PauseTransition pause6VorZweitemEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel6: Zweites Einblenden
        FadeTransition essen6ZweitesEinblenden = new FadeTransition(Duration.seconds(3.5), essen6ImageView);
        essen6ZweitesEinblenden.setFromValue(0.0);
        essen6ZweitesEinblenden.setToValue(1.0);
        essen6ZweitesEinblenden.setCycleCount(1);
// Startverzögerung
        PauseTransition warteKurz6 = new PauseTransition(Duration.seconds(6));
// Alles zusammen in eine Sequenz
        SequentialTransition animationEssen6 = new SequentialTransition(
            warteKurz6,
            essen6Einblenden,
            pause6NachEinblenden,
            essen6Ausblenden,
            pause6VorZweitemEinblenden,
            essen6ZweitesEinblenden
        	);
// Animation starten
        	animationEssen6.play(); 
// Animation endlos wiederholen:
        	animationEssen6.setCycleCount(Animation.INDEFINITE);
        	
               
// Lebensmittel7 hinzufügen:
        essen7ImageView = new ImageView (new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/TüteLebensmittel3.png").toExternalForm()));
        essen7ImageView.setX(470);
        essen7ImageView.setY(130);
        essen7ImageView.setFitWidth(350);
        essen7ImageView.setFitHeight(350);
        essen7ImageView.setVisible(false);   
// Lebensmittel7: Einblenden
        FadeTransition essen7Einblenden = new FadeTransition(Duration.seconds(3.5), essen7ImageView);
        essen7Einblenden.setFromValue(0.0);
        essen7Einblenden.setToValue(1.0);
        essen7Einblenden.setCycleCount(1);
// Kurze Pause nach dem ersten Einblenden
        PauseTransition pause7NachEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel7: Ausblenden
        FadeTransition essen7Ausblenden = new FadeTransition(Duration.seconds(3.5), essen7ImageView);
        essen7Ausblenden.setFromValue(1.0);
        essen7Ausblenden.setToValue(0.0);
        essen7Ausblenden.setCycleCount(1);
// Kurze Pause vor dem zweiten Einblenden
        PauseTransition pause7VorZweitemEinblenden = new PauseTransition(Duration.seconds(3));
// Lebensmittel7: Zweites Einblenden
        FadeTransition essen7ZweitesEinblenden = new FadeTransition(Duration.seconds(3.5), essen7ImageView);
        essen7ZweitesEinblenden.setFromValue(0.0);
        essen7ZweitesEinblenden.setToValue(1.0);
        essen7ZweitesEinblenden.setCycleCount(1);
// Startverzögerung
        PauseTransition warteKurz7 = new PauseTransition(Duration.seconds(6));
// Alles zusammen in eine Sequenz
        SequentialTransition animationEssen7 = new SequentialTransition(
            warteKurz7,
            essen7Einblenden,
            pause7NachEinblenden,
            essen7Ausblenden,
            pause7VorZweitemEinblenden,
            essen7ZweitesEinblenden
        	);
// Animation starten
        	animationEssen7.play();
// Animation endlos wiederholen:
        	animationEssen7.setCycleCount(Animation.INDEFINITE);
        
 
        
//======================================================
//=================[Plastik und Müll]===================
//======================================================
        
// Mülldeponie als Hintergrund
        muellDeponieImageView  = new ImageView(new Image(getClass().getResource("/images/Plastik_und_Muell/Muelldeponie.png").toExternalForm()));
        muellDeponieImageView.setFitWidth(800);
        muellDeponieImageView.setFitHeight(600);
        muellDeponieImageView.setPreserveRatio(false);
        muellDeponieImageView.setVisible(false);
        
// Vogelschwarm 1 für Mülldeponie:
        voegelImageView1 = new ImageView(new Image(getClass().getResource("/images/Plastik_und_Muell/Voegel.png").toExternalForm()));
        voegelImageView1.setX(900);
        voegelImageView1.setY(200);
        voegelImageView1.setFitWidth(300);
        voegelImageView1.setFitHeight(200);
        voegelImageView1.setVisible(false); 
// Vogelschwarm 1 animieren für Mülldeponie:
        TranslateTransition moveVoegel1 = new TranslateTransition(Duration.seconds(6), voegelImageView1);
        moveVoegel1.setByX(-1300);
        moveVoegel1.setAutoReverse(true);
        moveVoegel1.setCycleCount(TranslateTransition.INDEFINITE);
        moveVoegel1.setDuration(Duration.seconds(15)); 
        moveVoegel1.play();
// Vogelschwarm 2 für Mülldeponie:
        voegelImageView2 = new ImageView(new Image(getClass().getResource("/images/Plastik_und_Muell/Voegel.png").toExternalForm()));
        voegelImageView2.setX(950);
        voegelImageView2.setY(170);
        voegelImageView2.setFitWidth(300);
        voegelImageView2.setFitHeight(200);
        voegelImageView2.setVisible(false); 
// Vogelschwarm 1 animieren für Mülldeponie:
        TranslateTransition moveVoegel2 = new TranslateTransition(Duration.seconds(6), voegelImageView2);
        moveVoegel2.setByX(-1300);
        moveVoegel2.setAutoReverse(true);
        moveVoegel2.setCycleCount(TranslateTransition.INDEFINITE);
        moveVoegel2.setDuration(Duration.seconds(15)); 
        moveVoegel2.play();
              
              
        
//=========================================================
//=================[Ressourcen der Erde]===================
//=========================================================    
        
// Waldweg als Hintergrund
        waldWegImageView = new ImageView (new Image(getClass().getResource("/images/Ressourcen_der_Erde/Waldweg.png").toExternalForm()));
        waldWegImageView.setFitWidth(800);
        waldWegImageView.setFitHeight(600);
        waldWegImageView.setPreserveRatio(false);
        waldWegImageView.setVisible(false);     
        
// Baum1 hinzufügen (unten links)
        Image baum1Image = new Image(getClass().getResource("/images/Ressourcen_der_Erde/Baum1.png").toExternalForm());
        baum1ImageView = new ImageView(baum1Image);
        baum1ImageView.setX(50);
        baum1ImageView.setY(60);
        baum1ImageView.setFitWidth(200);
        baum1ImageView.setFitHeight(350);
        baum1ImageView.setVisible(false);
// Baum1 Animation
// Sobald das Layout fertig ist (Positionen berechnet), Pivot korrekt setzen:
        Platform.runLater(() -> {
        Bounds bounds1 = baum1ImageView.getBoundsInParent();
// Unten Mitte des Bildes berechnen
        double pivotX1 = bounds1.getMinX() + bounds1.getWidth() / 2;
        double pivotY1 = bounds1.getMaxY();
// Rotation erstellen:
        Rotate rotate1 = new Rotate(0, pivotX1, pivotY1);
        baum1ImageView.getTransforms().add(rotate1);
// Kipp-Animation (Baum fällt um)
        Timeline kippen1 = new Timeline(
            new KeyFrame(Duration.seconds(0), new KeyValue(rotate1.angleProperty(), 0)),
            new KeyFrame(Duration.seconds(1.5), new KeyValue(rotate1.angleProperty(), 90))
        );
// Leichte Bewegung nach rechts unten beim Umfallen
        TranslateTransition verschieben1 = new TranslateTransition(Duration.seconds(1.5), baum1ImageView);
        verschieben1.setByX(100);
        verschieben1.setByY(10);
// Startverzögerung
        PauseTransition startPause1 = new PauseTransition(Duration.seconds(5));        
// Reset-Animation (zurück auf Anfang)
        PauseTransition resetBaum1 = new PauseTransition(Duration.seconds(2));
        resetBaum1.setOnFinished(e -> {
            baum1ImageView.setTranslateX(0);
            baum1ImageView.setTranslateY(0);
            rotate1.setAngle(0);
        });
// Kombinierte Animation: Reset → Warten → Kippen + Verschieben
        ParallelTransition kippenUndVerschieben1 = new ParallelTransition(kippen1, verschieben1);
        SequentialTransition gesamtAnimation1 = new SequentialTransition(
            resetBaum1,
            startPause1,
            kippenUndVerschieben1
        );
// Endpause vor Neustart
        PauseTransition endePause1 = new PauseTransition(Duration.seconds(4));
// Endlos wiederholen
        SequentialTransition neustartEndPause1 = new SequentialTransition(gesamtAnimation1, endePause1);
        neustartEndPause1.setCycleCount(Animation.INDEFINITE);
        neustartEndPause1.play();
        });      

        
// Baum2 hinzufügen (unten rechts)
        Image baum2Image = new Image(getClass().getResource("/images/Ressourcen_der_Erde/Baum2.png").toExternalForm());
        baum2ImageView = new ImageView(baum2Image);
        baum2ImageView.setX(620);
        baum2ImageView.setY(150);
        baum2ImageView.setFitWidth(200);
        baum2ImageView.setFitHeight(350);
        baum2ImageView.setVisible(false);
// Baum2 Animation
// Sobald das Layout fertig ist (Positionen berechnet), Pivot korrekt setzen:
        Platform.runLater(() -> {
        Bounds bounds2 = baum2ImageView.getBoundsInParent();
     // Unten Mitte des Bildes berechnen
        double pivotX2 = bounds2.getMinX() + bounds2.getWidth() / 2;
        double pivotY2 = bounds2.getMaxY();
// Rotate erstellen (innerhalb des ImageView)
        Rotate rotate2 = new Rotate(0, pivotX2, pivotY2);
        baum2ImageView.getTransforms().add(rotate2);;
// Animation Baum2
        Timeline kippen2 = new Timeline(
        new KeyFrame(Duration.seconds(0), new KeyValue(rotate2.angleProperty(), 0)),
        new KeyFrame(Duration.seconds(1.5), new KeyValue(rotate2.angleProperty(), -90))
        );
// Leichte Bewegung nach links unten beim Umfallen        
        TranslateTransition verschieben2 = new TranslateTransition(Duration.seconds(1.0), baum2ImageView);
        verschieben2.setByX(-40);
        verschieben2.setByY(10);
// Startverzögerung
        PauseTransition startPause2 = new PauseTransition(Duration.seconds(6));
// Reset-Animation (zurück auf Anfang)
        PauseTransition resetBaum2 = new PauseTransition(Duration.seconds(2));
        resetBaum2.setOnFinished(e -> {
            baum2ImageView.setTranslateX(0);
            baum2ImageView.setTranslateY(0);
            rotate2.setAngle(0);
        });
// Kombinierte Animation: Reset → Warten → Kippen + Verschieben
        ParallelTransition kippenUndVerschieben2 = new ParallelTransition(kippen2, verschieben2);
        SequentialTransition gesamtAnimation2 = new SequentialTransition(
            resetBaum2,
            startPause2,
            kippenUndVerschieben2
        );
// Endpause vor Neustart
        PauseTransition endePause2 = new PauseTransition(Duration.seconds(3));
// Endlos wiederholen
        SequentialTransition neustartEndPause2 = new SequentialTransition(gesamtAnimation2, endePause2);
        neustartEndPause2.setCycleCount(Animation.INDEFINITE);
        neustartEndPause2.play(); 
        });   

        
// Baum3 hinzufügen (oben links)
        Image baum3Image = new Image(getClass().getResource("/images/Ressourcen_der_Erde/Baum3.png").toExternalForm());
        baum3ImageView = new ImageView(baum3Image);
        baum3ImageView.setX(200);
        baum3ImageView.setY(100);
        baum3ImageView.setFitWidth(100);
        baum3ImageView.setFitHeight(250);
        baum3ImageView.setVisible(false);
// Baum3 Animation
// Sobald das Layout fertig ist (Positionen berechnet), Pivot korrekt setzen:
        Platform.runLater(() -> {
        Bounds bounds3 = baum3ImageView.getBoundsInParent();
// Unten Mitte des Bildes berechnen
        double pivotX3 = bounds3.getMinX() + bounds3.getWidth() / 2;
        double pivotY3 = bounds3.getMaxY();
// Animation Baum3
        Rotate rotate3 = new Rotate(0, pivotX3, pivotY3);
        baum3ImageView.getTransforms().add(rotate3);
        Timeline kippen3 = new Timeline(
        new KeyFrame(Duration.seconds(0), new KeyValue(rotate3.angleProperty(), 0)),
        new KeyFrame(Duration.seconds(1.5), new KeyValue(rotate3.angleProperty(), 90))
        );
// Leichte Bewegung nach rechts unten beim Umfallen
        TranslateTransition verschieben3 = new TranslateTransition(Duration.seconds(1), baum3ImageView);
        verschieben3.setByX(100);
// Startverzögerung
        PauseTransition startPause3 = new PauseTransition(Duration.seconds(3));
// Reset-Animation (zurück auf Anfang)
        PauseTransition resetBaum3 = new PauseTransition(Duration.seconds(2));
        resetBaum3.setOnFinished(e -> {
            baum3ImageView.setTranslateX(0);
            baum3ImageView.setTranslateY(0);
            rotate3.setAngle(0);
        });
// Kombinierte Animation: Reset → Warten → Kippen + Verschieben
        ParallelTransition kippenUndVerschieben3 = new ParallelTransition(kippen3, verschieben3);
        SequentialTransition gesamtAnimation3 = new SequentialTransition(
            resetBaum3,
            startPause3,
            kippenUndVerschieben3
        );
// Endpause vor Neustart
        PauseTransition endePause3 = new PauseTransition(Duration.seconds(6));
// Endlos wiederholen
        SequentialTransition neustartEndPause3 = new SequentialTransition(gesamtAnimation3, endePause3);
        neustartEndPause3.setCycleCount(Animation.INDEFINITE);
        neustartEndPause3.play(); 
        });

        
// Baum4 hinzufügen (oben Rechts)
        Image baum4Image = new Image(getClass().getResource("/images/Ressourcen_der_Erde/Baum4.png").toExternalForm());
        baum4ImageView = new ImageView(baum4Image);
        baum4ImageView.setX(480);
        baum4ImageView.setY(50);
        baum4ImageView.setFitWidth(200);
        baum4ImageView.setFitHeight(350);
        baum4ImageView.setVisible(false);
// Baum 4 Animation
// Sobald das Layout fertig ist (Positionen berechnet), Pivot korrekt setzen:
        Platform.runLater(() -> {
        Bounds bounds4 = baum4ImageView.getBoundsInParent();
// Unten Mitte des Bildes berechnen
        double pivotX4 = bounds4.getMinX() + bounds4.getWidth() / 2;
        double pivotY4 = bounds4.getMaxY();
// Animation Baum4
        Rotate rotate4 = new Rotate(0, pivotX4, pivotY4);
        baum4ImageView.getTransforms().add(rotate4);
        Timeline kippen4 = new Timeline(
        new KeyFrame(Duration.seconds(0), new KeyValue(rotate4.angleProperty(), 0)),
        new KeyFrame(Duration.seconds(1.5), new KeyValue(rotate4.angleProperty(), -90))
            );
// Leichte Bewegung nach links unten beim Umfallen
            TranslateTransition verschieben4 = new TranslateTransition(Duration.seconds(1.5), baum4ImageView);
            verschieben4.setByX(-40);
            verschieben4.setByY(10);
// Startverzögerung
            PauseTransition startPause4 = new PauseTransition(Duration.seconds(4));
// Reset-Animation (zurück auf Anfang)
            PauseTransition resetBaum4 = new PauseTransition(Duration.seconds(2));
            resetBaum4.setOnFinished(e -> {
                baum4ImageView.setTranslateX(0);
                baum4ImageView.setTranslateY(0);
                rotate4.setAngle(0);
            });
// Kombinierte Animation: Reset → Warten → Kippen + Verschieben
            ParallelTransition kippenUndVerschieben4 = new ParallelTransition(kippen4, verschieben4);
            SequentialTransition gesamtAnimation4 = new SequentialTransition(
                resetBaum4,
                startPause4,
                kippenUndVerschieben4
            );
// Endpause vor Neustart
            PauseTransition endePause4 = new PauseTransition(Duration.seconds(5));
// Endlos wiederholen
            SequentialTransition neustartEndPause4 = new SequentialTransition(gesamtAnimation4, endePause4);
            neustartEndPause4.setCycleCount(Animation.INDEFINITE);
            neustartEndPause4.play();
        });

        
        
//=============================================================
//=================[Tiere und Artenvielfalt]===================
//=============================================================
        
// Erdloch als Hintergrund hinzufügen
        erdlochImageView = new ImageView (new Image(getClass().getResource("/images/Tiere_und_Artenvielfalt/Erdloch.png").toExternalForm()));
        erdlochImageView.setFitWidth(800);
        erdlochImageView.setFitHeight(600);
        erdlochImageView.setPreserveRatio(false);
        erdlochImageView.setVisible(false);
        
// Erdmännchen1 hinzufügen: Oben Links
        erdmaennchen1ImageView = new ImageView(new Image(getClass().getResource("/images/Tiere_und_Artenvielfalt/Erdmaennchen1.png").toExternalForm()));
        erdmaennchen1ImageView.setX(330);
        erdmaennchen1ImageView.setY(270);
        erdmaennchen1ImageView.setFitWidth(80);
        erdmaennchen1ImageView.setFitHeight(140);
        erdmaennchen1ImageView.setVisible(false);
// Erdmännchen1 animieren:
        TranslateTransition hoch1 = new TranslateTransition(Duration.seconds(2), erdmaennchen1ImageView);
        hoch1.setByY(-120);
        PauseTransition pauseOben1 = new PauseTransition(Duration.seconds(1));
        TranslateTransition runter1 = new TranslateTransition(Duration.seconds(3), erdmaennchen1ImageView);
        runter1.setByY(120);
        PauseTransition pauseUnten1 = new PauseTransition(Duration.seconds(2));
// Kombinieren zu einer Sequenz
        SequentialTransition animationErdmaennchen1 = new SequentialTransition(hoch1, pauseOben1, runter1, pauseUnten1);
        animationErdmaennchen1.setCycleCount(SequentialTransition.INDEFINITE);
        animationErdmaennchen1.play();
// Erdmännchen1 Viewport:        
        erdlochPatch1ImageView = new ImageView(new Image(getClass().getResource("/images/Tiere_und_Artenvielfalt/Erdloch.png").toExternalForm()));
        erdlochPatch1ImageView.setViewport(new Rectangle2D(330, 270, 80, 170));
        erdlochPatch1ImageView.setX(330);
        erdlochPatch1ImageView.setY(270);
        erdlochPatch1ImageView.setVisible(false); 
        
// Erdmännchen2 hinzufügen: Unten Links
        erdmaennchen2ImageView = new ImageView(new Image(getClass().getResource("/images/Tiere_und_Artenvielfalt/Erdmaennchen2.png").toExternalForm()));
        erdmaennchen2ImageView.setX(210);
        erdmaennchen2ImageView.setY(490);
        erdmaennchen2ImageView.setFitWidth(150);
        erdmaennchen2ImageView.setFitHeight(170);
        erdmaennchen2ImageView.setVisible(false); 
// Erdmännchen2 animieren:
        TranslateTransition hoch2 = new TranslateTransition(Duration.seconds(3), erdmaennchen2ImageView); // korrekt!
        hoch2.setByY(-150);
        PauseTransition pauseOben2 = new PauseTransition(Duration.seconds(1));
        TranslateTransition runter2 = new TranslateTransition(Duration.seconds(2), erdmaennchen2ImageView); // korrekt!
        runter2.setByY(150);
        PauseTransition pauseUnten2 = new PauseTransition(Duration.seconds(3));
// Kombinieren zu einer Sequenz
        SequentialTransition animationErdmaennchen2 = new SequentialTransition(hoch2, pauseOben2, runter2, pauseUnten2);
        animationErdmaennchen2.setCycleCount(SequentialTransition.INDEFINITE);
        animationErdmaennchen2.play();      
// Erdmännchen2 Viewport:        
        erdlochPatch2ImageView = new ImageView(new Image(getClass().getResource("/images/Tiere_und_Artenvielfalt/Erdloch.png").toExternalForm()));
        erdlochPatch2ImageView.setViewport(new Rectangle2D(210, 490, 140, 120));
        erdlochPatch2ImageView.setX(210);
        erdlochPatch2ImageView.setY(490);
        erdlochPatch2ImageView.setVisible(false);
            
// Erdmännchen3 hinzufügen: Unten Rechts
        erdmaennchen3ImageView = new ImageView(new Image(getClass().getResource("/images/Tiere_und_Artenvielfalt/Erdmaennchen3.png").toExternalForm()));
        erdmaennchen3ImageView.setX(500);
        erdmaennchen3ImageView.setY(340);
        erdmaennchen3ImageView.setFitWidth(180);
        erdmaennchen3ImageView.setFitHeight(180);
        erdmaennchen3ImageView.setVisible(false); 
// Erdmännchen3 animieren:
        TranslateTransition hoch3 = new TranslateTransition(Duration.seconds(4), erdmaennchen3ImageView);
        hoch3.setByY(-130); 
        PauseTransition pauseOben3 = new PauseTransition(Duration.seconds(3));
        TranslateTransition runter3 = new TranslateTransition(Duration.seconds(5), erdmaennchen3ImageView);
        runter3.setByY(130);
        PauseTransition pauseUnten3 = new PauseTransition(Duration.seconds(2));
// Kombinieren zu einer Sequenz
        SequentialTransition animationErdmaennchen3 = new SequentialTransition(hoch3, pauseOben3, runter3, pauseUnten3);
        animationErdmaennchen3.setCycleCount(SequentialTransition.INDEFINITE);
        animationErdmaennchen3.play();
// Erdmännchen3 Viewport:        
        erdlochPatch3ImageView = new ImageView(new Image(getClass().getResource("/images/Tiere_und_Artenvielfalt/Erdloch.png").toExternalForm()));
        erdlochPatch3ImageView.setViewport(new Rectangle2D(550, 338, 140, 185));
        erdlochPatch3ImageView.setX(550);
        erdlochPatch3ImageView.setY(338);
        erdlochPatch3ImageView.setVisible(false);
        
// Erdmännchen4 hinzufügen: kommt von links ins Bild gelaufen
        erdmaennchen4ImageView = new ImageView(new Image(getClass().getResource("/images/Tiere_und_Artenvielfalt/Erdmaennchen4.png").toExternalForm()));
        erdmaennchen4ImageView.setX(-180); 
        erdmaennchen4ImageView.setY(470);
        erdmaennchen4ImageView.setFitWidth(180);
        erdmaennchen4ImageView.setFitHeight(180);
        erdmaennchen4ImageView.setVisible(false);
// 1. Pause vor dem Laufen
        PauseTransition pauseLinks = new PauseTransition(Duration.seconds(2));
// 2. Laufanimation von links nach rechts
        TranslateTransition laufen = new TranslateTransition(Duration.seconds(8), erdmaennchen4ImageView);
        laufen.setByX(920);
        laufen.setAutoReverse(false);
// 3. Nach dem Lauf zurücksetzen auf Startposition 
        PauseTransition resetPause = new PauseTransition(Duration.seconds(0.5));
        resetPause.setOnFinished(e -> erdmaennchen4ImageView.setTranslateX(0));
// 4. Alles zusammen in eine Sequenz
        SequentialTransition animationErdmaennchen4 = new SequentialTransition(pauseLinks, laufen, resetPause);
        animationErdmaennchen4.setCycleCount(SequentialTransition.INDEFINITE);
        animationErdmaennchen4.play();   

        

//==========================================================
//=================[Was kann ich tun?]======================
//==========================================================
        
// Mondblick als hintergrund hinzufügen [Was kann ich tun?]
        mondBlickImageView = new ImageView (new Image(getClass().getResource("/images/Was_kann_ich_tun/Mondblick.png").toExternalForm()));
        mondBlickImageView.setFitWidth(800);
        mondBlickImageView.setFitHeight(600);
        mondBlickImageView.setPreserveRatio(false);
        mondBlickImageView.setVisible(false);  
        
// Sterne über den Weltraum legen
        sterneImageView = new ImageView (new Image(getClass().getResource("/images/Was_kann_ich_tun/Space2.png").toExternalForm()));
        sterneImageView.setX(-20);
        sterneImageView.setY(-50);
        sterneImageView.setFitWidth(900);
        sterneImageView.setFitHeight(525);
        sterneImageView.setRotate(4.5);
        sterneImageView.setPreserveRatio(false);
        sterneImageView.setVisible(false);
        
// Drehende Erde als Gif hinzufügen      
        erdRotationImageView = new ImageView (new Image(getClass().getResource("/images/Was_kann_ich_tun/globe1.gif").toExternalForm()));
        erdRotationImageView.setX(180);
        erdRotationImageView.setY(100);
        erdRotationImageView.setFitWidth(500);
        erdRotationImageView.setFitHeight(400);
        erdRotationImageView.setVisible(false);
        
// Komet1 hinzufügen:
        komet1ImageView = new ImageView (new Image(getClass().getResource("/images/Was_kann_ich_tun/Komet1.png").toExternalForm()));
        komet1ImageView.setX(900);
        komet1ImageView.setY(50);
        komet1ImageView.setFitWidth(250);
        komet1ImageView.setFitHeight(150);
        komet1ImageView.setRotate(13);
        komet1ImageView.setScaleY(1);
        komet1ImageView.setPreserveRatio(false);
        komet1ImageView.setVisible(false);
// Komet1 animieren:
        TranslateTransition moveKomet1 = new TranslateTransition(Duration.seconds(6), komet1ImageView);
        moveKomet1.setByX(-1300);
        moveKomet1.setByY(300);
        moveKomet1.setAutoReverse(false);
        moveKomet1.setCycleCount(TranslateTransition.INDEFINITE);
        moveKomet1.setDuration(Duration.seconds(8)); 
        moveKomet1.play();        
        
// Komet2 hinzufügen:
        komet2ImageView = new ImageView (new Image(getClass().getResource("/images/Was_kann_ich_tun/Komet2.png").toExternalForm()));
        komet2ImageView.setX(900);
        komet2ImageView.setY(100);
        komet2ImageView.setFitWidth(100);
        komet2ImageView.setFitHeight(100);
        komet2ImageView.setRotate(30);
        komet2ImageView.setPreserveRatio(false);
        komet2ImageView.setVisible(false);
// Komet2 animieren:
        TranslateTransition moveKomet2 = new TranslateTransition(Duration.seconds(6), komet2ImageView);
        moveKomet2.setByX(-1300);
        moveKomet2.setByY(250);
        moveKomet2.setAutoReverse(false);
        moveKomet2.setCycleCount(TranslateTransition.INDEFINITE);
        moveKomet2.setDuration(Duration.seconds(2));
        moveKomet2.play();
        
// Komet3 hinzufügen:
        komet3ImageView = new ImageView (new Image(getClass().getResource("/images/Was_kann_ich_tun/Komet3.png").toExternalForm()));
        komet3ImageView.setX(-100);
        komet3ImageView.setY(300);
        komet3ImageView.setFitWidth(170);
        komet3ImageView.setFitHeight(200);
        komet3ImageView.setRotate(100);
        komet3ImageView.setScaleY(-1);
        komet3ImageView.setPreserveRatio(false);
        komet3ImageView.setVisible(false);
// Komet3 animieren:
        TranslateTransition moveKomet3 = new TranslateTransition(Duration.seconds(6), komet3ImageView);
        moveKomet3.setByX(1300);
        moveKomet3.setByY(-850);
        moveKomet3.setAutoReverse(false);
        moveKomet3.setCycleCount(TranslateTransition.INDEFINITE);
        moveKomet3.setDuration(Duration.seconds(30));
        moveKomet3.play();
        
        
 
// Hintergrund hinzufügen:
    	backgroundPane = new Pane();
    	backgroundPane.getChildren().addAll(

// Klimawandel und Energie
    		akwImageView,
    		rauchImageView1,
    		rauchImageView2,

// Ernaehrung und Lebensmittelverschwendung
    		tischImageView,
    		essen6ImageView,
    		essen4ImageView,
    		essen7ImageView,		
    		essen5ImageView,
    		essen2ImageView,		
    		essen3ImageView,
    	    essen1ImageView,

// Plastik und Müll	    
    		muellDeponieImageView,
    		voegelImageView1,
    		voegelImageView2,
    	
// Ressourcen der Erde
    		waldWegImageView,
    		baum3ImageView,
    		baum1ImageView,
    		baum4ImageView,
    		baum2ImageView,

// Tiere und Artenvielfalt
    		erdlochImageView,
    		erdmaennchen1ImageView,
    		erdlochPatch1ImageView,
    		erdmaennchen2ImageView,
    		erdlochPatch2ImageView,
    		erdmaennchen3ImageView,
    		erdlochPatch3ImageView,
    		erdmaennchen4ImageView,

// Was kann ich tun
    		mondBlickImageView,
    		sterneImageView,
    		komet1ImageView,
    		komet2ImageView,
    		komet3ImageView,
    		erdRotationImageView
    	);      


    	    	
// Startbildschirm aufbauen
    VBox startLayout = new VBox(10);
    startLayout.setStyle("-fx-padding: 20; -fx-alignment: center;");

    Label welcomeLabel = new Label("Willkommen zum 🌍 UmweltQuiz 🌏");
    Label nameLabel = new Label("Bitte gib deinen Namen ein:");
    TextField nameInput = new TextField();
    nameInput.setPromptText("Dein Name:");
    nameInput.setMaxWidth(200);

    CheckBox showRulesCheckBox = new CheckBox("➡ Regeln Anzeigen ⬅");
    Button startButton = new Button("Start Quiz");

    startLayout.getChildren().addAll(
        welcomeLabel,
        nameLabel,
        nameInput,
        showRulesCheckBox,
        startButton
    );

    
// Label für die Kategorie erstellen:
    kategorieLabel = new Label("Kategorie:");
    kategorieLabel.setFont(new Font("Arial", 16));
    
// Event-Handler für den Start-Button
    startButton.setOnAction(e ->
    startQuiz(primaryStage, nameInput.getText(), showRulesCheckBox.isSelected())
    );

// Szene und Stage
    StackPane startRoot = new StackPane(backgroundPane, startLayout);   
    primaryStage.setTitle("🌍 UmweltQuiz 🌏");
    Scene startScene = new Scene(startRoot, 800, 600);
    primaryStage.setScene(startScene);
    primaryStage.show();
    }    

  
    
    
    
//Startet das Quiz nach Bestätigung der Regeln   
private void startQuiz(Stage primaryStage, String playerName, boolean showRules) {
	if (playerName.trim().isEmpty()) {
		showAlert("Fehlende Eingabe", "Bitte gib deinen Namen ein, bevor du startest!");
     	return;
	}    
	
// Spielername im QuizGame setzen
		quizGame.setPlayerName(playerName);
			if (showRules) {
				showRulesDialog(primaryStage, playerName);
		} else {
	            launchQuiz(primaryStage, playerName);
		}
	    }    





private void launchQuiz(Stage primaryStage, String playerName) {
    quizGame.startNewGame();

// VBoxen erzeugen
    infoBox = new VBox();
    antwortBox = new VBox();
    bottomBox = new VBox();

// GUI-Elemente erzeugen
    kategorieLabel = new Label();
    questionLabel = new Label();
    pointsLabel = new Label("Punkte: 0");
    linkLabel = new Hyperlink();

// AntwortButton erzeugen
    answerA = new Button();
    answerB = new Button();
    answerC = new Button();
    answerD = new Button();

// Antwort-Buttons mit Aktionen verknüpfen
    answerA.setOnAction(e -> checkAnswer('A'));
    answerB.setOnAction(e -> checkAnswer('B'));
    answerC.setOnAction(e -> checkAnswer('C'));
    answerD.setOnAction(e -> checkAnswer('D'));

// Styles setzen
    kategorieLabel.setStyle("-fx-font-size: 18px; -fx-text-fill: white; -fx-font-weight: bold;");
    kategorieLabel.setTextAlignment(TextAlignment.CENTER);
    
    questionLabel.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");
    questionLabel.setWrapText(true);
    questionLabel.setMaxWidth(600);
    questionLabel.setAlignment(Pos.CENTER);
    questionLabel.setTextAlignment(TextAlignment.CENTER);
    
    pointsLabel.setStyle("-fx-font-size: 15px; -fx-text-fill: white;");
    
    linkLabel.setStyle("-fx-font-size: 13px; -fx-text-fill: #00FFFF;");
    linkLabel.setTextAlignment(TextAlignment.CENTER);

// MaxBreite für Buttons
    answerA.setMaxWidth(200);
    answerB.setMaxWidth(200);
    answerC.setMaxWidth(200);
    answerD.setMaxWidth(200);

// VBox für Kategorie und Frage (oben)
    infoBox = new VBox(10, kategorieLabel, questionLabel);
    infoBox.setPadding(new Insets(10));
    infoBox.setMaxWidth(600);
    infoBox.setAlignment(Pos.CENTER);

// VBox für Antwort-Buttons (Mitte)
    antwortBox = new VBox(10, answerA, answerB, answerC, answerD);
    antwortBox.setAlignment(Pos.CENTER);
    antwortBox.setMaxWidth(420);

// VBox für Punkte und Link (unten)
    bottomBox = new VBox(5, pointsLabel, linkLabel);
    bottomBox.setPadding(new Insets(10));
    bottomBox.setMaxWidth(350);
    bottomBox.setAlignment(Pos.CENTER);


// Alle Container in StackPane (übereinander)
    StackPane quizRoot = new StackPane(backgroundPane, infoBox, antwortBox, bottomBox);

// Szene anzeigen
    Scene quizScene = new Scene(quizRoot, 800, 600);
    primaryStage.setScene(quizScene);
    primaryStage.show();

// Erste Frage laden (setzt auch die Kategorie)
    loadNextQuestion();

// Layout anwenden, nachdem Kategorie gesetzt wurde
    applyKategorieLayout(quizGame.getKategorie(), infoBox, antwortBox, bottomBox);
}





private void applyKategorieLayout(Kategorie kategorie, VBox infoBox, VBox antwortBox, VBox bottomBox) {
    switch (kategorie) {
        case RESSOURCEN_DER_ERDE:
// Top: Kategorie und Frage:
            StackPane.setAlignment(infoBox, Pos.TOP_CENTER);
            StackPane.setMargin(infoBox, new Insets(10, 100, 450, 100));
            infoBox.setMaxWidth(700);
            infoBox.setPadding(new Insets(20));
            infoBox.setAlignment(Pos.CENTER);
            infoBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.2); -fx-background-radius: 20;");
// Middle: AntwortButtons:
            StackPane.setAlignment(antwortBox, Pos.CENTER);
            StackPane.setMargin(antwortBox, new Insets(300, 200, 250, 200));
            antwortBox.setMaxWidth(800);
            antwortBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 15;");
// Bottom: Punkte und Link:
            StackPane.setAlignment(bottomBox, Pos.BOTTOM_CENTER);
            StackPane.setMargin(bottomBox, new Insets(700, 10, 10, 10));
            bottomBox.setMaxWidth(800);
            bottomBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 10;");
            break;
            
            
        case PLASTIK_UND_MUELL:
// Top: Kategorie und Frage:
            StackPane.setAlignment(infoBox, Pos.TOP_CENTER);
            StackPane.setMargin(infoBox, new Insets(10, 100, 450, 100));
            infoBox.setMaxWidth(700);
            infoBox.setPadding(new Insets(20));
            infoBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.2); -fx-background-radius: 20;");
// Middle: AntwortButtons:
            StackPane.setAlignment(antwortBox, Pos.CENTER);
            StackPane.setMargin(antwortBox, new Insets(250, 200, 250, 200));
            antwortBox.setMaxWidth(480);
            antwortBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 15;");
// Bottom: Punkte und Link:
            StackPane.setAlignment(bottomBox, Pos.BOTTOM_CENTER);
            StackPane.setMargin(bottomBox, new Insets(700, 00, 10, 10));
            bottomBox.setMaxWidth(800);
            bottomBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 10;");
            break;
        	
            
        case ERNAEHRUNG_UND_LEBENSMITTELVERSCHWENDUNG:
// Top: Kategorie und Frage:
            StackPane.setAlignment(infoBox, Pos.TOP_CENTER);
            StackPane.setMargin(infoBox, new Insets(10, 100, 450, 100));
            infoBox.setMaxWidth(700);
            infoBox.setPadding(new Insets(20));
            infoBox.setAlignment(Pos.CENTER);
            infoBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.2); -fx-background-radius: 20;");
// Middle: AntwortButtons:
            StackPane.setAlignment(antwortBox, Pos.CENTER);
            StackPane.setMargin(antwortBox, new Insets(250, 200, 300, 200));
            antwortBox.setMaxWidth(800);
            antwortBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 15;");
// Bottom: Punkte und Link:
            StackPane.setAlignment(bottomBox, Pos.BOTTOM_CENTER);
            StackPane.setMargin(bottomBox, new Insets(700, 10, 10, 10));
            bottomBox.setMaxWidth(800);
            bottomBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 10;");
            break;
            
                       
        case KLIMAWANDEL_UND_ENERGIE:
// Top: Kategorie und Frage:
            StackPane.setAlignment(infoBox, Pos.TOP_CENTER);
            StackPane.setMargin(infoBox, new Insets(10, 100, 450, 100));
            infoBox.setMaxWidth(700);
            infoBox.setPadding(new Insets(20));
            infoBox.setAlignment(Pos.CENTER);
            infoBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.2); -fx-background-radius: 20;");
// Middle: AntwortButtons:
            StackPane.setAlignment(antwortBox, Pos.CENTER);
            StackPane.setMargin(antwortBox, new Insets(300, 400, 250, 50));
            antwortBox.setMaxWidth(800);
            antwortBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 15;");
// Bottom: Punkte und Link:
            StackPane.setAlignment(bottomBox, Pos.BOTTOM_CENTER);
            StackPane.setMargin(bottomBox, new Insets(700, 10, 10, 10));
            bottomBox.setMaxWidth(800);
            bottomBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 10;");
            break;
            
                       
        case TIERE_UND_ARTENVIELFALT:
// Top: Kategorie und Frage:
            StackPane.setAlignment(infoBox, Pos.TOP_CENTER);
            StackPane.setMargin(infoBox, new Insets(10, 100, 450, 100));
            infoBox.setMaxWidth(700);
            infoBox.setPadding(new Insets(20));
            infoBox.setAlignment(Pos.CENTER);
            infoBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.2); -fx-background-radius: 20;");
// Middle: AntwortButtons:
            StackPane.setAlignment(antwortBox, Pos.CENTER);
            StackPane.setMargin(antwortBox, new Insets(350, 500, 450, 50));
            antwortBox.setMaxWidth(800);
            antwortBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 15;");
// Bottom: Punkte und Link:
            StackPane.setAlignment(bottomBox, Pos.BOTTOM_CENTER);
            StackPane.setMargin(bottomBox, new Insets(700, 10, 10, 10));
            bottomBox.setMaxWidth(800);
            bottomBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 10;");
            break;
            
            
        case WAS_KANN_ICH_TUN:
// Top: Kategorie und Frage:
            StackPane.setAlignment(infoBox, Pos.TOP_CENTER);
            StackPane.setMargin(infoBox, new Insets(10, 100, 450, 100));
            infoBox.setMaxWidth(700);
            infoBox.setPadding(new Insets(20));
            infoBox.setAlignment(Pos.CENTER);
            infoBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.2); -fx-background-radius: 20;");
// Middle: AntwortButtons:
            StackPane.setAlignment(antwortBox, Pos.CENTER);
            StackPane.setMargin(antwortBox, new Insets(380, 50, 250, 550));
            antwortBox.setMaxWidth(800);
            antwortBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 15;");
// Bottom: Punkte und Link:
            StackPane.setAlignment(bottomBox, Pos.BOTTOM_CENTER);
            StackPane.setMargin(bottomBox, new Insets(700, 10, 10, 10));
            bottomBox.setMaxWidth(800);
            bottomBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 10;");
            break;
            
             
// Falls keine Kategorie gefunden wird:            
        default:
// Top: Kategorie und Frage:
            StackPane.setAlignment(infoBox, Pos.TOP_CENTER);
            StackPane.setMargin(infoBox, new Insets(10, 100, 450, 100));
            infoBox.setMaxWidth(700);
            infoBox.setPadding(new Insets(20));
            infoBox.setAlignment(Pos.CENTER);
            infoBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.2); -fx-background-radius: 20;");
// Middle: AntwortButtons:
            StackPane.setAlignment(antwortBox, Pos.CENTER);
            StackPane.setMargin(antwortBox, new Insets(300, 200, 250, 200));
            antwortBox.setMaxWidth(800);
            antwortBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 15;");
// Bottom: Punkte und Link:
            StackPane.setAlignment(bottomBox, Pos.BOTTOM_CENTER);
            StackPane.setMargin(bottomBox, new Insets(700, 10, 10, 10));
            bottomBox.setMaxWidth(800);
            bottomBox.setStyle("-fx-background-color: rgba(25, 25, 25, 0.0); -fx-background-radius: 10;");
            break;
    		}
			}





private void checkAnswer(char antwort) {
    disableButton(answerA);
    disableButton(answerB);
    disableButton(answerC);
    disableButton(answerD);

    
//Prüft, ob die Antwort korrekt war
	boolean isCorrect = quizGame.checkAnswer(antwort);
//Holt die korrekte Antwort
	char correctAnswer = quizGame.getCorrectAnswer();
//Button, den der User geklickt hat	
	Button selectedButton = getButtonByAnswer(antwort);
//Button mit der richtigen Antwort	
	Button correctButton = getButtonByAnswer(correctAnswer); 
 

// Timeline für das Blinken der richtigen Antwort
	if (selectedButton != null) {
		if (isCorrect) {
			selectedButton.setStyle("-fx-background-color: #228B22; -fx-text-fill: white;");
		} else {
			selectedButton.setStyle("-fx-background-color: #CD0000; -fx-text-fill: white;");
				if (correctButton != null) {
					Timeline blink = new Timeline(
						new KeyFrame(Duration.seconds(0.5), e -> correctButton.setStyle("-fx-background-color: #228B22; -fx-text-fill: white;")),
						new KeyFrame(Duration.seconds(1.0), e -> correctButton.setStyle("")),
						new KeyFrame(Duration.seconds(1.5), e -> correctButton.setStyle("-fx-background-color: #228B22; -fx-text-fill: white;")),
						new KeyFrame(Duration.seconds(2.0), e -> correctButton.setStyle("")),
						new KeyFrame(Duration.seconds(2.5), e -> correctButton.setStyle("-fx-background-color: #228B22; -fx-text-fill: white;")),
						new KeyFrame(Duration.seconds(3.0), e -> correctButton.setStyle("")),
						new KeyFrame(Duration.seconds(3.5), e -> {
							
	// Nach dem Blinken bleibt der korrekte Button grün
		correctButton.setStyle("-fx-background-color: #228B22; -fx-text-fill: white;");
		})
		);
		blink.play();
		}
		}
		}
	
// Link sofort nach Antwort anzeigen:
	String link = quizGame.getLink();
		if (link != null && !link.trim().isEmpty()) {
			linkLabel.setText("Quelle: " + link.replace("http://", "").replace("https://", ""));
			linkLabel.setOnAction(event -> getHostServices().showDocument(link));
	    }

		
		
		
		
// Button vollständig sichtbar halten obwohl deaktiviert:
	new Timeline(new KeyFrame(Duration.seconds(4.0), e -> { 
		answerA.setStyle("-fx-opacity: 1.0;");
		answerB.setStyle("-fx-opacity: 1.0;");
		answerC.setStyle("-fx-opacity: 1.0;");
		answerD.setStyle("-fx-opacity: 1.0;");

// Punkte aktualisieren
	pointsLabel.setText("Punkte: " + quizGame.getPunkte());

// Frage NICHT sofort laden, sondern nach kurzer Verzögerung:
	new Timeline(new KeyFrame(Duration.seconds(0.005), ev -> {
		loadNextQuestion();
			})).play();
	    	})).play();
			}





//Lädt die nächste Frage und aktualisiert die Antwortmöglichkeiten
private void loadNextQuestion() {
	enableAllButtons();
		String question = quizGame.getNextQuestion();
	    	if (question != null) {
	        	questionLabel.setText(question);
	        	String[] answers = quizGame.getAnswers();       	

// In der GUI: Formatiert die Kategorie (z. B. "KLIMA_WANDEL" → "Klima wandel") für die Anzeige.        
	    String lesbareKategorie = QuizGame.formatKategorie(quizGame.getKategorie());
	    
// Setzt den Text des Kategorie-Labels in der Benutzeroberfläche auf die formatierte Kategorie.    
	       		kategorieLabel.setText("Kategorie: " + lesbareKategorie);
	       		
	       		applyKategorieLayout(quizGame.getKategorie(), infoBox, antwortBox, bottomBox);

	       		
// Nur bei Fragen der Kategorie: Klimawandel und Energie: Bilder sichtbar
	 boolean showKlimawandelUndEnergieBg = quizGame.getKategorie() == Kategorie.KLIMAWANDEL_UND_ENERGIE;
     	akwImageView.setVisible(showKlimawandelUndEnergieBg);
     	rauchImageView1.setVisible(showKlimawandelUndEnergieBg);
     	rauchImageView2.setVisible(showKlimawandelUndEnergieBg);    	       		
	       		
// Nur bei Fragen der Kategorie: Ernährung und Lebensmittelverschwendung: Bild sichtbar
   	 boolean showErnaehrungUndLebensmittelverschwendungBg = quizGame.getKategorie() == Kategorie.ERNAEHRUNG_UND_LEBENSMITTELVERSCHWENDUNG;
   	 	tischImageView.setVisible(showErnaehrungUndLebensmittelverschwendungBg); 
   	 	essen1ImageView.setVisible(showErnaehrungUndLebensmittelverschwendungBg);
   	 	essen2ImageView.setVisible(showErnaehrungUndLebensmittelverschwendungBg);
   	 	essen3ImageView.setVisible(showErnaehrungUndLebensmittelverschwendungBg);
   	 	essen4ImageView.setVisible(showErnaehrungUndLebensmittelverschwendungBg);
   	 	essen5ImageView.setVisible(showErnaehrungUndLebensmittelverschwendungBg);
   	 	essen6ImageView.setVisible(showErnaehrungUndLebensmittelverschwendungBg);
   	 	essen7ImageView.setVisible(showErnaehrungUndLebensmittelverschwendungBg);
	       		
// Nur bei Fragen der Kategorie: Plastik und Müll: Bild sichtbar
   	 boolean showPlastikUndMuellBg = quizGame.getKategorie() == Kategorie.PLASTIK_UND_MUELL;
      	muellDeponieImageView.setVisible(showPlastikUndMuellBg);
      	voegelImageView1.setVisible(showPlastikUndMuellBg);
      	voegelImageView2.setVisible(showPlastikUndMuellBg);
     	
// Nur bei Fragen der Kategorie: Ressourcen der Erde: Bild sichtbar
     boolean ressourcenDerErdeBg = quizGame.getKategorie() == Kategorie.RESSOURCEN_DER_ERDE;
     waldWegImageView.setVisible(ressourcenDerErdeBg);
     baum3ImageView.setVisible(ressourcenDerErdeBg);
     baum1ImageView.setVisible(ressourcenDerErdeBg);
     baum4ImageView.setVisible(ressourcenDerErdeBg);
     baum2ImageView.setVisible(ressourcenDerErdeBg);
// Bäume in Ausgangsposition setzen
     if (ressourcenDerErdeBg) {
    	    resetBaeume();
    	}
     	
// Nur bei Fragen der Kategorie: Tiere- und Artenvielfalt: Bild sichtbar
        boolean showTiereUndArtenvielfaltBg = quizGame.getKategorie() == Kategorie.TIERE_UND_ARTENVIELFALT;
     	erdlochImageView.setVisible (showTiereUndArtenvielfaltBg);
     	erdmaennchen1ImageView.setVisible(showTiereUndArtenvielfaltBg);
     	erdlochPatch1ImageView.setVisible(showTiereUndArtenvielfaltBg);
     	erdmaennchen2ImageView.setVisible(showTiereUndArtenvielfaltBg);
     	erdlochPatch2ImageView.setVisible(showTiereUndArtenvielfaltBg);
     	erdmaennchen3ImageView.setVisible(showTiereUndArtenvielfaltBg);
     	erdlochPatch3ImageView.setVisible(showTiereUndArtenvielfaltBg);
     	erdmaennchen4ImageView.setVisible(showTiereUndArtenvielfaltBg);
 	
// Nur bei Fragen der Kategorie: Was kann ich tun?: Bild sichtbar   
     	boolean showWasKannIchTunBg = quizGame.getKategorie() == Kategorie.WAS_KANN_ICH_TUN;
     	mondBlickImageView.setVisible(showWasKannIchTunBg);
     	sterneImageView.setVisible(showWasKannIchTunBg);
     	komet1ImageView.setVisible(showWasKannIchTunBg);
     	komet2ImageView.setVisible(showWasKannIchTunBg);
     	komet3ImageView.setVisible(showWasKannIchTunBg);
     	erdRotationImageView.setVisible(showWasKannIchTunBg);

     	
//Setzt den Text (Inhalt) in die Antwortbuttons        
	answerA.setText("A) " + answers[0]);
	answerB.setText("B) " + answers[1]);
	answerC.setText("C) " + answers[2]);
	answerD.setText("D) " + answers[3]);

//Antwort Buttons aktivieren 
	answerA.setDisable(false);
	answerB.setDisable(false);
	answerC.setDisable(false);
	answerD.setDisable(false);

//Entfernt eventuell vorher gesetzte Hintergrundfarben oder Effekte.           
	answerA.setStyle("");
	answerB.setStyle("");
	answerC.setStyle("");
	answerD.setStyle("");

//Setze den Link erst nach der Antwortanzeige:           
	linkLabel.setText("");
	linkLabel.setOnAction(null);
	} else {
		
//Wenn keine Fragen mehr übrig sind, wird das Quiz beendet
	endQuiz();
	}
	}



// Variable: Platzhalter für die Antworten
private Button getButtonByAnswer(char antwort) {
	return switch (antwort) {
		case 'A' -> answerA;
		case 'B' -> answerB;
		case 'C' -> answerC;
		case 'D' -> answerD;
		default -> null;
	    };
	    }





// Methode: deaktiviert Button ohne diesen grau zu machen:	
private void disableButton(Button button) {
	button.setMouseTransparent(true);				// keine Mausinteraktion möglich
	button.setFocusTraversable(false);				// kein Tastaturfokus möglich;
	}



// Methode: aktiviert die Buttons wieder: 
private void enableButton(Button button) {
	button.setMouseTransparent(false);				// Mausinteraktion wieder erlaubt
	button.setFocusTraversable(true);				// Tastaturfokus wieder erlaubt
	} 	
	


// Methode: Aktiviert alle AntwortButtons wieder:
private void enableAllButtons() {
	enableButton(answerA);
	enableButton(answerB);
	enableButton(answerC);
	enableButton(answerD);
	}



// Methode: bringt Bäume wieder in Ursprungsposition zurück:
private void resetBaeume() {
 baum1ImageView.setRotate(0);
 baum1ImageView.setTranslateX(0);
 baum1ImageView.setTranslateY(0);
 
 baum2ImageView.setRotate(0);
 baum2ImageView.setTranslateX(0);
 baum2ImageView.setTranslateY(0);
 
 baum3ImageView.setRotate(0);
 baum3ImageView.setTranslateX(0);
 baum3ImageView.setTranslateY(0);
 
 baum4ImageView.setRotate(0);
 baum4ImageView.setTranslateX(0);
 baum4ImageView.setTranslateY(0);
}



// Beendet das Quiz und zeigt die Endpunktzahl an
private void endQuiz() {
	showAlert("Quiz Beendet", "Du hast " + quizGame.getPunkte() + " Punkte erreicht!");
	}



// Methode um die Regeln in einem Dialogfenster anzuzeigen 
private void showRulesDialog(Stage primaryStage, String playerName) {
	if (rulesStage != null && rulesStage.isShowing())
		return;
	
// Erstellt ein weiteres Label für "📜 Spielregeln 📜" mit größerer Schrift
	Label rulesTitleLabel = new Label("\uD83D\uDCDC Spielregeln \uD83D\uDCDC");
	      rulesTitleLabel.setStyle("-fx-font-size: 20px; -fx-font-weight:bold;");	      
// Rest der Regeln anzeigen:
	Label rulesTextLabel = new Label("\n\n" 
			+ "- Es gibt Multiple-Choice Fragen mit den Antwortmöglichkeiten\n"
			+ "  A, B, C oder D.\n" + "- Wähle die für dich richtige Antwort aus.\n"
			+ "- Für jede richtige Antwort erhältst du 10 Punkte.\n"
	        + "- Falls dich das Thema interessiert und du mehr Infos dazu\n"
	        + "  haben möchtest, haben wir dir einen HyperLink zur Quelle mit\n"
	        + "  hinzugefügt.\n" + "- Viel Spaß und Erfolg!");

// Starte Quiz Button:
	Button startQuizButton = new Button("Starte Quiz");
		   startQuizButton.setStyle("-fx-font-size: 14px; -fx-padding: 10px;");
	       startQuizButton.setOnAction(e -> {
	    	   rulesStage.close();
	    	   primaryStage.getScene().getRoot().setDisable(false);
	    	   launchQuiz(primaryStage, playerName);
	    	   });

	       
	       
// Layout für das Regelfenster:
	VBox vbox = new VBox(10, rulesTitleLabel, rulesTextLabel, startQuizButton);
	vbox.setStyle("-fx-padding: 20; -fx-alignment: center;");

// Deaktiviert das QuizFenster um Interaktion zu verhindern
	primaryStage.getScene().getRoot().setDisable(true);

// Overlay hinzufügen, dass alle Interaktionen blockiert
	Pane overlay = new Pane();
		 overlay.setStyle("-fx-background-color: rgba(0, 0, 0, 0.0);");
		 overlay.setPrefSize(primaryStage.getWidth(), primaryStage.getHeight());
		 overlay.setOnMouseClicked(event -> event.consume());

// Füge das Overlay zur Scene hinzu:
	if (primaryStage.getScene().getRoot() instanceof Pane root) {
		root.getChildren().add(overlay);
		}

	
	
// Erstelle eine Scene für das benutzerdefinierte Fenster (Spielregeln)	
	Scene dialogScene = new Scene(vbox, 400, 350);
		rulesStage = new Stage();
		rulesStage.setTitle("📜 Spielregeln 📜");
		rulesStage.setScene(dialogScene);
		rulesStage.show();
		rulesStage.setOnCloseRequest(event -> {
			event.consume();
				if (primaryStage.getScene().getRoot() instanceof Pane paneRoot) {
					paneRoot.getChildren().remove(overlay);
	                }
	                primaryStage.getScene().getRoot().setDisable(false);
	                rulesStage.close();
	                launchQuiz(primaryStage, playerName);
					});
	    			}



// Zeigt eine allgemeine Benachrichtigung an
private void showAlert(String title, String message) {
	Alert alert = new Alert(Alert.AlertType.INFORMATION);
		  alert.setTitle(title);
		  alert.setHeaderText(null);
		  alert.setContentText(message);
		  alert.showAndWait();
}
}