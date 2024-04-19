package Util;

public abstract class Algoritmos {

	public static int fibonacci(int num1) {

		if (num1 <= 1) {

			return num1;

		} else {

			return fibonacci(num1 - 1) + fibonacci(num1 - 2);

		}

	}

	/**
	 * 
	 * @param numero
	 * @return
	 */

	public static int factorial(int numero) {

		return 0;

	}

	public static boolean esPrimo(int num) {
		
		if (num <= 1) {

			return false;

		} else {
			
			int prueba;
			int contador = 0;
			
			prueba = (int) Math.sqrt(num);
			
			for (int i = 0; prueba > 1; prueba--) {

				if (num % prueba == 0) {

					contador += 1;

				}

			}

			return contador < 1;

		}

	}

}
