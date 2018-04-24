package topic4_stringandmultidimension.assignment;

public class StringAssignment {

	/**
	 * Q: "aabccbaa" ===> "abcba" 
	 */
	public static String notContainConsecutiveDuplicate(String str) {
		if (str == null) {
			return null;// if string is null
		}
		if (str.length() == 0) {
			return ""; // if empty string
		}
		String resultString = "" + str.charAt(0);
		int i = 1;
		while (i < str.length()) {
			if (str.charAt(i - 1) != str.charAt(i)) {
				resultString = resultString + str.charAt(i);
			}
			i++;
		}
		return resultString;
	}

	/**
	 * Q: highest occurring character.
	 */
	public static char highestOccuringCharacter(String inputString) {
		int charArray[] = new int[256];
		for (int i = 0; i < inputString.length(); i++) {
			charArray[inputString.charAt(i)]++;

		}
		char maxOccuringChar = Character.MIN_VALUE;
		int maxNoOfOccuring = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] > maxNoOfOccuring) {
				maxNoOfOccuring++;
				maxOccuringChar = (char) i;
			}
		}

		return maxOccuringChar;
	}

	/**
	 * Q: Sort based on length. 
	 */
	public static String[] sortArrayOfString(String[] arrOfString) {
		for (int i = 0; i < arrOfString.length; i++) {
			for (int j = 0; j < arrOfString.length - i - 1; j++) {
				if (arrOfString[j].length() > arrOfString[j + 1].length()) {
					String temp = arrOfString[j];
					arrOfString[j] = arrOfString[j + 1];
					arrOfString[j + 1] = temp;
				}
			}
		}
		return arrOfString;
	}

	/**
	 * Q: "Welcome to Coding" ===> "emocleW ot gnidoC"
	 */
	public static String reverseEachWord(String input) {
		String output = "";
		int index = 0;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				index = i + 1;
				output += input.charAt(i);
			} else {
				output = output.substring(0, index) + input.charAt(i) + output.substring(index);
			}
		}
		return output;
	}

	/**
	 * Q: "Welcome to Coding" ===> "Coding to Welcome"
	 */
	public static String reverseWordWise(String input) {
		int end = input.length();
		int i = input.length() - 1;
		String output = "";
		while (i >= 0) {
			if (input.charAt(i) == ' ') {
				output = output + input.substring(i + 1, end) + " ";
				end = i;
			}
			i--;
		}
		output += input.substring(i + 1, end);
		return output;
	}

	/**
	 * Q: aaabbccds ===> a3b2c2ds.
	 */
	public static String compress(String inputString) {
		if (inputString == null) {
			return null;
		}
		if (inputString.length() == 0) {
			return "";
		}
		String output = inputString.charAt(0) + "";
		int count = 1;
		for (int i = 1; i < inputString.length(); i++) {
			if (inputString.charAt(i) == inputString.charAt(i - 1)) {
				count++;
				if (i == inputString.length() - 1) {
					output += count;
				}
			} else {
				if (count > 1) {
					output += count + "" + inputString.charAt(i);
				} else {
					output += inputString.charAt(i);
				}
				count = 1;
			}
		}
		return output;
	}

	/**
	 * Q: Largest SubString
	 */
	public static String findLargestUniqueSubstring(String str) {
		if (str.length() == 0) {
			return "";
		}

		int lastIndex[] = new int[256];
		for (int i = 0; i < lastIndex.length; i++) {
			lastIndex[i] = -1;
		}
		int currentSubstringStart = 0;
		int maxSubstringStart = 0;
		int maxSubstringEnd = 0;
		int maxSubstringLength = 1;

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (lastIndex[currentChar] >= currentSubstringStart) {
				if (i - currentSubstringStart > maxSubstringLength) {
					maxSubstringStart = currentSubstringStart;
					maxSubstringEnd = i - 1;
					maxSubstringLength = i - currentSubstringStart;
				}
				currentSubstringStart = lastIndex[currentChar] + 1;
			}
			lastIndex[currentChar] = i;
		}

		if (str.length() - currentSubstringStart > maxSubstringLength) {
			maxSubstringStart = currentSubstringStart;
			maxSubstringEnd = str.length() - 1;
			maxSubstringLength = str.length() - currentSubstringStart;
		}

		return str.substring(maxSubstringStart, maxSubstringEnd + 1);
	}

	/**
	 * Q: 2D multiplication
	 */
	public static int[][] multiDArrayMultiplication(int[][] firstarray, int[][] secondarray) {
		if (secondarray[0].length != firstarray.length) {
			System.out.println("Matrix cannot be multiplied");
		}
		int[][] result = new int[firstarray.length][secondarray[0].length];

		for (int i = 0; i < firstarray.length; i++) {
			for (int j = 0; j < secondarray[0].length; j++) {
				for (int k = 0; k < firstarray[0].length; k++) {
					result[i][j] += firstarray[i][k] * secondarray[k][j];
				}
			}
		}
		return result;
	}

	/**
	 * Q: Rotate a 2D matrix by 90
	 */
	public static void rotate2DArray(int[][] arr) {
		int[][] result = new int[arr[0].length][arr.length];
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col <= arr[0].length; col++) {
				result[col][row] = arr[row][col];
			}
		}

		for (int row = 0; row < arr.length; row++) {
			StringAssignmentHelper.reverse2DArray(result[row]);
		}

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col <= arr[0].length; col++) {
				System.out.print(result[col][row] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * Q: To lowercase
	 * */
	public static String toLowercase(String inputString) {
		String resultString = "";
		for (int i = 0; i < inputString.length(); i++) {
			char currentChar = inputString.charAt(i);
			if (currentChar >= 'A' && currentChar <= 'Z') {
				currentChar = Character.toLowerCase(currentChar);
			}
			resultString = resultString + currentChar;
		}
		return resultString;
	}

	/**
	 * Q: Pattern Search
	 */
	public static int brute(String text, String pattern) {
		int n = text.length(); // n is length of text.
		int m = pattern.length(); // m is length of pattern
		int j;
		for (int i = 0; i <= (n - m); i++) {
			j = 0;
			while ((j < m) && (text.charAt(i + j) == pattern.charAt(j))) {
				j++;
			}
			if (j == m)
				return i; // match at i
		}
		return -1; // no match
	}

	/**
	 * Q: Anagram
	 */
	public static boolean isAnagram(String input1, String input2) {
		if (input1.length() != input2.length()) {
			return false;
		}

		for (int i = 0; i < input1.length(); i++) {
			char currentCharacter = input1.charAt(i);
			int indexCurrentChar = input2.indexOf(currentCharacter);
			if (indexCurrentChar != -1) {
				input2 = input2.substring(0, indexCurrentChar)
						+ input2.substring(indexCurrentChar + 1, input2.length());
			} else {
				return false;
			}
		}

		if (input2.isEmpty()) {
			return true;
		}
		return false;
	}

	/**
	 * Q: Rotate String
	 */
	public static String rotateString(String inputString, int n) {
		if (inputString == null) {
			return null;
		}
		if (inputString.length() == 0) {
			return "";
		}
		String resultString = inputString.substring(0, inputString.length() - n);
		int i = 0;
		while (i < n) {
			resultString = inputString.charAt(inputString.length() - 1 - i) + resultString;
			i++;
		}

		return resultString;
	}

	public static void main(String[] args) {
		String x = findLargestUniqueSubstring("welcometocodinganinja");

		System.out.println(x);
	}
}
