
import java.util.ArrayList;
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

    private controller c;

//    public orderController() {
//        c = new controller();
//    }

    /**
     * Initialize method which contains the defaults.
     */
    public void initialize() {

        //ArrayList<Pizza> pl = new ArrayList<Pizza>(c.getPizzaList());
       // ArrayList<Pizza> pl = controller.getPizzaList();

       // orderSummary.appendText(c.getPizzaList() + " \n ------------------- \n");
       // orderSummary.appendText(pl + " \n ------------------- \n");

        //   c.getPizzaList();
        //   for (Pizza p : pizzaList){
       // orderSummary.appendText(pl.size() + " \n ------------------- \n");
        // }
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

    }
}
