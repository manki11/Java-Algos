package topic8_oops.generics;

class B<T,W> {
	private T x;
	private W y;

	public T getX() {
		return x;
	}

	public void setX(T x) {
		this.x = x;
	}

	public W getY() {
		return y;
	}

	public void setY(W y) {
		this.y = y;
	}

}


public class GenericTest{
	public static void main(String[] args) {
		B<Double,Integer> b = new B<Double, Integer>();
		b.setX(2.3);
		b.setY(5);
	}
}