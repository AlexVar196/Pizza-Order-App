
import java.util.ArrayList;
import java.lang.*;

/**
 * BuildYourOwn
 *
 * @author Michael Flores mof15
 * @author Alex Varshavsky av653
 */
public class BuildYourOwn extends Pizza {


    public BuildYourOwn(String style, String size, ArrayList<String> toppings) {
        super(style, size, toppings);
    }

    @Override
    public int pizzaPrice() {
        if (null != size) {
            switch (size) {
                case "Small (10\")":
                    return BYO_S;
                case "Medium (12\")":
                    return BYO_S + UPGRADE_TO_MED + (toppings.size() * TOPPING_PRICE);
                case "Large (14\")":
                    return BYO_S + UPGRADE_TO_LRG + (toppings.size() * TOPPING_PRICE);
                default:
                    return BYO_S + UPGRADE_TO_MED + (toppings.size() * TOPPING_PRICE);
            }
        } else return 0;
    }

    @Override
    public String toString() {
        String toppingString = "";
        for (String s : toppings){
        toppingString += s + ", ";
                }

        return "Style: " + style + "\n"
                + "Size: " + size + "\n"
                + "Toppings: " + toppingString + "\n"
                + "Price: " + pizzaPrice();
    }
}
