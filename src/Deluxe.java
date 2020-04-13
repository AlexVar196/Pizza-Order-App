
/**
 * Deluxe
 *
 * @author Michael Flores mof15
 * @author Alex Varshavsky av653
 */
public class Deluxe extends Pizza {

    String toppingString = "Sausage, Pepperoni, Green Pepper, Onion, Mushroom";

    public Deluxe(String style, String size) {
        super(style, size);
    }

    @Override
    public int pizzaPrice() {
        switch (size) {
            case "Small (10\")":
                return DELUXE_S;
            case "Medium (12\")":
                return DELUXE_S + UPGRADE_TO_MED;
            case "Large (14\")":
                return DELUXE_S + UPGRADE_TO_LRG;
            default:
                return DELUXE_S + UPGRADE_TO_MED;
        }
    }

    @Override
    public String toString() {
        return "Style: " + style + "\n"
                + "Size: " + size + "\n"
                + "Toppings: " + toppingString + "\n"
                + "Price: " + pizzaPrice();
    }
}
