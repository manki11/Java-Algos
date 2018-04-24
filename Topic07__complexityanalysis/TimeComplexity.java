package topic7_complexityanalysis;

import java.util.Scanner;

public class TimeComplexity {

	public static void mergeSort(int[] arr) {
		if (arr.length <= 1) {
			return;
		}

		int mid = arr.length / 2;
		int[] leftArr = new int[mid];
		int[] rightArr = new int[arr.length - mid];

		for (int i = 0; i < mid; i++) {
			leftArr[i] = arr[i];
		}
		int k = 0;
		for (int j = mid; j < arr.length; j++) {
			rightArr[k] = arr[j];
			k++;
		}

		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(leftArr, rightArr, arr);
	}

	public static void merge(int[] leftArr, int[] rightArr, int[] arr) {
		int i = 0, j = 0, k = 0;

		while (i < leftArr.length && j < rightArr.length) {
			if (leftArr[i] < rightArr[j]) {
				arr[k] = leftArr[i];
				k++;
				i++;
			} else {
				arr[k] = rightArr[j];
				k++;
				j++;
			}
		}

		while (i < leftArr.length) {
			arr[k] = leftArr[i];
			k++;
			i++;
		}

		while (j < rightArr.length) {
			arr[k] = rightArr[j];
			k++;
			j++;
		}
	}

	public static int binarysearch(int[] arr, int start, int end, int element) {
		if (end < start) {
			return -1;
		}

		int mid = (start + end) / 2;
		if (arr[mid] > element) {
			return binarysearch(arr, start, mid - 1, element);
		} else if (arr[mid] < element) {
			return binarysearch(arr, mid + 1, end, element);
		} else {
			return mid;
		}
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void betterBubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}

			if (!flag) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
		int[] input = new int[n];
		for (int i = 0; i < n; i++) {
			input[i] = n - i;
		}

		long startTime = System.currentTimeMillis();
		mergeSort(input);
		long endTime = System.currentTimeMillis();
		System.out.println("Merge Sort: " + n + " time: " + (endTime - startTime));

		for (int i = 0; i < n; i++) {
			input[i] = n - i;
		}

		startTime = System.currentTimeMillis();
		bubbleSort(input);
		endTime = System.currentTimeMillis();
		System.out.println("Bubble Sort: " + n + " time: " + (endTime - startTime));

	}

}
