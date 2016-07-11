package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage getPrimaryStage() {
        return primaryStage;
    }
    private static Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        this.primaryStage = primaryStage;
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("State capital test");
        primaryStage.setScene(new Scene(root, bounds.getWidth(), bounds.getHeight()));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
