import java.io.*;
import java.util.*;

public class fileClassScannerClassEx1 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("fileClassScannerClassEx1.txt");
        Scanner sc = new Scanner(file);


        System.out.println();
        System.out.println();

        while (sc.hasNextLine()) // Checks if the file has another line
        {
            System.out.println(sc.nextLine()); // Prints the next line while the condition is true
        }

        sc.close();

        File file1 = new File("fileClassScannerClassEx1.txt");
        Scanner sc1 = new Scanner(file);

        System.out.println();
        System.out.println();



        while(sc1.hasNext()) // Checks if file has another "token"  
                            // In this case a "token" is a string of characters that is terminated by a space
        {
            System.out.println(sc1.next()); // Prints the next word
        }
    }
}