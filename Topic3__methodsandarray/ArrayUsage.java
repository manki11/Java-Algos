package topic3_methodsandarray;

import java.util.Scanner;

public class ArrayUsage {

	protected static int[] getUserInputArray() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter size of Array");
		int size = s.nextInt();

		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter " + i + "th Value ");
			arr[i] = s.nextInt();
		}
		return arr;

	}

	
	public static void main(String[] args) {

		int arr[] = getUserInputArray();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		int sum= 0;
		for(int i =0;i<arr.length;i++){
			sum = sum+arr[i];
		}
		
		System.out.println(sum);

		/*
		 * int arr[] = new int[10];
		 * 
		 * 
		 * arr[0] =10; arr[1] = 20; arr[9] = 40; //arr[1] = 50;
		 * 
		 * //System.out.println(arr[0]); //System.out.println(arr[9]);
		 * 
		 * 
		 * for(int i = 0;i<arr.length;i++){ arr[i] = i; }
		 * 
		 * for(int i = 0;i<arr.length;i++){ System.out.println(arr[i]); }
		 */

	}
}
