package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
	
    //1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] array = {"hi", "hi", "hi", "GONE", "skibidi", "ohio", "aw hell nah", "omg", "hi"};
		Random(array);
	}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static String Strings(String[] array) {
		for(int i = 0; i< array.length; i++) {
			System.out.println(array[i]);
		}
		return "";
		
	}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
	public static String Reverse(String[] array) {
		for(int i = array.length-1; i>=0; i--) {
			System.out.println(array[i]);
		}
		return "";
		
	}

    //4. Write a method that takes an array of Strings and prints every other String in the array.
	public static String EveryOtherString(String[] array) {
		for(int i = 0; i< array.length; i++) {
			if(i %2==1) {
				System.out.println(array[i]);
			}
		}
		return "";
		
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	public static void Random(String[] array) {
		Random rand = new Random();
		 for (int i = array.length - 1; i > 0; i--) {
	            int randomIndex = rand.nextInt(i + 1);
	            String temp = array[i];
	            array[i] = array[randomIndex];
	            array[randomIndex] = temp;
	        }
		 for (String str : array) {
	            System.out.println(str);

		
		
		
	}
	}
}


