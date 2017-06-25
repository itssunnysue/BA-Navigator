package sample;

import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
import javafx.geometry.*;
import javafx.geometry.Insets;
//import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
//import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Font;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {

  //      Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("BA Campus Navigator");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Label start_pos = new Label("My Current Location");
        start_pos.setFont( new Font("Arial" , 17));
        start_pos.setTextFill(Color.web("#0000FF"));
        grid.add(start_pos, 4, 0);

        ChoiceBox<String> choiceBox_start = new ChoiceBox<>();                            //creates a drop box list
        choiceBox_start.getItems().addAll("Haupteingang", "Hof", "Mensa");
        grid.add(choiceBox_start, 6, 0);

        Label finish_pos = new Label("Choose a Destination");
        finish_pos.setFont( new Font("Arial" , 17));
        finish_pos.setTextFill(Color.web("#0000FF"));
        grid.add(finish_pos, 4, 2);

        ChoiceBox<String> choiceBox_finish = new ChoiceBox<>();                            //creates a drop box list
        choiceBox_finish.getItems().addAll("1,203", "1,204", "1,205");
        grid.add(choiceBox_finish, 6, 2);

        Button btn_go = new Button("GO!");
        HBox h_box1 = new HBox(10);
        h_box1.setAlignment(Pos.BOTTOM_LEFT);
        h_box1.getChildren().add(btn_go);
        grid.add(h_box1, 6, 4);

        final Scene scene = new Scene(grid, 1024, 768, Color.web("0000FF"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }



}
