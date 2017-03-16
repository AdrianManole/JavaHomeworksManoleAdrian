/*
 *  Class TestFileManagement tests all methods created 
 *  in the FilesManagement created class. Catch all exceptions possible to appear.
 * 
 */
package exceptions;

/**
 *
 * @author Adrian Manole
 */
public class TestFileManagement {

    // This method puts to test the methods created in FilesManagement class
    public static void main(String[] args) {
        FilesManagement.writeStringToFile();
        FilesManagement.readString();
        FilesManagement.writeStringEmptyFile();
        FilesManagement.deleteContentFromFile();
    }

}

