/*
 * Class FilesManagement has four methods: 
 *   1.First one writes a string into a file specified as parameter. 
 *   2.Second one reads into a string, if exists, the whole content of a specified file as parameter.
 *   3.The third one adds a string content into an empty file specified as parameter 
 *   4.The final one to delete a content of a specified file as parameter. 
 */
package exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Adrian Manole
 */
public class FilesManagement {

    //This method writes a string into a file specified as parameter.
    public static void writeStringToFile() {
        try {
            FileWriter fileW = new FileWriter("StringToFile.txt");
            PrintWriter printW = new PrintWriter(fileW);
            printW.println("This method should write a String into a file");
            printW.println("Next method should read the String from the file");
            printW.close();
        } catch (IOException e) {
            System.err.println("Please type a valid name for the file!");

        }
    }

    //This method reads into a string, if exists, the whole content of a specified file as parameter
    public static void readString() {

        FileReader fileR = null;

        try {
            fileR = new FileReader("StringToFile.txt");
        } catch (FileNotFoundException e) {
            System.err.println("The file specified by you does not exist");
        }

        BufferedReader bufferedR = new BufferedReader(fileR);
        String stringRead;

        try {
            while ((stringRead = bufferedR.readLine()) != null) {
                System.out.println(stringRead + "\n");
            }
        } catch (IOException e) {
            Logger.getLogger(FilesManagement.class.getName()).log(Level.WARNING, null, e);
        }
    }

    //This method adds a string content into an empty file specified as parameter
    public static void writeStringEmptyFile() {
        try {
            FileWriter fileW = new FileWriter("AnotherFile.txt");
            PrintWriter printW = new PrintWriter(fileW);
            printW.println("This should write a string into an empty file");
            fileW.close();

        } catch (IOException e) {
            Logger.getLogger(FilesManagement.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    // This method deletes the content of a file specified as a paramater
    public static void deleteContentFromFile() {
        try {
            FileWriter fileW = new FileWriter("StringToFile.txt");
            PrintWriter printW = new PrintWriter(fileW);
            printW.println("");
            fileW.close();

        } catch (IOException e) {
            Logger.getLogger(FilesManagement.class.getName()).log(Level.SEVERE, null, e);
        }

    }

}
