package topic4_stringandmultidimension;

import java.util.Scanner;

public class StringUse {

	public static void printSubString(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}

	}

	public static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}
		for (int i = 0; i < str1.length(); i++) {
			char currentCharacter = str1.charAt(i);

			int index = str2.indexOf(currentCharacter);
			if (index != -1) {
				str2 = str2.substring(0, index) + str2.substring(index + 1);
			} else {
				return false;
			}
		}

		if (str2.isEmpty()) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		String str = "abc";

		// boolean result = isAnagram("abcd", "cdba");
		// System.out.println("Is Anagram: " + result);

		printSubString("abcd");
		// System.out.println(str.length());
		//
		// System.out.println(str.toUpperCase());
		// System.out.println(str.charAt(2));
		//
		//// System.out.println(str.contains("s"));
		// System.out.println(str.concat("ABC"));
		// System.out.println(str+"DEF");
		//
		// String s1 = "DEF";
		// String s2 = "DEF";
		// if(s1==s2){
		// System.out.println("Compares address");
		// }
		// if(s1.equals(s2)){
		// System.out.println("Compares content of String");
		// }if(s1.equalsIgnoreCase("def")){
		//
		// }

		String str1 = "CodingNinja";
		// System.out.println(str1.substring(3, 6));
		//
		// String str2 = "abc";
		//
		// for(int i=0;i< 10;i++){
		// str2 = str2+i;
		// System.out.println(str2);
		// }

		// String result = reverseString(str1);
		// System.out.println(result);

		Scanner s = new Scanner(System.in);
		String str3 = s.nextLine();
		System.out.println(str3);

		String str4 = "hello";

		for (int i = 0; i < str4.length(); i++) {
			if (str4.contains(str4.charAt(i) + "")) {

			}

			char ch = str.charAt(1);
		}

	}

	public static String reverseString(String str) {
		String resultString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			resultString = resultString + str.charAt(i);
		}
		return resultString;

	}

}
