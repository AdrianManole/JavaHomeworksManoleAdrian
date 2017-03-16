/*
 * Test of main method, of class MyFirstClass.
 */
package myfirstpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian Manole
 */
public class MyFirstClassIT {
    
    public MyFirstClassIT() {
    }

    /**
     * Test of main method, of class MyFirstClass.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MyFirstClass.main(args);
    }
    
}
