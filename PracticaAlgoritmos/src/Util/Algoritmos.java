package Util;

public abstract class Algoritmos {
	
	/**
	 * Suma los dos números anteriores al introducido por parámetro.
	 * 
	 * @param El número del que se quiere calcular la sucesión de Fibonacci.
	 * 
	 * @return El fibonacci del número pasado por parámetro.
	 */

	public static int fibonacci(int num1) {

		if (num1 <= 1) {

			return num1;

		} else {

			return fibonacci(num1 - 1) + fibonacci(num1 - 2);

		}

	}
	
	/**
	 * Es la multiplicación iterativa de los números anteriores al introducido por parametro.
	 * 
	 * @param El número del que se quiere calcular el factorial.
	 * 
	 * @return El resultado del número pasado por parámetros.
	 */

	public static int factorial (int num) {
		
        int total = 1;
        
        for (int i = 1; i <= num; i++) {
        	
        	total *= i;
            
        }
        
        return total;
        
    }
	
	/**
	 * Una función que recibe un número y te devuelve un true o un false para saber si es primo o no.
	 * 
	 * @param Un número del que se quiere saber si es primo o no.
	 * 
	 * @return Devuelve un boolean en el que indica si es true o false.
	 */

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
