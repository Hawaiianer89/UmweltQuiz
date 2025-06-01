module UmweltQuiz {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires javafx.media;
    
    exports Quiz; // Exportiere das Package, in dem sich deine GUI und andere Klassen befinden
}
