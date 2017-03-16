/*
 * Test of arithmeticOperations method, of class MyFirstCalculator.
 */
package myfirstcalculator;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian Manole
 */
public class MyFirstCalculatorIT {
    
    public MyFirstCalculatorIT() {
    }

    /**
     * Test of arithmeticOperations method, of class MyFirstCalculator.
     */
    @Test
    public void testArithmeticOperations() {
        System.out.println("arithmeticOperations");
        MyFirstCalculator instance = new MyFirstCalculator();
        instance.arithmeticOperations();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of turnCalculatorOff method, of class MyFirstCalculator.
     */
    @Test
    public void testTurnCalculatorOff() {
        System.out.println("turnCalculatorOff");
        MyFirstCalculator instance = new MyFirstCalculator();
        instance.turnCalculatorOff();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of turnCalculatorOn method, of class MyFirstCalculator.
     */
    @Test
    public void testTurnCalculatorOn() {
        System.out.println("turnCalculatorOn");
        MyFirstCalculator instance = new MyFirstCalculator();
        instance.turnCalculatorOn();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MyFirstCalculator.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MyFirstCalculator.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
