import java.util.*;
public class arrayFour {
    public static void main(String[] args) {
        double[][] doubleArr = new double[5][5];        // Lets declare a new double 2D array that hasn't been filled with values yet but has sizes set
        Random rd = new Random();                       // New Random obj to use for below
        for (int i = 0; i < doubleArr.length; i++)      // We'll loop thru and fill values
        {
            for (int j = 0; j < doubleArr[i].length; j++)
                doubleArr[i][j] = rd.nextDouble();
        }

        for (int i = 0; i < doubleArr.length; i++)      // We'll loop thru and print values formatted
        {
            for (int j = 0; j < doubleArr[i].length; j++)
                System.out.printf("doubleArr[" + i + "][" + j + "] (formatted to 3 decimal places) = %.3f\n", doubleArr[i][j]);
        }
    }
}
