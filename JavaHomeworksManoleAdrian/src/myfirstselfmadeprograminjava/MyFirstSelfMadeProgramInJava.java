/*
 * file of my first self made program in Java (copied from Cristian 
who copied it from Marius)
 */
package myfirstselfmadeprograminjava;

import java.util.Scanner;

/**
 * My first Java self made program
 * @author Adrian Manole
 */
public class MyFirstSelfMadeProgramInJava {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What is your name?");
        System.out.print("Please type here: ");
        //String name = scan.nextLine(); commented for JUnit test
        String name = "Adrianus";
        System.out.println("So your name is " + name);
    }
    
}
