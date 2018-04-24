package topic8_oops;

public class Student {

	String name;
	int age;
	int rollNumber;

	static String schoolName = "bharati";
	
	Student(String studentName, int studentAge, int roll){
		name = studentName;
		age = studentAge;
		rollNumber = roll;
	}
	
	void study(){
		
	}
	void eating(){
		
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("abc", 16, 30);
		Student s2 = new Student("adc", 14, 35);
		s1.schoolName = "Vidyabhavan";
		System.out.println(s2.schoolName);
		
	}
	
}
