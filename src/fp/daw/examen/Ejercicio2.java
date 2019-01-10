package fp.daw.examen;

import java.util.Random;

public class Ejercicio2 {

	/*
	 * 2,5 puntos
	 * 
	 * Define, después de este comentario, un método llamado 'vectorSuma' que reciba un
	 * array bidimensional de números reales y retorne un vector de números reales que contenga
	 * en cada posición i el resultado de sumar todos los números almacenados en la fila i del
	 * array bidimensional.
	 *  
	 */

	public static int[] vectorSuma(int[][] matriz) {
		int filas = matriz.length;
		int [] vector = new int[filas];

		for(int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[i].length;j++) {
				vector[i] = matriz[i][j];
			}
		}
		return vector;
	}


	/*
	 * 2,5 puntos
	 * 
	 * Escribe en el método main las sentencias necesarias para poner a prueba el método
	 * 'vectorSuma'. Habrá que crear un array dimensión n * m, donde n y m serán números
	 * enteros aleatorios comprendidos entre 10 y 20, invocar al método 'vectorSuma' 
	 * pasándole este array y finalizar mostrando por pantalla el array bidimensional y
	 * el vector retornado con un formato que facilite su legibilidad.
	 * 
	 */

	public static void main(String[] args) {
		Random r = new Random();

		int filas = r.nextInt(20 - 10 + 1) + 10;
		int columnas = r.nextInt(20 - 10 + 1) + 10;

		int [][] matriz = new int[filas][columnas];
		int [] vector = vectorSuma(matriz);

		System.out.print("[");
		for (int i=0;i<matriz.length;i++) {
			if(i == matriz.length - 1) {
				System.out.println(matriz[i] + "]");
			}
			else {
				System.out.print(matriz[i] + ", ");
			}
			for (int j=0;j<matriz[i].length;j++) {
				if(j == matriz[i].length - 1) {
					System.out.println(matriz[j] + "]");
				}
				else {
					System.out.print(matriz[j] + ", ");

				}
			}
			System.out.println("[");
			for (int k=0;k<vector.length;k++) {
				if (k != vector.length - 1) {
					System.out.print(vector[k] + ", ");
				}
				else {
					System.out.print(vector[k] + "]");
				}
			}

		}

	}
}
