package topic14_textprocessing;

import java.util.HashMap;

public class PatternSearch {

	public static int bruteForce(String source, String text) {
		for (int i = 0; i < source.length() - text.length(); i++) {
			int j;
			for (j = 0; j < text.length(); j++) {
				if (source.charAt(i + j) != text.charAt(j)) {
					break;
				}
			}

			if (j == text.length()) {
				return i;
			}
		}
		return -1;
	}

	private static HashMap<Character, Integer> getLastIndices(String t) {
		HashMap<Character, Integer> lastIndices = new HashMap<>();
		for (int i = 0; i < t.length(); i++) {
			lastIndices.put(t.charAt(i), i);
		}
		return lastIndices;
	}

	public static int BoyerMoore1(String s, String t) {
		HashMap<Character, Integer> lastIndices = getLastIndices(t);
		int i = 0;
		while (i <= s.length() - t.length()) {
			int j;
			for (j = t.length() - 1; j >= 0; j--) {
				if (s.charAt(i + j) != t.charAt(j)) {
					char missedChar = s.charAt(i + j);
					if (!lastIndices.containsKey(missedChar)) {
						i = i + j + 1;
					} else {
						int lastIndex = lastIndices.get(missedChar);
						if (lastIndex < j) {
							i = i + j - lastIndex;
						} else {
							i++;
						}
					}
					break;
				}
			}
			if (j == -1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(BoyerMoore1("abcdedfgdgsgvsggsa", "gvs"));

	}
}