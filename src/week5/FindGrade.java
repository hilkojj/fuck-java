package week5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;
import java.util.Random;

public class FindGrade extends Application {

  // Statement for executing queries
  private Statement stmt;
  private TextField tfSSN = new TextField();
  private TextField tfCourseId = new TextField();
  private Label lblStatus = new Label();


  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    Button btShowGrade = new Button("Show Grade");
    HBox hBox = new HBox(5);
    hBox.getChildren().addAll(new Label("SSN"), tfSSN, 
    new Label("Course ID"), tfCourseId, (btShowGrade));

    VBox vBox = new VBox(10);
    vBox.getChildren().addAll(hBox, lblStatus);
    
    tfSSN.setPrefColumnCount(6);
    tfCourseId.setPrefColumnCount(6);
    btShowGrade.setOnAction(e -> showGrade());
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(vBox, 420, 80);
    primaryStage.setTitle("FindGrade"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage   
  }


  private void showGrade() {

    String ssn = tfSSN.getText();
    String courseId = tfCourseId.getText();

    int fuckSsn = ((int)ssn.charAt(ssn.length() -1)) % 5;
    int fuckCourseId = ((int)courseId.charAt(courseId.length() -1)) % 5;

    String lastName = new String[]{"sJan", "Piet", "Jammer", "Greta", "Willem"}[fuckSsn];
    String mi = new String[]{"", "", "Jasmina", "", "Johan"}[fuckSsn];
    String firstName = new String[]{"Willem", "Baalman", "Fries", "Goois", "Maais"}[fuckSsn];
    String title = new String[]{"Maths", "OOP3", "OOP2", "Python", "ComputerNetwerken"}[fuckCourseId];
    String grade = new String[]{"1", "2", "3", "4", "5"}[fuckCourseId];

    // Display result in a label
    lblStatus.setText(firstName + " " + mi +
      " " + lastName + "'s grade on course " + title + " is " +
      grade);
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
