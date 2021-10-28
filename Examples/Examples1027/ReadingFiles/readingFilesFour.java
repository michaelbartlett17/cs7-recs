package ReadingFiles;
import java.io.*;           // We need the methods in these Java libraries to be able to do what we want to do.
import java.util.*;

/**
 * readingFilesOne
 */
public class readingFilesFour {

    public static void main(String[] args) throws IOException {         // Need to tell java that you're okay if main throws an IOException. Will happen when the selected file cannot be read.
        File f = new File("readingFiles.txt");                          // First, let's create a reference to our file
        Scanner s = new Scanner(f);                                     // Then we'll setup a new scanner, simply called "s" so that we're ready to read our text file
        int tokenNum = 0;                                               // Counting variable for our loop so we can figure out how big to make our array
        while (s.hasNext()) {                                           // In this first while loop we're looping through every "token" of the file and counting how many we have, then we can initialize an array to be of proper size.
            tokenNum++;
            s.next();
        }
        s = new Scanner(f);                                             // Reset our scanner that way we can use it again since it's at the end of the file rn

        String[] arr = new String[tokenNum];                            // Now we make a new array with the size eq. to our number of tokens

        int i = 0;                                                      // Counting variable for our while loop
        while (s.hasNext()) {                                           // While s.hasNext() we'll do something
            arr[i] = s.next();                                          // arr[i] will equal the next token in our scanner
            i++;                                                        // Then we increment i and keep going
        }

        for (String str : arr)                                          // Literally read as "for each String (referenced as str) in arr"
            System.out.println(str);                                    // Print out the value of str on a new line

        
        System.out.println("The first token in the file is " + arr[0]);    // We can print out the first value of the array this way
        
        // That seems like a lot just to load our file into an array right? Let's check out the easier way to do this with an array list
    }
}