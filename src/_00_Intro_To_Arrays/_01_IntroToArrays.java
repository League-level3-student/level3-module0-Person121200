package _00_Intro_To_Arrays;

import java.lang.reflect.Array;
import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
    	Random rand = new Random();

        // 1. declare and Initialize an array 5 Strings
    	String[] items=new String[5];
    	items[0] = "a";
    	items[1] = "b";
    	items[2] = "c";
    	items[3] = "d";
    	items[4] = "e";
        // 2. print the third element in the array
    	System.out.println(items[2]);
        // 3. set the third element to a different value
    	items[2] = "different item";
        // 4. print the third element again
    	System.out.println(items[2]);
        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
    	for(int i = 0; i<items.length; i++) {
    		items[i]= "a";
    	}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
    	for(int i = 0; i<items.length; i++) {
    		System.out.println(items[i]);
    	}
        // 7. make an array of 50 integers
    	
        	int[] integers = new int[50];
    	
        // 8. use a for loop to make every value of the integer array a random
        //    number
    	for(int i =0; i<integers.length; i++) {
    		integers[i] = rand.nextInt(50);
    	}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
    	for(int i = 0; i>integers[i]; i++) {
    		
    	}
        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.

        // 12. print only the last element in the array

    }
}
