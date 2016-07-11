package sample;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Screen;

/**
 * Created by lytte on 7/9/2016.
 */
public class OutputGrades {
    public OutputGrades(String[][] capitals, int determine[]) {
        Text output[] = new Text[51];
        final ScrollBar scroll = new ScrollBar();
        Group root = new Group();

        int switcher;
        int total = 0;


        output[0] = new Text("Your score is "+ total + "/50"); // move if works
        output[0].setStyle("-fx-background-color: blue");
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        Scene scene2 =new Scene(root, bounds.getWidth(), bounds.getHeight());
        //assorted definitions for scroll's location
        scroll.setLayoutY(bounds.getHeight());
        scroll.setLayoutX(scene2.getWidth()-scroll.getWidth());
        scroll.setOrientation(Orientation.VERTICAL);
        scroll.setPrefHeight(bounds.getHeight());
        scroll.setPrefWidth(700);
        scroll.setMax(800);
        scroll.setMinHeight(bounds.getHeight());
        scroll.setMinWidth(bounds.getWidth());
        GridPane gridshow = new GridPane();
        gridshow.setStyle("-fx-background-color: darkgreen");
        gridshow.setAlignment(Pos.CENTER);
        gridshow.setVgap(8);
        gridshow.setHgap(10);
        gridshow.add(output[0], 0, 0);


        for(int i = 1; i < 51; i++) {
            switcher = determine[i - 1];
            total += determine[i - 1];
            if (switcher == 1) {
                output[i] = new Text("Question " + i + " is correct! " + capitals[i - 1][0] + "'s capital is " + capitals[i - 1][1]);
            } else {
                output[i] = new Text("Question " + i + " is incorrect! " + capitals[i - 1][0] + "'s capital is " + capitals[i - 1][1]);
            }
            gridshow.add(output[i], 0, i);
        }
        scroll.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> ov, Number old_val, Number new_val) {
                gridshow.setLayoutY(-new_val.doubleValue());
            }
        });
        //scrollbar method ^
        root.getChildren().addAll(gridshow, scroll);
        Main.getPrimaryStage().setScene(scene2);

    }
}

