/**
 * @author:         Miras Ashktorab
 * @date:           10/09/2019
 * @class ID:       70641
 * @Assignment:     Assignment 2    (package name: assign2)
 *
 * @Description:    Using junit create test cases to test methods in
 *                  AddingMachine.java
 */

package cse360assign2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit class test to check if AddingMashine works with different values
 */

class AddingMachineTest {

    /**
     * This test calculation: 0 + 4 - 2 + 5
     * expected total = 7
     * actual total = 7
     */
    @Test
    void fourMinusTwoPlusFive() {
        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add(4);
        myCalculator.subtract(2);
        myCalculator.add(5);
        myCalculator.toString();
        System.out.println(myCalculator.toString());
        assertEquals(7,myCalculator.getTotal());

        myCalculator.clear();
        assertEquals(0,myCalculator.getTotal());
    }

    /**
     * This test calculation: 0 + 10 - 3 + 8
     * expected total = 15
     * actual total = 15
     */
    @Test
    void calculation1() {
        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add(10);
        myCalculator.subtract(3);
        myCalculator.add(8);
        myCalculator.toString();
        System.out.println(myCalculator.toString());
        assertEquals(15,myCalculator.getTotal());

        myCalculator.clear();
        assertEquals(0,myCalculator.getTotal());
    }

}