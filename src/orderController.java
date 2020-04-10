
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * The controller for the order details.
 *
 * @author Michael Flores mof15
 * @author Alex Varshavsky av653
 */

public class orderController {

    @FXML
    private Button backToSelection;

    private Stage secondStage;

    /**
     * Set the second stage to Order Details
     * @param stage
     */
    public void setSecondStage(Stage stage) {
        secondStage = stage;
    }

    /**
     * Close the second stage
     */
    public void closeSecondStage() {
        secondStage.close();
    }
}
//    private Stage firstStage;
//    private Scene firstScene;
//
//    public void setFirstStage(Stage stage) {
//        firstStage = stage;
//    }
//    public void setFirstScene(Scene scene) {
//        firstScene = scene;
//    }
//    public void openFirstStage() {
//        firstStage.setTitle("Does this even show?");
//        firstStage.setScene(firstScene);
//        firstStage.show();
//    }
