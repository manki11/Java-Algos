package topic6_recursion.assignment;

public class AssignmentHelper {
	public  static String getKeysName(int number) {
		switch (number) {
		case 1:
			return "";
		case 2:
			return "ABC";
		case 3:
			return "DEF";
		default:
			return "";
		}
	}
	
	public static char getChar(int n) {
		return (char) (96 + n);
	}
}
