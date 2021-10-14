import java.io.*;

public class fileNotFoundEx {
    public static void main(String[] args) throws FileNotFoundException{
        try {
            InputStream inFile = new FileInputStream("fileThatDoesn'tExist.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Program Exiting.");
        }
    }
}
