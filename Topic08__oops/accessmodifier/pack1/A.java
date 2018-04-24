package topic8_oops.accessmodifier.pack1;

public class A {

	protected int x;
	int y;
	
	protected void fun(){
		System.out.println(x);
	}
	
	public void fun2(){
		fun();
	}
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.x);
		a.fun();
		//System.out.println(x);
		
	}
}
