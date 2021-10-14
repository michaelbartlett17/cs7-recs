import java.io.*;
import java.util.*;

public class fileClassScannerClassEx2 {

    public static void main(String[] args) throws Exception {
        File file = new File("fileClassScannerClassEx1.txt");
        BufferedReader br = new BufferedReader(new FileReader(file)); // Declare new buffered reader while using fileReader to read the file in
        String str; // String to hold values to print

        System.out.println();
        System.out.println();

        while ((str = br.readLine()) != null) // Checks if the file has another line
        {
            System.out.println(str); // Prints the next line while the condition is true
        }
        
    }
}