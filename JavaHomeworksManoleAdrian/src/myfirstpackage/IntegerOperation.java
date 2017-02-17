/*
 * 
 */
package myfirstpackage;

/**
 *
 * @author Adrian Manole
 */
public class IntegerOperation {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        int prod = a * b;
        String result = a + " + " + b + " = " + sum;
        System.out.println(result);
        // implement other operations and print results!
    }
    
}
