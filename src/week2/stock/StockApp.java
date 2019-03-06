package week2.stock;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// the Client
public class StockApp extends Application {
    public static StockApp instance;

    public static void main(String[] args) {
        // create concrete subject
        StockGrabber stockGrabber = new StockGrabber();

        // create and register concrete observer
        StockObserver observer1 = new StockObserver(stockGrabber);

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
//        for(int i=0; i<3; i++)
        executor.scheduleAtFixedRate(new GetTheStock(stockGrabber, "apple", 12.25d), 0, 3, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(new GetTheStock(stockGrabber, "ibm", 5.91d), 0, 3, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(new GetTheStock(stockGrabber, "oracle", 24.75d), 0, 3, TimeUnit.SECONDS);

        launch(args);

    }


    String stock1String = "Stock 1:";
    String stock2String = "Stock 2:";
    String stock3String = "Stock 3:";
    Label stock1Label;
    Label stock2Label;
    Label stock3Label;

    @Override
    public void start(Stage primaryStage) {
        instance = this;

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);

        stock1Label = new Label(stock1String);
        grid.addRow(0,stock1Label);

        stock2Label = new Label(stock2String);
        grid.addRow(1,stock2Label);

        stock3Label = new Label(stock3String);
        grid.addRow(2,stock3Label);

        // Create a scene and place it in the stage
        Scene scene = new Scene(grid, 420, 200);
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}

