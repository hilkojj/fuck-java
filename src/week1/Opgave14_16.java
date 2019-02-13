package week1;

import javafx.application.Application;
import javafx.beans.binding.DoubleBinding;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Opgave14_16 extends Application { // DONE

    class LinePane extends Pane {
        public LinePane() {
            getChildren().add(createLine( new DoubleBinding[] {
                    null, widthProperty().divide(1),
                    heightProperty().divide(3), heightProperty().divide(3)
            }, Color.BLUE));

            getChildren().add(createLine( new DoubleBinding[] {
                    null, widthProperty().divide(1),
                    heightProperty().divide(3).multiply(2), heightProperty().divide(3).multiply(2)
            }, Color.BLUE));

            getChildren().add(createLine( new DoubleBinding[] {
                    heightProperty().divide(3), heightProperty().divide(3),
                    null, widthProperty().divide(1),
            }, Color.RED));

            getChildren().add(createLine( new DoubleBinding[] {
                    heightProperty().divide(3).multiply(2), heightProperty().divide(3).multiply(2),
                    null, widthProperty().divide(1),
            }, Color.RED));
        }

        private Line createLine(DoubleBinding[] pos, Color color) {
            Line line = new Line(0, 0, 0, 0);
            if (pos[0] != null)
                line.startXProperty().bind(pos[0]);
            if (pos[1] != null)
                line.endXProperty().bind(pos[1]);
            if (pos[2] != null)
                line.startYProperty().bind(pos[2]);
            if (pos[3] != null)
                line.endYProperty().bind(pos[3]);
            line.setStrokeWidth(1);
            line.setStroke(color);
            return line;
        }
    }

    @Override
    public void start(Stage primaryStage) {
        // Create a scene and place it in the stage
        Scene scene = new Scene(new LinePane(), 400, 400, Paint.valueOf("gray"));
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    public static void main(String[] args) {
        launch(args);
    }
}