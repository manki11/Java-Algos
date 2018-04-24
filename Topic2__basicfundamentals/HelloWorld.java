package topic2_basicfundamentals;
public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("hello world");
		System.out.print("Hi Students");

		//------------------------------------------------
		int a = 100;
		int b = 100;
		if (a == b) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}

		//-------------------------------------------------
		long lightspeed = 186000;
		int days = 1000;
		long distance = days * lightspeed * 24 * 60 * 60;
		System.out.println(distance);

		//-------------------------------------------------
		System.out.println(5 / 9);
		System.out.println(5.0 / 9);
		System.out.println(5 / 9.0);

		double pie = 3.14;
		int radius = 10;
		double area = pie * radius * radius;
		System.out.println(area);

		char ch = 'g';
		System.out.println(ch);

		char ch1 = 'A';
		System.out.println(ch1);

		ch1++;
		System.out.println(ch1);

		System.out.println('a' + 'b');

		System.out.println("coding" + ('a' + 'b'));

		System.out.println("coding" + "ninja");

		boolean x = true;
		if (x) {

		} else {

		}

	}

}
