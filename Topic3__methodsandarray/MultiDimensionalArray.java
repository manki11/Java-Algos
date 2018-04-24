package topic3_methodsandarray;

import java.util.Scanner;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int [][] arr = new int[5][];

		arr[0] = new int[10];
		arr[1] = new int[20];
		arr[2] = new int[30];



		int arr2[][] ={{1,2,3,5},
				      {1,3,4,5},
				      {1,2,3,4}};
	}
	
	
	public static int[][] userInput(){
		Scanner s = new Scanner(System.in);
		int noOfRows = s.nextInt();
		int noOfCol = s.nextInt();
		
		int arr[][] = new int[noOfRows][noOfCol];
		for(int i=0;i<noOfRows;i++){
			for(int j=0;j<noOfCol;j++){
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
		
	}
	
	public static void printArray(int[][] arr){
		for(int i=0;i<arr.length;i++){
			int rowLength = arr[i].length;
			for(int j=0;j<rowLength;j++){
				System.out.println(arr[i][j]);
			}
		}
	}
}
