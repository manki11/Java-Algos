package topic7_complexityanalysis.assignment;

import topic6_recursion.assignment.AssignmentHelper;

public class Ques {

	public static void main(String[] args) {
		String length = LongestSubString("abaccdacb");

		System.out.println(length);
	}

	
	
	
	
	
	
	/**
	 * Q: Subset sum k
	 */
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

	public static int findLargestUniqueSubstring444(String str) {
		if (str.length() == 0) {
			return 0;
		}

		int lastIndex[] = new int[256];
		for (int i = 0; i < lastIndex.length; i++) {
			lastIndex[i] = -1;
		}
		int currentLength = 0;

		int maxLength = 1;

		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (lastIndex[currentChar] >= currentLength) {
				if (i - currentLength > maxLength) {

					maxLength = i - currentLength;
				}
				currentLength = lastIndex[currentChar] + 1;
			}
			lastIndex[currentChar] = i;
		}

		if (str.length() - currentLength > maxLength) {

			maxLength = str.length() - currentLength;
		}

		return maxLength;
	}

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
		if (lastTwoDigits >= 10 && lastTwoDigits <= 26) {
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
	 * Q: String was generated using some rules b. 
	 * the string begins with an 'a'
	 * each 'a' is followed by nothing or an 'a' or "bb" 
	 * each "bb" is
	 * followed by nothing or an 'a'
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
			if (input.charAt(1) == 'b' && input.length() == 2) {
				return true;
			} else if (input.charAt(1) == 'b' && input.length() > 2 && input.charAt(2) == 'a') {
				return checkStringWithAandB(input.substring(2));
			} else {
				return false;
			}
		} else {
			return false;
		}
	}


	
	
	
	
	public static String LongestSubString(String input){
		int lastIndexArray[] = new int[256];
		for(int i =0;i<lastIndexArray.length;i++){
			lastIndexArray[i] = -1;
		}
		int currentSubStringStart= 0;
		int maxSubStringStart = 0;
		int maxSubStringEnd = 0;
		int maxSubStringLength = 0;
		int i ;
		for( i =0;i<input.length();i++){
			char currentChar = input.charAt(i);
			int previousIndex = lastIndexArray[currentChar];
			
			
			if(previousIndex>=currentSubStringStart){
				if(maxSubStringLength < i-currentSubStringStart){
					maxSubStringStart = currentSubStringStart;
					maxSubStringEnd = i-1;
					maxSubStringLength = i-currentSubStringStart;
				}
				currentSubStringStart = previousIndex+1;
			}
			lastIndexArray[currentChar] = i;
		}
		if(maxSubStringLength < i-currentSubStringStart){
			maxSubStringStart = currentSubStringStart;
			maxSubStringEnd = i-1;
			maxSubStringLength = i-currentSubStringStart;
		}
		return input.substring(maxSubStringStart, maxSubStringEnd+1);
	}

}
