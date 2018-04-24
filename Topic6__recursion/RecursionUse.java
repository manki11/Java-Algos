package topic6_recursion;

public class RecursionUse {

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}

		int fact_n_1 = fact(n - 1);
		return n * fact_n_1;
	}

	public static int fibo(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		return fibo(n - 1) + fibo(n - 2);

	}

	public static boolean check7(int[] arr) {
		if (arr.length == 0) {
			return false;
		}
		if (arr[0] == 7) {
			return true;
		}

		int smallArray[] = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			smallArray[i - 1] = arr[i];
		}

		return check7(smallArray);
	}

	public static int firstIndexOf_7(int[] arr) {
		if (arr.length == 0) {
			return -1;
		}
		if (arr[0] == 7) {
			return 0;
		}
		int smallArray[] = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			smallArray[i - 1] = arr[i];
		}
		int result = firstIndexOf_7(smallArray);
		if (result == -1) {
			return -1;
		} else {
			return result + 1;
		}

	}

	public static int firstIndexOf7(int[] arr, int index) {
		if (arr.length == index) {
			return -1;
		}
		if (arr[index] == 7) {
			return index;
		}
		return firstIndexOf7(arr, index + 1);
	}

	public static int lastIndexOf7(int[] arr, int index) {
		if (arr.length == index) {
			return -1;
		}

		int result = lastIndexOf7(arr, index + 1);
		if (result == -1) {
			if (arr[index] == 7) {
				return index;
			} else {
				return -1;
			}
		} else {
			return result;
		}
	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static boolean check7withoutCopying(int[] arr, int index) {
		if (arr.length == index) {
			return false;
		}
		if (arr[index] == 7) {
			return true;
		}

		return check7withoutCopying(arr, index + 1);
	}

	public static boolean isArraySorted(int[] arr) {
		if (arr.length == 0 || arr.length == 1) {
			return true;
		}

		if (arr[0] > arr[1]) {
			return false;
		}

		int smallArray[] = new int[arr.length - 1];
		for (int i = 1; i < arr.length; i++) {
			smallArray[i - 1] = arr[i];
		}
		return isArraySorted(smallArray);
	}

	public static void main(String[] args) {
		// int[] arr = { 3, 5, 2, 8, 7, 0 };
		// selectionSort(arr);
		// for (int i : arr) {
		// System.out.println(i);
		// }
		System.out.println(fibo(50));
	}
}
