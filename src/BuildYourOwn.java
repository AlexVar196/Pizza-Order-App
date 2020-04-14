
import java.util.ArrayList;
import java.lang.*;

/**
 * BuildYourOwn class extends pizza and allows the user to build a customized
 * pizza. Toppings must be at least one and not more than six.
 *
 * @author Michael Flores mof15
 * @author Alex Varshavsky av653
 */
public class BuildYourOwn extends Pizza {

    // Constructor
    public BuildYourOwn(String style, String size, ArrayList<String> toppings) {
        super(style, size, toppings);
    }

    /**
     * pizzaPrice calculates the price of a pizza according to the constants
     * defined in the Pizza class.
     *
     * @return returns the integer price, or -1 if there's an error.
     *
     */
    @Override
    public int pizzaPrice() {
        if (null != size && toppings.size() < 7 && toppings.size() > 0) {
            switch (size) {
                case "Small (10\")":
                    return BYO_S + (toppings.size() * TOPPING_PRICE);
                case "Medium (12\")":
                    return BYO_S + UPGRADE_TO_MED + (toppings.size() * TOPPING_PRICE);
                case "Large (14\")":
                    return BYO_S + UPGRADE_TO_LRG + (toppings.size() * TOPPING_PRICE);
                default:
                    return BYO_S + UPGRADE_TO_MED + (toppings.size() * TOPPING_PRICE);
            }
        } else {
            return -1;
        }
    }

    /**
     * @return a string with pizza details: style, size, toppings and price.
     *
     */
    @Override
    public String toString() {
        String toppingString = "";
        for (String s : toppings) {
            toppingString += s + ", ";
        }

        if (pizzaPrice() > 0) {

            return "Style: " + style + "\n"
                    + "Size: " + size + "\n"
                    + "Toppings: " + toppingString + "\n"
                    + "Price: " + pizzaPrice();
        }
        return "Wrong amount of toppings was selected for current pizza. Must be between 1 to 6";
    }
}
