package topic8_oops.exceptionhandling;

public class A {

	public static void main(String[] args) {

		try {
			int x = 5 / 0;

			System.out.println("Level 1 clear");
			String s = null;
			System.out.println(s.length());

			int arr[] = new int[5];

			arr[5] = 10;
			System.out.println("Level last clear");
		} catch (Exception e) {
			System.out.println("Arithmatic problem handled" + e);
		} catch(ArithmeticException e){
			
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
		}

		System.out.println("All done");
	}
}
