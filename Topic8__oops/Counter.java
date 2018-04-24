package topic8_oops;

public class Counter {

	static  int count=0 ;
	
	Counter(){
		count++;
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		System.out.println(c1.count);
		Counter c2 = new Counter();
		System.out.println(c2.count);
		Counter c3 = new Counter();
		
		
		
		System.out.println(c3.count);
		
	}
}
