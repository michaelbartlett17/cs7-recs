import java.util.*;

public class arrayEx1 {
    public static void main(String[] args) {
        String[] cars = new String[] {"Volvo", "BMW", "Ford", "Mazda"}; // Make a new array with its values right away
        
        for (int i = 0; i < cars.length; i++) // Loop through the array and print every element
            System.out.println(cars[i]);

        int[] nums = new int [10]; // Allocate room for 10 elements of an array in memory
        
        for (int i = 0; i < nums.length; i++) // Fill the array with the number that their space in the array represents
            nums[i] = i; 

        for (int i : nums) // "For each (int) i in nums print i"
            System.out.println(i);
    }
}
