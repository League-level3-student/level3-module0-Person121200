package _03_Intro_to_2D_Arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

/*
 *  A 2D array is comparable to a matrix/grid ordered by rows and columns.
 *  A 2D array that holds 3, 1D arrays with each 1D array having 3 elements
 *  can be thought of a 3x3 matrix/grid:
 *                 col0 col1 col2
 *                  \/   \/   \/
 *          row 0  { 1,  2,  3 }
 *          row 1  { 4,  5,  6 }
 *          row 2  { 7,  8,  9 }
 * 
 *  Where row 0 contains the numbers 1, 2, 3.
 *  and column 0 contains the numbers 1, 4, 7.
 * 
 *  Java stores a 2D array in 'row-major order', meaning the row number is
 *  the first number in the square brackets. The row 0 elements are:
 * 
 *  Row 0 = matrix[0][0], matrix[0][1], matrix[0][2]    // 1, 2, 3
 * 
 *  The second number in the square brackets is the column number.
 *  The column 0 elements are:
 * 
 *  Column 0 = matrix[0][0], matrix[1][0], matrix[2][0] // 1, 4, 7
 */
public class _02_2DArrayPractice {

	static Random rand = new Random();

	public static void main(String[] args) {

	}

	/*
	 * Return a 2D array that can accommodate the grid of values below: 0, 1, 2 3,
	 * 4, 5 6, 7, 8
	 */
	public Integer[][] test1() {
		Integer[][] hi = new Integer[3][3];

		return hi;
	}

	/*
	 * Return a 2D array that can accommodate the grid of values below: "a", "b",
	 * "c", "d", "e", "f", "g", "e"
	 */
	public String[][] test2() {
		String[][] hi = new String[2][4];

		return hi;
	}

	/*
	 * Return a 2D array that can accommodate the grid of values below: true, false,
	 * false, false, false, true, true, true, true, false
	 */
	public Boolean[][] test3() {
		Boolean[][] hi = new Boolean[5][2];
		return hi;
	}

	/*
	 * Draw the grid of values for the following 2D array of ints: Assume all the
	 * elements in the 2D array are initialized to random ints
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Show your teacher the grid you created
	 */
	public static int[][] Randomgrid() {
		int[][] grid = new int[2][3];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = rand.nextInt(100);
				System.out.println(grid[i]);

			}

		}

		return null;

	}

	/*
	 * Draw the grid of values for the following 2D array of Robots Assume all the
	 * elements in the 2D array are initialized.
	 * 
	 *
	 * 
	 * 
	 *
	 * Show your teacher the grid you created
	 */
	public Robot[][] robot() {
		Robot[][] robots = new Robot[4][2];
		return robots;

	}

	/*
	 * Given the array of Objects below, return the element that is not null null,
	 * null, null, null null, null, null, Object
	 */
	public Object test4() {
		Object[][] objects = { { null, null, null, null }, { null, null, null, new Object() } };

		return objects[1][3];
	}

	/*
	 * Given the array of Objects below, return the element that is not null null,
	 * null, Object, null null, null, null, null
	 */
	public Object test5() {
		Object[][] objects = { { null, null, new Object(), null }, { null, null, null, null } };

		return objects[0][2];
	}

	/*
	 * Write an algorithm to return the sum of all the numbers in the first row (row
	 * 0)
	 */
	public Integer test6() {
		int sum2 = 0;

		Integer[][] nums = { { 8, 7, 6, 5 }, { 4, 3 }, { 2, 1, 0 } };
		for (int i = 0; i < nums[0].length; i++) {
			sum2 = sum2 + nums[0][i];

		}
		System.out.println(sum2);
		return sum2;
	}

	/*
	 * Write an algorithm to return the sum of all the numbers in the first column
	 * (column 0)
	 */
	public Integer test7() {
		int sum2 = 0;

		int[][] nums = { { 8, 7, 6, 5 }, { 4, 3 }, { 2, 1, 0 } };
		for (int i = 0; i < nums.length; i++) {
			sum2 = sum2 + nums[i][0];
		}
		return sum2;

	}

	/*
	 * Write an algorithm to return the sum of all the numbers in the specified row
	 */
	public Integer getSumByRow(int[][] matrix, int row) {
		int value=0;
		Integer sum = 0;
		for(int i =0; i<matrix[row].length;i++) {
			 sum = value+matrix[row][i];
		}
		return sum;
	}
//	    ( 
//	  ( o o )
//	(  -----  )
// (  	      )
//  ----------
          
	/*
	 * Write an algorithm to return the sum of all the numbers in the specified
	 * column
	 */
	public Integer getSumByColumn(int[][] matrix, int col) {
		int value=0;
		Integer sum = 0;
		for(int i =0; i<matrix[col].length;i++) {
			 sum = value+matrix[col][i];
	}
		return sum;
	}

	/*
	 * Return the value of the element adjacent to the specified row and column The
	 * directions East, West, North, South are relative to the 2D array matrix/grid.
	 * For example in this 3x3 2D array:
	 * 
	 * [1][2][3] [4][5][6] [7][8][9]
	 * 
	 * for the 5 in the middle (row = 1, column = 1), then East neighbor = 6 West
	 * neighbor = 4 North neighbor = 2 South neighbor = 8
	 * 
	 * 1. Assume input row and column values are valid indexes in the matrix. 2. If
	 * the neighbor does not exist, i.e. it's outside the grid boundaries, return
	 * null.
	 */
	public Integer getEastNeighbor(int[][] matrix, int row, int col) {
		if(col+1 >= matrix[row].length) {
			return null;
		}
		return matrix[row][col+1];
	}

	public Integer getWestNeighbor(int[][] matrix, int row, int col) {
		if(col-1 < 0) {
			return null;
		}
		return matrix[row][col-1];
	}

	public Integer getNorthNeighbor(int[][] matrix, int row, int col) {
		if(row-1 < 0) {
			return null;
		}
		return matrix[row-1][col];
	}

	public Integer getSouthNeighbor(int[][] matrix, int row, int col) {
		if(row+1 >= matrix[row].length) {
			return null;
		}
		return matrix[row+1][col];
	}
}
