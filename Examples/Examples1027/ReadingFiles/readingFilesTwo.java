package ReadingFiles;
import java.io.*;           // We need the methods in these Java libraries to be able to do what we want to do.
import java.util.*;

/**
 * readingFilesOne
 */
public class readingFilesTwo {

    public static void main(String[] args) throws IOException {         // Need to tell java that you're okay if main throws an IOException. Will happen when the selected file cannot be read.
        File f = new File("readingFiles.txt");                          // First, let's create a reference to our file
        Scanner s = new Scanner(f);                                     // Then we'll setup a new scanner, simply called "s" so that we're ready to read our text file

        while (s.hasNext()) {                                           // In this first while loop we're looping through every "token" of the file and printing it out. Scanner.hasNext() checks if there is still another "token" left to be read in the file. It'll eval. to true or false.
            System.out.println(s.next());                               // Then we can print the next "token" of the file.
        }

        s.close();
    }
}