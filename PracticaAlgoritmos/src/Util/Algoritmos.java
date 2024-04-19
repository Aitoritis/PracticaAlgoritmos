package Util;

public abstract class Algoritmos {

	public static int fibonacci(int num1) {

		if (num1 <= 1) {

			return num1;

		} else {

			return fibonacci(num1 - 1) + fibonacci(num1 - 2);

		}

	}

	public static int factorial (int num) {
		
        int total = 0;
        
        for (int i = 0; i < num; i++) {
        	
            total += i * num;
            
        }
        
        return total;
        
    }

	public static boolean esPrimo(int num) {

		if (num <= 1) {

			return false;

		}

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {

				return false;

			}

		}

		return true;

	}

}
