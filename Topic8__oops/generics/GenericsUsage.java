package topic8_oops.generics;

public class GenericsUsage {

	public static <T> void printArray(T arr[]) {
		for (T i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer arr[] = { 2, 3, 4, 5, 6 };
		printArray(arr);

		Character arr2[] = { 'A', 'B', 'c', 'd' };
		printArray(arr2);

		Double arr3[] = { 2.6, 3.4, 4.3, 5.0 };
		printArray(arr3);

	}
}
