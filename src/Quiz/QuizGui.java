package Quiz;

import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;			// Importiert die KeyFrame-Klasse für Animationen in JavaFX -> definiert eine Aktion, die zu einem bestimmten Zeitpunkt in einer Animation ausgeführt wird						 
import javafx.animation.Timeline;			// Importiert Timeline-Klasse, die eine Abfolge von KeyFrames für Animationen verwaltet.
import javafx.animation.TranslateTransition;
import javafx.application.Application;		// Importiert Application-Klasse, die die Einstiegsklasse für jede JavaFX-Anwendung darstellt.
import javafx.scene.Scene;					// Importiert Scene-Klasse, die die "Bühne" für alle visuellen JavaFX-Elemente darstellt.
import javafx.scene.control.*;				// Importiert alle Bedienelemente (Controls) wie Label, Button, TextField usw. -> Gehört zur GUI.
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;			// Importiert Pane-Layout, ein generisches Layout zur Positionierung von GUI-Elementen.
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;			// Importiert VBox-Layout, das Elemente vertikal untereinander anordnet.
import javafx.scene.text.Font;				// Schriftarten, größe eines Textes in der GUI
import javafx.stage.Stage;					// Importiert Stage-Klasse, die das Hauptfenster einer JavaFX-Anwendung repräsentiert.
import javafx.util.Duration;				// Importiert Duration-Klasse, die für zeitbasierte Operationen wie Animationen verwendet wird.
import javafx.geometry.Rectangle2D;
import javafx.animation.PauseTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.application.Platform;
import javafx.scene.transform.Rotate;
import javafx.geometry.Bounds;
import javafx.animation.Animation;


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
    ;
    
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


        
// AKW als Hintergrund für Kategorie: [Klimawandel und Energie]
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
       
        
        
// Tisch als Hintergrund für Kategorie [Ernaehrung und Lebensmittelverschwendung]
        tischImageView = new ImageView(new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/Tisch.png").toExternalForm()));
        tischImageView.setFitWidth(800);
        tischImageView.setFitHeight(600);
        tischImageView.setPreserveRatio(false);
        tischImageView.setVisible(false);   
        
// Lebensmitte1 hinzufügen:
        essen1ImageView = new ImageView (new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/Lebensmittel1.png").toExternalForm()));
        essen1ImageView.setX(570);
        essen1ImageView.setY(350);
        essen1ImageView.setFitWidth(250);
        essen1ImageView.setFitHeight(250);
        essen1ImageView.setVisible(false);
// Lebensmittel1: Transparent -> Sichtbar
        FadeTransition essen1 = new FadeTransition(Duration.seconds(3.5), essen1ImageView);
        essen1.setFromValue(0.0);
        essen1.setToValue(1.0);
        essen1.setCycleCount(1);
// Pause vor Animationsstart:
        PauseTransition warteKurz1 = new PauseTransition(Duration.seconds(6));
// Beide zusammen in eine Sequenz
        SequentialTransition animationEssen1 = new SequentialTransition(warteKurz1, essen1);
        animationEssen1.play();
  
// Lebensmitte2 hinzufügen:
        essen2ImageView = new ImageView (new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/ServierVorschlag1.png").toExternalForm()));
        essen2ImageView.setX(200);
        essen2ImageView.setY(300);
        essen2ImageView.setFitWidth(300);
        essen2ImageView.setFitHeight(300);
        essen2ImageView.setVisible(false);   
// Lebensmittel2: Transparent -> Sichtbar
        FadeTransition essen2 = new FadeTransition(Duration.seconds(3.5), essen2ImageView);
        essen2.setFromValue(0.0);
        essen2.setToValue(1.0);
        essen2.setCycleCount(1);
// Pause vor Animationsstart:
        PauseTransition warteKurz2 = new PauseTransition(Duration.seconds(6));
// Beide zusammen in eine Sequenz
        SequentialTransition animationEssen2 = new SequentialTransition(warteKurz2, essen2);
        animationEssen2.play();        
        
// Lebensmitte3 hinzufügen:
        essen3ImageView = new ImageView (new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/Trocken2.png").toExternalForm()));
        essen3ImageView.setX(400);
        essen3ImageView.setY(380);
        essen3ImageView.setFitWidth(250);
        essen3ImageView.setFitHeight(230);
        essen3ImageView.setVisible(false);
// Lebensmittel3: Transparent -> Sichtbar
        FadeTransition essen3 = new FadeTransition(Duration.seconds(3.5), essen3ImageView);
        essen3.setFromValue(0.0);
        essen3.setToValue(1.0);
        essen3.setCycleCount(1);
// Pause vor Animationsstart:
        PauseTransition warteKurz3 = new PauseTransition(Duration.seconds(6));
// Beide zusammen in eine Sequenz
        SequentialTransition animationEssen3 = new SequentialTransition(warteKurz3, essen3);
        animationEssen3.play(); 
              
// Lebensmitte4 hinzufügen:
        essen4ImageView = new ImageView (new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/Trocken3.png").toExternalForm()));
        essen4ImageView.setX(180);
        essen4ImageView.setY(250);
        essen4ImageView.setFitWidth(350);
        essen4ImageView.setFitHeight(300);
        essen4ImageView.setVisible(false); 
// Lebensmittel4: Transparent -> Sichtbar
        FadeTransition essen4 = new FadeTransition(Duration.seconds(3.5), essen4ImageView);
        essen4.setFromValue(0.0);
        essen4.setToValue(1.0);
        essen4.setCycleCount(1);
// Pause vor Animationsstart:
        PauseTransition warteKurz4 = new PauseTransition(Duration.seconds(6));
// Beide zusammen in eine Sequenz
        SequentialTransition animationEssen4 = new SequentialTransition(warteKurz4, essen4);
        animationEssen4.play(); 
              
// Lebensmitte5 hinzufügen:
        essen5ImageView = new ImageView (new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/TüteLebensmittel1.png").toExternalForm()));
        essen5ImageView.setX(-20);
        essen5ImageView.setY(320);
        essen5ImageView.setFitWidth(300);
        essen5ImageView.setFitHeight(300);
        essen5ImageView.setVisible(false);
        essen5ImageView.setRotate(-10);
// Lebensmittel5: Transparent -> Sichtbar
        FadeTransition essen5 = new FadeTransition(Duration.seconds(3.5), essen5ImageView);
        essen5.setFromValue(0.0);
        essen5.setToValue(1.0);
        essen5.setCycleCount(1);
// Pause vor Animationsstart:
        PauseTransition warteKurz5 = new PauseTransition(Duration.seconds(6));
// Beide zusammen in eine Sequenz
        SequentialTransition animationEssen5 = new SequentialTransition(warteKurz5, essen5);
        animationEssen5.play();        
              
// Lebensmitte6 hinzufügen:
        essen6ImageView = new ImageView (new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/TüteLebensmittel2.png").toExternalForm()));
        essen6ImageView.setX(10);
        essen6ImageView.setY(200);
        essen6ImageView.setFitWidth(250);
        essen6ImageView.setFitHeight(250);
        essen6ImageView.setVisible(false); 
// Lebensmittel3: Transparent -> Sichtbar
        FadeTransition essen6 = new FadeTransition(Duration.seconds(3.5), essen6ImageView);
        essen6.setFromValue(0.0);
        essen6.setToValue(1.0);
        essen6.setCycleCount(1);
// Pause vor Animationsstart:
        PauseTransition warteKurz6 = new PauseTransition(Duration.seconds(6));
// Beide zusammen in eine Sequenz
        SequentialTransition animationEssen6 = new SequentialTransition(warteKurz6, essen6);
        animationEssen6.play();         
               
// Lebensmitte7 hinzufügen:
        essen7ImageView = new ImageView (new Image(getClass().getResource("/images/Ernaehrung_und_Lebensmittelverschwendung/TüteLebensmittel3.png").toExternalForm()));
        essen7ImageView.setX(470);
        essen7ImageView.setY(130);
        essen7ImageView.setFitWidth(350);
        essen7ImageView.setFitHeight(350);
        essen7ImageView.setVisible(false);   
// Lebensmittel7: Transparent -> Sichtbar
        FadeTransition essen7 = new FadeTransition(Duration.seconds(3.5), essen7ImageView);
        essen7.setFromValue(0.0);
        essen7.setToValue(1.0);
        essen7.setCycleCount(1);
// Pause vor Animationsstart:
        PauseTransition warteKurz7 = new PauseTransition(Duration.seconds(6));
// Beide zusammen in eine Sequenz
        SequentialTransition animationEssen7 = new SequentialTransition(warteKurz7, essen7);
        animationEssen7.play(); 
        
        
        
// Mülldeponie als Hintergrund für Kategorie [Plastik und Müll]
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
              
              
        
        
        
 
// Waldweg als Hintergrund für Kategorie [Ressourcen der Erde]
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

        
        
// Erdloch als Hintergrund hinzufügen [Tiere und Artenvielfalt]
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


//Quiz-Start Funktion (wird nach den Regeln aufgerufen)
private void launchQuiz(Stage primaryStage, String playerName) {
	quizGame.startNewGame();

// Quiz-Layout in einem StackPane, damit Hintergrund und Buttons übereinander liegen	
 VBox quizLayout = new VBox(10);
 quizLayout.setStyle("-fx-padding: 20; -fx-alignment: center;");
 questionLabel = new Label("Frage wird geladen...");    


//AntwortButton deaktivieren nach Auswahl -> ohne Transparenz
 answerA = new Button();
 answerB = new Button();
 answerC = new Button();
 answerD = new Button();
 answerA.setOnAction(e -> checkAnswer('A'));
 answerB.setOnAction(e -> checkAnswer('B'));
 answerC.setOnAction(e -> checkAnswer('C'));
 answerD.setOnAction(e -> checkAnswer('D'));
 
 pointsLabel = new Label("Punkte: 0");
 linkLabel = new Hyperlink();
 linkLabel.setStyle("-fx-text-fill: blue; -fx-underline: true;");

 quizLayout.getChildren().addAll(
     kategorieLabel,
     questionLabel,
     answerA, answerB, answerC, answerD,
     pointsLabel,
     linkLabel
 );
 

 StackPane quizRoot = new StackPane(backgroundPane, quizLayout);
 primaryStage.setScene(new Scene(quizRoot, 800, 600));
 loadNextQuestion();
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

	       		
// Nur bei Fragen der Kategorie: Klimawandel und Energie: Bilder sichtbar
	 boolean showAKWBg = quizGame.getKategorie() == Kategorie.KLIMAWANDEL_UND_ENERGIE;
     	akwImageView.setVisible(showAKWBg);
     	rauchImageView1.setVisible(showAKWBg);
     	rauchImageView2.setVisible(showAKWBg);    	       		
	       		
// Nur bei Fragen der Kategorie: Ernährung und Lebensmittelverschwendung: Bild sichtbar
   	 boolean showTischBg = quizGame.getKategorie() == Kategorie.ERNAEHRUNG_UND_LEBENSMITTELVERSCHWENDUNG;
   	 	tischImageView.setVisible(showTischBg); 
   	 	essen1ImageView.setVisible(showTischBg);
   	 	essen2ImageView.setVisible(showTischBg);
   	 	essen3ImageView.setVisible(showTischBg);
   	 	essen4ImageView.setVisible(showTischBg);
   	 	essen5ImageView.setVisible(showTischBg);
   	 	essen6ImageView.setVisible(showTischBg);
   	 	essen7ImageView.setVisible(showTischBg);

   	       		
// Nur bei Fragen der Kategorie: Plastik und Müll: Bild sichtbar
   	 boolean showMuellDeponieBg = quizGame.getKategorie() == Kategorie.PLASTIK_UND_MUELL;
      	muellDeponieImageView.setVisible(showMuellDeponieBg);
      	voegelImageView1.setVisible(showMuellDeponieBg);
      	voegelImageView2.setVisible(showMuellDeponieBg);
     	
// Nur bei Fragen der Kategorie: Ressourcen der Erde: Bild sichtbar
     boolean showWaldWegBg = quizGame.getKategorie() == Kategorie.RESSOURCEN_DER_ERDE;
     waldWegImageView.setVisible(showWaldWegBg);
     baum3ImageView.setVisible(showWaldWegBg);
     baum1ImageView.setVisible(showWaldWegBg);
     baum4ImageView.setVisible(showWaldWegBg);
     baum2ImageView.setVisible(showWaldWegBg);
// Bäume in Ausgangsposition setzen
     if (showWaldWegBg) {
    	    resetBaeume();
    	}

     
     	
// Nur bei Fragen der Kategorie: Tiere- und Artenvielfalt: Bild sichtbar
        boolean showErdlochBg = quizGame.getKategorie() == Kategorie.TIERE_UND_ARTENVIELFALT;
     	erdlochImageView.setVisible (showErdlochBg);
     	erdmaennchen1ImageView.setVisible(showErdlochBg);
     	erdlochPatch1ImageView.setVisible(showErdlochBg);
     	erdmaennchen2ImageView.setVisible(showErdlochBg);
     	erdlochPatch2ImageView.setVisible(showErdlochBg);
     	erdmaennchen3ImageView.setVisible(showErdlochBg);
     	erdlochPatch3ImageView.setVisible(showErdlochBg);
     	erdmaennchen4ImageView.setVisible(showErdlochBg);
 	
   	
// Nur bei Fragen der Kategorie: Was kann ich tun?: Bild sichtbar   
     	boolean showMondBlickBg = quizGame.getKategorie() == Kategorie.WAS_KANN_ICH_TUN;
     	mondBlickImageView.setVisible(showMondBlickBg);
     	sterneImageView.setVisible(showMondBlickBg);
     	erdRotationImageView.setVisible(showMondBlickBg);
     	

   
     	
     	
     	
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