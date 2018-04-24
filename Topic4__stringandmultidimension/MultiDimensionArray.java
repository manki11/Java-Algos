package topic4_stringandmultidimension;

import java.util.Scanner;

public class MultiDimensionArray {

	public static void printArray(int[][] arr) {

		for (int row = 0; row < arr.length; row++) {
			int colLength = arr[row].length;
			for (int col = 0; col < colLength; col++) {
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}

	}

	public static int[][] userInputDifferentLengthArray() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of Rows");
		int noOfRows = s.nextInt();
		int[][] arr = new int[noOfRows][];

		for (int row = 0; row < arr.length; row++) {
			System.out.println("Enter no of cols in row " + row);
			int noOfCol = s.nextInt();
			arr[row] = new int[noOfCol];
			for (int col = 0; col < noOfCol; col++) {
				arr[row][col] = s.nextInt();
			}
		}

		return arr;
	}

	public static int[][] userInputArray() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter no of Rows");
		int noOfRows = s.nextInt();
		System.out.println("Enter no of cols");
		int noOfCols = s.nextInt();

		int arr[][] = new int[noOfRows][noOfCols];

		for (int row = 0; row < arr.length; row++) {
			int colLength = arr[0].length;
			for (int col = 0; col < colLength; col++) {
				arr[row][col] = s.nextInt();
			}
		}
		return arr;

	}

	public static void main(String[] args) {

		int[][] arr = userInputDifferentLengthArray();
		printArray(arr);

		int[][] arr2 = { { 1, 2, 3 }, { 2, 4, 5, 6 }, { 2 }, { 2, 3 } };

	}
}
