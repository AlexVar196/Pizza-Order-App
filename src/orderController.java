
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * The orderController class is the controller for the order details.
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
        // nothing to do here.
    }

    /**
     * Set the second stage to Order Details obtained from the main java class
     *
     * @param stage
     */
    public void setSecondStage(Stage stage) {
        secondStage = stage;
    }

    /**
     * Close the second stage when clicking on the back button.
     */
    public void closeSecondStage() {
        secondStage.close();
    }

    /**
     * Clear the whole order
     */
    public void clearOrder() {

        controller.pizzaList.clear();
        orderSummary.clear();
        orderSummary.appendText("Order was cleared.");
    }

    /**
     * Displays the whole order summary with a calculated price.
     */
    public void showOrderSummary() {

        int total_price = 0;
        String order_summary = "";

        for (Pizza pizza : controller.pizzaList) {
            total_price += pizza.pizzaPrice();
            order_summary += "\n\n" + pizza.toString();
        }

        orderSummary.clear();
        orderSummary.appendText(order_summary + " \n ------------------- \n");
        orderSummary.appendText("Total Price: " + total_price);

    }
}
