/*
 * Test of sayHello method, of class HelloWorldAnonymousClasses.
 */
package anonymousclasses;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adrian Manole
 */
public class HelloWorldAnonymousClassesIT {
    
    public HelloWorldAnonymousClassesIT() {
    }

    /**
     * Test of sayHello method, of class HelloWorldAnonymousClasses.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        HelloWorldAnonymousClasses instance = new HelloWorldAnonymousClasses();
        instance.sayHello();
    }

    /**
     * Test of main method, of class HelloWorldAnonymousClasses.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        HelloWorldAnonymousClasses.main(args);
    }
    
}
