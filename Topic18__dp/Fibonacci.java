package topic18_dp;

public class Fibonacci {

	public static long fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static long fibonacciB(int n) {
		long[] storage = new long[n + 1];
		return fibonacciWithStorage(n, storage);
	}

	private static long fibonacciWithStorage(int n, long[] storage) {
		if (n == 0 || n == 1) {
			storage[n] = n;
			return storage[n];
		}
		if (storage[n] != 0) {
			return storage[n];
		}
		storage[n] = fibonacciWithStorage(n - 1, storage) + fibonacciWithStorage(n - 2, storage);

		return storage[n];
	}

	
	
	public static int fibonacciI(int n){
		int storage[] = new int[n+1];
		storage[0] = 0;
		storage[1] = 1;
		for(int i =2;i<=n;i++){
			storage[i] = storage[i-1]+storage[i-2];
		}
		return storage[n];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println(fibonacciB(5000));
		
		System.out.println(fibonacci(50));
		
		
	}
}
