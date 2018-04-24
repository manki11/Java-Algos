package topic8_oops.interfaceuse.example4;

/*
 * If there are two or more same methods in two interfaces and a class implements both interfaces, 
 * implementation of the method once is enough.
 * */
interface A {
	public void aaa();
}

interface B {
	public void aaa();
}

public class Central implements A, B {
	public void aaa() {
		// Any Code here
	}

	public static void main(String args[]) {
		// Statements
	}
}