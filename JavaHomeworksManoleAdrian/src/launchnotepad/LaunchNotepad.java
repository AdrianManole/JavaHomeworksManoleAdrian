package launchnotepad;


import java.io.IOException;

/*
 * This class will launch 3 instances of notepad 
 */

/**
 * @author Adrian Manole
 */
public class LaunchNotepad {

     public static void main(String[] args) throws InterruptedException
    {
        //Returns the Runtime object associated with the application
        Runtime runtime = Runtime.getRuntime();     
 
        try
        {
            //Opens a new notepad instance
            runtime.exec("notepad.exe"); 
            //Waits for 3 seconds
            Thread.sleep(3000);
            //Opens a new notepad instance
            runtime.exec("notepad.exe"); 
            //Waits for 3 seconds
            Thread.sleep(3000);
            //Opens a new notepad instance
            runtime.exec("notepad.exe");
 
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    
}
