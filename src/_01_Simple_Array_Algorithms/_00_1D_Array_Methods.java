package _01_Simple_Array_Algorithms;

import java.util.Random;

public class _00_1D_Array_Methods {
    //1. Complete the method so that it returns the sum of all
    //   of the integers in the array being passed in
	Random rand = new Random();
	static int valueA;
	static double valueB;
	
    public static double sumIntArray(int[] values) {
       for(int i = 0; i<values.length; i++) {
    	   valueA = values[i];
    	   valueB = valueB+valueA;
    	   
    	   
       }
        return valueB;
        
        
    }
    public static void main(String[] args) {
    	//Run HERE
    }

    //2. Complete the method so that it returns the average of all
    //   of the integers in the array being passed in
    public static double averageIntArray(int[] values) {
        for(int i = 0; i<values.length; i++) {
     	   valueA = values[i];
     	   valueB = valueB+valueA;
     	   
     	   
    }
        valueB = valueB/2;
        return valueB;
    }



    //3. Complete the method so that it returns true if the integer
    //   array contains the value specified by the second parameter.
    //   It should otherwise return false.
    public static boolean containsIntValue(int[] array, int value) {
    	for(int i =0; i<array.length; i++) {
    		if(array[i] ==  value) {
    			return true;
    		}
    	}
    	return false;

        
    }


    //4. Complete the method so that it returns the index of the,
    //   first instance that the specified value occurs in the array.
    //   If the array does not contain the specified value, it should return -1.
    public static int getIndex(int[] arr, int value) {
    	for(int i =0; i<arr.length; i++) {
    		if(arr[i] == value) {
    			return i;
    		}

    	}
        return -1;
    }
}
