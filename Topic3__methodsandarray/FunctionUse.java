package topic3_methodsandarray;

public class FunctionUse {

	public static void fun3() {
		System.out.println("fun3");
	}

	public static void fun2() {
		
		int k =0;
		int g =10;
		fun1();
	}

	public static int fun1() {
		fun3();
		return 0;
	}

	public static void main(String[] args) {
		int x = 0;
		int b = 20;
		boolean f = true;
		fun2();

	}
}
