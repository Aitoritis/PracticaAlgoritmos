package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Util.Algoritmos;

class test {

	@BeforeAll
	static void setup() {
		
	}
	
	@Test
	void calcularFibonacci() {

		int fibonacciEsperado = 5;
		int fibonacciilObtenido = Algoritmos.fibonacci(5);
		assertEquals(fibonacciEsperado, fibonacciilObtenido);

	}
	
	@Test
	void calcularFactorial() {

		int factorialEsperada = 24;
		int factorialObtenida = Algoritmos.factorial(4);
		assertEquals(factorialEsperada, factorialObtenida);

	}
	
	@Test
	void calcularPrimo() {

		boolean primoEsperado = true;
		boolean primoilObtenida = Algoritmos.esPrimo(5);
		assertEquals(primoEsperado, primoilObtenida);

	}

}
