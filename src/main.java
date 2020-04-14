
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The main class for the primary stage and second stage, which runs the entire
 * application.
 *
 * @author Michael Flores mof15
 * @author Alex Varshavsky av653
 */
public class main extends Application {

    static public orderController second;

    public void start(Stage primaryStage) throws Exception {

        //Load the FXML file.
        FXMLLoader firstLoader = new FXMLLoader(getClass().getResource("primaryStage.fxml"));
        Parent root = firstLoader.load();
        Scene primaryScene = new Scene(root, 625, 600);

        //Load the FXML file.
        FXMLLoader secondLoader = new FXMLLoader(getClass().getResource("orderDetail.fxml"));
        Parent child = secondLoader.load();
        Scene orderScene = new Scene(child, 500, 400);

        Stage orderStage = new Stage();

        //controller.java
        controller first = firstLoader.getController();
        first.setSecondStage(orderStage);
        first.setSecondScene(orderScene);
        //first.openSecondStage();

        //orderController.java
        second = secondLoader.getController();
        second.setSecondStage(orderStage);

        primaryStage.setTitle("Pizza Party");
        primaryStage.setScene(primaryScene);
        primaryStage.show();

    }

    public static void main(String[] args) {

        //Launch the application.
        launch(args);
    }
}
