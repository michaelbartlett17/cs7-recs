import java.util.*;
import java.io.*;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        File file = new File("output.txt");
        FileWriter fw = new FileWriter(file, true); // take in the file name and set to true (looking at the Java API the boolean value is to append or to overwrite the data.)
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("line 25");

        bw.close();
        fw.close();
        
    }
}
