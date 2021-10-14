import java.io.*;
import java.util.*;

public class PrintWriterEx {

    public static void main(String[] args) throws Exception {
        PrintWriter outputFile = new PrintWriter("output.txt");
        
        for (int i = 0; i < 25; i++)
        {
            outputFile.println("This is line " + i);
        }
        outputFile.close();
    }
}

