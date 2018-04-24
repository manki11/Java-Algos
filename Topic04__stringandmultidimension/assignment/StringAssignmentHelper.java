package topic4_stringandmultidimension.assignment;

public class StringAssignmentHelper {
	public static void reverse2DArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while (end > start) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
