package App;

public class Principal {

	public static void main(String[] args) {
		
		// Creamos los arrays.

		int[] numeros = new int[5];
		int[] resultadoFibonacci = new int[5];
		int[] resultadoFactorial = new int[5];
		boolean[] resultadoPrimos = new boolean[5];
		
		// Se realizan sus respectivos for para calcularlos.

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = (int) (Math.random() * 10 + 1);
			System.out.println(numeros[i]);

		}

		for (int i = 0; i < resultadoFibonacci.length; i++) {

			resultadoFibonacci[i] = Util.Algoritmos.fibonacci(numeros[i]);

		}
		System.out.println("-------");

		for (int i = 0; i < resultadoFactorial.length; i++) {

			resultadoFactorial[i] = Util.Algoritmos.factorial(numeros[i]);
			System.out.println(resultadoFactorial[i]);

		}

		for (int i = 0; i < resultadoPrimos.length; i++) {

			resultadoPrimos[i] = Util.Algoritmos.esPrimo(numeros[i]);

		}

	}

}
