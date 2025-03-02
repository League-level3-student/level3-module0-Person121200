package _03_Intro_to_2D_Arrays;

import java.util.Random;

public class _01_IntroTo2DArrays {

    public static void main(String[] args) {
        // 1. declare a 2D array of integers with 3, 1D arrays that each hold
        //    3 integers
    	int [][] array2d = new int [3][3];
        // 2. use two for loops to set all the elements in the 2D array to
        //    a different integer
    	Random rand = new Random();
    	for(int i = 0; i<array2d.length; i++) {
    		for(int j = 0; j<array2d[i].length; j++) {
    			array2d[i][j] = rand.nextInt(100);
    			
    		}
    		
    	}
    	System.out.println(array2d[1][2]);
    	array2d[1][2] = 3;
    	System.out.println(array2d[1][2]);
    		
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
        
        // 3. print the third element from the second 1D array (2DArray[1][2])

        // 4. set the third element from the second 1D array to a different
        //    value

        // 5. print the element again and verify the value has changed

    }
}
