
import java.util.ArrayList;

/**
 * Pizza
 *
 * @author Michael Flores mof15
 * @author Alex Varshavsky av653
 */

public abstract class Pizza {
    protected String style;
    protected String size;
    protected ArrayList<String> toppings;

    public Pizza(String style, String size, ArrayList<String> toppings) {

    }
    public Pizza(String style, String size) {

    }
    
    public abstract int pizzaPrice();

    public String toString() {
        return "";
    }
    public String getToppings() {
        return "";
    }
}
