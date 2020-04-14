
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.util.ArrayList;

/**
 * The controller class acts as a GUI in order to handle user events. This class
 * is running until the program is terminated. This class allows us to add and
 * remove Pizza orders as well as display all current built pizzas with their
 * calculated price.
 *
 * @author Michael Flores mof15
 * @author Alex Varshavsky av653
 */
public class controller {

    public static ArrayList<Pizza> pizzaList = new ArrayList<Pizza>();

    //All the FXML components to be displayed
    @FXML
    private ComboBox pizzaStyle;
    @FXML
    private ComboBox pizzaSize;
    @FXML
    private ImageView imageView;
    @FXML
    private ListView toppings;
    @FXML
    private ListView selectedToppings;
    @FXML
    private Button addToppings;
    @FXML
    private Button removeToppings;
    @FXML
    private Button clearSelection;
    @FXML
    private Button addToOrder;
    @FXML
    private Button showOrder;
    @FXML
    private TextArea theTextArea;

    private Stage secondStage;
    private Scene secondScene;

    //Combo Box List Options
    ObservableList<String> pizzaStyleList
            = FXCollections.observableArrayList("Build Your Own", "Hawaiian", "Deluxe");
    ObservableList<String> pizzaSizeList
            = FXCollections.observableArrayList("Small (10\")", "Medium (12\")", "Large (14\")");

    //Default for the Image View
    Image buildPizzaImage = new Image("buildPizza.png");

    /**
     * Initialize values for combo box and imageView.
     */
    public void initialize() {

        //Initialize Combo Box
        pizzaStyle.setValue("Build Your Own");
        pizzaStyle.setItems(pizzaStyleList);

        pizzaSize.setValue("Medium (12\")");
        pizzaSize.setItems(pizzaSizeList);

        //Initialize default Image
        imageView.setImage(buildPizzaImage);

        //Initialize toppings in the ListView
        toppings.getItems().addAll("Beef", "Cheese", "Chicken",
                "Green Pepper", "Ham", "Mushroom", "Onion", "Pepperoni", "Pineapple", "Sausage");

        //Select multiple enabled
        toppings.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    /**
     * Changes the image in the imageView.
     */
    public void changeImage() {
        Image hawaiianImage = new Image("hawaiian.jpg");
        Image deluxeImage = new Image("deluxe.jpg");

        if (pizzaStyle.getValue().equals(pizzaStyleList.get(1))) {
            imageView.setImage(hawaiianImage);
            addToppings.setDisable(true);
            removeToppings.setDisable(true);
            toppings.getItems().clear();
            selectedToppings.getItems().clear();
            selectedToppings.getItems().addAll("Ham", "Pineapple");

        } else if (pizzaStyle.getValue().equals(pizzaStyleList.get(2))) {
            imageView.setImage(deluxeImage);
            addToppings.setDisable(true);
            removeToppings.setDisable(true);
            toppings.getItems().clear();
            selectedToppings.getItems().clear();
            selectedToppings.getItems().addAll("Sausage", "Pepperoni", "Green Pepper", "Onion", "Mushroom");

        } else {
            imageView.setImage(buildPizzaImage);
            addToppings.setDisable(false);
            removeToppings.setDisable(false);
            selectedToppings.getItems().clear();
            toppings.getItems().addAll("Beef", "Cheese", "Chicken",
                    "Green Pepper", "Ham", "Mushroom", "Onion", "Pepperoni", "Pineapple", "Sausage");
        }
    }

    /**
     * Obtain the second stage from main.
     *
     * @param stage
     */
    public void setSecondStage(Stage stage) {
        secondStage = stage;
    }

    /**
     * Obtain the second scene from main.
     *
     * @param scene
     */
    public void setSecondScene(Scene scene) {
        secondScene = scene;
    }

    /**
     * Open the second stage to display order details.
     */
    public void openSecondStage() {

        main.second.showOrderSummary();
        secondStage.setTitle("Order Details");
        secondStage.setScene(secondScene);
        secondStage.show();
    }

    /**
     * Add the toppings to the selected ListView
     */
    public void addToppings() {

        ObservableList selection = toppings.getSelectionModel().getSelectedItems();

        for (Object item : selection) {
            if (selectedToppings.getItems().contains(item)) {
                theTextArea.appendText("You already selected that topping!\n");
            } else {
                int x = selectedToppings.getItems().size();
                if (x < 6) {
                    selectedToppings.getItems().add(item);
                    toppings.getItems().remove(item);
                } else {
                    theTextArea.appendText("You already selected six toppings!\n");
                }
            }
        }
    }

    /**
     * Add the pizza to order.
     *
     */
    public void addToOrder() {
        theTextArea.appendText("Added:" + "\n");

        ArrayList<String> listOfToppings = new ArrayList<String>(selectedToppings.getItems());
        String psize = (String) pizzaSize.getValue();
        String pstyle = (String) pizzaStyle.getValue();

        if (null != pstyle) {
            if (selectedToppings.getItems().size() > 0) {
                switch (pstyle) {
                    case "Build Your Own": {
                        Pizza pizza = new BuildYourOwn(pstyle, psize, listOfToppings);
                        pizzaList.add(pizza);
                        theTextArea.appendText(pizza.toString() + "\n");
                        break;
                    }

                    case "Hawaiian": {
                        Pizza pizza = new Hawaiian(pstyle, psize);
                        pizzaList.add(pizza);
                        theTextArea.appendText(pizza.toString() + "\n");
                        break;
                    }
                    case "Deluxe": {
                        Pizza pizza = new Deluxe(pstyle, psize);
                        pizzaList.add(pizza);
                        theTextArea.appendText(pizza.toString() + "\n");
                        break;
                    }
                    default: {
                        theTextArea.appendText("Failed to chose a style.\n");
                    }
                    break;
                }
            } else {
                theTextArea.appendText("You must select at least one topping.\n");
            }
        } else {
            theTextArea.appendText("Some fields are missing.\n");
        }

    }

    /**
     * Remove the toppings to the toppings ListView
     */
    public void removeToppings() {

        ObservableList selection = selectedToppings.getSelectionModel().getSelectedItems();

        for (Object item : selection) {
            toppings.getItems().add(item);
            selectedToppings.getItems().remove(item);
        }
    }

    /**
     * Clear the selected toppings
     */
    public void clearSelection() {

        //Remove all of the selected toppings
        ObservableList removeSelection = selectedToppings.getItems();
        selectedToppings.getItems().removeAll(removeSelection);

        //Set everything to default
        initialize();
    }

}
