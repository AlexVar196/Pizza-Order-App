
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * The orderController class is the controller
 * for the order details.
 *
 * @author Michael Flores mof15
 * @author Alex Varshavsky av653
 */

public class orderController {

    @FXML
    private Button backToSelection;

    @FXML
    private TextArea orderSummary;

    private Stage secondStage;

    /**
     * Initialize method which contains the defaults.
     */
    public void initialize() {
        orderSummary.appendText("Order is empty.");
    }

    /**
     * Set the second stage to Order Details obtained from the
     * main java class
     *
     * @param stage
     */
    public void setSecondStage(Stage stage) {
        secondStage = stage;
    }

    /**
     * Close the second stage when clicking on
     * the back button.
     */
    public void closeSecondStage() {
        secondStage.close();
    }
}
