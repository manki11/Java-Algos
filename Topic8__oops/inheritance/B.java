package topic8_oops.inheritance;

public class B extends A{
int k ;
	
	void showk(){
		System.out.println(k);
	}
	public static void main(String[] args) {
		B a = new B();
		System.out.println(a.i);
		System.out.println(a.j);
		a.showij();
		a.showk();
			
	}
}
