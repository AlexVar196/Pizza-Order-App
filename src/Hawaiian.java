
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

    @Override
    public String toString() {
        return "Style: " + style + "\n"
                + "Size: " + size + "\n"
                + "Toppings: " + toppingString + "\n"
                + "Price: " + pizzaPrice();
    }
}
