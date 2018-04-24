package topic8_oops.exceptionhandling;

public class C {

	static void validateAge(int age) throws Exception{
		if(age<18){
			throw new Exception();
		}
		System.out.println("Welcome");
	}
	
	
}
