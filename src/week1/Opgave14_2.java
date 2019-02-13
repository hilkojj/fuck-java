package week1;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Random;

public class Opgave14_2 extends Application { // DONE

    @Override
    public void start(Stage primaryStage) {
        Random r = new Random();

        ImageView[] imageViews = {
                new ImageView(new Image("week1/example/"+ ((r.nextInt(2)==1)?"x":"o") +".gif")),
                new ImageView(new Image("week1/example/"+ ((r.nextInt(2)==1)?"x":"o") +".gif")),
                new ImageView(new Image("week1/example/"+ ((r.nextInt(2)==1)?"x":"o") +".gif")),
                new ImageView(new Image("week1/example/"+ ((r.nextInt(2)==1)?"x":"o") +".gif")),
                new ImageView(new Image("week1/example/"+ ((r.nextInt(2)==1)?"x":"o") +".gif")),
                new ImageView(new Image("week1/example/"+ ((r.nextInt(2)==1)?"x":"o") +".gif")),
                new ImageView(new Image("week1/example/"+ ((r.nextInt(2)==1)?"x":"o") +".gif")),
                new ImageView(new Image("week1/example/"+ ((r.nextInt(2)==1)?"x":"o") +".gif")),
                new ImageView(new Image("week1/example/"+ ((r.nextInt(2)==1)?"x":"o") +".gif")),
        };

        GridPane grid = new GridPane();
        for(int i=0; i<9; i++)
            grid.add(imageViews[i], i%3, i/3);
        grid.setAlignment(Pos.CENTER);

        // Create a scene and place it in the stage
        Scene scene = new Scene(grid, 420, 200);
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}