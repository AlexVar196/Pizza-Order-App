/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import static junit.framework.TestCase.assertEquals;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alex
 */
public class BuildYourOwnTest {

    public BuildYourOwnTest() {
    }

    /**
     * Test of pizzaPrice method, of class BuildYourOwn.
     *
     * Variations: BYO: all sizes, all toppings Hawaiian: all sizes, no toppings
     * Deluxe: all sizes, no toppings
     */
    @Test
    public void testPizzaPrice() {
        // System.out.println("pizzaPrice");
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

        int expResult = 0;
        int result = byoS3.pizzaPrice();
        assertEquals(expResult, result);

    }

}
