package topic8_oops.inheritance;

class F {
	F(){
		System.out.println("F Constructor");
	}
	public void fun() {
		System.out.println("F fun()");
	}
}

class E extends F {
	int i;
	int j;
	E(){
		System.out.println("E default");
	}
	E(int i, int j){
		this.i=i;
		this.j = j;
		
		System.out.println("E Constructor with i & j"+i+" "+j);
	}
	public void fun() {
		System.out.println("E fun()");
	}
}

class P extends E {

	int k;
	P(){
		super();
		System.out.println("P Constructor");
	}
	public void fun() {
		super.fun();
		System.out.println("P fun()");
	}
}

public class D {
	public static void main(String[] args) {
		P p = new P();
		p.fun();
		
	}
}
