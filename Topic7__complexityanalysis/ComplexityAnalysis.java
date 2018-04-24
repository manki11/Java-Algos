package topic7_complexityanalysis;

public class ComplexityAnalysis {

	/**
	 * Q: highest occurring character.
	 */
	public static char highestOccuringCharacter(String inputString) {
		int charArray[] = new int[256];
		for (int i = 0; i < inputString.length(); i++) {
			charArray[inputString.charAt(i)]++;

		}
		char maxOccuringChar = Character.MIN_VALUE;
		int maxNoOfOccuring = Integer.MIN_VALUE;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] > maxNoOfOccuring) {
				maxNoOfOccuring++;
				maxOccuringChar = (char) i;
			}
		}

		return maxOccuringChar;
	}

	/*
	 * Time complexity log n
	 * */
	public static int powerOfX(int x, int n) {
		if (n == 1) {
			return x;
		}
		int temp = powerOfX(x, n / 2);
		if (n % 2 == 0) {
			return temp * temp;
		} else {
			return x * temp * temp;
		}

	}

	public static int longestUniqueSubString(String input) {
		int lastIndex[] = new int[256];

		for (int i = 0; i < lastIndex.length; i++) {
			lastIndex[i] = -1;
		}

		int currentSubString = 1;
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			int previousIndex = lastIndex[currentChar];

			if (previousIndex >= currentSubString) {
				currentSubString = previousIndex + 1;
			}

			lastIndex[currentChar] = i;
		}

	}

	public static void quickSort(int[] input, int beginIndex, int endIndex) {
		if (beginIndex >= endIndex) {
			return;
		}

		int pivotPosition = getPivotPosition(input, beginIndex, endIndex);
		quickSort(input, beginIndex, pivotPosition - 1);
		quickSort(input, pivotPosition + 1, endIndex);
	}

	private static int getPivotPosition(int[] input, int beginIndex, int endIndex) {

		return 0;
	}

	// fun(int n){
	//
	// //String str = "";
	// StringBuilder str = new StringBuilder("");
	//
	// for(int i =0;i<100;i++){
	// str =str.append(i);
	// }
	//
	// }
	public static void main(String[] args) {
		// highestOccuringChar("abcd");
		System.out.println(powerOfX(2, 3));

	}
}
