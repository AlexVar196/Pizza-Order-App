
import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

/**
 * JUnit tests of BuildYourOwn class.
 * Using version 4.3
 * 
 * @author Michael Flores mof15
 * @author Alex Varshavsky av653
 */
public class BuildYourOwnTest {

    public BuildYourOwnTest() {
    }

    /**
     * Test of pizzaPrice method, of class BuildYourOwn.
     *
     * Variations: 
     * BYO: all sizes, all toppings 
     * Hawaiian: all sizes, no toppings
     * Deluxe: all sizes, no toppings
     */
    @Test
    public void testPizzaPrice() {

        // Creating instances of topping lists of different sizes (Ham1, Ham2, etc are just replacements for topping names)
        ArrayList emptyListToppings = new ArrayList();  // empty

        ArrayList listToppings1 = new ArrayList();  // one topping
        listToppings1.add("Ham1");

        ArrayList listToppings3 = new ArrayList();  // 3 toppings
        listToppings3.add("Ham1");
        listToppings3.add("Ham2");
        listToppings3.add("Ham3");

        ArrayList listToppings6 = new ArrayList(); // 6 toppings
        listToppings6.add("Ham1");
        listToppings6.add("Ham2");
        listToppings6.add("Ham3");
        listToppings6.add("Ham4");
        listToppings6.add("Ham5");
        listToppings6.add("Ham6");

        ArrayList listToppings7 = new ArrayList(); // 7 toppings
        listToppings7.add("Ham1");
        listToppings7.add("Ham2");
        listToppings7.add("Ham3");
        listToppings7.add("Ham4");
        listToppings7.add("Ham5");
        listToppings7.add("Ham6");
        listToppings7.add("Ham7");

        String small = "Small (10\")";
        String medium = "Medium (12\")";
        String large = "Large (14\")";

        String build_y_o = "Build Your Own";
        String hawaiian = "Hawaiian";
        String deluxe = "Deluxe";

        // Creating pizza instances of all sizes and types with various toppings
        Pizza byoS0 = new BuildYourOwn(build_y_o, small, emptyListToppings);
        Pizza byoS1 = new BuildYourOwn(build_y_o, small, listToppings1);
        Pizza byoS3 = new BuildYourOwn(build_y_o, small, listToppings3);
        Pizza byoS6 = new BuildYourOwn(build_y_o, small, listToppings6);
        Pizza byoS7 = new BuildYourOwn(build_y_o, small, listToppings7);

        Pizza byoM0 = new BuildYourOwn(build_y_o, medium, emptyListToppings);
        Pizza byoM1 = new BuildYourOwn(build_y_o, medium, listToppings1);
        Pizza byoM3 = new BuildYourOwn(build_y_o, medium, listToppings3);
        Pizza byoM6 = new BuildYourOwn(build_y_o, medium, listToppings6);
        Pizza byoM7 = new BuildYourOwn(build_y_o, medium, listToppings7);

        Pizza byoL0 = new BuildYourOwn(build_y_o, large, emptyListToppings);
        Pizza byoL1 = new BuildYourOwn(build_y_o, large, listToppings1);
        Pizza byoL3 = new BuildYourOwn(build_y_o, large, listToppings3);
        Pizza byoL6 = new BuildYourOwn(build_y_o, large, listToppings6);
        Pizza byoL7 = new BuildYourOwn(build_y_o, large, listToppings7);

        Pizza hawaiS = new Hawaiian(hawaiian, small);
        Pizza hawaiM = new Hawaiian(hawaiian, medium);
        Pizza hawaiL = new Hawaiian(hawaiian, large);

        Pizza deluxS = new Deluxe(deluxe, small);
        Pizza deluxM = new Deluxe(deluxe, medium);
        Pizza deluxL = new Deluxe(deluxe, large);

        // Build Your Own testing - Small
        assertEquals(-1, byoS0.pizzaPrice());
        assertEquals(7, byoS1.pizzaPrice());
        assertEquals(11, byoS3.pizzaPrice());
        assertEquals(17, byoS6.pizzaPrice());
        assertEquals(-1, byoS7.pizzaPrice());
        
        // Build Your Own testing - Medium
        assertEquals(-1, byoM0.pizzaPrice());
        assertEquals(9, byoM1.pizzaPrice());
        assertEquals(13, byoM3.pizzaPrice());
        assertEquals(19, byoM6.pizzaPrice());
        assertEquals(-1, byoM7.pizzaPrice());
        
        // Build Your Own testing - Large
        assertEquals(-1, byoL0.pizzaPrice());
        assertEquals(11, byoL1.pizzaPrice());
        assertEquals(15, byoL3.pizzaPrice());
        assertEquals(21, byoL6.pizzaPrice());
        assertEquals(-1, byoL7.pizzaPrice());
        
        // Hawaiian testing
        assertEquals(8, hawaiS.pizzaPrice());
        assertEquals(10, hawaiM.pizzaPrice());
        assertEquals(12, hawaiL.pizzaPrice());
        
        // Deluxe testing
        assertEquals(14, deluxS.pizzaPrice());
        assertEquals(16, deluxM.pizzaPrice());
        assertEquals(18, deluxL.pizzaPrice());

    }

}
