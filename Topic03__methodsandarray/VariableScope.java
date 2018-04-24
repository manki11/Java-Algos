package topic3_methodsandarray;

public class VariableScope {

	public static void fun(int num) {
		System.out.println(num);

		int x = 10;
		if (num == 10) {
			int k = 100;

		} else {
			int k = 20;
		}

		int k = 50;
		System.out.println(x);

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		//System.out.println(i);

	}

	public static void main(String[] args) {
		fun(10);
	}
}
