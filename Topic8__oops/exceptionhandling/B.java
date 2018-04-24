package topic8_oops.exceptionhandling;

public class B {

	 void validateAge(int age) throws Exception{
		if(age<18){
			throw new Exception();
		}
		System.out.println("Welcome");
	}

	void n() throws Exception {
	
			validateAge(20);
		
	}

	void p() throws Exception {
		n();
	}

	public static void main(String[] args) {
		B b = new B();
		try {
			b.p();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
