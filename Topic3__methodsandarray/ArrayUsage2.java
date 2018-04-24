package topic3_methodsandarray;

import java.util.Scanner;

public class ArrayUsage2 {
	public static int[] getUserInputArray() {
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
		reverseArray(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	
	
	private static void reverseArray(int[] arr2) {
		int start = 0;
		int end = arr2.length - 1;

		while (end > start) {

			int temp = arr2[start];
			arr2[start] = arr2[end];
			arr2[end] = temp;
			
			start++;
			end--;

		}
	}

}
