package topic6_recursion.assignment;

public class RecursionAssignment {
	/**
	 * Q: All indices of 7
	 */
	public static int[] indexesOfSeven(int[] arr, int index) {
		if (index == arr.length) {
			int[] result = new int[0];
			return result;
		}

		int[] smallResult = indexesOfSeven(arr, index + 1);

		if (arr[index] != 7) {
			return smallResult;
		} else {
			int result[] = new int[smallResult.length + 1];
			result[0] = index;
			for (int i = 0; i < smallResult.length; i++) {
				result[i + 1] = smallResult[i];
			}
			return result;
		}
	}

	/**
	 * Q: All subset of Array
	 */

	public static int[][] allSubSetOfArray(int[] input, int index) {
		if (index == input.length) {
			int result[][] = { {} };
			return result;
		}

		int[][] smallResult = allSubSetOfArray(input, index + 1);
		int[][] result = new int[smallResult.length * 2][];

		for (int i = 0; i < smallResult.length; i++) {
			int length = smallResult[i].length;
			result[i] = new int[length];
			for (int j = 0; j < length; j++) {
				result[i][j] = smallResult[i][j];
			}
		}
		for (int i = 0; i < smallResult.length; i++) {
			int length = smallResult[i].length;
			result[i + smallResult.length] = new int[length + 1];
			result[i + smallResult.length][0] = input[index];
			for (int j = 0; j < length; j++) {
				result[i + smallResult.length][j + 1] = smallResult[i][j];
			}
		}
		return result;
	}

	/**
	 * Q: Keypad
	 * */
	public static String[] keyPad(int number) {
		if (number == 0) {
			String[] result = { "" };
			return result;
		}

		String[] smallresult = keyPad(number / 10);
		String keys = AssignmentHelper.getKeysName(number % 10);
		String[] result = new String[smallresult.length * keys.length()];

		int k = 0;
		for (int i = 0; i < smallresult.length; i++) {
			for (int j = 0; j < keys.length(); j++) {
				result[k++] = smallresult[i] + keys.charAt(j);
			}
		}

		return result;

	}

	/**
	 * Q: SubSequence of String
	 * */
	public static String[] subSequence(String input) {
		if (input.length() == 0) {
			String[] output = {""};
			return output;
		}

		String[] smallresult = subSequence(input.substring(1));
		String[] result = new String[(smallresult.length) * 2];

		for (int i = 0; i < smallresult.length; i++) {
			result[i] = smallresult[i];
		}
		for (int i = 0; i < smallresult.length; i++) {
			result[i + smallresult.length] = input.charAt(0) + smallresult[i];
		}

		return result;

	}

	/**
	 * Q: SubSequence print
	 * */
	public static void subSequencePrint(String input, String resultSoFar) {
		if (input.length() == 0) {
			System.out.println(resultSoFar);
			return;
		}

		subSequencePrint(input.substring(1), resultSoFar + input.charAt(0));
		subSequencePrint(input.substring(1), resultSoFar);
	}

	/**
	 * Q:permutation of String
	 * 
	 * */
	public static void permutation(String input, String resultSoFar) {
		if (input.length() == 0) {
			System.out.println(resultSoFar);
			return;
		}

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			String newResultSoFar = resultSoFar + ch;
			String newInput = input.substring(0, i) + input.substring(i + 1);
			permutation(newInput, newResultSoFar);
		}
	}



	/**
	 * Q: String was generated using some rules
	 */
	public static boolean checkStringWithAandB(String input) {
		if (input == null) {
			return true;
		}
		if (input.charAt(0) == 'a') {
			if (input.length() == 1) {
				return true;
			} else if (input.charAt(1) == 'a') {
				return checkStringWithAandB(input.substring(1));
			} else if (input.charAt(1) == 'b') {
				return checkStringWithAandB(input.substring(1));
			} else {
				return false;
			}
		} else if (input.charAt(0) == 'b') {
			if (input.charAt(1) == 'b' && input.length() > 2 && input.charAt(2) == 'a') {
				return checkStringWithAandB(input.substring(2));
			} else if (input.charAt(1) == 'b' && input.length() == 2) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * Q: child staircase with n steps
	 */
	public static int findWays(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		if (n == 3) {
			return 4;
		}

		return findWays(n - 1) + findWays(n - 2) + findWays(n - 3);
	}

	/**
	 * Q: String to int
	 * */
	public static int convertStringToInt(String input) {
		if (input.length() == 0) {
			return 0;
		}
		if (input.length() == 1) {
			return Integer.parseInt(input);
		}
		int smallAns = convertStringToInt(input.substring(0, input.length() - 1));
		int finalAns = smallAns * 10 + Integer.parseInt(input.charAt(input.length() - 1) + "");
		return finalAns;

	}

	/**
	 * Q: is Palindrome
	 * */
	public static boolean isPalindrom(String input) {
		if (input.length() == 1 || input.length() == 0) {
			return true;
		}
		if (input.charAt(0) != input.charAt(input.length() - 1)) {
			return false;
		}
		return isPalindrom(input.substring(1, input.length() - 1));
	}

	/**
	 * Q: String Manipulator
	 * */
	public static String stringManipulator(String str) {
		if (str.length() == 1) {
			return str;
		}
		if (str.charAt(0) == str.charAt(1)) {
			String smallResult = stringManipulator(str.substring(1));
			return str.charAt(0) + "*" + smallResult;
		} else {
			String smallResult = stringManipulator(str.substring(1));
			return str.charAt(0) + smallResult;
		}
	}

	/**
	 * Q: All possible codes from given String
	 * */

	public static String[] getCode(int input) {
		if (input == 0) {
			String[] output = { "" };
			return output;
		}

		int lastDigit = input % 10;
		String[] smallOutput1 = getCode(input / 10);
		String[] smallOutput2 = new String[0]; // String[] smallOutput2 = null
												// this will give
												// nullPointerException
		int lastTwoDigits = input % 100;
		if (lastTwoDigits > 10 && lastTwoDigits <= 26) {
			smallOutput2 = getCode(input / 100);
		}

		String output[] = new String[smallOutput1.length + smallOutput2.length];
		int k = 0;
		for (String s : smallOutput1) {
			char lastDigitChar = AssignmentHelper.getChar(lastDigit); // (char)('a'-1+lastDigit)
			output[k] = s + lastDigitChar;
			k++;
		}

		for (String s : smallOutput2) {
			char lastTwoDigitChar = AssignmentHelper.getChar(lastTwoDigits);
			output[k] = s + lastTwoDigitChar;
			k++;
		}
		return output;

	}

	/**
	 * Q: Subset sum k
	 * */
	public static int[][] subsetsSumKHelper(int[] input, int beginIndex, int k) {
		if (beginIndex == input.length) {
			if (k == 0) {
				return new int[1][0];
			} else {
				return new int[0][0];
			}
		}

		int[][] smallOutput1 = subsetsSumKHelper(input, beginIndex + 1, k);
		int[][] smallOutput2 = subsetsSumKHelper(input, beginIndex + 1, k - input[beginIndex]);
		int[][] output = new int[smallOutput1.length + smallOutput2.length][];
		int index = 0;
		for (int i = 0; i < smallOutput1.length; i++) {
			output[index++] = smallOutput1[i];
		}

		for (int i = 0; i < smallOutput2.length; i++) {
			output[index] = new int[smallOutput2[i].length + 1];
			output[index][0] = input[beginIndex];
			for (int j = 0; j < smallOutput2[i].length; j++) {
				output[index][j + 1] = smallOutput2[i][j];
			}
			index++;
		}
		return output;
	}

	public static int[][] subsetsSumK(int input[], int k) {
		return subsetsSumKHelper(input, 0, k);
	}

	public static void main(String[] args) {
		// int[] arr = { 2, 7, 8, 3, 1, 7, 7, 7, 4 };
		// int[] result = indexesOfSeven(arr, 0);
		// for (int value : result) {
		// System.out.println(value);
		// }

		// String[] result = keyPad(23);
		// for (String str : result) {
		// System.out.println(str);
		// }
		// int arr []= {2,3,4};
		//
		//
		// int result1[][]=allSubSetOfArray(arr, 0);
		//
		// for(int i = 0;i<result1.length;i++){
		// int length = result1[i].length;
		// for(int j = 0;j<length;j++){
		// System.out.print(result1[i][j]+" ");
		// }
		// System.out.println();
		// }

		// subSequencePrint("abc","");
		// permutation("abc", "");

		// boolean result = checkStringWithAandB("aaabbaaaaaabbaaaaaaaaabb");
		// int ans = convertStringToInt("1234");
		// System.out.println(ans);
		boolean x = isPalindrom("abca");
		System.out.println(x);
	}
}
