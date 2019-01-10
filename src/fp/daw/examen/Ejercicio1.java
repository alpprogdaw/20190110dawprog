package fp.daw.examen;

import java.util.Random;

public class Ejercicio1 {

	/* 
	 * 2,5 puntos
	 * 
	 * Escribe en el método main un algoritmo que genere un número aleatorio comprendido entre
	 * 10 y 100. Una vez obtenido esté número se generará a partir de él una secuencia se números
	 * enteros en la que se cumplen las siguientes condiciones:  
	 *
	 *    • Si un número de la secuencia es par, el siguiente será dicho número dividido
	 *      por la mitad.
	 *
	 *    • Si un número de la secuencia es impar, el siguiente será el resultado de multiplicar
	 *      dicho número por 3 y sumarle 1.
	 *      
	 * La secuencia finaliza cuando en el proceso de generar los números de la misma se obtiene
	 * como resultado el número 1. Los números de la secuencia se mostrarán por pantalla a según
	 * se van generando con el formato que se muestra en el ejemplo siguiente, teniendo en cuenta
	 * que en una línea de texto se mostrarán como máximo 30 números:
	 * 
	 *    Si el primer número es 10, la secuencia que se genera es:
	 *    
	 *        10, 5, 16, 8, 4, 2, 1
	 */

	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(100 - 10 + 1) + 10;
		int i=0;
		int [] vector = new int[30];

		
			while (vector[30] == 1 && i>vector.length) {
				vector[0] = num;
				if (vector[i] % 2 == 0) {
					vector[i + 1] = vector[i] / 2;
				}
				else {
					vector[i + 1] = (vector[i] * 3) + 1; 
				}
				i++;
			}
		

		System.out.println("[");
		for (int k=0;k<vector.length;k++) {
			if (k != vector.length - 1) {
				System.out.println(vector[k] + ", ");
			}
			else {
				System.out.println(vector[k] + "]");
			}
		}
	}
}
