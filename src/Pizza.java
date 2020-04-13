
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

    public Pizza(String style, String size, ArrayList<String> toppings) {
        this.style = style;
        this.size = size;
        this.toppings = toppings;

    }

    public Pizza(String style, String size) {
        this.style = style;
        this.size = size;
    }

    public abstract int pizzaPrice();

    public String toString() {
        return "From super";
    }

    public String getToppings() {
        return "From super toppings";
    }
}
