package topic2_basicfundamentals;
public class FahrenheitToCelsius {

	public static void main(String[] args) {

		int fahrenheit = 0;
		int maxFahrenheit = 300;
		while (fahrenheit <= maxFahrenheit) {
			int celsius = (int) ((5.0 / 9) * (fahrenheit - 32));
			System.out.println(fahrenheit + "        " + celsius);
			fahrenheit = fahrenheit + 20;
		}

	}
}
