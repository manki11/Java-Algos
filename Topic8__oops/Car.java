package topic8_oops;

import java.util.Scanner;

public class Car {

	String color;
	int modelNumber;
	int price;

	void accelerate() {

	}

	void speedUp() {

	}

	void applyBreaks() {

	}

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "Red";
		car1.modelNumber = 2000;
		car1.price = 100000;

		Car car2 = new Car();
		car2.color = "Green";
		car2.modelNumber = 2010;
		car2.price = 1000000;

		
		Car[] carArray = new Car[4];

		Scanner s = new Scanner(System.in);

		for (int i = 0; i < carArray.length; i++) {
			System.out.println("Entry for Car Object Number " + (i + 1));

			//carArray[i] = new Car();
			
			
			System.out.println("Color: ");
			carArray[i].color = s.next();

			System.out.println("Model Number: ");
			carArray[i].modelNumber = s.nextInt();

			System.out.println("Price: ");
			carArray[i].price = s.nextInt();

		}
		
		for(int i =0;i<carArray.length;i++){
			System.out.println(carArray[i].color+" "+carArray[i].modelNumber+" "+carArray[i].price);
		}
		
		
		
		
		
		
		
		
		
		

	}
}
