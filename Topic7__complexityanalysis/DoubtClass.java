package topic7_complexityanalysis;

import topic6_recursion.assignment.AssignmentHelper;

public class DoubtClass {

	/**;
	 * Recursion assignment 
	 * Q: All possible codes from given String
	 * a-->1,  b-->2, c-->3
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
		if (lastTwoDigits >= 10 && lastTwoDigits <= 26) {
			smallOutput2 = getCode(input / 100);
		}

		String output[] = new String[smallOutput1.length + smallOutput2.length];
		int k = 0;
		for (String s : smallOutput1) {
			char lastDigitChar = AssignmentHelper.getChar(lastDigit); 
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

	public static char getCharCode(int x) {
		return (char) (96 + x);

	}

	/**
	 * String assignment ques
	 *  aaabbccds ===> a3b2c2ds.
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
	

	public static void main(String[] args) {
		// String[] result = getCode(1123);
		// for (String str : result) {
		// System.out.println(str);
		// }

		// Scanner s = new Scanner(System.in);
		// String str = s.nextLine();
		// String input[] = str.split(" ");
		// for(int i=0;i<input.length;i++){
		//
		// }

		String str1 = compress1("aaabbccd");
		System.out.println(str1);

	}

	/**
	 * 
	 * String assignment ques
	 * */
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

	
	
	public  void quickSort(int[] input, int beginIndex, int endIndex){
		if(beginIndex >= endIndex){
			return;
		}
		
		int pivotPos = partition(input, beginIndex,endIndex);
		quickSort(input, beginIndex, pivotPos-1);
		quickSort(input, pivotPos+1, endIndex);
		
	}
	
	
	
	public void quickSort1(int[] input, int beginIndex, int endIndex){
		if(beginIndex>=endIndex){
			return;
		}
		
		int pivotPosition = partition(input,beginIndex, endIndex);
		quickSort1(input,beginIndex, pivotPosition-1);
		quickSort1(input, pivotPosition+1, endIndex);
	}

	
	
	
	public static void partition2(int[] input, int beginIndex, int endIndex){
		int pivotElement = input[beginIndex];
		int pivotPosition= 0;
		for(int i=beginIndex;i<endIndex;i++){
			if(input[i]<pivotElement){
				pivotPosition++;
			}
		}
		
		input[beginIndex] = input[pivotPosition];
		input[pivotPosition] = pivotElement;
		int i = beginIndex;
		int j = endIndex;
		
		while(i<pivotPosition &&j>pivotPosition){
			if(input[i]<pivotElement){
				i++;
			}else if(input[j]>pivotElement){
				j--;
			}else{
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
		}
	}
	
	
	
	
	
	
	
	

		
		
		
		
		
		
		
		
		
		
		

	
	private  int partition(int[] input, int beginIndex, int endIndex) {
		int pivot = input[beginIndex];
		int pivotPos = beginIndex;
		for(int i = beginIndex; i <= endIndex; i++ ){
			if(input[i] < pivot){
				pivotPos++;
			}
		}
		
		input[beginIndex] = input[pivotPos];
		input[pivotPos] = pivot;
		int i = beginIndex;
		int j = endIndex;
		
		while(i < pivotPos && j > pivotPos){
			if(input[i] < pivot){
				i++;
			}
			else if(input[j] >= pivot){
				j--;
			}
			else{
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				i++;
				j--;
			}
		}
		
		return pivotPos;
	}


	
	public static String compress1(String input){
		
		String result = input.charAt(0)+"";
		int count = 1;
		for(int i=1;i<input.length();i++){
		
			
			if(input.charAt(i-1)==input.charAt(i)){
				count++;
			}else{
				if(count>1){
					result = result +count+input.charAt(i);
				}else{
					result = result +input.charAt(i);
				}
				count =1;
			}
			
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
