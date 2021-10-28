import java.util.*;

public class arrayTwo {
    public static void main(String[] args) {
        int[] intArr = new int[10];                              // intArr is of size 10, indexed from 0-9
        for (int i = 0; i < intArr.length; i++)                 // Loop thru our array and fill it with values
            intArr[i] = i;

        for (int i : intArr)                                    // For each int in intArr, print the int
            System.out.println(i);
    }
}