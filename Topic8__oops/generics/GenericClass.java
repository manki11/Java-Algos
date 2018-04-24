package topic8_oops.generics;

class A<T> {
	private T x;

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

}




public class GenericClass {
	public static void main(String[] args) {
//		A<Integer> a = new A<Integer>();
//		a.setX('A');
		
		
		A a1 = new A();
		
		a1.setX('B');
		a1.setX(3);
		
		System.out.println(a1.getX());
	}
	
	
}
