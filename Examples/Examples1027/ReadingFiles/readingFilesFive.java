package ReadingFiles;
import java.io.*;           // We need the methods in these Java libraries to be able to do what we want to do.
import java.util.*;

/**
 * readingFilesOne
 */
public class readingFilesFive {

    public static void main(String[] args) throws IOException {         // Need to tell java that you're okay if main throws an IOException. Will happen when the selected file cannot be read.
        File f = new File("readingFiles.txt");                          // First, let's create a reference to our file
        Scanner s = new Scanner(f);                                     // Then we'll setup a new scanner, simply called "s" so that we're ready to read our text file
        ArrayList<String> listOfTokens = new ArrayList<String>();       // We initialze a new array list to hold our values
        while (s.hasNext()) {                                           // In this first while loop we're looping through every "token" of the file and counting how many we have, then we can initialize an array to be of proper size.
            listOfTokens.add(s.next());
        }
        
        for (String str : listOfTokens)
            System.out.println(str);
        // Much better :)

        /* 
            An array list "under the hood" is just an array. But it adds special methods for us users to use that way we don't have to worry about things like having a fixed size.
            So when we say list.add(value) the array list looks to the end of the list that it's keeping track of and adds our value there.
            We can still add certain values at indices too using .set() to replace what's at the index and using list.add(value, index)
            When using .add and passing an index it will then push everything at the index down a place to make room for the value being passed in.
            We can't do this in array without upsizing it first since arrays are of fixed size.
            That means we have to copy the current array to a new array and move all the values down an index using a loop
            But array lists do this for us! Much easier, a little slower since they constantly grow but we don't have to worry about all those operations.
        */
    }
}