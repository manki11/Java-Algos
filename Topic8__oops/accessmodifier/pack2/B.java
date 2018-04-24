package topic8_oops.accessmodifier.pack2;

import topic8_oops.accessmodifier.pack1.A;

public class B extends A {
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.x);
		a.fun();

	}
}
