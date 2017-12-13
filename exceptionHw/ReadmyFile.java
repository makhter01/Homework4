package exceptionHw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
 /*  In the following program, we read a file called "myfile.txt" and output the file line by line on the console,
      use FileReader and wrap it in a BufferedReader.
     @author Mehzabin Akhter.
  */

public class ReadmyFile {
    public static void main(String[] args) {
        //String path="/Users/mehzabinakhter/IdeaProjects/Codelab/myfile.txt"; // alternative path
        String fileName = "myfile"; // the name of the file to open
        FileReader file = null;    //Referrence to Filereader.
        BufferedReader br = null;   // reference to BufferedReader

        try {
            file = new FileReader(fileName); //// creates a FileReader and FileReader reads text files in the default encoding.


        } catch (FileNotFoundException ex) {       // if file not found FileNotFoundException will handle the exce
            System.out.println( "Unable to open file : " + fileName + " ");

            // or  ex.printStackTrace();
        }
        br = new BufferedReader(file); // creates a BufferedReader and  wrap FileReader in BufferedReader
        String text;
        try {
            while ((text = br.readLine()) != null) {     // read line untill end of the line and store it into text
                System.out.println(text);
            }
        } catch (IOException ex) {   //if BufferedReader can't read the file,IORxception object ex will handle the exception.
            ex.printStackTrace();

        } finally {        // this is executed on the way out of try/catch blocks,no matter how the try block is exited , the finally block is executed.
            try {
                file.close();   // file will close
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();   //a stack trace is a list of the method calls that the application was in the middle of when an Exception was thrown.

            }

        }

    }

    }






