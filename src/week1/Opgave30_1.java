package week1;

public class Opgave30_1 extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Text area for displaying contents
        TextArea ta = new TextArea();
        // Create a scene and place it in the stage
        Scene scene = new Scene(new ScrollPane(ta), 450, 200);
        primaryStage.setTitle("Opgave30_1"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
        
        ta.appendText("TEST");
    }

    public static void main(String[] args) {
        System.out.println("test");
    }
}
