import java.util.*;

public class arrayThree {
    public static void main(String[] args) {
        int[][] twoDIntArr = {                      // Lets declare a new 2D int array and fill it with values. Remember 2d arrays are just an array of arrays
                                {0, 1, 2, 3, 4}, 
                                {5, 6, 7, 8, 9}
                            };
        for (int i = 0; i < twoDIntArr.length; i++)             // Now we'll loop thru and print all the values
        {
            for (int j = 0; j < twoDIntArr[i].length; j++)
                System.out.print(twoDIntArr[i][j] + " ");
            System.out.println();
        }

        for (int i = 0; i < twoDIntArr.length; i++)             // Looping again just to show indices for each value
        {
            for (int j = 0; j < twoDIntArr[i].length; j++)
                System.out.println("arr[" + i + "][" + j + "] = " + twoDIntArr[i][j]);
        }

    }
}
