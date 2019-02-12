package week1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Opgave14_6 extends Application { // DONE

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        int size = 8;
        for(int i=0; i<size*size; i++)
            grid.add(new Rectangle(20, 20, Paint.valueOf(((i+i/size)%2==0)?"black":"white")), i%size, i/size);
        grid.setAlignment(Pos.CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setTitle("FindGrade"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}