package topic18_dp;

public class LCS {

	public static int lcs(String s, String t) {
		if (s.length() == 0 || t.length() == 0) {
			return 0;
		}
		if (s.charAt(0) == t.charAt(0)) {
			return 1 + lcs(s.substring(1), t.substring(1));
		} else {
			int ans1 = lcs(s.substring(1), t);
			
			int ans2 = lcs(s, t.substring(1));
			return ans1 > ans2 ? ans1 : ans2;
		}
	}

	public static String lcsDP(String s, String t) {
		int m = s.length();
		int n = t.length();
		String storage[][] = new String[s.length() + 1][t.length() + 1];
		for (int i = 0; i <= m; i++) {
			storage[0][i] = "";
		}

		for (int j = 0; j <= n; j++) {
			storage[j][0] = "";
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s.charAt(m - i) == t.charAt(n - j)) {
					storage[i][j] = s.charAt(m - i) + storage[i - 1][j - 1];
				} else {
					String ans1 = storage[i - 1][j];
					String ans2 = storage[i][j - 1];
					storage[i][j] = ans1.length() > ans2.length() ? ans1 : ans2;
				}
			}
		}
		return storage[m][n];
	}

	public static String lcsString(String s, String t) {
		if (s.length() == 0 || t.length() == 0) {
			return "";
		}
		if (s.charAt(0) == t.charAt(0)) {
			return s.charAt(0) + lcsString(s.substring(1), t.substring(1));
		} else {
			String ans1 = lcsString(s.substring(1), t);
			String ans2 = lcsString(s, t.substring(1));
			return ans1.length() > ans2.length() ? ans1 : ans2;
		}
	}

	public static String lcsR(String s, String t) {
		String storage[][] = new String[s.length() + 1][t.length() + 1];
		return lcsR(s, t, storage);
	}

	private static String lcsR(String s, String t, String[][] storage) {
		int m = s.length();
		int n = t.length();
		if (m == 0 || n == 0) {
			storage[m][n] = "";
			return storage[m][n];
		}
		if (storage[m][n] != null) {
			return storage[m][n];
		}
		if (s.charAt(0) == t.charAt(0)) {
			storage[m][n] = s.charAt(0) + lcsR(s.substring(1), t.substring(1), storage);
		} else {
			String ans1 = lcsR(s.substring(1), t, storage);
			String ans2 = lcsR(s, t.substring(1), storage);
			storage[m][n] = ans1.length() > ans2.length() ? ans1 : ans2;
		}
		return storage[m][n];
	}

	public static void main(String[] args) {
		String s = "abcdfedpjhjhfkjhqwkefhqwhefjkwefjhkjwefwefhkjwehf";
		String t = "jjhagdjgaskjdhkqwdhkqwjhdkjqhwd";
		System.out.println(lcs(s, t));
	}

}
