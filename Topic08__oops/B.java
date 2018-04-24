package topic8_oops;

 class A {
	static int n =0;
	static A a ;
	private A() {

	}
	
	public static  A getInstance(){
		if(n==0){
			n++;
			a = new A();
		}
		return a;
		
	}
}

public class B{
	public static void main(String[] args) {
		A a =  A.getInstance();
		
		A a1 = A.getInstance();
	}
}
