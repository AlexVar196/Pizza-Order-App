
import java.util.ArrayList;

/**
 * Pizza
 *
 * @author Michael Flores mof15
 * @author Alex Varshavsky av653
 */
public abstract class Pizza {

    protected final int DELUXE_S = 14;
    protected final int HAWAIIAN_S = 8;
    protected final int BYO_S = 5;
    protected final int UPGRADE_TO_MED = 2;
    protected final int UPGRADE_TO_LRG = 4;
    protected final int TOPPING_PRICE = 2;
    protected String style;
    protected String size;
    protected ArrayList<String> toppings;

    /**
     * Constructor
     *
     * @param style - the pizza style
     * @param size - the pizza size
     * @param toppings - the pizza toppings - array of strings.
     */
    public Pizza(String style, String size, ArrayList<String> toppings) {
        this.style = style;
        this.size = size;
        this.toppings = toppings;

    }

    /**
     * Constructor
     *
     * @param style - the pizza style
     * @param size - the pizza size
     */
    public Pizza(String style, String size) {
        this.style = style;
        this.size = size;
    }

    /**
     * Abstract class
     *
     */
    public abstract int pizzaPrice();

    /**
     * @return empty string.
     *
     */
    public String toString() {
        return "";
    }

    /**
     * @return empty string.
     *
     */
    public String getToppings() {
        return "";
    }
}
