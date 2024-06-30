package application;

import application.Design.Design;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text Processing App");

        // Create main layout
        BorderPane layout = new BorderPane();
        Scene scene = new Scene(layout, 1000, 600);

        // Create and set UI sections
        Design mainUI = new Design();
        layout.setLeft(mainUI.createRegexSection());
        layout.setRight(mainUI.createDataSection());

        // Load CSS
        String css = getClass().getResource("/application/style.css").toExternalForm();
        scene.getStylesheets().add(css);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}