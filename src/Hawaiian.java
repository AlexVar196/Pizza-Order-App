
/**
 * Hawaiian
 *
 * @author Michael Flores mof15
 * @author Alex Varshavsky av653
 */
public class Hawaiian extends Pizza {

    String toppingString = "Ham, Pineapple";

    public Hawaiian(String style, String size) {
        super(style, size);
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
        switch (size) {
            case "Small (10\")":
                return HAWAIIAN_S;
            case "Medium (12\")":
                return HAWAIIAN_S + UPGRADE_TO_MED;
            case "Large (14\")":
                return HAWAIIAN_S + UPGRADE_TO_LRG;
            default:
                return HAWAIIAN_S + UPGRADE_TO_MED;
        }
    }

    /**
     * @return a string with pizza details: style, size, toppings and price.
     *
     */
    @Override
    public String toString() {
        return "Style: " + style + "\n"
                + "Size: " + size + "\n"
                + "Toppings: " + toppingString + "\n"
                + "Price: " + pizzaPrice();
    }
}
