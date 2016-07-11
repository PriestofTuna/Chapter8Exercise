package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

public class Controller {
    //for capitals 0 is the capital, 1 is the answer, 2 for alt answer. But really, if this wasn't required I'd do this particular operation under a single Dimensional Array.
    final String[][] capitals = {
            {"Alabama", "montgomery"},
            {"Alaska", "juneau"},
            {"Arizona", "phoenix"},
            {"Arkansas", "little rock"},
            {"California", "sacramento"},
            {"Colorado", "denver"},
            {"Connecticut", "hartford"},
            {"Delaware", "dover"},
            {"Florida", "tallahassee"},
            {"Georgia", "atlanta"},
            {"Hawaii", "honolulu"},
            {"Idaho", "boise"},
            {"Illinois", "springfield"},
            {"Indiana", "indianapolis"},
            {"Iowa", "des moines"},
            {"Kansas", "topeka"},
            {"Kentucky", "frankfort"},
            {"Louisiana", "baton rouge"},
            {"Maine", "augusta"},
            {"Maryland", "annapolis"},
            {"Massachusetts", "boston"},
            {"Michigan", "lansing"},
            {"Minnesota", "st. paul"},
            {"Mississippi", "jackson"},
            {"Missouri", "jefferson city", "jefferson"}, //has option to ignore the "City"
            {"Montana", "helena"},
            {"Nebraska", "lincoln"},
            {"Nevada", "carson city", "carson"}, //has option to ignore the "City"
            {"New Hampshire", "concord"},
            {"New Jersey", "trenton"},
            {"New Mexico", "santa fe"},
            {"New York", "albany"},
            {"North Carolina", "raleigh"},
            {"North Dakota", "bismarck"},
            {"Ohio", "columbus"},
            {"Oklahoma", "oklahoma city"},
            {"Oregon", "salem"},
            {"Pennsylvania", "harrisburg"},
            {"Rhode Island","providence"},
            {"South Carolina", "columbia"},
            {"South Dakota", "pierre"},
            {"Tennessee", "nashville"},
            {"Texas", "austin"},
            {"Utah", "salt lake city", "salt lake"}, //has option to ignore the "City"
            {"Vermont", "montpelier"},
            {"Virginia", "richmond"},
            {"District of Columbia", "washington"},
            {"West Virginia", "charleston"},
            {"Wisconsin", "madison"},
            {"Wyoming", "cheyenne"}
    };
    @FXML final ColorPicker colorPicker = new ColorPicker(Color.web("#296f3a"));
    @FXML AnchorPane mainPane;
    @FXML Button grade = new Button();
    //The below is created using SceneBuilder use angular/Node/manual to avoid my fate
    //Unfortunately when using SceneBuilder, there's no way to use arrays...
    @FXML TextField field1 = new TextField();
    @FXML TextField field2 = new TextField();
    @FXML TextField field3 = new TextField();
    @FXML TextField field4 = new TextField();
    @FXML TextField field5 = new TextField();
    @FXML TextField field6 = new TextField();
    @FXML TextField field7 = new TextField();
    @FXML TextField field8 = new TextField();
    @FXML TextField field9 = new TextField();
    @FXML TextField field10 = new TextField();
    @FXML TextField field11 = new TextField();
    @FXML TextField field12 = new TextField();
    @FXML TextField field13 = new TextField();
    @FXML TextField field14 = new TextField();
    @FXML TextField field15 = new TextField();
    @FXML TextField field16 = new TextField();
    @FXML TextField field17 = new TextField();
    @FXML TextField field18 = new TextField();
    @FXML TextField field19 = new TextField();
    @FXML TextField field20 = new TextField();
    @FXML TextField field21 = new TextField();
    @FXML TextField field22 = new TextField();
    @FXML TextField field23 = new TextField();
    @FXML TextField field24 = new TextField();
    @FXML TextField field25 = new TextField();
    @FXML TextField field26 = new TextField();
    @FXML TextField field27 = new TextField();
    @FXML TextField field28 = new TextField();
    @FXML TextField field29 = new TextField();
    @FXML TextField field30 = new TextField();
    @FXML TextField field31 = new TextField();
    @FXML TextField field32 = new TextField();
    @FXML TextField field33 = new TextField();
    @FXML TextField field34 = new TextField();
    @FXML TextField field35 = new TextField();
    @FXML TextField field36 = new TextField();
    @FXML TextField field37 = new TextField();
    @FXML TextField field38 = new TextField();
    @FXML TextField field39 = new TextField();
    @FXML TextField field40 = new TextField();
    @FXML TextField field41 = new TextField();
    @FXML TextField field42 = new TextField();
    @FXML TextField field43 = new TextField();
    @FXML TextField field44 = new TextField();
    @FXML TextField field45 = new TextField();
    @FXML TextField field46 = new TextField();
    @FXML TextField field47 = new TextField();
    @FXML TextField field48 = new TextField();
    @FXML TextField field49 = new TextField();
    @FXML TextField field50 = new TextField();


    @FXML public void grades(ActionEvent actionEvent) {
        String fieldsArray[] = { //used for for loops and the like.
                field1.getText(),
                field2.getText(),
                field3.getText(),
                field4.getText(),
                field5.getText(),
                field6.getText(),
                field7.getText(),
                field8.getText(),
                field9.getText(),
                field10.getText(),
                field11.getText(),
                field12.getText(),
                field13.getText(),
                field14.getText(),
                field15.getText(),
                field16.getText(),
                field17.getText(),
                field18.getText(),
                field19.getText(),
                field20.getText(),
                field21.getText(),
                field22.getText(),
                field23.getText(),
                field24.getText(),
                field25.getText(),
                field26.getText(),
                field27.getText(),
                field28.getText(),
                field29.getText(),
                field30.getText(),
                field31.getText(),
                field32.getText(),
                field33.getText(),
                field34.getText(),
                field35.getText(),
                field36.getText(),
                field37.getText(),
                field38.getText(),
                field39.getText(),
                field40.getText(),
                field41.getText(),
                field42.getText(),
                field43.getText(),
                field44.getText(),
                field45.getText(),
                field46.getText(),
                field47.getText(),
                field48.getText(),
                field49.getText(),
                field50.getText()
        };




        int[] determine = new int[50];
        System.out.println(field50.getText());
        for(int i = 0; i < 50; i++) {
            System.out.println(fieldsArray[i]);
            int length =  capitals[i].length - 1;
            //the below statements includes multiple answers, and also ignores the case of the choices
            if((capitals[i][length]).equalsIgnoreCase(fieldsArray[i]) | ((capitals[i][1]).equalsIgnoreCase(fieldsArray[i]))) {
                determine[i] = 1;
            } else {
                determine[i] = 0;
            }
        }
        OutputGrades outputGrades= new OutputGrades(capitals, determine);
    }
}
