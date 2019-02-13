package week1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class Opgave15_4 extends Application { // DONE

    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();

        Label nr1Label = new Label("Nr 1:");
        TextField nr1 = new TextField("4.5");
        Label nr2Label = new Label("Nr 2:");
        TextField nr2 = new TextField("4.5");
        Label resultLabel = new Label("Result:");
        TextField result = new TextField("5.5");

        Button addButton = new Button("Add");
        addButton.setOnAction(e -> result.setText(""+ (Double.parseDouble(nr1.getText()) + Double.parseDouble(nr2.getText()))) );

        Button minButton = new Button("Subtract");
        minButton.setOnAction(e -> result.setText(""+ (Double.parseDouble(nr1.getText()) - Double.parseDouble(nr2.getText()))) );

        Button mulButton = new Button("Multiply");
        mulButton.setOnAction(e -> result.setText(""+ (Double.parseDouble(nr1.getText()) * Double.parseDouble(nr2.getText()))) );

        Button divButton = new Button("Divide");
        divButton.setOnAction(e -> result.setText(""+ (Double.parseDouble(nr1.getText()) / Double.parseDouble(nr2.getText()))) );

        pane.addRow(0, new HBox(nr1Label, nr1, nr2Label, nr2, resultLabel, result));
        pane.addRow(1, new HBox(addButton, minButton, mulButton, divButton));

        Scene scene = new Scene(pane, 400, 400, Paint.valueOf("gray"));
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}